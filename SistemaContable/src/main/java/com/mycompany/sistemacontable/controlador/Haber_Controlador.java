/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.controlador;

import com.mycompany.sistemacontable.modelo.Haber;
import com.mycompany.sistemacontable.persistencia.HaberJpaController;
import com.mycompany.sistemacontable.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Haber_Controlador {

    HaberJpaController habJpa = new HaberJpaController();

    public void crear(Haber haber) {
        habJpa.create(haber);
    }

    public void eliminar(Haber haber) throws NonexistentEntityException {
        habJpa.destroy(haber.getId());
    }

    public void editar(Haber haber) throws Exception {
        habJpa.edit(haber);
    }

    public List<Haber> listaHaber() {
        return habJpa.findHaberEntities();
    }

    public Haber getHaber(Haber haber) {
        return habJpa.findHaber(haber.getId());
    }

}
