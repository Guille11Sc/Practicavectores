package com.mycompany.programcovid;

import java.util.Arrays;

public class listarEdad {

    paciente a[] = new paciente[2];
    String menorEdad[][] = new String[a.length][2];
    String mayorEdad[][] = new String[a.length][2];
    String terceraEdad[][] = new String[a.length][2];
    int edades[] = new int[2];

    public listarEdad() {
    }

    @Override
    public String toString() {
        return "listarEdad{" + "a=" + Arrays.toString(a) + ", menorEdad=" + Arrays.toString(menorEdad) + ", mayorEdad=" + Arrays.toString(mayorEdad) + ", terceraEdad=" + Arrays.toString(terceraEdad) + '}';
    }

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
    public void llenarEdad() {
        for (int i = 0; i < 2; i++) {
            edades[i] = a[i].getEdad();
        }
    }

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

    public void listarEdad() {
        for (int i = 0; i < a.length; i++) {
               int j=0;
        
        if ((menorEdad[i][j])!= null) {
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
