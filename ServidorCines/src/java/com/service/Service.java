/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author PC
 */
@WebService(serviceName = "Service")
public class Service {
    ServiciosCine cine = new ServiciosCine();
    ServiciosCliente cliente = new ServiciosCliente();
//    /**
//     * This is a sample web service operation
//     */
//    @WebMethod(operationName = "hello")
//    public String hello(@WebParam(name = "name") String txt) {
//        return "Hello " + txt + " !";
//    }

    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "nuevoCliente")
    public boolean nuevoCliente(@WebParam(name = "nombre") String nombre, @WebParam(name = "id") int id, @WebParam(name = "usuario") String usuario, @WebParam(name = "clave") String clave) {
        //TODO write your implementation code here:
        return cliente.nuevoUsuario(nombre, id, usuario, clave);
    }

    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public boolean login(@WebParam(name = "usuario") String usuario, @WebParam(name = "clave") String clave) {
        //TODO write your implementation code here:
        return cliente.login(usuario, clave);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listaPeli")
    public String listaPeli() {
        //TODO write your implementation code here:
        return cine.listaPeli();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "nuevaPeli")
    public String nuevaPeli(@WebParam(name = "nombre") String nombre, @WebParam(name = "precio") int precio, @WebParam(name = "hora") String hora, @WebParam(name = "tipo") String tipo, @WebParam(name = "imagen") String imagen) {
        //TODO write your implementation code here:
        return cine.nuevaPeli(nombre, precio, hora, tipo, imagen);
    }

    
}
