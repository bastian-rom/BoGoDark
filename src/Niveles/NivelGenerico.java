/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niveles;

import bogodark.Dados;


/**
 *
 * @author Usuario
 */
public class NivelGenerico {
    private String nivel;
    private int incremento_vida;
    private int incremento_damage;
    private boolean habilidad_especial;
    private int enemigos;
    private int experiencia;
    private int muertes;

    

    
    public NivelGenerico(String Nivel, int muertes)
    {
     this.experiencia=muertes;
     this.incremento_damage=25;
     this.incremento_vida=30;
     this.nivel=Nivel;
     this.enemigos= Dados.Dado(50);
     
     
     
    }
   
    
     
     
     
     
    
    
    
    }
           
    
