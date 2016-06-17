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
public class Bombero {
   
    String nombre;
    int vida;
    int damage;
    int defensa;
    boolean hostil;

public Bombero(String Nombre) 
{

this.nombre="desconocido";
this.vida=100;
this.damage=15;
this.defensa=10;
this.hostil=false;
}
public Bombero(String Nombre,int Vida,int Damage,int Defensa,boolean Hostil)
        
{
       this.nombre=Nombre;
       this.damage=Damage;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefenza() {
        return defensa;
    }

    public void setDefenza(int defenza) {
        this.defensa = defenza;
    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

}
