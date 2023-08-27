/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.controlador;

import com.mycompany.sistemacontable.modelo.Balance;
import com.mycompany.sistemacontable.modelo.Detalle;
import com.mycompany.sistemacontable.modelo.Persona;
import com.mycompany.sistemacontable.persistencia.BalanceJpaController;
import com.mycompany.sistemacontable.persistencia.ControladoraPersistencia;
import com.mycompany.sistemacontable.persistencia.DetalleJpaController;
import com.mycompany.sistemacontable.persistencia.PersonaJpaController;
import com.mycompany.sistemacontable.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author LegionXR
 */
public class Detalle_Controlador {
    DetalleJpaController detJpa = new DetalleJpaController();
    
    public void crear(Detalle detalle){
        detJpa.create(detalle);
    }
    
    
    
    
    
    public List<Detalle>listaDetalle(){
        
        
        return detJpa.findDetalleEntities();
                
    }
    
    public Detalle getDetalle (Detalle detalle){
        
        return detJpa.findDetalle(detalle.getId());
    }
}
