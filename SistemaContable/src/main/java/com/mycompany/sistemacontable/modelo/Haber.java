/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.modelo;

import java.io.Serial;
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
public class Haber implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="hab_id")
    private int id;
    
    @Column(name="hab_detalle")
    private String detalle;
    
    @Column(name="hab_tipoBeneficiario")
    private String tipoBeneficiario;
    
    @Column(name="hab_tipoPago")
    private String tipoPago;
    
    @Column(name="hab_valor")
    private double valor;
    
    @OneToOne
    @JoinColumn(name="pro_ruc")
    private Proveedor proveedor;
    
    @OneToOne
    @JoinColumn(name="emp_codigoEmpleado")
    private Empleado empleado;
    
    @OneToOne
    @JoinColumn(name = "id_det")
    private Detalle deta;
    
    @Column(name = "hab_estado")
    private String estado;

    public Haber() {
    }

    public Haber(int id, String detalle, String tipoBeneficiario, String tipoPago, double valor, Proveedor proveedor, Empleado empleado) {
        this.id = id;
        this.detalle = detalle;
        this.tipoBeneficiario = tipoBeneficiario;
        this.tipoPago = tipoPago;
        this.valor = valor;
        this.proveedor = proveedor;
        this.empleado = empleado;
        
    }
    
    public Haber(int id, String detalle, String tipoBeneficiario, String tipoPago, double valor, Proveedor proveedor, Empleado empleado, Detalle det) {
        this.id = id;
        this.detalle = detalle;
        this.tipoBeneficiario = tipoBeneficiario;
        this.tipoPago = tipoPago;
        this.valor = valor;
        this.proveedor = proveedor;
        this.empleado = empleado;
        this.deta=det;
    }

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

    public String getTipoBeneficiario() {
        return tipoBeneficiario;
    }

    public void setTipoBeneficiario(String tipoBeneficiario) {
        this.tipoBeneficiario = tipoBeneficiario;
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

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
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
