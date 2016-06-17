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
public class Doctor {
    
    int curacion;
    boolean doctor;
    int regeneracion;
    int ataque;
    
    public Doctor()
    {
    this.curacion=15;
    this.doctor=true;
    this.regeneracion=10;
    this.ataque=10;
    }
    
    public Doctor (int Curacion, boolean Doctor, int Regeneracion,int Ataque)
            
    {
        this.curacion=Curacion;
        this.doctor=Doctor;
        this.regeneracion=Regeneracion;
        this.ataque=Ataque;
    }

    public int getCuracion() {
        return curacion;
    }

    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }

    public boolean isDoctor() {
        return doctor;
    }

    public void setDoctor(boolean doctor) {
        this.doctor = doctor;
    }

    public int getRegeneracion() {
        return regeneracion;
    }

    public void setRegeneracion(int regeneracion) {
        this.regeneracion = regeneracion;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
}
