/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.controlador;

import com.mycompany.sistemacontable.modelo.Persona;
import com.mycompany.sistemacontable.persistencia.ControladoraPersistencia;
import com.mycompany.sistemacontable.persistencia.PersonaJpaController;
import com.mycompany.sistemacontable.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author LegionXR
 */
public class Persona_Controlador {
   PersonaJpaController perJpa = new PersonaJpaController();
    
    public void crear(Persona persona){
        perJpa.create(persona);
    }
    
    public void eliminar(Persona persona) throws NonexistentEntityException{
        perJpa.destroy(persona.getId());
        
        
    }
    
    public void editar(Persona persona) throws Exception{
        perJpa.edit(persona);
        
    }
    
    public List<Persona>listaPersona(){
        
        
        return perJpa.findPersonaEntities();
                
    }
    
    public Persona getPersona (Persona persona){
        
        return perJpa.findPersona(persona.getId());
    }
}
