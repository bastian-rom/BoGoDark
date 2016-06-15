/*

 */
package Niveles;

import bogodark.Dados;



public class NivelGenerico {
    private String nivel;
    private int incremento_vida;
    private int incremento_damage;
    private boolean habilidad_especial;
    private int enemigos;
    private int experiencia;
    private int muertes;

    

    
    public NivelGenerico(String Nivel, int muertes)
    {
     this.experiencia=muertes;
     this.incremento_damage=25;
     this.incremento_vida=30;
     this.nivel=Nivel;
     this.enemigos= Dados.Dado(50);
     }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
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

    public boolean isHabilidad_especial() {
        return habilidad_especial;
    }

    public void setHabilidad_especial(boolean habilidad_especial) {
        this.habilidad_especial = habilidad_especial;
    }

    public int getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(int enemigos) {
        this.enemigos = enemigos;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getMuertes() {
        return muertes;
    }

    public void setMuertes(int muertes) {
        this.muertes = muertes;
    }
  
}
           
    
