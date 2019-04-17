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

    public void repetido(String nombre) {
        int total = this.nombrePeli.size();
        int cont = 0;
        for (int i = 0; i < total; i++) {
            if (nombrePeli.get(i).equals(nombre)) 
                cont++;
        }
        if(cont==0)
            nombrePeli.add(nombre);
    }

    //String nombre, int precio, String hora, int[][] campos, String tipo, String imagen
    public String nuevaPeli(String nombre, int precio, String hora, String tipo, String imagen) {
        Cine peli = new Cine(nombre, precio, hora, tipo, imagen);
        peli.resetearCampos();
        cines.add(peli);
        repetido(nombre);
        return "bien";
    }

    public String buscarPeli(String nombre) {
        int total = this.cines.size();
        String msg = "";
        for (int i = 0; i < total; i++) {
            if (cines.get(i).getNombre().equals(nombre)) {
                msg = msg + i + "&";
            }
        }
        return msg;
    }

    public String listaPeli() {
        String msg = "";
        int total = this.nombrePeli.size();
        for (int i = 0; i < total; i++) {
            msg = msg + nombrePeli.get(i) + "&";
        }
        return msg;
    }
    
    public String getNombre(int x){
        return this.cines.get(x).getNombre();
    }
    
    public int getPrecio(int x){
        return this.cines.get(x).getPrecio();
    }
    
    public String getHora(int x){
        return this.cines.get(x).getHora();
    }
    
    public String getTipo(int x){
        return this.cines.get(x).getTipo();
    }
    
    public String getImagen(int x){
        return this.cines.get(x).getImagen();
    }

}
