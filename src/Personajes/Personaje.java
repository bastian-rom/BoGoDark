/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import bogodark.Dados;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Personaje {

    private String nombre;
    private int vida;
    private int damage;
    private int defensa;
    private int nivel;
    private int fuer;
    private int des;
    private int con;
    private int inte;
    private int sab;
    private int car;
    private int xp;
    public boolean turno;

    public Personaje(String Nombre) {
        this.nombre = Nombre;
        this.vida =50;
        this.damage=Dados.Dado(20);
        this.defensa= Dados.Dado(20);
        this.nivel=1;
        this.fuer= getCarac();
        this.des=getCarac();
        this.con=getCarac();
        this.inte=getCarac();
        this.sab=getCarac();
        this.car=getCarac();
        this.xp=0;
        this.turno=false;

        }

    
    public void mi_turno()
    {
        setTurno(true);
    }
    
    public void End_turn()
    {
        setTurno(false);
    }
    
    
    
    
    
    private int getCarac()
    {
        int[] arreglo={Dados.Dado(6),Dados.Dado(6),Dados.Dado(6),Dados.Dado(6)};
        int menor =arreglo[0];
        for(int i=1; i <=3;i++ ){
            
           if(arreglo[i]<menor) 
           {
               menor= arreglo[i];
           }
            
        } 
        int suma =0;
        for(int valor : arreglo)
        {
//            suma+= arreglo[valor];
        }
         
          return suma-menor;         
        
     }

    public void golpe()
    {
        JOptionPane.showMessageDialog(null,"Personaje "+getNombre()+" lanza un golpe de "+getDamage()+" de daño.");
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
     public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }
}
