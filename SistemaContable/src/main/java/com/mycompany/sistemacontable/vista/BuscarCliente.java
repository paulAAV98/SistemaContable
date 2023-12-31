/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemacontable.vista;

import com.mycompany.sistemacontable.controlador.Controlador_All;
import com.mycompany.sistemacontable.modelo.Cliente;
import com.mycompany.sistemacontable.modelo.ClienteT;
import com.mycompany.sistemacontable.modelo.Persona;
import com.mycompany.sistemacontable.persistencia.ClienteJpaController;
import com.mycompany.sistemacontable.persistencia.PersonaJpaController;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class BuscarCliente extends javax.swing.JFrame {

    /**
     * Creates new form BuscarCliente
     */
    
    public BuscarCliente() {
        initComponents();
        crear_lista();
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xx = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txCliente = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombrec = new javax.swing.JLabel();
        apellidoc = new javax.swing.JLabel();
        cedulac = new javax.swing.JLabel();

        xx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xxActionPerformed(evt);
            }
        });
        xx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                xxKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                xxKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xxKeyTyped(evt);
            }
        });

        txCliente.setModel(new Tabla_Clientes());
        txCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txCliente);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("ENVIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel1.setText("CLIENTE:");

        nombrec.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N

        apellidoc.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N

        cedulac.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(xx, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cedulac, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nombrec, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(apellidoc, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(xx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombrec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(apellidoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cedulac, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VtnBalanceDebe vtnDebe = new VtnBalanceDebe();
        vtnDebe.setDatoN(nombrec.getText());
        vtnDebe.setDatoA(apellidoc.getText());
        vtnDebe.setDatoC(cedulac.getText());
        vtnDebe.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void xxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xxKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_xxKeyPressed

    private void xxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xxKeyReleased
        // TODO add your handling code here:
        metodo();
    }//GEN-LAST:event_xxKeyReleased

    private void xxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xxKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_xxKeyTyped

    private void txClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txClienteMouseClicked
        // TODO add your handling code here:
        cedulac.setText((String) txCliente.getValueAt(txCliente.getSelectedRow(), 0));
        nombrec.setText((String) txCliente.getValueAt(txCliente.getSelectedRow(), 1));
        apellidoc.setText((String) txCliente.getValueAt(txCliente.getSelectedRow(), 2));
    }//GEN-LAST:event_txClienteMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoc;
    private javax.swing.JLabel cedulac;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombrec;
    private javax.swing.JTable txCliente;
    private javax.swing.JTextField xx;
    // End of variables declaration//GEN-END:variables

    private void crear_lista() {
        /*listax.add("Juana");
        listax.add("Judas");
        listax.add("Juan");
        listax.add("Jose");
        listax.add("Manuel");
        listax.add("Marco");
        listax.add("Maria");
        listax.add("Flor");
        listax.add("Fernanda");
        listax.add("Fernando");
        listax.add("Andres");
        listax.add("Miguel");
        listax.add("Alvaro");
        listax.add("Luis");*/
    }
    
    private void metodo() {
        /*yy.setText("");
        //System.out.println(xx.getText());
        yy.setText(xx.getText());

        int dim = yy.getText().length();

        System.out.println(dim);*/
        //xx.doLayout();
        
        imprimir(xx.getText());
        
        
        
        txCliente.setModel(new Tabla_Clientes(new Controlador_All().generar(xx.getText())));
        
        //System.out.println("holaaa");
        
        

        /* 
            
        }*/
    }
    
     /*private ArrayList<ClienteT> generar(String nombre) {
        List<Cliente> listaxc = new ClienteJpaController().getList();
        List<Persona> listax = new PersonaJpaController().getList();
       // System.out.println(listax.size()+"sadsadassssssssssssss");
        nombre=nombre.trim();
        int num=0;

        ArrayList<ClienteT> lx = new ArrayList<>();

        for (int i = 0; i < listax.size(); i++) {
            String no=listax.get(i).getNombre();
             String n = "";
             int dim=0;
             if(no.length()<= nombre.length()){
                 dim=no.length();
             }else{
                 dim=nombre.length();
             }
            for (int f = 0; f < dim; f++) {
                if (!(nombre.substring(f,f+1).equals(no.substring(f,f+1)))) {
                   
                    break;

                }else{
                    if(f==nombre.length()-1){
                        ClienteT cl=new ClienteT();
                        cl.setCedula(listaxc.get(i).getCedula());
                        cl.setNombre(listax.get(i).getNombre());
                        cl.setApellido(listax.get(i).getApellido());
                        cl.setDireccion(listax.get(i).getDireccion());
                        cl.setTelefono(listax.get(i).getTelefono());
                        lx.add(cl);
                    }
                }
                
            }
        }
        return lx;
     }
*/

    
    
    void imprimir(String nombre){
        
        for (int i = 0; i < new Controlador_All().generar(nombre).size(); i++) {
            System.out.println(new Controlador_All().generar(nombre).get(i));
            System.out.println("--------------------------------------");
            
        }
        
    }
    

}