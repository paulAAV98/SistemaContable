/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Usuario
 */
@Entity
public class Empleado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int id;
    
    @Column(name = "emp_cedula")
    private String cedula;
    
    @Column(name = "emp_cargo")
    private String cargo;
    
    @Column(name = "emp_codigoEmpleado")
    private String codigoEmleado;
    
    @OneToOne
    @JoinColumn(name = "id_cli_per")
    private Persona persona;

    public Empleado(int id, String cedula, String cargo, String codigoEmleado, Persona persona) {
        this.id = id;
        this.cedula = cedula;
        this.cargo = cargo;
        this.codigoEmleado = codigoEmleado;
        this.persona = persona;
    }

    public Empleado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCodigoEmleado() {
        return codigoEmleado;
    }

    public void setCodigoEmleado(String codigoEmleado) {
        this.codigoEmleado = codigoEmleado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    +
    
    
    
    
    
    
}
