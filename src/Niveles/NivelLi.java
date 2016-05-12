/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niveles;

/**
   @author Sebastian
 */
public class NivelLi {
   String nivel_3;
   int incremento_vida;
   int incremento_daño;
   int incremento_defensa;
   boolean habilidad_especial;
   

 public NivelLi()
{
this.nivel_3="nivel 3";
this.incremento_vida= 20;
this.incremento_daño= 20;
this.incremento_defensa=20;
this.habilidad_especial=true;

/* la habilidad especial=reducir el peso de la armadura
ya que el litio el metal mas ligeros*/

}
 public NivelLi (String Nivel_3,int IncrementoVida,int IncrementoDaño,int IncrementoDefensa,boolean HabilidadEspecial) 
 {
     this.nivel_3=Nivel_3;
     this.incremento_vida=IncrementoVida;
     this.incremento_daño=IncrementoDaño;
     this.incremento_defensa=IncrementoDefensa;
     this.habilidad_especial=HabilidadEspecial;
     
 }  

    public String getNivel_3() {
        return nivel_3;
    }

    public void setNivel_3(String nivel_3) {
        this.nivel_3 = nivel_3;
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
