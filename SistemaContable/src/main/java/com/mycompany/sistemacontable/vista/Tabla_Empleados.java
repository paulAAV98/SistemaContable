/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.vista;

import com.mycompany.sistemacontable.modelo.EmpleadoT;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class Tabla_Empleados extends AbstractTableModel {

    public String[] columnas = {"CEDULA", "NOMBRE", "APELLIDO", "CARGO", "CODIGO EMPLEADO", "DIRECCION", "TELEFONO}"};
    public Class[] columnasTipos = {String.class, String.class, String.class, String.class, String.class, String.class, String.class};
    private ArrayList<EmpleadoT> listaEmpleados = new ArrayList<>();

    public Tabla_Empleados(ArrayList<EmpleadoT> datos) {
        super();
        listaEmpleados = new ArrayList<EmpleadoT>();
        this.listaEmpleados = datos;
    }

    public Tabla_Empleados() {
    }

    public int getColumnCount() {
        return columnas.length;
    }

    public int getRowCount() {
        return listaEmpleados.size();
    }

    public void setValueAt(Object value, int row, int col) {
        EmpleadoT emp = (EmpleadoT) (listaEmpleados.get(row));

        switch (col) {

            case 0:
                emp.setCedula((String) value);
                break;
            case 1:
                emp.setNombre((String) value);
                break;
            case 2:
                emp.setApellido((String) value);
                break;
            case 3:
                emp.setCargo((String) value);
                break;
            case 4:
                emp.setCodigoEmpleado((String) value);
                break;
            case 5:
                emp.setDireccion((String) value);
                break;
            case 6:
                emp.setTelefono((String) value);
                break;
        }
    }
    
    public String getColumnName(int col){
        return columnas[col];
    }
    
    public Class getColumnClass(int col){
        return columnasTipos[col];
    }
    
    public Object getValueAt(int row, int col) {
        EmpleadoT emp = (EmpleadoT) (listaEmpleados.get(row));
        
        switch (col){
            
            case 0:
                return emp.getCedula();
            case 1:
                return emp.getNombre();
            case 2:
                return emp.getApellido();
            case 3:
                return emp.getCargo();
            case 4:
                return emp.getCodigoEmpleado();
            case 5:
                return emp.getDireccion();
            case 6:
                return emp.getTelefono();
        }
        return new String();
    }

}
