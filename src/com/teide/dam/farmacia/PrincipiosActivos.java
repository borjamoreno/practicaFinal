/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.teide.dam.farmacia;

/**
 *
 * @author Jose
 */
public class PrincipiosActivos {
    private String nombre;
    private int mg;

    public PrincipiosActivos(String nombre, int mg) {
        this.nombre = nombre;
        this.mg = mg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMg() {
        return mg;
    }

    public void setMg(int mg) {
        this.mg = mg;
    }
    
    
    
    
}
