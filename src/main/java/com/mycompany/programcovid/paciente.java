
package com.mycompany.programcovid;
import javax.swing.JOptionPane;

public class paciente {
    
    //atributos
    private String nombre;
    private String edad;
    private String identificacion;
    private String direccion;
    private String correo;
    private String tipoSangre;
    
    
    
    
    
    public paciente(String nom,String ed,String ident,String direc,String email,String tipoSangre){
        this.nombre=nombre;
        this.edad=edad;
        this.identificacion=identificacion;
        this.direccion=direccion;
        this.correo=correo;
        this.tipoSangre=tipoSangre;
        
    }
    
    @Override
    public String toString(){
        return nombre+","+edad+","+identificacion+","+direccion+","+correo+","+tipoSangre;
    }
//get and set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }
    //metodos
   
}
