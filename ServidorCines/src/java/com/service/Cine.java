/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

/**
 *
 * @author PC
 */
//nepe
public class Cine {
    private String nombre;
    private int precio;
    private String hora;
    private int[][] campos;//6*4
    private String tipo;
    private String imagen;
    private final int x=6;
    private final int y=4;

    public Cine() {
    }

    public Cine(String nombre, int precio, String hora, String tipo, String imagen) {
        this.nombre = nombre;
        this.precio = precio;
        this.hora = hora;
        this.campos = new int[x][y];
        this.tipo = tipo;
        this.imagen = imagen;
    }
    
    public void resetearCampos(){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                this.campos[x][y]=0;
            }
        }
    }
    public String mostrarCampos(){
        String msg="";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                msg= msg+" "+this.campos[x][y];
            }
            msg=msg+"/n";
        }
        return msg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int[][] getCampos() {
        return campos;
    }

    public void setCampos(int[][] campos) {
        this.campos = campos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    
}
