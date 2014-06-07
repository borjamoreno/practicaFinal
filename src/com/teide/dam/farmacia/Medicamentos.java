/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.teide.dam.farmacia;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Jose y Borja
 */
public class Medicamentos {
    private String nombre, tipo;
    private GregorianCalendar fechaFabricacion, fechaCaducidad;
    private double precio;
    Scanner s = new Scanner(System.in);

   
    private Medicamentos(String nombre, GregorianCalendar fechaFabricacion, GregorianCalendar fechaCaducidad, String tipo, double precio) {
        this.nombre = nombre;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaCaducidad = fechaCaducidad;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public GregorianCalendar getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(GregorianCalendar fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public GregorianCalendar getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(GregorianCalendar fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Scanner getS() {
        return s;
    }

    public void setS(Scanner s) {
        this.s = s;
    }
    
    private void crearMedicamento(String nombre, GregorianCalendar fechaFabricacion, GregorianCalendar fechaCaducidad, String tipo, double precio){
    ArrayList<String> listado = new ArrayList<>();
    Medicamentos m = new Medicamentos(nombre, fechaFabricacion, fechaCaducidad, tipo, precio);
        System.out.println("Introduzca el nombre del medicamento");
        nombre=s.nextLine();
        System.out.println("Introduzca el nombre del medicamento");
        //fechaFabricacion=s.next();

        //¿Por qué pones los sout aqui? no seria mejor ponerlos en el ejecuta como te dije? y por qué lo has puesto dos veces?
        //ademas hay que hacer el arraylist, y hacer que se añada el medicamento a él
    }
}
