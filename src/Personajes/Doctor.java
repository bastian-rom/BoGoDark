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
    
    public Doctor()
    {
    this.curacion=15;
    this.doctor=true;
    this.regeneracion=10;
    }
    
    public Doctor (int Curacion, boolean Doctor, int Regeneracion)
            
    {
        this.curacion=Curacion;
        this.doctor=Doctor;
        this.regeneracion=Regeneracion;
    }
}
