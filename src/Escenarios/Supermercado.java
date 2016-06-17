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
public class Supermercado  {
    
    
   static int enemigos=Dados.Dado(10);
   int dificultad=Dados.Dado(8);
   public static int enemies=enemigos; 
   
  public  static void level_inicio()
  {      
         //JavierHjframe wind=new JavierHjframe();
         Guerrillero mono=new Guerrillero("Goku");
         //wind.setVisible(true);
         Mutante Kobold=new Mutante("Kobold");
        // wind.jLabel5.setText(" Enemigos Restantes"+enemies);
         
  }
  
  public static void reiniciar()
  {        enemies=Dados.Dado(10);
           /*JavierHjframe wind=new JavierHjframe();
           wind.jLabel5.setText(" Enemigos Restantes"+enemies);
           wind.jButton1.setVisible(false);
           wind.jButton3.setVisible(false);
           wind.jButton2.setVisible(true);*/
  }
  
  
    
}
