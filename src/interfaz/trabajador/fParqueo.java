/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package interfaz.trabajador;

import datos.archivo;
import datos.parqueo;
import javax.swing.JOptionPane;
import logica.config;

public class fParqueo extends javax.swing.JInternalFrame {
    parqueo[] parqueos;
    /**
     * Creates new form fParqueo
     */
    public fParqueo() {
        initComponents();
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
        btnNuevo = new javax.swing.JButton();
        cmbParqueo = new javax.swing.JComboBox<>();
        cmbEspacios = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAplicar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Modificar parqueos");

        jLabel1.setText("Parqueo:");

        btnNuevo.setText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        cmbParqueo.setFocusable(false);
        cmbParqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbParqueoActionPerformed(evt);
            }
        });

        cmbEspacios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "4", "5" }));
        cmbEspacios.setFocusable(false);
        cmbEspacios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEspaciosActionPerformed(evt);
            }
        });

        jLabel2.setText("Espacios:");

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

        btnAplicar.setText("Aplicar");
        btnAplicar.setToolTipText("Guarda cambios del parqueo seleccionado");
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbParqueo, 0, 438, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
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
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addComponent(cmbEspacios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbParqueo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar)
                    .addComponent(btnAplicar)
                    .addComponent(btnBorrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        parqueos[cmbParqueo.getSelectedIndex()].guardar();
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        String nombre = JOptionPane.showInputDialog(this, "Nombre del parqueo");
        if (nombre != null) {
            new parqueo(nombre, cmbEspacios.getSelectedIndex()+3).guardar();
            btnAplicar.setEnabled(true);
            btnAceptar.setEnabled(true);
            cmbEspacios.setEnabled(true);
            mostrar();
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        parqueos[cmbParqueo.getSelectedIndex()].guardar();
        mostrar();
    }//GEN-LAST:event_btnAplicarActionPerformed

    private void cmbParqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbParqueoActionPerformed
        try {
            cmbEspacios.setSelectedIndex(parqueos[cmbParqueo.getSelectedIndex()].getEspacios() - 3);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbParqueoActionPerformed

    private void cmbEspaciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEspaciosActionPerformed
        parqueos[cmbParqueo.getSelectedIndex()].setEspacios(cmbEspacios.getSelectedIndex()+3);
    }//GEN-LAST:event_cmbEspaciosActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Borrar", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            parqueos[cmbParqueo.getSelectedIndex()].eliminar();
            mostrar();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed


    void mostrar(){
        cmbParqueo.removeAllItems();
        try {
            String[] archivos = new archivo(new config().getDir() + "/" + "parqueos").listarArchivosEnDirectorio();
            int l = archivos.length;
            parqueos = new parqueo[l];
            for (int i = 0; i < l; i++) {
                try {
                    parqueos[i] = new parqueo(archivos[i]);
                    cmbParqueo.addItem(parqueos[i].getNombre());
                    cmbEspacios.setSelectedIndex(parqueos[0].getEspacios() - 3);
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
        }
        verificar();
    }
    
    void verificar(){
        boolean valido = cmbParqueo.getSelectedIndex() != -1;
        btnAceptar.setEnabled(valido);
        btnAplicar.setEnabled(valido);
        cmbEspacios.setEnabled(valido);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbEspacios;
    private javax.swing.JComboBox<String> cmbParqueo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
