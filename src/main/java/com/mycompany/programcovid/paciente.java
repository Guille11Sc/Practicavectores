
package com.mycompany.programcovid;


public class paciente {
 

    //atributos
    private String nombre;
    private int edad;
    private String identificacion;
    private String direccion;
    private String correo;
    private String tipoSangre;
    
    
    
    
    
    public paciente(String nombre,int edad,String identificacion,String direccion,String correo,String tipoSangre){
        this.nombre=nombre;
        this.edad=edad;
        this.identificacion=identificacion;
        this.direccion=direccion;
        this.correo=correo;
        this.tipoSangre=tipoSangre;
        
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"/n Edad: "+edad+"/n Identificación: "+identificacion+"/n Dirección: "+direccion+"/n Correo: "+correo+"/N Tipo de sangre: "+tipoSangre;
    }
//get and set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
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

    public int getEdad() {
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
