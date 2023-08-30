/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.controlador;

import com.mycompany.sistemacontable.modelo.Cliente;
import com.mycompany.sistemacontable.modelo.Persona;
import com.mycompany.sistemacontable.modelo.Proveedor;
import com.mycompany.sistemacontable.persistencia.ClienteJpaController;
import com.mycompany.sistemacontable.persistencia.PersonaJpaController;
import com.mycompany.sistemacontable.persistencia.ProveedorJpaController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LegionXR
 */
public class Controlador_All {

    List<Integer> lisx(String cedula) {
        List<Integer> lista = new ArrayList<>();
        List<Integer> lista1 = new ArrayList<>();
        int sum = 0;
        int cont = 1;

        for (int i = 0; i < cedula.length(); i++) {
            lista.add(Integer.parseInt(cedula.substring(i, i + 1)));

        }

        return lista;
    }

    int Suma(List<Integer> lista) {
        int sum = 0;
        int cont = 1;
        for (int i = 0; i < lista.size() - 1; i++) {

            if (cont % 2 == 0) {
                sum = sum + lista.get(i);

            } else {

                sum = sum + res(lista.get(i));
                //System.out.println(res(lista.get(i)));

            }
            cont++;

        }
        return sum;
    }

    int res(int num) {
        if (num * 2 >= 10) {
            return (num * 2) - 9;

        } else {

            return num * 2;
        }

    }

    int modulo(int num) {
        return num % 10;
    }

    int resta(int num) {
        //JOptionPane.showMessageDialog(null,num);
        if (num != 0) {
            return 10 - num;
        } else {

            return 0;
        }

    }

    public boolean Cedula(String num) {

        int ultimo = lisx(num).get(lisx(num).size() - 1);

        if (resta(modulo(Suma(lisx(num)))) == ultimo) {
            return true;

        } else {
            return false;
        }

    }
    
    public List<Integer>listapersonas(){
        
        List<Persona>lisp=new PersonaJpaController().getList();
        
        List<Integer>lisp_c=new ArrayList<>();
        
        for (int i = 0; i < lisp.size(); i++) {
            lisp_c.add(lisp.get(i).getId());
            
        }
        
        return lisp_c;
    }
    
    public int valor_id(){
        List<Integer>lis_id=listapersonas();
        int id=0;
        System.out.println("dimension "+lis_id.size());
        for (int i = 0; i < lis_id.size(); i++) {
            if (lis_id.get(i)>id) {
                id=lis_id.get(i);
            
                }
        }
        
        return id;
    }
    
    
    public List<Integer>listaclientes(){
        
        List<Cliente>lisp=new ClienteJpaController().getList();
        
        List<Integer>lisp_c=new ArrayList<>();
        
        for (int i = 0; i < lisp.size(); i++) {
            lisp_c.add(lisp.get(i).getId());
            
        }
        
        return lisp_c;
    }
    
    public List<Integer>listaProveedores(){
        
        List<Proveedor>lisp=new ProveedorJpaController().getList();
        
        List<Integer>lisp_c=new ArrayList<>();
        
        for (int i = 0; i < lisp.size(); i++) {
            lisp_c.add(lisp.get(i).getId());
            
        }
        
        return lisp_c;
    }
    
    public int valor_idc(){
        List<Integer>lis_id=listaclientes();
        int id=0;
        System.out.println("dimension "+lis_id.size());
        for (int i = 0; i < lis_id.size(); i++) {
            if (lis_id.get(i)>id) {
                id=lis_id.get(i);
            
                }
        }
        
        return id;
    }
    
     public int valor_idp(){
        List<Integer>lis_id=listaProveedores();
        int id=0;
        System.out.println("dimension "+lis_id.size());
        for (int i = 0; i < lis_id.size(); i++) {
            if (lis_id.get(i)>id) {
                id=lis_id.get(i);
            
                }
        }
        
        return id;
    }
    
     public int id_per(String cedula){
        
         int id=0;
        List<Cliente>lisp=new ClienteJpaController().getList();
        
        List<Integer>lisp_c=new ArrayList<>();
        
        for (int i = 0; i < lisp.size(); i++) {
            if (lisp.get(i).getCedula().equals(cedula)) {
                id=lisp.get(i).getId();
                break;
                
            }
            
        }
        
        return id;
    }
    
    
    
}
