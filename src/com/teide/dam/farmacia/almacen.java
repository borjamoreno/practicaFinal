/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teide.dam.farmacia;

/**
 *
 * @author DAM1
 */
public class almacen {
    String nombre, fechaFab, fechaCad, tipo, principioActivos;
    int precio;

    //FechaFab = Fabricacion, FechaCad = FechaCad, principiosActivos deben tener nombre y cantidad en mg.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaFab() {
        return fechaFab;
    }

    public void setFechaFab(String fechaFab) {
        this.fechaFab = fechaFab;
    }

    public String getFechaCad() {
        return fechaCad;
    }

    public void setFechaCad(String fechaCad) {
        this.fechaCad = fechaCad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrincipioActivos() {
        return principioActivos;
    }

    public void setPrincipioActivos(String principioActivos) {
        this.principioActivos = principioActivos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}

