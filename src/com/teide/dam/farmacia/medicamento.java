/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teide.dam.farmacia;

import java.util.ArrayList;

/**
 *
 * @author Borja
 */
public class medicamento {
    
    private ArrayList<almacen> listado;
    
    public medicamento(){
    listado = new ArrayList<>();
    }

    private medicamento(String nombre, String fechaFab, String fechaCad, String tipo, String principioActivos, int precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void crearMedicamento(String nombre, String fechaFab, String fechaCad, String tipo, String principioActivos, int precio){

        medicamento m = new medicamento(nombre, fechaFab, fechaCad, tipo, principioActivos, precio);
        listado.add(m);
    }
}
