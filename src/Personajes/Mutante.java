
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
public class Mutante {
String nombre;
    int vida;
    int daño;
    int peligro;


  public Mutante()
          
  {
  this.nombre="super mutante";
  this.vida=100;
  this.daño=15;
  this.peligro=25;
 
          
  }
  public Guerrillero( int Vida, String Nombre, int Daño, int Peligro)
  { 
      this.nombre=Nombre;
      this.vida=Vida;
      this.daño=Daño;
      this.peligro=Peligro
              
  }

}
