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
import com.mycompany.sistemacontable.modelo.EmpleadoT;
import com.mycompany.sistemacontable.modelo.Haber;
import com.mycompany.sistemacontable.modelo.HaberT;
import com.mycompany.sistemacontable.modelo.Persona;
import com.mycompany.sistemacontable.modelo.Proveedor;
import com.mycompany.sistemacontable.modelo.ProveedorT;
import com.mycompany.sistemacontable.persistencia.ClienteJpaController;
import com.mycompany.sistemacontable.persistencia.DebeJpaController;
import com.mycompany.sistemacontable.persistencia.EmpleadoJpaController;
import com.mycompany.sistemacontable.persistencia.HaberJpaController;
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

    public Cliente clientes(int id) {
        List<Cliente> lisp = new ClienteJpaController().getList();
        Cliente cli = new Cliente();
        //System.out.println("dimension "+lis_id.size());
        for (int i = 0; i < lisp.size(); i++) {
            if (lisp.get(i).getId() == id) {
                cli = lisp.get(i);
            }
        }

        return cli;
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

    public double sumaValor(double valor) {
        List<Debe> lisd = new DebeJpaController().getList();
        double suma = 0;
        for (int i = 0; i < lisd.size(); i++) {
            if (lisd.get(i).getValor() == valor) {
                suma = suma + lisd.get(i).getValor();
            }
        }
        return suma;
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

    public int id_perP(String ruc) {

        int id = 0;
        List<Proveedor> lisp = new ProveedorJpaController().getList();

        List<Integer> lisp_c = new ArrayList<>();

        for (int i = 0; i < lisp.size(); i++) {
            if (lisp.get(i).getRuc().equals(ruc)) {
                id = lisp.get(i).getId();
                break;

            }

        }

        return id;
    }

    public int id_perEI(String cedula) {
        int id = 0;
        List<Empleado> lise = new EmpleadoJpaController().getList();

        List<Integer> lisp_c = new ArrayList<>();

        for (int i = 0; i < lise.size(); i++) {
            if (lise.get(i).getCedula().equals(cedula)) {
                id = lise.get(i).getId();
                break;
            }
        }
        return id;
    }

    public int id_perEC(String codigo) {
        int id = 0;

        List<Empleado> lise = new EmpleadoJpaController().getList();

        List<Integer> lisp_c = new ArrayList<>();

        for (int i = 0; i < lise.size(); i++) {
            if (lise.get(i).getCodigoEmleado().equals(codigo)) {
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

    public ArrayList<DebeT> reflejar() {
        List<Debe> listad = new DebeJpaController().getList();
        List<Cliente> listac = new ClienteJpaController().getList();
        ArrayList<DebeT> lx = new ArrayList<>();

        System.out.println("****** LX *****");
        System.out.println(lx.size() + "lista LX");
        System.out.println("****** DEBE *****");
        System.out.println(listad.size() + "lista DEBE");
        System.out.println("****** CLIENTE *****");
        System.out.println(listac.size() + "lista CLIENTE");

        int id = 0;

        for (int i = 0; i < listac.size(); i++) {
            for (int j = 0; j < listad.size(); j++) {
                if (listac.get(i).getId() == listad.get(j).getCliente().getId()) {
                    DebeT deb = new DebeT();
                    deb.setNombre(listad.get(j).getCliente().getPersona().getNombre());
                    deb.setApellido(listad.get(j).getCliente().getPersona().getApellido());
                    deb.setTipoPago(listad.get(j).getTipoPago());
                    deb.setValor(listad.get(j).getValor());
                    deb.setDetalle(listad.get(j).getDetalle());

                    lx.add(deb);
                }
            }
        }
        return lx;
    }

    public ArrayList<HaberT> reflejarHaber() {
        List<Haber> listah = new HaberJpaController().getList();
        List<Proveedor> listap = new ProveedorJpaController().getList();
        List<Empleado> listae = new EmpleadoJpaController().getList();
        ArrayList<HaberT> lh = new ArrayList<>();
        int id = 0;
        System.out.println("****** LX *****");
        System.out.println(lh.size() + "lista LX");
        System.out.println("****** HABER *****");
        System.out.println(listah.size() + "lista HABER");
        System.out.println("****** EMPLEADO *****");
        System.out.println(listae.size() + " - lista EMPLEADO");
        System.out.println("****** PROVEEDOR *****");
        System.out.println(listap.size() + " - lista PROVEEDOR");

        for (int i = 0; i < listah.size(); i++) {
            
            
            for (int j = 0; j < listae.size(); j++) {
                if (listah.get(i).getEmpleado().getId()==listae.get(j).getId() && listae.get(j).getId()!=1  ) {
                    HaberT hab = new HaberT();
                    hab.setNombre(listah.get(i).getEmpleado().getPersona().getNombre());
                    hab.setApellido(listah.get(i).getEmpleado().getPersona().getApellido());
                    hab.setTipoBeneficiario(listah.get(i).getTipoBeneficiario());
                    hab.setDetalle(listah.get(i).getDetalle());
                    hab.setTipoPago(listah.get(i).getTipoPago());
                    hab.setValor(listah.get(i).getValor());

                    lh.add(hab);
                
            }
                }
                   for (int k = 0; k < listap.size(); k++) {
                       if (listah.get(i).getProveedor().getId()==listap.get(k).getId() && listap.get(k).getId()!=2  ) {
                        HaberT hab = new HaberT();
                    hab.setNombre(listah.get(i).getProveedor().getPersona().getNombre());
                    hab.setApellido(listah.get(i).getProveedor().getPersona().getApellido());
                    hab.setTipoBeneficiario(listah.get(i).getTipoBeneficiario());
                    hab.setDetalle(listah.get(i).getDetalle());
                    hab.setTipoPago(listah.get(i).getTipoPago());
                    hab.setValor(listah.get(i).getValor());

                    lh.add(hab);
                   } 
                }
                   for (int l = 0; l < listap.size(); l++) {
                       if (listah.get(i).getProveedor().getId()==2 && listap.get(l).getId()==listah.get(i).getProveedor().getId() && listah.get(i).getEmpleado().getId()==1 && listah.get(i).getEmpleado().getId()==listae.get(l).getId()  ) {
                        HaberT hab = new HaberT();
                    hab.setNombre(listah.get(i).getProveedor().getPersona().getNombre());
                    hab.setApellido(listah.get(i).getProveedor().getPersona().getApellido());
                    hab.setTipoBeneficiario(listah.get(i).getTipoBeneficiario());
                    hab.setDetalle(listah.get(i).getDetalle());
                    hab.setTipoPago(listah.get(i).getTipoPago());
                    hab.setValor(listah.get(i).getValor());

                    lh.add(hab);
                   } 
                }
                
            
            
            
                
        }

        
        return lh;
    }
    
    

    public ArrayList<EmpleadoT> generarC(String codigo) {
        List<Empleado> listax = new EmpleadoJpaController().getList();

        codigo = codigo.trim();
        int num = 0;

        ArrayList<EmpleadoT> lx = new ArrayList<>();

        for (int i = 0; i < listax.size(); i++) {
            String no = listax.get(i).getCodigoEmleado();
            String n = "";
            int dim = 0;
            if (no.length() <= codigo.length()) {
                dim = no.length();
            } else {
                dim = codigo.length();
            }
            for (int f = 0; f < dim; f++) {
                if (!(codigo.substring(f, f + 1).toUpperCase().equals(no.substring(f, f + 1).toUpperCase()))) {

                    break;

                } else {
                    if (f == codigo.length() - 1) {

                        EmpleadoT cl = new EmpleadoT();
                        cl.setCedula(listax.get(i).getCedula());
                        cl.setNombre(personas(listax.get(i).getPersona().getId()).getNombre());
                        cl.setApellido(personas(listax.get(i).getPersona().getId()).getApellido());
                        cl.setCargo(listax.get(i).getCargo());
                        cl.setCodigoEmpleado(listax.get(i).getCodigoEmleado());
                        cl.setDireccion(personas(listax.get(i).getPersona().getId()).getDireccion());
                        cl.setTelefono(personas(listax.get(i).getPersona().getId()).getTelefono());
                        lx.add(cl);

                    }
                }

            }
        }

        return lx;

    }

}
