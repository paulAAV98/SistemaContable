/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.controlador;

import com.mycompany.sistemacontable.modelo.Cliente;
import com.mycompany.sistemacontable.modelo.ClienteT;
import com.mycompany.sistemacontable.modelo.Debe;
import com.mycompany.sistemacontable.modelo.DebeT;
import com.mycompany.sistemacontable.modelo.Empleado;
import com.mycompany.sistemacontable.modelo.Persona;
import com.mycompany.sistemacontable.modelo.Proveedor;
import com.mycompany.sistemacontable.modelo.ProveedorT;
import com.mycompany.sistemacontable.persistencia.ClienteJpaController;
import com.mycompany.sistemacontable.persistencia.DebeJpaController;
import com.mycompany.sistemacontable.persistencia.EmpleadoJpaController;
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

    public List<Integer> listapersonas() {

        List<Persona> lisp = new PersonaJpaController().getList();

        List<Integer> lisp_c = new ArrayList<>();

        for (int i = 0; i < lisp.size(); i++) {
            lisp_c.add(lisp.get(i).getId());

        }

        return lisp_c;
    }

    public int valor_id() {
        List<Integer> lis_id = listapersonas();
        int id = 0;
        System.out.println("dimension " + lis_id.size());
        for (int i = 0; i < lis_id.size(); i++) {
            if (lis_id.get(i) > id) {
                id = lis_id.get(i);

            }
        }

        return id;
    }

    public List<Integer> listaclientes() {

        List<Cliente> lisp = new ClienteJpaController().getList();

        List<Integer> lisp_c = new ArrayList<>();

        for (int i = 0; i < lisp.size(); i++) {
            lisp_c.add(lisp.get(i).getPersona().getId());

        }

        return lisp_c;
    }

    public List<Integer> listaempleados() {
        List<Empleado> lisp = new EmpleadoJpaController().getList();

        List<Integer> lisp_c = new ArrayList<>();

        for (int i = 0; i < lisp.size(); i++) {
            lisp_c.add(lisp.get(i).getId());
        }

        return lisp_c;
    }

    public List<Integer> listaProveedores() {

        List<Proveedor> lisp = new ProveedorJpaController().getList();

        List<Integer> lisp_c = new ArrayList<>();

        for (int i = 0; i < lisp.size(); i++) {
            lisp_c.add(lisp.get(i).getId());

        }

        return lisp_c;
    }

    public List<Integer> listaDebes() {

        List<Debe> lisp = new DebeJpaController().getList();

        List<Integer> lisp_c = new ArrayList<>();

        for (int i = 0; i < lisp.size(); i++) {
            lisp_c.add(lisp.get(i).getId());

        }

        return lisp_c;
    }

    public int valor_idc() {
        List<Integer> lis_id = listaclientes();
        int id = 0;
        System.out.println("dimension " + lis_id.size());
        for (int i = 0; i < lis_id.size(); i++) {
            if (lis_id.get(i) > id) {
                id = lis_id.get(i);

            }
        }

        return id;
    }

    public int valor_ide() {
        List<Integer> lis_id = listaempleados();
        int id = 0;
        System.out.println("dimension" + lis_id.size());
        for (int i = 0; i < lis_id.size(); i++) {
            if (lis_id.get(i) > id) {
                id = lis_id.get(i);
            }
        }
        return id;
    }

    public String valor_cedula(int id) {
        List<Cliente> lisp = new ClienteJpaController().getList();
        String cedula = "";
        //System.out.println("dimension "+lis_id.size());
        for (int i = 0; i < lisp.size(); i++) {
            if (lisp.get(i).getPersona().getId() == id) {
                cedula = lisp.get(i).getCedula();
            }
        }

        return cedula;

    }

    public Persona personas(int id) {
        List<Persona> lisp = new PersonaJpaController().getList();
        Persona per = new Persona();
        //System.out.println("dimension "+lis_id.size());
        for (int i = 0; i < lisp.size(); i++) {
            if (lisp.get(i).getId() == id) {
                per = lisp.get(i);
            }
        }

        return per;
    }

    public String valor_empresa(int id) {
        List<Proveedor> lisp = new ProveedorJpaController().getList();
        String empresa = "";
        //System.out.println("dimension "+lis_id.size());
        for (int i = 0; i < lisp.size(); i++) {
            if (lisp.get(i).getPersona().getId() == id) {
                empresa = lisp.get(i).getEmpresa();
            }
        }

        return empresa;
    }

    public int valor_idp() {
        List<Integer> lis_id = listaProveedores();
        int id = 0;
        System.out.println("dimension " + lis_id.size());
        for (int i = 0; i < lis_id.size(); i++) {
            if (lis_id.get(i) > id) {
                id = lis_id.get(i);

            }
        }

        return id;
    }

    public int valor_idd() {
        List<Integer> lis_id = listaDebes();
        int id = 0;
        System.out.println("dimension " + lis_id.size());
        for (int i = 0; i < lis_id.size(); i++) {
            if (lis_id.get(i) > id) {
                id = lis_id.get(i);

            }
        }

        return id;
    }

    public int id_per(String cedula) {

        int id = 0;
        List<Cliente> lisp = new ClienteJpaController().getList();

        List<Integer> lisp_c = new ArrayList<>();

        for (int i = 0; i < lisp.size(); i++) {
            if (lisp.get(i).getCedula().equals(cedula)) {
                id = lisp.get(i).getId();
                break;

            }

        }

        return id;
    }

    public int id_perP(String cedula) {

        int id = 0;
        List<Proveedor> lisp = new ProveedorJpaController().getList();

        List<Integer> lisp_c = new ArrayList<>();

        for (int i = 0; i < lisp.size(); i++) {
            if (lisp.get(i).getRuc().equals(cedula)) {
                id = lisp.get(i).getId();
                break;

            }

        }

        return id;
    }
    
    public int id_perE(String cedula){
        int id = 0;
        List<Empleado> lise = new EmpleadoJpaController().getList();
        
        List<Integer> lisp_c = new ArrayList<>();
        
        for(int i = 0; i < lise.size(); i++){
            if(lise.get(i).getCedula().equals(cedula)){
                id = lise.get(i).getId();
                break;
            }
        }
        return id;
    }
    
    public int id_perEE(String codigo){
        int id = 0;
        
        List<Empleado> lise = new EmpleadoJpaController().getList();
        
        List<Integer> lisp_c = new ArrayList<>();
        
        for(int i=0; i<lise.size(); i++){
            if(lise.get(i).getCodigoEmleado().equals(codigo)){
                id = lise.get(i).getId();
                break;
            }
        }
        return id;
    }

    public ArrayList<ClienteT> generar(String nombre) {
        List<Persona> listax = new PersonaJpaController().getList();
        // System.out.println(listax.size()+"sadsadassssssssssssss");
        nombre = nombre.trim();
        int num = 0;

        ArrayList<ClienteT> lx = new ArrayList<>();

        for (int i = 0; i < listax.size(); i++) {
            String no = listax.get(i).getNombre();
            String n = "";
            int dim = 0;
            if (no.length() <= nombre.length()) {
                dim = no.length();
            } else {
                dim = nombre.length();
            }
            for (int f = 0; f < dim; f++) {
                if (!(nombre.substring(f, f + 1).toUpperCase().equals(no.substring(f, f + 1).toUpperCase()))) {

                    break;

                } else {
                    if (f == nombre.length() - 1) {
                        if (!valor_cedula(listax.get(i).getId()).equals("")) {

                            ClienteT cl = new ClienteT();
                            cl.setCedula(valor_cedula(listax.get(i).getId()));
                            cl.setNombre(listax.get(i).getNombre());
                            cl.setApellido(listax.get(i).getApellido());
                            cl.setDireccion(listax.get(i).getDireccion());
                            cl.setTelefono(listax.get(i).getTelefono());
                            lx.add(cl);
                        }
                    }

                }
            }
        }
        return lx;

    }

    public ArrayList<ProveedorT> generarl(String empresa) {
        List<Proveedor> listax = new ProveedorJpaController().getList();

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
                if (!(empresa.substring(f, f + 1).toUpperCase().equals(no.substring(f, f + 1).toUpperCase()))) {

                    break;

                } else {
                    if (f == empresa.length() - 1) {

                        ProveedorT cl = new ProveedorT();
                        cl.setRuc(listax.get(i).getRuc());
                        cl.setNombre(personas(listax.get(i).getPersona().getId()).getNombre());
                        cl.setApellido(personas(listax.get(i).getPersona().getId()).getApellido());
                        cl.setDireccion(personas(listax.get(i).getPersona().getId()).getDireccion());
                        cl.setTelefono(personas(listax.get(i).getPersona().getId()).getTelefono());
                        cl.setEmpresa(listax.get(i).getEmpresa());
                        lx.add(cl);

                    }
                }

            }
        }

        return lx;

    }

}
