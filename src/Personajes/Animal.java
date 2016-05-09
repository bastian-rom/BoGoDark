/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

/**
 *
 * @author Javier117
 */
public class Animal {
       String nombre;
   int vida;
   int daño;
   int defensa;
   boolean hostil;
   
   public Animal ()
   {
   this.nombre="desconocido";
   this.vida=50;
   this.daño=5;
   this.defensa=10;
   this.hostil=false;
   }
   public Animal (String Nombre,int Vida,int Daño,int Defensa,boolean Hostil)
   {
       this.nombre=Nombre;
       this.daño=Daño;
       this.defensa=Defensa;
       this.vida=Vida;
       this.hostil=Hostil;
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

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }
}
