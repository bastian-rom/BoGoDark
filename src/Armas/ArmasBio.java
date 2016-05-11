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
public class ArmasBio {
    int daño;
    int municion;
    int alcance;
    String nombre;
    
    public ArmasBio ()
    {
    this.alcance=10;
    this.daño=12;
    this.municion=20;
    this.nombre="arma biologica";
    }
    
    
    
    public ArmasBio( int Alcance,int Daño, int Municion, String Nombre)
    {
    this.alcance=Alcance;
    this.daño=Daño;
    this.municion=Municion;
    this.nombre=Nombre;
    
    
   }
    
}
}
