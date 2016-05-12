/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

/**
 *
 * @author Sebastian
 */
public class FNC {
    String nombre;
    int vida;
    int daño;
    int defensa;
    int autoridad;
    boolean brigadier;
    
    public FNC()
            
    {
     this.nombre="alferez";
     this.vida=100;
     this.daño=40;
     this.defensa=30;
     this.autoridad=80;
     this.brigadier=true;
    }
    public FNC(int Vida,String Nombre,int Daño,int Defensa,int Autoridad)
    {
        this.nombre=Nombre;
        this.vida=vida;
        this.defensa=Defensa;
        this.autoridad=Autoridad;
        this.brigadier=true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAutoridad() {
        return autoridad;
    }

    public void setAutoridad(int autoridad) {
        this.autoridad = autoridad;
    }

    public boolean isBrigadier() {
        return brigadier;
    }

    public void setBrigadier(boolean brigadier) {
        this.brigadier = brigadier;
    }
}
/*[eiditada jeisson aldana mora]*/
