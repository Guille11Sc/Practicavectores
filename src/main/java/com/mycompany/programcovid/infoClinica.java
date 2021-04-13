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
    private String nombre;
    private String enfermedadPrimaria;
    private String enfermedadSecundaria;
    private String fechaAdquirida;
    private String sintomasPresentados;
    private String medicamentosActuales;
    
    
    
    
     public infoClinica(String nombre,String enfermedadPrimaria, String enfermedadSecundaria,String fechaAdquirida, String sintomasPresentados, String medicamentosActuales){
        this.enfermedadPrimaria=enfermedadPrimaria;
        this.nombre=nombre;
        this.enfermedadSecundaria=enfermedadSecundaria;
        this.fechaAdquirida=fechaAdquirida;
        this.sintomasPresentados= sintomasPresentados;
        this.medicamentosActuales=medicamentosActuales;
    }

    @Override
    public String toString() {
        return "infoClinica{" + "nombre=" + nombre + ", enfermedadPrimaria=" + enfermedadPrimaria + ", enfermedadSecundaria=" + enfermedadSecundaria + ", fechaAdquirida=" + fechaAdquirida + ", sintomasPresentados=" + sintomasPresentados + ", medicamentosActuales=" + medicamentosActuales + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEnfermedadPrimaria() {
        return enfermedadPrimaria;
    }

    public void setEnfermedadPrimaria(String enfermedadPrimaria) {
        this.enfermedadPrimaria = enfermedadPrimaria;
    }

    public String getEnfermedadSecundaria() {
        return enfermedadSecundaria;
    }

    public void setEnfermedadSecundaria(String enfermedadSecundaria) {
        this.enfermedadSecundaria = enfermedadSecundaria;
    }

    public String getFechaAdquirida() {
        return fechaAdquirida;
    }

    public void setFechaAdquirida(String fechaAdquirida) {
        this.fechaAdquirida = fechaAdquirida;
    }

    public String getSintomasPresentados() {
        return sintomasPresentados;
    }

    public void setSintomasPresentados(String sintomasPresentados) {
        this.sintomasPresentados = sintomasPresentados;
    }

    public String getMedicamentosActuales() {
        return medicamentosActuales;
    }

    public void setMedicamentosActuales(String medicamentosActuales) {
        this.medicamentosActuales = medicamentosActuales;
    }
     
      
   

   

   

       
}
