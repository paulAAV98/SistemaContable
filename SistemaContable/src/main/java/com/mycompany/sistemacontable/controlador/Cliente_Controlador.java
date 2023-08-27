/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.controlador;

import com.mycompany.sistemacontable.modelo.Balance;
import com.mycompany.sistemacontable.modelo.Cliente;
import com.mycompany.sistemacontable.modelo.Persona;
import com.mycompany.sistemacontable.persistencia.BalanceJpaController;
import com.mycompany.sistemacontable.persistencia.ClienteJpaController;
import com.mycompany.sistemacontable.persistencia.ControladoraPersistencia;
import com.mycompany.sistemacontable.persistencia.PersonaJpaController;
import com.mycompany.sistemacontable.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author LegionXR
 */
public class Cliente_Controlador {
    ClienteJpaController cliJpa = new ClienteJpaController();
    
    public void crear(Cliente cliente){
        cliJpa.create(cliente);
    }
    
    public void eliminar(Balance balance) throws NonexistentEntityException{
        cliJpa.destroy(balance.getId());
        
        
    }
    
    public void editar(Cliente cliente) throws Exception{
       cliJpa.edit(cliente);
        
    }
    
    public List<Cliente>listaCliente(){
        
        
        return cliJpa.findClienteEntities();
                
    }
    
    public Cliente getBalance (Cliente cliente){
        
        return cliJpa.findClienteC(cliente.getCedula());
    }
}
