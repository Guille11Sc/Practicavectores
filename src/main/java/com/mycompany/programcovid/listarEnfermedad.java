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
        return "listarEnfermedad{" + "a=" + Arrays.toString(b) + ", diabetes=" + Arrays.toString(diabetes) + ", hipertension=" + Arrays.toString(hipertension) + ", cancer=" + Arrays.toString(cancer) + ", huerfana=" + Arrays.toString(huerfana)+", dislipidemia=" + Arrays.toString(dislipidemia)+ ", tiroides=" + Arrays.toString(tiroides) +'}';
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

            if (enfermedades[i] == "cancer") {
                cancer[i][j] = b[i].getNombre();
                cancer[i][j + 1] = String.valueOf(b[i].getEnfermedadPrimaria());
            } else if (enfermedades[i] =="hipertension") {
                hipertension[i][j] = b[i].getNombre();
                hipertension[i][j + 1] = String.valueOf(b[i].getEnfermedadPrimaria());
            } else if (enfermedades[i] == "tiroides") {
                tiroides[i][j] = b[i].getNombre();
                tiroides[i][j + 1] = String.valueOf(b[i].getEnfermedadPrimaria());
            }  else if (enfermedades[i] =="huerfana") {
                huerfana[i][j] = b[i].getNombre();
                huerfana[i][j + 1] = String.valueOf(b[i].getEnfermedadPrimaria());
            }  else if (enfermedades[i] == "diabetes") {
                diabetes[i][j] = b[i].getNombre();
                diabetes[i][j + 1] = String.valueOf(b[i].getEnfermedadPrimaria());
            }  else if (enfermedades[i] == "dislipidemia") {
                dislipidemia[i][j] = b[i].getNombre();
                dislipidemia[i][j + 1] = String.valueOf(b[i].getEnfermedadPrimaria());
            }

        }

    }
    public void listarEdad() {
        System.out.println("Pacientes con diabetes");
        if ((diabetes[0][0])!= null) {
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println(diabetes[i][j]+" ");
                }
                System.out.println("");  
            }
        }
        System.out.println("Pacientes con tiroides");
        if ((tiroides[0][0]) !=null) {
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(tiroides[i][j]+" ");
                }
                System.out.println("");    
            }
        }
        System.out.println("Pacientes con hipertension");
        if ((hipertension[0][0]) != null) {
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(hipertension[i][j]+" ");
                }
                System.out.println("");  
            }

        }
         System.out.println("Pacientes con enfermedad huerfana");
        if ((huerfana[0][0]) != null) {
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(huerfana[i][j]+" ");
                }
                System.out.println("");  
            }

        }
         System.out.println("Pacientes con dislipidemia");
        if ((dislipidemia[0][0]) != null) {
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(dislipidemia[i][j]+" ");
                }
                System.out.println("");  
            }

        }
         System.out.println("Pacientes con cancer");
        if ((cancer[0][0]) != null) {
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(cancer[i][j]+" ");
                }
                System.out.println("");  
            }

        }
    }
    
}
