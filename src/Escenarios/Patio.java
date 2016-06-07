/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escenarios;

import bogodark.Dados;
import Personajes.*;
import javax.swing.JOptionPane;
/*
jeison velasco :( 
 */
public class Patio 

{
   
Ejercito loca = new Ejercito("loca");
Mutante perras=new Mutante("perras");
Nerd madrid=new Nerd ("madrid");
Animal cosito=new Animal ("pepe");
Bombero mono=new Bombero ("mono");




int x;

public static void Pelea(){
        boolean primero= true;
{
    while (loca.getVida() > 0 && perras.getVida() > 0);
        {
            if (Math.random() > 0.5)
            {
                primero = true;
                
            } 
            else 
            {
                primero = false;
                
            }
            if 
                    (primero) 
            {
                loca.setVida(loca.getVida()- (perras.getDamage()- loca.getDefensa()));
                
            } 
            else 
            {
                perras.setVida(perras.getVida() - (loca.getDamage() - perras.getDefensa()));
            }
        }
    }
}
}
    
    
    
  
        
        
       
    
    
    
    
    





        
 
 
