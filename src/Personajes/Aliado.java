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
public class Aliado {
    
    String nombre;
    int vida;
    int daño;
    
   public Aliado()
   {
    this.nombre="Aliado desconocido";
    this.vida =100;
    this.daño= 10;
   }
   
   public Aliado(String Nombre,int Vida, int Daño)
   {
    this.nombre=Nombre;
    this.vida =Vida;
    this.daño= Daño;
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
    
    
}
