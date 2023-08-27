/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sistemacontable;

import com.mycompany.sistemacontable.controlador.Persona_Controlador;
import com.mycompany.sistemacontable.modelo.Persona;
import com.mycompany.sistemacontable.persistencia.ControladoraPersistencia;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class SistemaContable {

    public static void main(String[] args) {
        //ControladoraPersistencia controlPersis = new ControladoraPersistencia();
       //  --------------------------Pruebas----------------------------------------------- 
        new Persona_Controlador().crear(new Persona(1,"Juan","Torres","Manuel Vega","0959147219"));
        new Persona_Controlador().crear(new Persona(1,"Maria","Vega","Calle Larga","0985623038"));
        Persona per=new Persona();
        per.setId(2);
        Persona per1 =new Persona_Controlador().getPersona(per);
        
        JOptionPane.showMessageDialog(null,per1.getNombre() );
        
    }
}
