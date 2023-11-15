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
public class Debe implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="deb_id")
    private int id;
    
    @Column(name="deb_detalle")
    private String detalle;
    
    @Column(name="deb_tipopago")
    private String tipoPago;
    
    @Column(name="deb_valor")
    private double valor;
    
    @OneToOne
    @JoinColumn(name="cli_cedula")
    private Cliente cliente;
    
     @OneToOne
    @JoinColumn(name = "id_det")
    private Detalle deta;
     
    @Column(name = "deb_estado")
    private String estado;
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDeta(Detalle deta) {
        this.deta = deta;
    }

    public Detalle getDeta() {
        return deta;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    
    
    
    
}
