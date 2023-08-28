/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author LegionXR
 */
@Entity
public class Detalle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="det_id")
    private int id;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="det_id")
    private List<Debe> ingresos;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="det_id")
    private List<Haber> pagos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public List<Debe> getIngresos() {
        return ingresos;
    }

    public void addIngresos(Debe debe){
        if(this.ingresos == null)
            this.ingresos = new ArrayList<Debe>();
    }

    public List<Haber> getPagos() {
        return pagos;
    }

    public void addPagos(Haber haber){
        if(this.pagos == null)
            this.pagos = new ArrayList<Haber>();
    }
    
    
    
    

}
