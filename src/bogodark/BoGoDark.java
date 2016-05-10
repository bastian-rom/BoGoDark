/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bogodark;

import Personajes.*;

/**
 *
 * @author Sebastian
 */
public class BoGoDark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Javierh();
    }
    
    public static void Javierh()
    {
     Aliado Soldado=new Aliado("Soldado",10,100,10);
     Enemigo Saqueador=new Enemigo("Saqueador",100,10,10);
     
     System.out.println(Soldado.getNombre()+" vs "+Saqueador.getNombre());
     
     while (Soldado.getVida()>0 && Saqueador.getVida()>0){
     
         if( Math.random()<0.5)
        {   if (Soldado.getDaño()>Saqueador.getDefensa())
                {
                int golpe=Soldado.getDaño()-Saqueador.getDefensa();
                Saqueador.setVida(Saqueador.getVida()-golpe);
                System.out.println(Saqueador.getNombre()+" vida desciende a:"+Saqueador.getVida());
                }
            else 
                { 
                  System.out.println( Saqueador.getNombre()+" inmune al daño");
                  Saqueador.setDefensa(Saqueador.getDefensa()-Soldado.getDaño());
                }
                }
          else { 
             if (Saqueador.getDaño()>Soldado.getDefensa())
                    {
                    int golpe=Saqueador.getDaño()-Soldado.getDefensa();
                    Soldado.setVida(Soldado.getVida()-golpe);
                    System.out.println(Soldado.getNombre()+" vida desciende a:"+Soldado.getVida());
                    }
                    
                    else { 
                            System.out.println( Soldado.getNombre()+" inmune al daño"); 
                            Soldado.setDefensa(Saqueador.getDaño()-Soldado.getDefensa());

                         }
        }
                    
                 
     }
    }
    
}
