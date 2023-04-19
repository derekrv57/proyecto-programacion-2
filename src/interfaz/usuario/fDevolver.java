/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package interfaz.usuario;

import datos.archivo;
import datos.bicicleta;
import datos.informe;
import datos.parqueo;
import datos.usuario;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;
import logica.config;

/**
 *
 * @author derek
 */
public class fDevolver extends javax.swing.JInternalFrame {

    usuario usu;
    bicicleta[] bicis;

    /**
     * Creates new form fDevolver
     */
    public fDevolver(usuario usu) {
        initComponents();
        this.usu = usu;
        mostrarParqueos();
    }

    public fDevolver(boolean usuario, usuario usu) {
        initComponents();
        usuario = !usuario;
        this.setClosable(usuario);
        this.usu = usu;
        mostrarParqueos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbParqueo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDevolver = new javax.swing.JTable();
        btnDevolver = new javax.swing.JButton();
        cmbBicicleta = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("Devolver");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        cmbParqueo.setFocusable(false);

        jLabel1.setText("Parqueo:");

        tblDevolver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Id", null},
                {"Parqueo alquilado", null},
                {"Parqueo devolver", null},
                {"Tipo", null},
                {"Hora alquiler", null},
                {"Precio hora", null},
                {null, null},
                {"Total", null}
            },
            new String [] {
                "Item", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDevolver);

        btnDevolver.setText("Devolver");
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });

        cmbBicicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBicicletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbParqueo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDevolver))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbParqueo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(btnDevolver, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        if (new informe(String.valueOf(tblDevolver.getValueAt(1, 1)), String.valueOf(tblDevolver.getValueAt(2, 1)), String.valueOf(tblDevolver.getValueAt(3, 1)), String.valueOf(tblDevolver.getValueAt(4, 1)), Long.parseLong(String.valueOf(tblDevolver.getValueAt(7, 1)).replace(new config().moneda, ""))).generar()) {
            if (bicis[cmbBicicleta.getSelectedIndex()].devolver(String.valueOf(cmbParqueo.getSelectedItem()))) {
                JOptionPane.showMessageDialog(this, "Devuelto");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo devolver");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "No se pudo devolver\nError al generar el informe");
        }
        mostrar();
        mostrarParqueos();
        if (cmbBicicleta.getItemCount() == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnDevolverActionPerformed

    private void cmbBicicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBicicletaActionPerformed
        mostrarDatos();
    }//GEN-LAST:event_cmbBicicletaActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        mostrar();
    }//GEN-LAST:event_formInternalFrameOpened

    void mostrar() {
        bicis = usu.getAlquileres();
        cmbBicicleta.removeAllItems();
        for (int i = 0; i < bicis.length; i++) {
            cmbBicicleta.addItem(bicis[i].getParqueo() + " | " + bicis[i].getHora());
        }
        mostrarDatos();
    }

    void mostrarDatos() {
        int s = cmbBicicleta.getSelectedIndex();
        if (s >= 0) {
            long precio = (long) new config().getPrecioHora();
            LocalDateTime horaInicial = LocalDateTime.parse(bicis[s].getHora(), DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
            LocalDateTime horaActual = LocalDateTime.now();
            long minutosTranscurridos = ChronoUnit.MINUTES.between(horaInicial, horaActual);
            tblDevolver.setValueAt(bicis[s].getId(), 0, 1);
            tblDevolver.setValueAt(bicis[s].getParqueo(), 1, 1);
            tblDevolver.setValueAt(String.valueOf(cmbParqueo.getSelectedItem()), 2, 1);
            tblDevolver.setValueAt(bicis[s].getTipo(), 3, 1);
            tblDevolver.setValueAt(bicis[s].getHora(), 4, 1);
            tblDevolver.setValueAt(String.valueOf(precio), 5, 1);
            long total = minutosTranscurridos * precio;
            tblDevolver.setValueAt(new config().moneda + String.valueOf(total), 7, 1);
        } 
    }

    void mostrarParqueos(){
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
    }
    
    void mostrarParqueosDisponibles(parqueo p, int espacios){
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
        btnDevolver.setEnabled(espacios > 0);
        if (espacios > 0) {
            cmbParqueo.addItem(p.getNombre());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolver;
    private javax.swing.JComboBox<String> cmbBicicleta;
    private javax.swing.JComboBox<String> cmbParqueo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDevolver;
    // End of variables declaration//GEN-END:variables

}
