/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programcovid;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Lecturas {
    Scanner teclado = new Scanner(System.in);
    
    public String leerString(String mensaje){
        System.out.println(mensaje);
        return (teclado.nextLine());
        
        //se hizo en una clase aparte para exportarla 
        //cada vez que se necesite enunciarla en los ejercicios.
    }
}
