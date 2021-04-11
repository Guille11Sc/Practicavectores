/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programcovid;

import static java.lang.Integer.parseInt;
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);    
       paciente a[]= new paciente[2];
       
       String nombre="";
       int edad=0;
       String identificacion="";
       String direccion="";
       String correo="";
       String tipoSangre="";
       
       String enfermedadPrimaria="";
       String enferedadSecundaria="";
       String fechaAdquirida="";
       String síntomasPresentados="";
       String medicamentosActuales="";
       
       
       //llenar los datos generales de los pacientes
       for(int i=0;i<a.length;i++){
           System.out.println("Ingresa tu nombre: ");
           nombre = leer.nextLine();
           System.out.println("Ingresa tu edad: ");
           edad = parseInt(leer.nextLine());
           System.out.println("Ingresa tu identificacion: ");
           identificacion = leer.nextLine();
           System.out.println("Ingresa tu direccion: ");
           direccion = leer.nextLine();
           System.out.println("Ingresa tu correo: ");
           correo = leer.nextLine();
           System.out.println("Ingresa tu tipo de sangre: ");
           tipoSangre = leer.nextLine();
          // System.out.println("Ingresa tu tipo de sangre: ");
          // tipoSangre = leer.nextLine();
          //  System.out.println("Ingresa tu tipo de sangre: ");
           //tipoSangre = leer.nextLine();
            //System.out.println("Ingresa tu tipo de sangre: ");
           //tipoSangre = leer.nextLine();
            //System.out.println("Ingresa tu tipo de sangre: ");
           //tipoSangre = leer.nextLine();
            //System.out.println("Ingresa tu tipo de sangre: ");
           //tipoSangre = leer.nextLine();
           a[i]= new paciente(nombre,edad,identificacion,direccion,correo,tipoSangre);
           
       }
       //mostrar los datos generales de los pacientes
        for(int i=0;i<a.length;i++){
            System.out.println("Datos paciente número "+(i+1)+": Nombre: "+a[i].getNombre()+" Edad: "+a[i].getEdad()+" Id: "+a[i].getIdentificacion()+" Dirección: "+
                    a[i].getDireccion()+" Correo: "+a[i].getCorreo()+" Tipo de sangre: "+a[i].getTipoSangre());
    }
     
    }
    
}
