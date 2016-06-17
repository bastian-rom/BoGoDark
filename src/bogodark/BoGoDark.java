/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bogodark;

import Armas.Pistola;
import Personajes.*;
import javax.swing.JOptionPane;



public class BoGoDark {
    
    public static void main(String[] args) 
    {   
        
        String name2 = Crear_personaje();
        Guerrillero jugador=new Guerrillero(name2);
        Mutante enemy=new Mutante(); 
        int enemies=Dados.Dado(6);
        int ronda=0;
        
        String weapon= JOptionPane.showInputDialog(null,"Seleccionar arma ,¿Pistola(p) o Cuchillo(c)?");
            if (weapon=="p")
                    {
                    Pistola pistol=new Pistola("Pistola 9mm");
                    jugador.setDamage(pistol.Disparar());
                    }
            else { if (weapon=="c")
                    {
                        jugador.setDamage(jugador.getDamage()+3);
                    }
            }
            boolean endgame=false;
            switch (Dados.Dado(2))
               {
                   case 1:jugador.mi_turno();
                   case2:jugador.End_turn();
               }
            
     
            while (jugador.getVida()>0 ||endgame==true)
        {   
            ronda+=1;
            JOptionPane.showMessageDialog(null,"Ronda "+ronda+","+jugador.getNombre()+"contra "+enemies+"enemigos");
            JOptionPane.showMessageDialog(null, endgame);
            
            switch (Dados.Dado(6))
            {
                case 1:JOptionPane.showMessageDialog(null,jugador.getNombre()+" ha encontrado comida, +15 de vida");
                        jugador.setVida(jugador.getVida()+15);break;
                
                case 2:JOptionPane.showMessageDialog(null,jugador.getNombre()+" ha caido en una trampa,-20 de vida");
                   jugador.setVida(jugador.getVida()-20); break;
                
                case 3:JOptionPane.showMessageDialog(null,"El camino parece volverse mas largo...");break;
                
                case 4:JOptionPane.showMessageDialog(null,jugador.getNombre()+" empieza a sentir el cansancio....(-8 daño)");
                       jugador.setDamage(jugador.getDamage()-8); break;
                
                case 5:JOptionPane.showMessageDialog(null,"Parece que esta anocheciendo...");break;
               
                case 6:JOptionPane.showMessageDialog(null,"'Parece un buen momento para descansar'-"+jugador.getNombre());
                break;
            
            }
            
            while (jugador.getVida()>0 || enemy.getVida()>0)
            {   
               
               if (jugador.isTurno())
                {
                    JOptionPane.showMessageDialog(null,jugador.getNombre()+" ataca."+jugador.getDamage()+" de daño.");
                    enemy.setVida(jugador.getDamage()-enemy.getVida());
                    jugador.End_turn();
                }
               else 
                {
                  JOptionPane.showMessageDialog(null,enemy.getNombre()+"- ataca.  "+enemy.getDamage()+": de daño.");
                  jugador.setVida(enemy.getDamage()-jugador.getVida());
                  jugador.mi_turno();
                }
            }
            if (enemy.getVida()<=0)
                {
                JOptionPane.showMessageDialog(null,jugador.getNombre()+" ha vencido");
                }
            else
                {
                JOptionPane.showMessageDialog(null,jugador.getNombre()+" pierde ");
                }
           
        }
        
      
      
    }

    
    private static String Crear_personaje()
    {
        String name1=JOptionPane.showInputDialog(null,"Escribe el nombre de tu personaje");
        return name1;
    }
    
    
    private static boolean Trunode()

    {   boolean w=false;
        double azar=Math.random();
        if (azar>=0.5)
        {
            w=true;
        }
        return w;
        
        
    }
    
    
    
    
   
}
