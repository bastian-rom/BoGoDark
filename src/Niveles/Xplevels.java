/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niveles;

import Personajes.Guerrillero;
import Personajes.Personaje;

/**
 *
 * @author usuario
 */
public class Xplevels {
    
    int xp;
    String rango;
    int nivel_actual;

    
    
    public String Subir_rango(int current_lvl)
    {   
        String x = null;
        switch (current_lvl)
        { 
            case 1:x="Recluta";break;
            case 2:x="Soldado Raso";break;
            case 3:x="Cabo";break;
            case 4:x="Cabo Primero";break;
            case 5:x="Sargento";break;
        }
        return x;
    }
    
    
    
    
    
    
    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getNivel_actual() {
        return nivel_actual;
    }

    public void setNivel_actual(int nivel_actual) {
        this.nivel_actual = nivel_actual;
    }
    
    
    
    
    
    
    
    
}
