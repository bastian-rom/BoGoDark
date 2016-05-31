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

import bogodark.Dados;

/**
 *
 * @author Sebastian
 */
 /*editada por jeisson aldana mora*/
public class Guerrillero {
    String nombre;
    int vida;
    int damage;
    int defensa;
    int autoridad;
    int fuer;
    int des;
    int con;
    int inte;
    int sab;
    int car;
    
  public Guerrillero()
          
  {
  this.nombre="cano";
  this.vida=100;
  this.damage=15;
  this.defensa=12;
  this.autoridad=0;
  this.fuer=Dados.Dado(20);
  this.des=Dados.Dado(20);
  this.con=Dados.Dado(20);
  this.inte=Dados.Dado(20);
  this.sab=Dados.Dado(20);
  this.car=Dados.Dado(20);
  
  
  }
  public Guerrillero(String Nombre)
  { 
      this.nombre=Nombre;
      this.vida=100;
  this.damage=15;
  this.defensa=12;
  this.autoridad=0; 
      this.fuer=Dados.Dado(20);
     this.des=Dados.Dado(20);
     this.con=Dados.Dado(20);
     this.inte=Dados.Dado(20);
    this.sab=Dados.Dado(20);
     this.car=Dados.Dado(20);
              
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
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

             

    

