/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programcovid;

/**
 *
 * @author admin
 */
public class infoClinica {
    
    private String enfermedadPrimaria;
    private String enfermedadSecundaria;
    private String fechaAdquirida;
    private String sintomasPresentados;
    private String medicamentosActuales;
    
    
    
    
     public infoClinica(String enfermedadPrimaria, String enfermedadSecundaria,String fechaAdquirida, String sintomasPresentados, String medicamentosActuales){
        this.enfermedadPrimaria=enfermedadPrimaria;
        this.enfermedadSecundaria=enfermedadSecundaria;
        this.fechaAdquirida=fechaAdquirida;
        this.sintomasPresentados= sintomasPresentados;
        this.medicamentosActuales=medicamentosActuales;
    }
     
      
    @Override
    public String toString(){
        return enfermedadPrimaria+","+enfermedadSecundaria+","+fechaAdquirida+","+sintomasPresentados+","+medicamentosActuales;
    }

    public String getEnfermedadPrimaria() {
        return enfermedadPrimaria;
    }

    public void setEnfermedadPrimaria(String enfermedadPrimaria) {
        this.enfermedadPrimaria = enfermedadPrimaria;
    }

    public String getEnfermedadPecundaria() {
        return enfermedadSecundaria;
    }

    public void setEnfermedadPecundaria(String enfermedadPecundaria) {
        this.enfermedadSecundaria = enfermedadPecundaria;
    }

    public String getFechaAdquirida() {
        return fechaAdquirida;
    }

    public void setFechaAdquirida(String fechaAdquirida) {
        this.fechaAdquirida = fechaAdquirida;
    }
    public String sintomasPresentados() {
        return enfermedadPrimaria;
    }
     public void sintomasPresentados(String fechaAdquirida) {
        this.fechaAdquirida = fechaAdquirida;
    }

       
}
