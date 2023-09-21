/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemacontable.vista;

import com.mycompany.sistemacontable.controlador.Controlador_All;
import com.mycompany.sistemacontable.modelo.Cliente;
import com.mycompany.sistemacontable.modelo.ClienteT;
import com.mycompany.sistemacontable.modelo.Persona;
import com.mycompany.sistemacontable.modelo.Proveedor;
import com.mycompany.sistemacontable.modelo.ProveedorT;
import com.mycompany.sistemacontable.persistencia.ClienteJpaController;
import com.mycompany.sistemacontable.persistencia.PersonaJpaController;
import com.mycompany.sistemacontable.persistencia.ProveedorJpaController;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
public class BuscarProveedor extends javax.swing.JFrame {

    /**
     * Creates new form BuscarProveedor
     */
    public BuscarProveedor() {
        
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

        xProveedor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ruc = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txProveedor = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        xProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xProveedorActionPerformed(evt);
            }
        });
        xProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                xProveedorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                xProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xProveedorKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel1.setText("PROVEEDOR: ");

        ruc.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N

        apellido.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N

        nombre.setFont(new java.awt.Font("Garamond", 0, 16)); // NOI18N

        txProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txProveedor);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("ENVIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(xProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(xProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ruc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xProveedorActionPerformed

    private void xProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xProveedorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_xProveedorKeyPressed

    private void xProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xProveedorKeyReleased
        // TODO add your handling code here:
        metodo();
    }//GEN-LAST:event_xProveedorKeyReleased

    private void xProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xProveedorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_xProveedorKeyTyped

    private void txProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txProveedorMouseClicked
        // TODO add your handling code here:
        ruc.setText((String) txProveedor.getValueAt(txProveedor.getSelectedRow(), 0));
        nombre.setText((String) txProveedor.getValueAt(txProveedor.getSelectedRow(), 1));
        apellido.setText((String) txProveedor.getValueAt(txProveedor.getSelectedRow(), 2));
        
    }//GEN-LAST:event_txProveedorMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VtnBalanceHaber vtnHaber = new VtnBalanceHaber();
        vtnHaber.setDatoRP(ruc.getText());
        vtnHaber.setDatoNP(nombre.getText());
        vtnHaber.setDatoAP(apellido.getText());
        vtnHaber.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel ruc;
    private javax.swing.JTable txProveedor;
    private javax.swing.JTextField xProveedor;
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

        imprimirEmpresa(xProveedor.getText());

        txProveedor.setModel(new Tabla_Proveedor (new Controlador_All().generarl(xProveedor.getText())));

        //System.out.println("holaaa");
        /* 
            
        }*/
    }
    
    

    /*private ArrayList<ProveedorT> generarl(String empresa) {
        List<Proveedor> listax = new ProveedorJpaController().getList();
        List<Persona> listaxc = new PersonaJpaController().getList();
        System.out.println(listax.size() + "sadsadassssssssssssss");
        empresa = empresa.trim();
        int num = 0;

        ArrayList<ProveedorT> lx = new ArrayList<>();

        for (int i = 0; i < listax.size(); i++) {
            String no = listax.get(i).getEmpresa();
            String n = "";
            int dim = 0;
            if (no.length() <= empresa.length()) {
                dim = no.length();
            } else {
                dim = empresa.length();
            }
            for (int f = 0; f < dim; f++) {
                if (!(empresa.substring(f, f + 1).equals(no.substring(f, f + 1)))) {

                    break;

                } else {
                    if (f == empresa.length() - 1) {
                        ProveedorT pro=new ProveedorT();
                        pro.setRuc(listax.get(i).getRuc());
                        pro.setNombre(personas(listax.get(i).getPersona().getId()).getNombre());
                        pro.setApellido(personas(listax.get(i).getPersona().getId()).getApellido());
                        pro.setTelefono(personas(listax.get(i).getPersona().getId()).getDireccion());
                        pro.setDireccion(personas(listax.get(i).getPersona().getId()).getDireccion());
                        pro.setEmpresa(listax.get(i).getEmpresa());
                        lx.add(pro);
                    }
                }

            }
        }
        return lx;

    }
*/
    void imprimirEmpresa(String empresa) {

        for (int i = 0; i < new Controlador_All().generarl(empresa).size(); i++) {
            System.out.println(new Controlador_All().generarl(empresa).get(i));
            System.out.println("--------------------------------------");

        }
    }

    
}
