/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemacontable.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VtnCliente extends javax.swing.JFrame {

    /**
     * Creates new form VtnCliente
     */
    public VtnCliente() {
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

        jLabelFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        RegistrarClienteItem = new javax.swing.JMenuItem();
        ActualizarClienteItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        RegistrarProveedorItem = new javax.swing.JMenuItem();
        ActualizarProveedorItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BALANCE");
        setEnabled(false);

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azul.jpg"))); // NOI18N
        jLabelFondo.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        jMenu1.setText("Cliente");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.S_RESIZE_CURSOR));
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });


        


        ActualizarClienteItem.setLabel("Actualizar Cliente");
        ActualizarClienteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarClienteItemActionPerformed(evt);
            }
        });
        jMenu1.add(ActualizarClienteItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Proveedor");

        RegistrarProveedorItem.setText("Registrar Proveedor");
        RegistrarProveedorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarProveedorItemActionPerformed(evt);
            }
        });
        jMenu2.add(RegistrarProveedorItem);

        ActualizarProveedorItem.setText("Actualizar Proveedor");
        ActualizarProveedorItem.setActionCommand("Actualizar Proveedor");
        ActualizarProveedorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarProveedorItemActionPerformed(evt);
            }
        });
        jMenu2.add(ActualizarProveedorItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Balance");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarClienteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarClienteItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarClienteItemActionPerformed

    private void ActualizarProveedorItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarProveedorItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualizarProveedorItemActionPerformed

    private void RegistrarProveedorItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarProveedorItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarProveedorItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "Hola Cliente");
    }//GEN-LAST:event_jMenu1ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ActualizarClienteItem;
    private javax.swing.JMenuItem ActualizarProveedorItem;
    private javax.swing.JMenuItem RegistrarClienteItem;
    private javax.swing.JMenuItem RegistrarProveedorItem;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
