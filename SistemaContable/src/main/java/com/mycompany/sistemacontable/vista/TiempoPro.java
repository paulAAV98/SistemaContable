/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.vista;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class TiempoPro {
    
    Calendar fecha = new GregorianCalendar();
    
    String anio = Integer.toString(fecha.get(Calendar.YEAR));
    String mes = Integer.toString(fecha.get(Calendar.MONTH)+1);
    String dia = Integer.toString(fecha.get(Calendar.DATE));
    
    String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String minuto = Integer.toString(fecha.get(Calendar.MINUTE));
    String segundo = Integer.toString(fecha.get(Calendar.SECOND));
    
    
    String fechacomp = anio+" - 0"+mes+" - "+dia+" "+hora+":"+minuto+":"+segundo;
    
    String fechacomp1 = anio+"-0"+mes+"-"+dia+"-"+hora+"-"+minuto+"-"+segundo;

    public String getFechacomp1() {
        return fechacomp1;
    }
    
    
    
    
}
