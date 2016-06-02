/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escenarios;
import Personajes.*;
import bogodark.Dados;

/**
 *
 * @author JAVIER HERNANDEZ!!!!
 */
public class Supermercado {
    
    
   int enemigos=Dados.Dado(10);
   int dificultad;
   
   
  public  void spawn()
  {
      for (int i=0;i==enemigos;i++)
      {
          Mutante x =new Mutante("Mutante");
          System.out.println(x.getDamage());
          
      }
      
      
  }
  
    
}
