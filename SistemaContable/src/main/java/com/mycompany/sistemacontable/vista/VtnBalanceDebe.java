/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemacontable.vista;

import com.mycompany.sistemacontable.controlador.Cliente_Controlador;
import com.mycompany.sistemacontable.controlador.Controlador_All;
import com.mycompany.sistemacontable.controlador.Debe_Controlador;
import com.mycompany.sistemacontable.controlador.Persona_Controlador;
import com.mycompany.sistemacontable.modelo.Cliente;
import com.mycompany.sistemacontable.modelo.Debe;
import com.mycompany.sistemacontable.modelo.Persona;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Usuario
 */
public class VtnBalanceDebe extends javax.swing.JFrame {

    /**
     * Creates new form VtnBalanceDebe
     */
    Cliente cli = null;
    Persona per = null;
    private String nombreCliente;
    private String apellidoCliente;
    private String cedulaCliente;
     
    
    
    public VtnBalanceDebe() {
        initComponents();
        metodo();
        
        
    }
    
    public void setDatoN(String datoN){
        this.nombreCliente = datoN;
        nombreC.setText(datoN);   
    }
    
    public void setDatoA(String datoA){
        this.apellidoCliente = datoA;
        apellidoC.setText(datoA);
    }
    
    public void setDatoC(String datoC){
        this.cedulaCliente = datoC;
        cedulaC.setText(datoC);
    }
    
    private void metodo(){
        txDebe.setModel(new Tabla_Debe(new Controlador_All().reflejar()));
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
        nombreC = new javax.swing.JLabel();
        apellidoC = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        detalle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txDebe = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cedulaC = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel1.setText("CLIENTE: ");

        nombreC.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N

        apellidoC.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel4.setText("TIPO DE PAGO:");

        comboTipo.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione --", "Efectivo", "Tarjeta de Débito", "Tarjeta de Crédito", "Transferencia Bancaria" }));
        comboTipo.setToolTipText("");
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel5.setText("VALOR:");

        valor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        valor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valor.setToolTipText("");
        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel6.setText("DETALLE:");

        detalle.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txDebe.setModel(new Tabla_Debe());
        jScrollPane1.setViewportView(txDebe);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("REFLEJAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("AGREGAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cedulaC.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cedulaC, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apellidoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apellidoC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cedulaC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton2)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BuscarCliente buscl=new BuscarCliente();
        buscl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoActionPerformed

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        cli = new Cliente_Controlador().getCliente(new Controlador_All().id_per(cedulaC.getText()));
        per = new Persona_Controlador().getPersona(cli.getPersona().getId());
        
        Debe deb=new Debe();
        String opcion=(String)comboTipo.getSelectedItem();
        if(opcion.equals("Seleccione --")){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna opcion");
        }else{
        //cli.setCedula(cedulaC.getText());
        deb.setCliente(cli);
        deb.setId(0);
        deb.setTipoPago(comboTipo.getSelectedItem().toString());
        deb.setValor(Double.parseDouble(valor.getText()));
        deb.setDetalle(detalle.getText());
        deb.setEstado("A");
        Debe_Controlador debC = new Debe_Controlador();
        debC.crear(deb);
        System.out.println("Resultado del label");
        System.out.println(nombreC.getText());
        limpiar();
        metodo();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
       new VtnBalanceGeneral().setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoC;
    private javax.swing.JLabel cedulaC;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JTextField detalle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreC;
    private javax.swing.JTable txDebe;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables

private void limpiar(){
    cedulaC.setText("");
    nombreC.setText("");
    apellidoC.setText("");
    valor.setText("");
    detalle.setText("");
    }

}
