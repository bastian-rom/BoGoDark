
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
    int CA;

    public Mutante() {
        this.nombre = "super mutante";
        this.vida = 100;
        this.damage = 15;
        this.defensa = 25;
        this.autoridad = 0;
        this.fuer = Dados.Dado(20);
        this.des = Dados.Dado(20);
        this.con = Dados.Dado(20);
        this.inte = Dados.Dado(20);
        this.sab = Dados.Dado(20);
        this.car = Dados.Dado(20);
        this.CA = 12;

    }

    public Mutante(String Nombre) {
        this.nombre = Nombre;
        this.vida = 100;
        this.damage = 15;
        this.defensa = 25;
        this.autoridad = 0;
        this.fuer = Dados.Dado(20);
        this.des = Dados.Dado(20);
        this.con = Dados.Dado(20);
        this.inte = Dados.Dado(20);
        this.sab = Dados.Dado(20);
        this.car = Dados.Dado(20);
        this.CA = 12;
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

    public int getAutoridad() {
        return autoridad;
    }

    public void setAutoridad(int autoridad) {
        this.autoridad = autoridad;
    }

    public int getFuer() {
        return fuer;
    }

    public void setFuer(int fuer) {
        this.fuer = fuer;
    }

    public int getDes() {
        return des;
    }

    public void setDes(int des) {
        this.des = des;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getInte() {
        return inte;
    }

    public void setInte(int inte) {
        this.inte = inte;
    }

    public int getSab() {
        return sab;
    }

    public void setSab(int sab) {
        this.sab = sab;
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }

    public int getCA() {
        return CA;
    }

    public void setCA(int CA) {
        this.CA = CA;
    }

}
