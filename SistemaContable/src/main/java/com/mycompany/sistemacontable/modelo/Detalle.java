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
import javax.persistence.ManyToOne;


/**
 *
 * @author LegionXR
 */
@Entity
public class Detalle implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="det_id")
    private int id;
    
    @Column(name="det_detalle")
    private String detalle;
    
    @Column(name="det_monto")
    private double monto;
    
    @Column(name="det_tipo_pago")
    private String tipo_pago;
    
   

    public Detalle(int id, String detalle, double monto, String tipo_pago) {
        this.id = id;
        this.detalle = detalle;
        this.monto = monto;
        this.tipo_pago = tipo_pago;
    }

    public Detalle() {
    }

    public int getId() {
        return id;
    }

    public String getDetalle() {
        return detalle;
    }

    public double getMonto() {
        return monto;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

   
     
     
     
    
}
