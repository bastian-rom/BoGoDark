/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Sebastian
 */

    package Personajes;

/**
 *
 * @author Sebastian
 */
 /*editada por jeisson aldana mora*/
public class Guerrillero {
    String nombre;
    int vida;
    int daño;
    int defensa;
    int autoridad;
    
  public Guerrillero()
          
  {
  this.nombre="cano";
  this.vida=100;
  this.daño=15;
  this.defensa=25;
  this.autoridad=0;
          
  }
  public Guerrillero(int Vida,String Nombre,int Daño,int Defensa,int Autoridad)
  { 
      this.nombre=Nombre;
      this.vida=Vida;
      this.daño=Daño;
      this.defensa=Defensa; 
      this.autoridad=Autoridad;
              
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
}       

             

    

