/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Usuario
 */
@Entity
public class Detalle_Debe {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="deb_id")
    private int id;
    
    @Column(name="deb_monto")
    private double monto;
    
}
