package pe.edu.uni.educaapp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.edu.uni.educaapp.db.AccesoDB;

public class EducaService {

    private Connection cn;
    private final String MATRICULA_INSERT = "INSERT INTO MATRICULA"
            + "(CUR_ID,ALU_ID,MAT_FECHA,MAT_PRECIO,MAT_CUOTAS) "
            + "VALUES(?,?,GETDATE(),?,?)";
    private final String CURSO_UPDATE = "UPDATE CURSO "
            + "SET cur_matriculados = cur_matriculados + 1 "
            + "WHERE CUR_ID = ?";

    public int procMatricula(int idAlumno, int idCurso, double precio, int cuotas) {
        int estado = 1;
        PreparedStatement pstm;
        int filas;
        try {
            // 0.- Conexion
            cn = AccesoDB.getConnection();
            // 1.- Inicio de Tx
            cn.setAutoCommit(false);
            // 2.- Verificar si existe código del alumno
            validarAlumno(idAlumno);
            // 3.- Verificar Deudas

            // 4.- Verificar si existe el código del curso
            validarCurso(idCurso);
            // 5.- Verificar si hay vacantes
            validarVacantes(idCurso);
            // 6.- Verificar el precio.

            // 7.- verificar que el nro de cuotas sea valido
            // 9.- Registrar matrícula
            pstm = cn.prepareStatement(MATRICULA_INSERT);
            pstm.setInt(1, idCurso);
            pstm.setInt(2, idAlumno);
            pstm.setDouble(3, precio);
            pstm.setInt(4, cuotas);
            pstm.executeUpdate();
            pstm.close();
            // 10.- Actualizar vacantes
            pstm = cn.prepareStatement(CURSO_UPDATE);
            pstm.setInt(1, idCurso);
            filas = pstm.executeUpdate();
            if (filas != 1) {
                String s = "Se ha producido un error, intentelo mas tarde.";
                throw new SQLException(s);
            }
            // 11.- Fin de TX
            cn.commit(); // Confirma todos los cambios
        } catch (SQLException e) {
            try {
                cn.rollback(); // Cancela todos los cambios
            } catch (Exception e1) {
            }
            estado = -1;
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            try {
                cn.rollback(); // Cancela todos los cambios
            } catch (Exception e1) {
            }
            estado = -1;
            String s = "Error en el proceso, intentelo mas tarde.";
            throw new RuntimeException(s);
        } finally {
            try {
                cn.close(); // Cierra la conexión
            } catch (Exception e) {
            }
        }
        return estado;
    }

    private void validarAlumno(int idAlumno) throws SQLException {
        String SQL = "SELECT COUNT(1) FILAS "
                + "FROM ALUMNO WHERE alu_id=?";
        PreparedStatement pstm = cn.prepareStatement(SQL);
        pstm.setInt(1, idAlumno);
        ResultSet rs = pstm.executeQuery();
        rs.next();
        int filas = rs.getInt("FILAS");
        if (filas != 1) {
            throw new SQLException("Codigo del alumno no existe.");
        }
    }

    private void validarCurso(int idCurso) throws SQLException {
        String SQL = "SELECT COUNT(1) FILAS "
                + "FROM CURSO WHERE cur_id=?";
        PreparedStatement pstm = cn.prepareStatement(SQL);
        pstm.setInt(1, idCurso);
        ResultSet rs = pstm.executeQuery();
        rs.next();
        int filas = rs.getInt("FILAS");
        if (filas != 1) {
            throw new SQLException("Codigo del curso no existe.");
        }
    }

    private void validarVacantes(int idCurso) throws SQLException {
        String SQL = "select (cur_vacantes - cur_matriculados) as disponibles "
                + "from curso where cur_id = ?";
        PreparedStatement pstm = cn.prepareStatement(SQL);
        pstm.setInt(1, idCurso);
        ResultSet rs = pstm.executeQuery();
        rs.next();
        int vacantes = rs.getInt("disponibles");
        if (vacantes <= 0) {
            throw new SQLException("no hay vacantes disponibles");
        }
    }

}
