/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armas;

import bogodark.Dados;

/**
 *
 * @author Usuario
 */
public class Arma {
    private String nombre;
    private int damage;
    private int cargador;
    private int municionmax;
    private int v_carga;
    private int cadencia;
   
    
    public Arma (String Nombre){
        this.nombre = Nombre;
        this.damage=Dados.Dado(20);
        this.cargador=2;
        this.v_carga=Dados.Dado(2);
        this.cadencia=Dados.Dado(2);
        this.municionmax=this.cargador;
        
                   
    }
    
    
    public int Disparar()
    {
        int balas=getCargador()-((getCadencia()*100)/getCadencia());

        int disparos=getDamage()*balas;
        setCargador(getCargador()-balas);
        return disparos;
    }
    
    public void Recargar()
    {
        setCargador(getMunicionmax());
    }  
    
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCargador() {
        return cargador;
    }

    public void setCargador(int cargador) {
        this.cargador = cargador;
    }

    public int getV_carga() {
        return v_carga;
    }

    public void setV_carga(int v_carga) {
        this.v_carga = v_carga;
    }

    public int getCadencia() {
        return cadencia;
    }

    public void setCadencia(int cadencia) {
        this.cadencia = cadencia;
    }
   
    public int getMunicionmax() {
        return municionmax;
    }

    public void setMunicionmax(int municionmax) {
        this.municionmax = municionmax;
    }
     
    
}

