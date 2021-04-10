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
    private String enfermedadPecundaria;
    private String fechaAdquirida;
    
    
    
     public infoClinica(String enfermedadPrimaria, String enfermedadSecundaria,String fechaAdquirida){
        this.enfermedadPrimaria=enfermedadPrimaria;
        this.enfermedadPecundaria=enfermedadSecundaria;
        this.fechaAdquirida=fechaAdquirida;
    }
     
      
    @Override
    public String toString(){
        return enfermedadPrimaria+","+enfermedadPecundaria+","+fechaAdquirida;
    }
    
}
