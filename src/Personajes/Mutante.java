
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import bogodark.Dados;

/**
 *
 * @author Sebastian
 */
public class Mutante {
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
    
  public Mutante()
          
  {
  this.nombre="super mutante";
  this.vida=100;
  this.damage=15;
  this.defensa=25;
  this.autoridad=0;
  this.fuer=Dados.Dado(20);
  this.des=Dados.Dado(20);
  this.con=Dados.Dado(20);
  this.inte=Dados.Dado(20);
  this.sab=Dados.Dado(20);
  this.car=Dados.Dado(20);
 
 
          
  }
  public Mutante(  String Nombre)
  { 
      this.nombre=Nombre;
     
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

   
    }



