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
 * @author LegionXR
 */
@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cli_id")
    private int id;

    @Column(name = "cli_cedula")
    private String cedula;

    @Column(name = "cli_correo")
    private String correo;

    @OneToOne
    @JoinColumn(name = "id_cli_per")
    private Persona persona;

    public Cliente(int id, String cedula, String correo, Persona persona) {
        this.id = id;
        this.cedula = cedula;
        this.correo = correo;
        this.persona = persona;
    }

    public Cliente() {
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public int getId() {
        return id;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

}
