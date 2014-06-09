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
    private String nombrePA;
    private int mg;

    public PrincipiosActivos(String nombrePA, int mg) {
        this.nombrePA = nombrePA;
        this.mg = mg;
    }

    public String getnombrePA() {
        return nombrePA;
    }

    public void setNombrePA(String nombre) {
        this.nombrePA = nombrePA;
    }

    public int getMg() {
        return mg;
    }

    public void setMg(int mg) {
        this.mg = mg;
    }
    
    
    
    
}
