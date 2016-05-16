
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
  public Mutante( int Vida, String Nombre, int Daño, int Peligro)
  { 
      this.nombre=Nombre;
      this.vida=Vida;
      this.daño=Daño;
      this.peligro=Peligro;
              
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

    public int getPeligro() {
        return peligro;
    }

    public void setPeligro(int peligro) {
        this.peligro = peligro;
    }

}

