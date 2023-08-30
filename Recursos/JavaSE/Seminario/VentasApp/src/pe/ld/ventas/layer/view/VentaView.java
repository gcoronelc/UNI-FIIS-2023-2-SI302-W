package pe.ld.ventas.layer.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import pe.ld.ventas.dto.VentaDto;
import pe.ld.ventas.dto.VentaItem;
import pe.ld.ventas.entity.Empleado;
import pe.ld.ventas.layer.model.VentasModel;
import pe.ld.ventas.util.Message;
import pe.ld.ventas.util.Session;

public class VentaView extends javax.swing.JInternalFrame {

    private static VentaView instancia = new VentaView();

    // Variables locales
    private List<VentaItem> items;

    public static VentaView getInstancia() {
        return instancia;
    }

    private VentaView() {
        initComponents();
        nuevaVenta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnBuscarProducto = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevaVenta = new javax.swing.JButton();
        btnGrabarVenta = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("V E N T A");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS GENERALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 51, 255))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Cliente:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Importe:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        txtImporte.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtImporte, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(txtCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUCTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 51, 255))); // NOI18N

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "CANT", "SUBTOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblData);
        if (tblData.getColumnModel().getColumnCount() > 0) {
            tblData.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/ld/ventas/img/add.png"))); // NOI18N
        btnBuscarProducto.setToolTipText("Agregar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/ld/ventas/img/remove.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar Producto");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VENTA", jPanel1);

        btnNuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/ld/ventas/img/new.png"))); // NOI18N
        btnNuevaVenta.setToolTipText("Nueva Venta");
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });

        btnGrabarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pe/ld/ventas/img/save.png"))); // NOI18N
        btnGrabarVenta.setToolTipText("Grabar Venta");
        btnGrabarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGrabarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnGrabarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
            Session.put("ventaItem", null);
            BuscarProductoView view = new BuscarProductoView(null, true);
            view.setVisible(true);
            if (Session.get("ventaItem") != null) {
                VentaItem item = (VentaItem) Session.get("ventaItem");
                agregar(item);
                calcularTotal();
            }
	}//GEN-LAST:event_btnBuscarProductoActionPerformed

	private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
            nuevaVenta();
	}//GEN-LAST:event_btnNuevaVentaActionPerformed

	private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            DefaultTableModel dtm = (DefaultTableModel) tblData.getModel();
            int fila = tblData.getSelectedRow();
            if (fila >= 0) {
                dtm.removeRow(fila);
                items.remove(fila);
                calcularTotal();
            }
	}//GEN-LAST:event_btnEliminarActionPerformed

	private void btnGrabarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarVentaActionPerformed
            // Validcion
            if (items.isEmpty()) {
                Message.error(rootPane, "No hay items.");
                return;
            }
            if (txtCliente.getText().isEmpty()) {
                Message.error(rootPane, "Flta cliente.");
                return;
            }
            // Proceso
            try {
                Empleado emp = (Empleado) Session.get("empleado");
                VentaDto ventaDto = new VentaDto();
                ventaDto.setCliente(txtCliente.getText());
                ventaDto.setIdEmpl(emp.getIdemp());
                ventaDto.setImporte(Double.parseDouble(txtImporte.getText()));
                ventaDto.setDetalle(items);
                VentasModel model = new VentasModel();
                model.grabar(ventaDto);
                Message.info(rootPane, "Gracias por su compra.");
                nuevaVenta();
            } catch (Exception e) {
                Message.error(rootPane, "ERROR: " + e.getMessage());
            }
	}//GEN-LAST:event_btnGrabarVentaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabarVenta;
    private javax.swing.JButton btnNuevaVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtImporte;
    // End of variables declaration//GEN-END:variables

    private void agregar(VentaItem item) {
        // Buscar
        int fila = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getIdprod() == item.getIdprod()) {
                items.set(i, item);
                fila = i;
                break;
            }
        }

        if (fila == -1) { // Agregar a tabla
            items.add(item);
            DefaultTableModel dtm = (DefaultTableModel) tblData.getModel();
            Object[] rowData = {
                item.getIdprod(),
                item.getNombre(),
                item.getPrecio(),
                item.getCant(),
                item.getSubtotal()
            };
            dtm.addRow(rowData);
        } else {
            tblData.setValueAt(item.getCant(), fila, 3);
            tblData.setValueAt(item.getSubtotal(), fila, 4);
        }
    }

    private void nuevaVenta() {
        items = new ArrayList<VentaItem>();
        txtCliente.setText("");
        txtImporte.setText("0.00");
        limpiarTabla();
    }

    private void limpiarTabla() {
        DefaultTableModel dtm = (DefaultTableModel) tblData.getModel();
        dtm.setRowCount(0);
    }

    private void calcularTotal() {
        double total = 0.0;
        for (VentaItem i : items) {
            total += i.getSubtotal();
        }
        total = Math.ceil(total * 100) / 100;
        this.txtImporte.setText(String.valueOf(total));
    }
}
