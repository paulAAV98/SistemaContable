/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.vista;

import com.mycompany.sistemacontable.modelo.Cliente;
import com.mycompany.sistemacontable.modelo.DebeT;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class Tabla_Debe extends AbstractTableModel{
    public String[] columnas = {"NOMBRE CLIENTE","APELLIDO CLIENTE","DESCRIPCION","TIPO DE PAGO","VALOR"};
    public Class[] columnasTipos = {String.class,String.class,String.class,double.class,String.class};
    ArrayList<DebeT> listaDebes = new ArrayList<>();
    
    public Tabla_Debe(ArrayList<DebeT> datos){
        super();
        listaDebes = new ArrayList<DebeT>();
        this.listaDebes=datos;
    }

    public Tabla_Debe() {
    }
    
    public int getColumnCount(){
        return columnas.length;
    }
    
    public int getRowCount(){
        return listaDebes.size();
    }
    
    public void setValueAt(Object value, int row, int col){
        DebeT emp = (DebeT) (listaDebes.get(row));
        
        switch (col){
            case 0:
                emp.setNombre((String) value);
                break;
            case 1:
                emp.setApellido((String) value);
                break;
            case 2:
                emp.setDetalle((String) value);
                break;
            case 3:
                emp.setDetalle((String) value);
                break;
            case 4:
                emp.setValor((double) value);
                break;
                
          
            
        }
        
    }
    
    public String getColumnName(int col){
        return columnas[col];
    }
    
    public Class getColumnClass(int col){
        return columnasTipos[col];
    }
    
    public Object getValueAt(int row, int col){
        DebeT emp = (DebeT) (listaDebes.get(row));
        
        switch (col){
            case 0:
                return emp.getNombre();
            case 1:
                return emp.getApellido();
            case 2:
                return emp.getDetalle();
            case 3:
                return emp.getTipoPago();
            case 4:
                return emp.getValor();
        }
        return new String();
    }
}
