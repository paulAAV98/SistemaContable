/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.controlador;

import com.mycompany.sistemacontable.modelo.Empleado;
import com.mycompany.sistemacontable.persistencia.EmpleadoJpaController;
import com.mycompany.sistemacontable.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Empleado_Controlador {
    
    EmpleadoJpaController empJpa = new EmpleadoJpaController();
    
    public void crear(Empleado empleado){
        empJpa.create(empleado);
    }
    
    public void eliminar(Empleado empleado) throws NonexistentEntityException{
        empJpa.destroy(empleado.getId());
    }
    
    public void editar(Empleado empleado) throws Exception{
        empJpa.edit(empleado);
    }
    
    public List<Empleado> listaEmpleado(){
        return empJpa.findEmpleadoEntities();
    }
    
    public Empleado getEmpleado(int id){
        return empJpa.findEmpleado(id);
    }
    
}
