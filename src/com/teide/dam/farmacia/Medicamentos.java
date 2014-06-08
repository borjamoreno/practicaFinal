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
    private String nombre, tipo, fechaFabricacion, fechaCaducidad, precio;
    Scanner s = new Scanner(System.in);

   
    private Medicamentos(String nombre, String fechaFabricacion, String fechaCaducidad, String tipo, String precio) {
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

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Scanner getS() {
        return s;
    }

    public void setS(Scanner s) {
        this.s = s;
    }
    
    private void crearMedicamento(String nombre, String fechaFabricacion, String fechaCaducidad, String tipo, String precio){
        ArrayList<String> listado = new ArrayList<>();
        Medicamentos m = new Medicamentos(nombre, fechaFabricacion, fechaCaducidad, tipo, precio);
            System.out.println("Introduzca el nombre del medicamento");
            nombre=s.nextLine();
            System.out.println("Introduzca la fecha de fabricacion del medicamento separado por '/'");
            fechaFabricacion=s.nextLine();
            System.out.println("Introduzca la fecha de caducidad del medicamento separado por '/'");
            fechaCaducidad=s.nextLine();
            s.nextLine();
            System.out.println("Introduzca el precio del medicamento");
            precio=s.nextLine();
            listado.add(nombre);
            listado.add(fechaFabricacion);
            listado.add(fechaCaducidad);
            listado.add(precio);
            //Preguntar si al ordenar el nombre, se ordenan con él o son independientes
    }
    
}
