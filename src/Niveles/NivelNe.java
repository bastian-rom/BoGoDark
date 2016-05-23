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
public class NivelNe {
    
   String nivel_10;
   int incremento_vida;
   int incremento_damage;
   int incremento_defensa;
   boolean habilidad_especial;
   

 public NivelNe()
{
this.nivel_10="nivel 10";
this.incremento_vida= 20;
this.incremento_damage= 20;
this.incremento_defensa=20;
this.habilidad_especial=true;

/* la habilidad especial= aumenta la visibilidad del usuario
ya que el neon utilizado como bombilla en bares*/

}
 public NivelNe (String Nivel_10,int IncrementoVida,int IncrementoDamage,int IncrementoDefensa,boolean HabilidadEspecial) 
 {
     this.nivel_10=Nivel_10;
     this.incremento_vida=IncrementoVida;
     this.incremento_damage=IncrementoDamage;
     this.incremento_defensa=IncrementoDefensa;
     this.habilidad_especial=HabilidadEspecial;
     
 } 

    public String getNivel_10() {
        return nivel_10;
    }

    public void setNivel_10(String nivel_10) {
        this.nivel_10 = nivel_10;
    }

    public int getIncremento_vida() {
        return incremento_vida;
    }

    public void setIncremento_vida(int incremento_vida) {
        this.incremento_vida = incremento_vida;
    }

    public int getIncremento_damage() {
        return incremento_damage;
    }

    public void setIncremento_damage(int incremento_damage) {
        this.incremento_damage = incremento_damage;
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
