/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.vista;

import com.mycompany.sistemacontable.modelo.HaberT;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class Tabla_Haber extends AbstractTableModel {

    public String[] columnas = {"NOMBRE", "APELLIDO", "BENEFICIARIO", "DESCRIPCION", "TIPO DE PAGO", "VALOR"};
    public Class[] columnasTipos = {String.class, String.class, String.class, String.class, String.class, double.class};
    ArrayList<HaberT> listaHaberes = new ArrayList<>();

    public Tabla_Haber(ArrayList<HaberT> datos) {
        super();
        listaHaberes = new ArrayList<HaberT>();
        this.listaHaberes = datos;
    }

    public Tabla_Haber() {

    }

    public int getColumnCount() {
        return columnas.length;
    }

    public int getRowCount() {
        return listaHaberes.size();
    }

    public void setValueAt(Object value, int row, int col) {
        HaberT hab = (HaberT) (listaHaberes.get(row));

        switch (col) {
            case 0:
                hab.setNombre((String) value);
                break;
            case 1:
                hab.setApellido((String) value);
                break;
            case 2:
                hab.setTipoBeneficiario((String) value);
                break;
            case 3:
                hab.setDetalle((String) value);
                break;
            case 4:
                hab.setTipoPago((String) value);
                break;
            case 5:
                hab.setValor((double) value);
                break;

        }

    }

    public String getColumnName(int col) {
        return columnas[col];
    }

    public Class getColumnClass(int col) {
        return columnasTipos[col];
    }
    
    public Object getValueAt(int row, int col){
        HaberT hab = (HaberT) (listaHaberes.get(row));
        
        switch (col) {
            case 0:
                return hab.getNombre();
            case 1:
                return hab.getApellido();
            case 2:
                return hab.getTipoBeneficiario();
            case 3:
                return hab.getDetalle();
            case 4: 
                return hab.getTipoPago();
            case 5:
                return hab.getValor();
            
        }
        return new String();
    }
}
