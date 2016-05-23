/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armas;

/**
 *
 * @author Sebastian
 */
public class ArmasQuimicas {
     int alcance;
    int velocidadcarga;
    int damage;
    int velocidadataque;
    String nombre;
    int municion;
    
    
     public ArmasQuimicas()
 {
     this.alcance=3;
     this.damage=5;
     this.velocidadataque=3;
     this.nombre="arma quimica";
     this.velocidadcarga=4;
 }
     public ArmasQuimicas(int Alcance, int Damage, int Velocidadataque, String Nombre, int Velocidadcarga)
 {
     this.alcance=Alcance;
     this.damage=Damage;
     this.velocidadataque=Velocidadataque;
     this.velocidadcarga=Velocidadcarga;
     
 }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getVelocidadcarga() {
        return velocidadcarga;
    }

    public void setVelocidadcarga(int velocidadcarga) {
        this.velocidadcarga = velocidadcarga;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getVelocidadataque() {
        return velocidadataque;
    }

    public void setVelocidadataque(int velocidadataque) {
        this.velocidadataque = velocidadataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }
 };




