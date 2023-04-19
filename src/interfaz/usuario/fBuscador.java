/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package interfaz.usuario;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import datos.archivo;
import datos.bicicleta;
import datos.usuario;
import javax.swing.JOptionPane;
import logica.config;

/**
 *
 * @author derek
 */
public class fBuscador extends javax.swing.JInternalFrame {
    bicicleta[] bicicletas;
    usuario usu;
    /**
     * Creates new form fBuscador
     */
    public fBuscador(usuario usu) {
        initComponents();
        mostrar(true, "");
        this.usu = usu;
    }
    
    public fBuscador(boolean usuario, usuario usu) {
        initComponents();
        usuario = !usuario;
        try {
            this.setMaximum(!usuario);
            this.setClosable(usuario);
            this.setIconifiable(usuario);
            this.setMaximizable(usuario);
            this.setResizable(usuario);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(fBuscador.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrar(true, "");
        this.usu = usu;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBicis = new javax.swing.JTable();
        btnAlquilar = new javax.swing.JButton();
        chbNoDisponibles = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        cmbParqueo = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscador de bicicletas");

        tblBicis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Parqueo", "Tipo", "Disponibilidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBicis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblBicisMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblBicis);
        if (tblBicis.getColumnModel().getColumnCount() > 0) {
            tblBicis.getColumnModel().getColumn(0).setMinWidth(64);
            tblBicis.getColumnModel().getColumn(0).setPreferredWidth(64);
            tblBicis.getColumnModel().getColumn(0).setMaxWidth(256);
        }

        btnAlquilar.setText("Alquilar");
        btnAlquilar.setEnabled(false);
        btnAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlquilarActionPerformed(evt);
            }
        });

        chbNoDisponibles.setSelected(true);
        chbNoDisponibles.setText("Mostrar solo disponibles");
        chbNoDisponibles.setFocusable(false);
        chbNoDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbNoDisponiblesActionPerformed(evt);
            }
        });

        jLabel2.setText("Parqueo:");

        cmbParqueo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        cmbParqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbParqueoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbParqueo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chbNoDisponibles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlquilar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlquilar)
                    .addComponent(jLabel2)
                    .addComponent(cmbParqueo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chbNoDisponibles))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlquilarActionPerformed
        if (bicicletas[tblBicis.getSelectedRow()].alquilar(usu)) {
            JOptionPane.showMessageDialog(this, "Alquilado");
        }
        else{
            JOptionPane.showMessageDialog(this, "Error al alquilar");
        }
        mostrar(chbNoDisponibles.isSelected(), String.valueOf(cmbParqueo.getSelectedItem()).replace("Todos", ""));
    }//GEN-LAST:event_btnAlquilarActionPerformed

    private void cmbParqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbParqueoActionPerformed
        mostrar(chbNoDisponibles.isSelected(), String.valueOf(cmbParqueo.getSelectedItem()).replace("Todos", ""));
    }//GEN-LAST:event_cmbParqueoActionPerformed

    private void chbNoDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbNoDisponiblesActionPerformed
        mostrar(chbNoDisponibles.isSelected(), String.valueOf(cmbParqueo.getSelectedItem()).replace("Todos", ""));
    }//GEN-LAST:event_chbNoDisponiblesActionPerformed

    private void tblBicisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBicisMouseReleased
        try {
            btnAlquilar.setEnabled(bicicletas[tblBicis.getSelectedRow()].isDisponible());
        } catch (Exception e) {
            btnAlquilar.setEnabled(false);
        }
    }//GEN-LAST:event_tblBicisMouseReleased

    
    void mostrar(boolean noDisponibles, String parqueo){
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 4; j++) {
                tblBicis.setValueAt("", i, j);
            }
        }
        try {
            String[] archivos = new archivo(new config().getDir() + "/" + "bicicletas").listarArchivosEnDirectorio();
            int l = archivos.length;
            bicicletas = new bicicleta[l];
            for (int i = 0; i < l; i++) {
                try {
                    bicicletas[i] = new bicicleta(archivos[i]);
                } catch (Exception e) {
                }
            }
            try {
                for (int i = 0; i < l; i++) {
                    if (parqueo.equals("")) {
                        if (noDisponibles) {
                            if (bicicletas[i].isDisponible()) {
                                tblBicis.setValueAt(String.valueOf(bicicletas[i].getId()), i, 0);
                                tblBicis.setValueAt(bicicletas[i].getParqueo(), i, 1);
                                tblBicis.setValueAt(bicicletas[i].getTipo(), i, 2);
                                tblBicis.setValueAt("DISPONIBLE", i, 3);
                            }
                        } else {
                            tblBicis.setValueAt(String.valueOf(bicicletas[i].getId()), i, 0);
                            tblBicis.setValueAt(bicicletas[i].getParqueo(), i, 1);
                            tblBicis.setValueAt(bicicletas[i].getTipo(), i, 2);
                            if (bicicletas[i].isDisponible()) {
                                tblBicis.setValueAt("DISPONIBLE", i, 3);
                            } else {
                                tblBicis.setValueAt("OCUPADA", i, 3);
                            }
                        }
                    } else {
                        if (bicicletas[i].getParqueo().equals(parqueo)) {
                            if (noDisponibles) {
                                if (bicicletas[i].isDisponible()) {
                                    tblBicis.setValueAt(String.valueOf(bicicletas[i].getId()), i, 0);
                                    tblBicis.setValueAt(bicicletas[i].getParqueo(), i, 1);
                                    tblBicis.setValueAt(bicicletas[i].getTipo(), i, 2);
                                    tblBicis.setValueAt("DISPONIBLE", i, 3);
                                }
                            } else {
                                tblBicis.setValueAt(String.valueOf(bicicletas[i].getId()), i, 0);
                                tblBicis.setValueAt(bicicletas[i].getParqueo(), i, 1);
                                tblBicis.setValueAt(bicicletas[i].getTipo(), i, 2);
                                if (bicicletas[i].isDisponible()) {
                                    tblBicis.setValueAt("DISPONIBLE", i, 3);
                                } else {
                                    tblBicis.setValueAt("OCUPADA", i, 3);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
            }
            
        } catch (Exception e) {
        }
        try {
            btnAlquilar.setEnabled(bicicletas[tblBicis.getSelectedRow()].isDisponible());
        } catch (Exception e) {
            btnAlquilar.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlquilar;
    private javax.swing.JCheckBox chbNoDisponibles;
    private javax.swing.JComboBox<String> cmbParqueo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBicis;
    // End of variables declaration//GEN-END:variables
}