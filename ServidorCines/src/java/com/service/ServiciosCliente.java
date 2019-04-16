/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ServiciosCliente {

    ArrayList<Cliente> clientes = new ArrayList();

    public ServiciosCliente() {
    }

    public boolean nuevoUsuario(String nombre, int id, String usuario, String clave) {
        if (repetido(nombre, id)) {
            //String nombre, int id, String usuario, String clave
            Cliente cliente = new Cliente(nombre, id, usuario, clave);
            this.clientes.add(cliente);
            return true;
        }
        return false;
    }

    public boolean repetido(String nombre, int id) {
        int total = this.clientes.size();
        for (int i = 0; i < total; i++) {
            if (clientes.get(i).getNombre().equals(nombre) && clientes.get(i).getId() == id) {
                return false;
            }
        }
        return true;
    }
}
