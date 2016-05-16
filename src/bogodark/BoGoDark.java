/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bogodark;

import Personajes.*;
/*
public class BoGoDark {

    
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
    
}*/
////////////////////////////////////////////////////////////////////////////////////////////////////////

/*ejercicio william camilo beltran */
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian
 */
public class BoGoDark {

    
    public static void main(String[] args) {
        WilliamCBO();
    }
    
    public static void WilliamCBO()
    {
     Bombero Robot=new Bombero("Smith",100,15,10,false);
     Gamin Trixi=new Gamin("Yurany",100,15,10,true);
     JOptionPane.showMessageDialog(null,Trixi.getNombre()+" VS "+Robot.getNombre());
     while (Robot.getVida()>0 && Trixi.getVida()>0)
     {
            if( Math.random()>0.5)
                if(Robot.getDaño()>Trixi.getDefensa())
            {
            int ataque = Robot.getDaño()- Trixi.getDefensa();
            Trixi.setVida(Trixi.getVida()- ataque);
            System.out.println(Robot.getNombre()+" le pega a "+Trixi.getNombre() +" el daño es de "+ - ataque );
            System.out.println("la vida de "+Trixi.getNombre()+" deciende a "+Trixi.getVida());
            } else 
                {
            int rebote=Trixi.getDefensa()-Robot.getDaño();
            Robot.setVida(rebote - Robot.getVida());
            System.out.println("la vida de "+Robot.getNombre()+ "se reduce a "+ Robot.getVida());
                }
            else{
                int ataque = Trixi.getDaño()- Robot.getDefenza();
                Robot.setVida(Robot.getVida()- ataque);
                System.out.println(Trixi.getNombre()+" le pega a "+Robot.getNombre()+ " el daño es de "+ - ataque);
                System.out.println("la vida de "+ Robot.getNombre()+ " se reduce a "+ Robot.getVida());
                        } if (Trixi.getVida()== 0 || Robot.getVida()==0 )
                        {if (Trixi.getVida()==0)
                        {
                            System.out.println("El ganador es "+ Robot.getNombre()+" con "+ Robot.getVida()+ " de vida");
                            JOptionPane.showMessageDialog(null,"El ganador es "+ Robot.getNombre()+" con "+ Robot.getVida()+ " de vida");
                        }
                        else{
                            System.out.println("el ganador es "+ Trixi.getNombre()+ " con "+ Trixi.getVida()+" de vida");
                             JOptionPane.showMessageDialog(null,"el ganador es "+ Trixi.getNombre()+ " con "+ Trixi.getVida()+" de vida");
                        }
                        }
                        {/*JhonWOnka*/
                            Policia=new Policia("desconocido",100,15,10,false);
                            Guerrillero=new Guerrillero("desconocido",100,15,10,true);
                            boolean=primero=false;
                            while (Policia.getVida()>0 && Guerrillero.getVida()>0);
                            {
                                if(math.ramdom()>0.5)
                                {
                                    primero=true;
                                }
                                else
                                {
                                    primero=false;
                                }
                                if(Primero)
                                {
                                    P2.setlife(P2.getlife()-(P1.getdamage()-P2.getdefense())
                                }
                                else
                                {
                                    P1.setlife(P2.getlife()-(P2.getdamage()-P1.getdefense())
                                }
                            }
                            
                             
                            
                           
                            
                        }
}}}


