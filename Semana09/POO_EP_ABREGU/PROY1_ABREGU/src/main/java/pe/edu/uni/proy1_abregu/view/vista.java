package pe.edu.uni.proy1_abregu.view;

import javax.swing.JOptionPane;
import pe.edu.uni.proy1_abregu.services.MateService;

public class vista extends javax.swing.JFrame {

    public vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Iniciar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Operaciones = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        n4 = new javax.swing.JTextField();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        n3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Result = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Evaluando Problemas Matematicos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 70, 880, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 80, 40));

        Iniciar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Iniciar.setText("Iniciar");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        jPanel1.add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 80, 40));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Borrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 80, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("N");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 60, 30));

        Operaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amigos", "Perfecto", "Serie" }));
        Operaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperacionesActionPerformed(evt);
            }
        });
        jPanel1.add(Operaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 250, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero 1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 60, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 880, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("X");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 60, 30));

        n4.setEnabled(false);
        jPanel1.add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 292, 220, 30));
        jPanel1.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 220, -1));
        jPanel1.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 220, 30));

        n3.setEnabled(false);
        jPanel1.add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 242, 220, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Numero 2");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 60, 40));

        Result.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Result.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Result.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Result.setEnabled(false);
        jPanel1.add(Result, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 760, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Escoger Operacion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 250, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Resultado");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 250, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(n1, "Vuelva Pronto");
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        MateService options = new MateService();
        try {
            if ("Amigos".equals((String) Operaciones.getSelectedItem())) {
                Result.setText(options.CalculateAmigos(Integer.parseInt(n1.getText()), Integer.parseInt(n2.getText())));
            } else if ("Perfecto".equals((String) Operaciones.getSelectedItem())) {
                Result.setText(options.CalculatePerfect(Integer.parseInt(n1.getText())));
            } else {
               // Result.setText(options.CalculateSerie(Integer.parseInt(n4.getText()), Integer.parseInt(n3.getText())));
            }
        } catch (NumberFormatException e){ // Si no se coloca un numero 
            JOptionPane.showMessageDialog(n1, "No se ha colocado un numero en las casillas");
        }
    }//GEN-LAST:event_IniciarActionPerformed

    private void OperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperacionesActionPerformed
        // Borramos con el boton
        jButton3.doClick();
        if ("Amigos".equals((String) Operaciones.getSelectedItem())) {
            n1.setEnabled(true);
            n2.setEnabled(true);
            n3.setEnabled(false);
            n4.setEnabled(false);
        } else if ("Perfecto".equals((String) Operaciones.getSelectedItem())) {
            n1.setEnabled(true);
            n2.setEnabled(false);
            n3.setEnabled(false);
            n4.setEnabled(false);
        } else {
            n1.setEnabled(false);
            n2.setEnabled(false);
            n3.setEnabled(true);
            n4.setEnabled(true);
        }
    }//GEN-LAST:event_OperacionesActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        n1.setText("");
        n2.setText("");
        n3.setText("");
        n4.setText("");
        Result.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar;
    private javax.swing.JComboBox<String> Operaciones;
    private javax.swing.JTextField Result;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField n4;
    // End of variables declaration//GEN-END:variables
}
