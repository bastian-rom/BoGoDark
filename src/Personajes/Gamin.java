/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

/**
 *
 * @author ttaa
 */
public class Gamin {
    String nombre;
    int vida;
    int damage;
    int defensa;
    boolean hostil;

public Gamin() 
{

this.nombre="desconocido";
this.vida=100;
this.damage=15;
this.defensa=10;
this.hostil=true;
}
public Gamin(String Nombre,int Vida,int Damage,int Defensa,boolean Hostil)
        
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

    public int setVida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
