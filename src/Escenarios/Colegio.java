/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escenarios;

import Personajes.Nerd;
import Personajes.Gamin;
import Personajes.Animal;
import Personajes.Bombero;
import Personajes.Doctor;
import Personajes.Ejercito;
import bogodark.Dados;
 

public class Colegio {
    static int Enemigo=5;
    int dificultad=3;
   
    public static void searmoelpedo(){      
        Gamin Gamin = new Gamin();
        Nerd Nerd = new Nerd("hola"); 
        while (Gamin.getVida()>0&&Nerd.getVida()>0){
        if (Dados.Dado(2)==1){     
        Gamin.setVida(Gamin.getVida()-Nerd.getDaño());
        }
        else {            
            Nerd.setVida(Nerd.getVida()-Gamin.getDamage());
        }
        }
        while (Gamin.getVida()>0&&Nerd.getVida()>0){
        if (Dados.Dado(2)==1){     
        Gamin.setVida(Gamin.getVida()-Nerd.getDaño());
        }
        else {            
            Nerd.setVida(Nerd.getVida()-Gamin.getDamage());
        }
        }
        while (Gamin.getVida()>0&&Nerd.getVida()>0){
        if (Dados.Dado(2)==1){     
        Gamin.setVida(Gamin.getVida()-Nerd.getDaño());
        }
        else {            
            Nerd.setVida(Nerd.getVida()-Gamin.getDamage());
        }
        }
        while (Gamin.getVida()>0&&Nerd.getVida()>0){
        if (Dados.Dado(2)==1){     
        Gamin.setVida(Gamin.getVida()-Nerd.getDaño());
        }
        else {            
            Nerd.setVida(Nerd.getVida()-Gamin.getDamage());
        }
        }
        while (Gamin.getVida()>0&&Nerd.getVida()>0){
        if (Dados.Dado(2)==1){     
        Gamin.setVida(Gamin.getVida()-Nerd.getDaño());
        }
        else {            
            Nerd.setVida(Nerd.getVida()-Gamin.getDamage());
        }
        }
    }
}