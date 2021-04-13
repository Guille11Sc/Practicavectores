/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programcovid;

import java.util.Arrays;
/**
 *
 * @author admin
 */
public class listarEnfermedad {
    
    
    infoClinica b[]=new infoClinica[2];
    String diabetes[][] = new String[b.length][2];
    String hipertension[][] = new String[b.length][2];
    String cancer[][] = new String[b.length][2];
    String huerfana[][] = new String[b.length][2];
    String tiroides[][] = new String[b.length][2];
    String dislipidemia[][] = new String[b.length][2];
    String enfermedades[] = new String[2];
    
    public listarEnfermedad(){
        
    }

    @Override
    public String toString() {
        return "listarEnfermedad{" + "b=" + Arrays.toString(b) + ", diabetes=" + Arrays.toString(diabetes) + ", hipertension=" + Arrays.toString(hipertension) + ", cancer=" + Arrays.toString(cancer) + ", huerfana=" + Arrays.toString(huerfana) + ", tiroides=" + Arrays.toString(tiroides) + ", dislipidemia=" + Arrays.toString(dislipidemia) + ", enfermedades=" + Arrays.toString(enfermedades) + '}';
    }

    public infoClinica[] getB() {
        return b;
    }

    public void setB(infoClinica[] b) {
        this.b = b;
    }

    public String[][] getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String[][] diabetes) {
        this.diabetes = diabetes;
    }

    public String[][] getHipertension() {
        return hipertension;
    }

    public void setHipertension(String[][] hipertension) {
        this.hipertension = hipertension;
    }

    public String[][] getCancer() {
        return cancer;
    }

    public void setCancer(String[][] cancer) {
        this.cancer = cancer;
    }

    public String[][] getHuerfana() {
        return huerfana;
    }

    public void setHuerfana(String[][] huerfana) {
        this.huerfana = huerfana;
    }

    public String[][] getTiroides() {
        return tiroides;
    }

    public void setTiroides(String[][] tiroides) {
        this.tiroides = tiroides;
    }

    public String[][] getDislipidemia() {
        return dislipidemia;
    }

    public void setDislipidemia(String[][] dislipidemia) {
        this.dislipidemia = dislipidemia;
    }

    public String[] getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String[] enfermedades) {
        this.enfermedades = enfermedades;
    }
    
    

     
     
    
     public void llenarEnfermedad() {
        for (int i = 0; i < 2; i++) {
            enfermedades[i] = b[i].getEnfermedadPrimaria();
        }
    }
    
     
    public void guardarEnfermedad() {

        for (int i = 0; i < b.length; i++) {
            int j = 0;

            if ("cancer".equals(enfermedades[i])) {
                cancer[i][j] = b[i].getNombre();
                cancer[i][j + 1] = b[i].getEnfermedadPrimaria();
            } else if ("hipertension".equals(enfermedades[i])) {
                hipertension[i][j] = b[i].getNombre();
                hipertension[i][j + 1] = b[i].getEnfermedadPrimaria();
            } else if ("tiroides".equals(enfermedades[i])) {
                tiroides[i][j] = b[i].getNombre();
                tiroides[i][j + 1] = b[i].getEnfermedadPrimaria();
            }  else if ("huerfana".equals(enfermedades[i])) {
                huerfana[i][j] = b[i].getNombre();
                huerfana[i][j + 1] = b[i].getEnfermedadPrimaria();
            }  else if ("diabetes".equals(enfermedades[i])) {
                diabetes[i][j] = b[i].getNombre();
                diabetes[i][j + 1] = b[i].getEnfermedadPrimaria();
            }  else if ("dislipidemia".equals(enfermedades[i])) {
                dislipidemia[i][j] = b[i].getNombre();
                dislipidemia[i][j + 1] = b[i].getEnfermedadPrimaria();
            }

        }

    }
    public void imprimirEnfermedad() {
        
        for (int i = 0; i < b.length; i++) {
                int j=0;
        
        if ((diabetes[i][j])!= null) {
            System.out.println("Pacientes con diabetes");
               System.out.println(diabetes[i][j]+" "+diabetes[i][j+1]);
                
                System.out.println("");  
            }
        
        
        if ((tiroides[i][j]) !=null) {
            System.out.println("Pacientes con tiroides");
                System.out.print(tiroides[i][j]+" "+tiroides[i][j+1]);
                System.out.println("");    
            }
        
        
        if ((hipertension[i][j]) != null) {
            System.out.println("Pacientes con hipertension");
                System.out.print(hipertension[i][j]+" "+hipertension[i][j+1]);
                System.out.println("");  
            }

        
         
        if ((huerfana[i][j]) != null) {
            System.out.println("Pacientes con enfermedad huerfana");
                    System.out.print(huerfana[i][j]+" "+huerfana[i][j+1]);
                    System.out.println(""); 
                }
                 
            

        
         
        if ((dislipidemia[0][0]) != null) {
            System.out.println("Pacientes con dislipidemia");
            System.out.print(dislipidemia[i][j]+" "+dislipidemia[i][j+1]);
                
            System.out.println("");  
  
        }
         System.out.println("Pacientes con cancer");
        if ((cancer[0][0]) != null) {
            
                System.out.print(cancer[i][j]+" "+cancer[i][j+1]);
                System.out.println("");  
            

        }
    }
    
}
}