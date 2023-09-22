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
 * @author Bernardo
 */
@Entity

public class Proveedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pro_id")
    private int id;

    @Column(name = "pro_ruc")
    private String ruc;

    @Column(name = "pro_empresa")
    private String empresa;

    @OneToOne
    @JoinColumn(name = "id_pro_per")
    private Persona persona;

    public Proveedor(int id, String ruc, String empresa, Persona persona) {
        this.id = id;
        this.ruc = ruc;
        this.empresa = empresa;
        this.persona = persona;
    }

    public Proveedor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

}
