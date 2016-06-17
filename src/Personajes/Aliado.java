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
    int damage;
    int defensa;
    boolean aliado;
    
   public Aliado()
   {
    this.nombre="Aliado desconocido";
    this.vida =100;
    this.damage= 10;
    this.defensa=10;
    this.aliado=true;
   }
   
   public Aliado(int Defensa,String Nombre,int Vida, int Damage)
   {
    this.nombre=Nombre;
    this.vida =Vida;
    this.damage= Damage;
    this.defensa=Defensa;
    this.aliado=true;
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
    
}
