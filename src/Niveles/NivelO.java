/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niveles;

/**
 *
 * @author Sebastian
 */
public class NivelO {
    
   String nivel_8;
   int incremento_vida;
   int incremento_daño;
   int incremento_defensa;
   boolean habilidad_especial;
   

 public NivelO()
{
this.nivel_8="nivel 8";
this.incremento_vida= 20;
this.incremento_daño= 20;
this.incremento_defensa=20;
this.habilidad_especial=true;

/* la habilidad especial= baja la vida en un 8 por turno
ya que el usuario reduce el oxigeno del espacio*/

}
 public NivelO (String Nivel_8,int IncrementoVida,int IncrementoDaño,int IncrementoDefensa,boolean HabilidadEspecial) 
 {
     this.nivel_8=Nivel_8;
     this.incremento_vida=IncrementoVida;
     this.incremento_daño=IncrementoDaño;
     this.incremento_defensa=IncrementoDefensa;
     this.habilidad_especial=HabilidadEspecial;
     
 } 

    public String getNivel_8() {
        return nivel_8;
    }

    public void setNivel_8(String nivel_8) {
        this.nivel_8 = nivel_8;
    }

    public int getIncremento_vida() {
        return incremento_vida;
    }

    public void setIncremento_vida(int incremento_vida) {
        this.incremento_vida = incremento_vida;
    }

    public int getIncremento_daño() {
        return incremento_daño;
    }

    public void setIncremento_daño(int incremento_daño) {
        this.incremento_daño = incremento_daño;
    }

    public int getIncremento_defensa() {
        return incremento_defensa;
    }

    public void setIncremento_defensa(int incremento_defensa) {
        this.incremento_defensa = incremento_defensa;
    }

    public boolean isHabilidad_especial() {
        return habilidad_especial;
    }

    public void setHabilidad_especial(boolean habilidad_especial) {
        this.habilidad_especial = habilidad_especial;
    }
 
}
