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
public class ServiciosCine {
    ArrayList<String> nombrePeli = new ArrayList();
    ArrayList<Cine> cines = new ArrayList();
    public ServiciosCine() {
    }
    
    public void repetido(String nombre){
        int total=this.nombrePeli.size();
        for (int i = 0; i < total; i++) {
            if(nombrePeli.get(i).equals(nombre))
                System.out.println("Ya existe");
            else
                nombrePeli.add(nombre);
        }
    }
    
    //String nombre, int precio, String hora, int[][] campos, String tipo, String imagen
    public void nuevaPeli(String nombre, int precio, String hora, String tipo, String imagen){
        Cine peli = new Cine(nombre,precio,hora,tipo,imagen);
        peli.resetearCampos();
        cines.add(peli);
        repetido(nombre);
    }
    
    public String buscarPeli(String nombre){
        int total=this.cines.size();
        String msg="";
        for (int i = 0; i < total; i++) {
            if(cines.get(i).getNombre().equals(nombre))
                msg = msg+i+" ";
        }
        msg = msg+" ";
        return msg;
    }
    
    
}
