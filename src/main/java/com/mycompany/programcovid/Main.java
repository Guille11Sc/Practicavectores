/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programcovid;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);    
       paciente a[]= new paciente[2];
       
       String nombre="";
       String edad="";
       String identificacion="";
       String direccion="";
       String correo="";
       String tipoSangre="";
       
       
       
       for(int i=0;i<a.length;i++){
           System.out.println("Ingresa tu nombre: ");
           nombre = leer.nextLine();
           System.out.println("Ingresa tu edad: ");
           edad = leer.nextLine();
           System.out.println("Ingresa tu identificacion: ");
           identificacion = leer.nextLine();
           System.out.println("Ingresa tu direccion: ");
           direccion = leer.nextLine();
           System.out.println("Ingresa tu correo: ");
           correo = leer.nextLine();
           System.out.println("Ingresa tu tipo de sangre: ");
           tipoSangre = leer.nextLine();
           a[i]= new paciente(nombre,edad,identificacion,direccion,correo,tipoSangre);
           
       }
       
        for(int i=0;i<a.length;i++){
            System.out.println(a[i].getNombre()+" "+a[i].getEdad()+" "+a[i].getIdentificacion()+" "+
                    a[i].getDireccion()+" "+a[i].getCorreo()+" "+a[i].getTipoSangre());
    }
     
    }
    
}
