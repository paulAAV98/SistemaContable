/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.controlador;

import com.mycompany.sistemacontable.modelo.Balance;
import com.mycompany.sistemacontable.modelo.Persona;
import com.mycompany.sistemacontable.modelo.Proveedor;
import com.mycompany.sistemacontable.persistencia.BalanceJpaController;
import com.mycompany.sistemacontable.persistencia.ControladoraPersistencia;
import com.mycompany.sistemacontable.persistencia.PersonaJpaController;
import com.mycompany.sistemacontable.persistencia.ProveedorJpaController;
import com.mycompany.sistemacontable.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author LegionXR
 */
public class Proveedor_Controlador {
    ProveedorJpaController proJpa = new ProveedorJpaController();
    
    public void crear(Proveedor proveedor){
        proJpa.create(proveedor);
    }
    
    public void eliminar(Proveedor proveedor) throws NonexistentEntityException{
        proJpa.destroy(proveedor.getId());
        
        
    }
    
    public void editar(Proveedor proveedor) throws Exception{
        proJpa.edit(proveedor);
        
    }
    
    public List<Proveedor>listaProveedor(){
        
        
        return proJpa.findProveedorEntities();
                
    }
    
    public Proveedor getProveedor (Proveedor proveedor){
        
        return proJpa.findProveedor(proveedor.getId());
    }
}
