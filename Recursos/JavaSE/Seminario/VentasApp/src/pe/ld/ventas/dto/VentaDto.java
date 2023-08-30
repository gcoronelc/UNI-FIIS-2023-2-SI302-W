package pe.ld.ventas.dto;

import java.util.List;

public class VentaDto {

    private int idventa;
    private String cliente;
    private int idEmpl;
    private double importe;
    private List<VentaItem> detalle;

    public VentaDto() {
    }

    public VentaDto(int idventa, String cliente, int idEmpl, double importe, List<VentaItem> detalle) {
        this.idventa = idventa;
        this.cliente = cliente;
        this.idEmpl = idEmpl;
        this.importe = importe;
        this.detalle = detalle;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<VentaItem> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<VentaItem> detalle) {
        this.detalle = detalle;
    }

    public int getIdEmpl() {
        return idEmpl;
    }

    public void setIdEmpl(int idEmpl) {
        this.idEmpl = idEmpl;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

}
