/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package interfaz.trabajador;

import datos.archivo;
import datos.bicicleta;
import datos.parqueo;
import javax.swing.JOptionPane;
import logica.config;

/**
 *
 * @author derek
 */
public class fInventario extends javax.swing.JInternalFrame {

    bicicleta[] bicicletas;
    config cfg = new config();

    /**
     * Creates new form fInventario
     */
    public fInventario() {
        initComponents();
        txtSimbolo.setText(cfg.moneda);
        txtMonto.setValue(cfg.getPrecioHora());
        mostrar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSimbolo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAplicar = new javax.swing.JButton();
        cmbId = new javax.swing.JComboBox<>();
        cmbParqueo = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        btnGuardarCofig = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar montos y cantidad de bicicletas");

        jLabel1.setText("Simbolo de moneda:");

        txtSimbolo.setText("₡");
        txtSimbolo.setFocusable(false);

        jLabel2.setText("Monto por hora:");

        txtMonto.setFocusable(false);

        jLabel3.setText("Parqueo:");

        btnAceptar.setText("Aceptar");
        btnAceptar.setToolTipText("Guarda cambios del parqueo seleccionado");
        btnAceptar.setFocusable(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setFocusable(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("ID:");

        btnAplicar.setText("Aplicar");
        btnAplicar.setToolTipText("Guarda cambios del parqueo seleccionado");
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });

        cmbId.setFocusable(false);
        cmbId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIdActionPerformed(evt);
            }
        });

        cmbParqueo.setFocusable(false);
        cmbParqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbParqueoActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnBorrar.setForeground(java.awt.Color.red);
        btnBorrar.setText("Borrar");
        btnBorrar.setFocusable(false);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo:");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bicicleta", "Moto" }));
        cmbTipo.setFocusable(false);

        btnGuardarCofig.setText("Guardar");
        btnGuardarCofig.setFocusable(false);
        btnGuardarCofig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCofigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMonto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardarCofig))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAplicar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbParqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSimbolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarCofig))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbParqueo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar)
                    .addComponent(btnAplicar)
                    .addComponent(btnNuevo)
                    .addComponent(btnBorrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            bicicleta b = bicicletas[cmbId.getSelectedIndex()];
            b = new bicicleta(Integer.parseInt(cmbId.getSelectedItem().toString()), cmbParqueo.getSelectedItem().toString(), b.isDisponible(), cmbTipo.getSelectedItem().toString());
            b.guardar();
        } catch (Exception e) {
        }
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        bicicleta b = bicicletas[cmbId.getSelectedIndex()];
        b = new bicicleta(Integer.parseInt(cmbId.getSelectedItem().toString()), cmbParqueo.getSelectedItem().toString(), b.isDisponible(), cmbTipo.getSelectedItem().toString());
        b.guardar();
        mostrar();
    }//GEN-LAST:event_btnAplicarActionPerformed

    private void cmbIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIdActionPerformed
        btnNuevo.setEnabled(cmbParqueo.getItemCount() > 0);
    }//GEN-LAST:event_cmbIdActionPerformed

    private void cmbParqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbParqueoActionPerformed
        /*try {
            cmbEspacios.setSelectedIndex(bicicletas[cmbParqueo.getSelectedIndex()].getEspacios() - 3);
        } catch (Exception e) {
        }*/
    }//GEN-LAST:event_cmbParqueoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        int id = (int) (Math.random() * 1000000000);
        new bicicleta(id, String.valueOf(cmbParqueo.getSelectedItem()), true, String.valueOf(cmbTipo.getSelectedItem())).guardar();
        btnAplicar.setEnabled(true);
        btnAceptar.setEnabled(true);
        cmbId.setEnabled(true);
        mostrar();
        for (int i = 0; i < bicicletas.length; i++) {
            if (bicicletas[i].getId() == id) {
                cmbId.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Borrar", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            bicicletas[cmbId.getSelectedIndex()].eliminar();
            mostrar();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnGuardarCofigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCofigActionPerformed
        cfg.moneda = txtSimbolo.getText();
        cfg.precioHora = Double.parseDouble(String.valueOf(txtMonto.getValue()));
        cfg.guardar();
        JOptionPane.showMessageDialog(this, "Configuración guardada");
    }//GEN-LAST:event_btnGuardarCofigActionPerformed

    void mostrar() {
        cmbParqueo.removeAllItems();
        try {
            String[] archivos = new archivo(new config().getDir() + "/" + "parqueos").listarArchivosEnDirectorio();
            int l = archivos.length;
            parqueo[] parqueos = new parqueo[l];
            for (int i = 0; i < l; i++) {
                try {
                    parqueos[i] = new parqueo(archivos[i]);
                    mostrarParqueosDisponibles(parqueos[i], parqueos[0].getEspacios());
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
        }
        cmbId.removeAllItems();
        try {
            String[] archivos = new archivo(new config().getDir() + "/" + "bicicletas").listarArchivosEnDirectorio();
            int l = archivos.length;
            bicicletas = new bicicleta[l];
            for (int i = 0; i < l; i++) {
                try {
                    bicicletas[i] = new bicicleta(archivos[i]);
                    cmbId.addItem(String.valueOf(bicicletas[i].getId()));
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
        }
        btnBorrar.setEnabled(cmbId.getItemCount() > 0);
    }
    
    void mostrarParqueosDisponibles(parqueo p, int espacios) {
        String[] archivos = new archivo(new config().getDir() + "/" + "bicicletas").listarArchivosEnDirectorio();
        int l = archivos.length;
        bicicleta[] bicicletas = new bicicleta[l];
        for (int i = 0; i < l; i++) {
            try {
                bicicletas[i] = new bicicleta(archivos[i]);
                if (bicicletas[i].getParqueo().equals(p.getNombre()) && bicicletas[i].isDisponible()) {
                    espacios--;
                }
            } catch (Exception e) {
            }
        }
        
        if (espacios > 0) {
            cmbParqueo.addItem(p.getNombre());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarCofig;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbId;
    private javax.swing.JComboBox<String> cmbParqueo;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner txtMonto;
    private javax.swing.JTextField txtSimbolo;
    // End of variables declaration//GEN-END:variables
}
