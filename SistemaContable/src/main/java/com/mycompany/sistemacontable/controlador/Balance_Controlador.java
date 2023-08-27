/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontable.controlador;

import com.mycompany.sistemacontable.modelo.Balance;

import com.mycompany.sistemacontable.persistencia.BalanceJpaController;

import com.mycompany.sistemacontable.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author LegionXR
 */
public class Balance_Controlador {

    BalanceJpaController balJpa = new BalanceJpaController();

    public void crear(Balance balance) {
        balJpa.create(balance);
    }

    public void eliminar(Balance balance) throws NonexistentEntityException {
        balJpa.destroy(balance.getId());

    }

    public void editar(Balance balance) throws Exception {
        balJpa.edit(balance);

    }

    public List<Balance> listaBalance() {

        return balJpa.findBalanceEntities();

    }

    public Balance getBalance(Balance balance) {

        return balJpa.findBalance(balance.getId());
    }
}
