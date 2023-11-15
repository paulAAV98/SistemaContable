/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.controlador;

import com.mycompany.sistemacontable.modelo.Debe;
import com.mycompany.sistemacontable.persistencia.DebeJpaController;
import com.mycompany.sistemacontable.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Debe_Controlador {
    
    DebeJpaController debJpa = new  DebeJpaController();
    
    public void crear(Debe debe){
        debJpa.create(debe);
    }
    
    public void eliminar(Debe debe) throws NonexistentEntityException {
        debJpa.destroy(debe.getId());
    }
    
    public void editar(Debe debe) throws Exception{
        debJpa.edit(debe);
    }
    
    public List<Debe> listaDebe(){
        return debJpa.findDebeEntities();
    }
    
    public Debe getDebe(Debe debe){
        return debJpa.findDebe(debe.getId());
    }
    
    public Debe getDebe(int id){
        return debJpa.findDebe(id);
    }
    
}
