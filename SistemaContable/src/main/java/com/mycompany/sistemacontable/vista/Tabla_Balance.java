/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.vista;

import com.mycompany.sistemacontable.modelo.Balance;
import com.mycompany.sistemacontable.modelo.Cliente;
import com.mycompany.sistemacontable.modelo.DebeT;
import com.mycompany.sistemacontable.modelo.Detalle;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class Tabla_Balance extends AbstractTableModel{
    public String[] columnas = {"FECHA","NOTA","TOTAL","# DETALLE"};
    public Class[] columnasTipos = {String.class,String.class,String.class,Integer.class};
    List<Balance> listaBalance = new ArrayList<>();
    
    public Tabla_Balance(List<Balance> datos){
        super();
        listaBalance = new ArrayList<Balance>();
        this.listaBalance=datos;
    }

    public Tabla_Balance() {
    }
    
    public int getColumnCount(){
        return columnas.length;
    }
    
    public int getRowCount(){
        return listaBalance.size();
    }
    
    public void setValueAt(Object value, int row, int col){
        Balance emp = (Balance) (listaBalance.get(row));
        
        switch (col){
            case 0:
                emp.setFecha((Date) value);
                break;
            case 1:
                emp.setNota((String) value);
                break;
            case 2:
                emp.setTotal((Double) value);
            case 3:
                emp.setDetalle((Detalle) value);    
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
        Balance emp = (Balance) (listaBalance.get(row));
        
        switch (col){
            case 0:
                return emp.getFecha();
            case 1:
                return emp.getNota();
            case 2:
                return emp.getTotal();
             case 3:
                return emp.getDetalle().getId();    
          
        }
        return new String();
    }
}
