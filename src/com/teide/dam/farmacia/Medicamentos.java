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

    private Medicamentos(String busqueda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    ArrayList<Medicamentos> listado = new ArrayList<Medicamentos>();
    
    private void crearMedicamento(String nombre, String fechaFabricacion, String fechaCaducidad, String tipo, String precio){
        Medicamentos m = new Medicamentos(nombre, fechaFabricacion, fechaCaducidad, tipo, precio);
            //System.out.println("Introduzca el nombre del medicamento");
            //nombre=s.nextLine();
            //System.out.println("Introduzca la fecha de fabricacion del medicamento separado por '/'");
            //fechaFabricacion=s.nextLine();
            //System.out.println("Introduzca la fecha de caducidad del medicamento separado por '/'");
            //fechaCaducidad=s.nextLine();
            //System.out.println("Introduzca el precio del medicamento");
            //precio=s.nextLine();
            
            m.setNombre(nombre);
            m.setFechaFabricacion(fechaFabricacion);
            m.setFechaCaducidad(fechaCaducidad);
            m.setPrecio(precio);
            listado.add(m);
            //Preguntar si al ordenar el nombre, se ordenan con él o son independientes
    }
    private void buscarMedicamento(Medicamentos m) {
         System.out.println("Desea buscar por:");
         System.out.println("1. Nombre");
         System.out.println("2. Principio activo");
         int option=s.nextInt();
         if (option==1){
             System.out.println("¿Qué esta buscando?");
             String busqueda=s.nextLine();
             if (listado.contains(new Medicamentos(busqueda))) {
                 System.out.println(listado.indexOf(busqueda));
             }
             else System.out.println("No se ha encontrado ningun medicamento con ese nombre");
             
         }
         else if (option==2){
             System.out.println("¿Qué principio activo desea buscar?");
             String busqueda2=s.nextLine();
             if (listado.contains(new Medicamentos(busqueda2))) {
                 System.out.println(listado.indexOf(busqueda2));
             }
             else System.out.println("No se ha encontrado ningun principio activo con ese nombre");
         }
         else if (option !=1 && option!=2) System.out.println("Eleccion incorrecta");
    }
    private void eliminarMedicamento(Medicamentos m) {
         System.out.println("Introduzca el nombre del medicamento a eliminar:");
         String busqueda=s.nextLine();
             if (listado.contains(new Medicamentos(busqueda))) {
                 listado.remove(busqueda);
             }
             else System.out.println("No se ha encontrado ningun medicamento con ese nombre");
         
    }
}
