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
       paciente a[]= new paciente[5];//objeto que manejara la clase paciente
       infoClinica b[]=new infoClinica[5];//objeto que manejara la clase infoclinica
       vacunas vacuna=new vacunas();//objeto que manejara la clase vacuna
       listarEdad listaEdades=new listarEdad();//objeto que listara por edades
       listarEnfermedad listEnfermedad=new listarEnfermedad();//objeto que listara por enfermedades
       boolean aplicar[]=new boolean[5];//array para saber si se le asigna cita o no
      
        //atributos
       String nombre="";
       int edad=0;
       String identificacion="";
       String direccion="";
       String correo="";
       String tipoSangre="";
       String enfermedadPrimaria="";
       String enfermedadSecundaria="";
       String fechaAdquirida="";
       String sintomasPresentados="";
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
           System.out.println("Ingresa tu Enfermedad primaria: ");
           enfermedadPrimaria = leer.nextLine();
          System.out.println("Ingresa tu enfermedad Secundaria: ");
           enfermedadSecundaria = leer.nextLine();
           System.out.println("Ingresa fecha en que adquirio la enfermedad: ");
           fechaAdquirida = leer.nextLine();
           System.out.println("Ingresa sintomas de covid presentados: ");
           sintomasPresentados = leer.nextLine();
           System.out.println("Ingresa medicamento que tome actualmente: ");
           medicamentosActuales = leer.nextLine();
           //llenar los objetos arrays
           a[i]= new paciente(nombre,edad,identificacion,direccion,correo,tipoSangre);
           b[i]= new infoClinica(nombre,enfermedadPrimaria,enfermedadSecundaria,fechaAdquirida,sintomasPresentados,medicamentosActuales);
          //condicional para saber si se vacuna o no
           if (edad>50 && ("hipertension".equals(enfermedadPrimaria) || "diabetes".equals(enfermedadPrimaria) || "dislipidemia".equals(enfermedadPrimaria)
                   || "cancer".equals(enfermedadPrimaria) || "tiroides".equals(enfermedadPrimaria) || "huerfana".equals(enfermedadPrimaria))){
           vacuna.restarVacuna();
           aplicar[i]=true;
           
           }else{
               aplicar[i]=false;
           }

       }
       
       
       //mostrar los datos generales de los pacientes
        System.out.println("");
        for(int i=0;i<a.length;i++){
            System.out.println("Datos paciente n??mero "+(i+1)+": Nombre: "+a[i].getNombre()+" Edad: "+a[i].getEdad()+" Id: "+a[i].getIdentificacion()+" Direcci??n: "+
                    a[i].getDireccion()+" Correo: "+a[i].getCorreo()+" Tipo de sangre: "+a[i].getTipoSangre()+"Enfermedad primaria: "+b[i].getEnfermedadPrimaria()+"Enfermedad secimdaroa: "+b[i].getEnfermedadSecundaria()
                     +"Fecha adquirida: "+b[i].getFechaAdquirida()+"Sintomas: "+b[i].getSintomasPresentados()+"Medicamentos actuales: "+b[i].getMedicamentosActuales());
            
            
            if(aplicar[i]==true){
                vacuna.asignarCitas();
                System.out.println("");
            }
        }
       //objetos 
     vacuna.mostrarVacunas();
        System.out.println("");
     listaEdades.a=a;
     listaEdades.llenarEdad();
     listaEdades.guardarEdad();
     listaEdades.listarEdad();
        System.out.println("");
     listEnfermedad.b=b;
     listEnfermedad.llenarEnfermedad();
     listEnfermedad.guardarEnfermedad();
     listEnfermedad.imprimirEnfermedad();
     
     
     
     
    }
    
}
