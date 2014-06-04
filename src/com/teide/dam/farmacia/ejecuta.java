/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.teide.dam.farmacia;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class ejecuta {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int opcion=0;
    do{
            System.out.println("Para dar de alta un medicamento, pulse 1");
            System.out.println("Para buscar un medicamento, pulse 2");
            System.out.println("Para vender medicamentos, pulse 3");
            System.out.println("Para eliminar un medicamento, pulse 4");
            System.out.println("Para salir, pulse 5");
            opcion=s.nextInt();
    }
    while(opcion!=5);
    }

}
