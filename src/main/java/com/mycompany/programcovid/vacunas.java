
package com.mycompany.programcovid;


public class vacunas {
    //atributos
    int vacunasTotales=100;
    int dia;
    int mes;
    int hora;
   
    
           
    //constructor
    public vacunas() {
    }
    //getter and setter
    public int getVacunastotales() {
        return vacunasTotales;
    }

    public void setVacunastotales(int vacunastotales) {
        this.vacunasTotales = vacunastotales;
    }

    @Override
    public String toString() {
        return "vacunas{" + "vacunasTotales=" + vacunasTotales + ", dia=" + dia + ", mes=" + mes + ", hora=" + hora + '}';
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    
    
    //metodos
    //metodo para restar la vacuna al aplicarle a paciente
   public void restarVacuna(){
       vacunasTotales--;
       
   }
   //metodo para mostrar cuantas vacunas quedan en total
   public void mostrarVacunas(){
       System.out.println("La cantidad de vacunas actuales son: "+vacunasTotales);
   }
   //metodo para asignar cita
   public void asignarCitas(){
        dia= (int) (Math.random()*29+1);
        mes= (int) (Math.random()*5+1);
        hora= (int) (Math.random()*23+1);
        System.out.println("La primera cita sera el dia: "+dia+"/"+mes+"/2021  a las: "+hora+" con el medico: Guillermo Sanchez "
                + "en el consultorio: "+dia);
        dia= (int) (Math.random()*29+1);
        mes= (int) (Math.random()*11+6);
        hora= (int) (Math.random()*23+1);
        System.out.println("La segunda cita sera el dia: "+dia+"/"+mes+"/2021  a las: "+hora+" con el medico: Guillermo Sanchez "
                + "en el consultorio: "+dia);
       
    
    
}
}
