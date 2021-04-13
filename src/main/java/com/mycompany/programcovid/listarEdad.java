package com.mycompany.programcovid;

import java.util.Arrays;

public class listarEdad {
     //atributos
    paciente a[] = new paciente[5];
    //arrays bidimensionales para listar por rango de edades
    String menorEdad[][] = new String[a.length][5];
    String mayorEdad[][] = new String[a.length][5];
    String terceraEdad[][] = new String[a.length][5];
    int edades[] = new int[5]; //array para capturar las edades 
    //constructor
    public listarEdad() {
    }

    @Override
    public String toString() {
        return "listarEdad{" + "a=" + Arrays.toString(a) + ", menorEdad=" + Arrays.toString(menorEdad) + ", mayorEdad=" + Arrays.toString(mayorEdad) + ", terceraEdad=" + Arrays.toString(terceraEdad) + '}';
    }
     //getter and setter
    public paciente[] getA() {
        return a;
    }

    public void setA(paciente[] a) {
        this.a = a;
    }

    public String[][] getMenorEdad() {
        return menorEdad;
    }

    public void setMenorEdad(String[][] menorEdad) {
        this.menorEdad = menorEdad;
    }

    public String[][] getMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(String[][] mayorEdad) {
        this.mayorEdad = mayorEdad;
    }

    public String[][] getTerceraEdad() {
        return terceraEdad;
    }

    public void setTerceraEdad(String[][] terceraEdad) {
        this.terceraEdad = terceraEdad;
    }

    //metodos
    //metodo para llenar el array edades con la edad de los pacientes
    public void llenarEdad() {
        for (int i = 0; i < 5; i++) {
            edades[i] = a[i].getEdad();
        }
    }
      //metodo para guardar la edad y el nombre en el array bidimensaional 
    public void guardarEdad() {

        for (int i = 0; i < a.length; i++) {
            int j = 0;

            if (edades[i] < 17) {
                menorEdad[i][j] = a[i].getNombre();
                menorEdad[i][j + 1] = String.valueOf(a[i].getEdad());
            } else if (edades[i] >= 18 && a[i].getEdad() < 50) {
                mayorEdad[i][j] = a[i].getNombre();
                mayorEdad[i][j + 1] = String.valueOf(a[i].getEdad());
            } else if (edades[i] >= 50) {
                terceraEdad[i][j] = a[i].getNombre();
                terceraEdad[i][j + 1] = String.valueOf(a[i].getEdad());

            }

        }

    }
    //metodo para mostrar las edades segun rangos
    public void listarEdad() {
        for (int i = 0; i < a.length; i++) {
               int j=0;
        
        if ((menorEdad[i][j])!= null) {  //si es diferente de null
            System.out.println("Edad entre 1-17");
            
                    System.out.println(menorEdad[i][j]+" "+menorEdad[i][j+1]);
                    System.out.println("");  
                }
                
            
        
        
        if ((mayorEdad[i][j]) !=null) {
            System.out.println("Edad entre 18-49");
                    System.out.print(mayorEdad[i][j]+" "+mayorEdad[i][j+1]);
                    System.out.println("");  
                }
                  
            
        
        
        if ((terceraEdad[i][j]) != null) {  
          System.out.println("Edad mayor a 50");
                    System.out.print(terceraEdad[i][j]+" "+terceraEdad[i][j+1]);
                
                System.out.println("");  
            }

        
    }
    }
}
