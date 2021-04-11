
package com.mycompany.programcovid;


public class vacunas {
    
    int vacunasTotales=100;

    public vacunas() {
    }

    public int getVacunastotales() {
        return vacunasTotales;
    }

    public void setVacunastotales(int vacunastotales) {
        this.vacunasTotales = vacunastotales;
    }

    @Override
    public String toString() {
        return "vacunas{" + "vacunastotales=" + vacunasTotales + '}';
    }
    
    //metodos
    
   public void restarVacuna(){
       vacunasTotales--;
       
   }
   
   public void mostrarVacunas(){
       System.out.println("La cantidad de vacunas actuales son: "+vacunasTotales);
   }
}
