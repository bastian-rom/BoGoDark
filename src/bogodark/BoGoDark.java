/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bogodark;

import Personajes.*;
import bogodark.Dados;
import javax.swing.JOptionPane;

public class BoGoDark {
    

    public static void main(String[] args) 
    {   
        
        String[] sel=new String[5];
        sel[0]="2";
        sel[1]="4";
        sel[2]="6";
        sel[3]="8";
        sel[3]="8";
        sel[4]="10";
        int entrada=JOptionPane.showOptionDialog(null,"mensaje","cambiar titulo",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,sel,sel[0]);
        System.out.println(Dados.Dado(Dados.opciones[entrada]));
        System.out.println(Dados.opciones[entrada+1]);
      
                
      intro();
      
      
    }

     private static void intro()
     
    {
        System.out.println("BoGoDark");
        System.out.println("Historia");
    }

          
   
     public static void Javierh() {
        Aliado Soldado = new Aliado(10, "Soldado", 100, 10);
        Enemigo Saqueador = new Enemigo("Saqueador", 100, 10, 10);

        System.out.println(Soldado.getNombre() + " vs " + Saqueador.getNombre());

        while (Soldado.getVida() > 0 && Saqueador.getVida() > 0) {

            if (Math.random() < 0.5) {
                if (Soldado.getDamage() > Saqueador.getDefensa()) {
                    int golpe = Soldado.getDamage() - Saqueador.getDefensa();
                    Saqueador.setVida(Saqueador.getVida() - golpe);
                    System.out.println(Saqueador.getNombre() + " vida desciende a:" + Saqueador.getVida());
                } else {
                    System.out.println(Saqueador.getNombre() + " inmune al damage");
                    Saqueador.setDefensa(Saqueador.getDefensa() - Soldado.getDamage());
                }
            } else {
                if (Saqueador.getDamage() > Soldado.getDefensa()) {
                    int golpe = Saqueador.getDamage() - Soldado.getDefensa();
                    Soldado.setVida(Soldado.getVida() - golpe);
                    System.out.println(Soldado.getNombre() + " vida desciende a:" + Soldado.getVida());
                } else {
                    System.out.println(Soldado.getNombre() + " inmune al damage");
                    Soldado.setDefensa(Saqueador.getDamage() - Soldado.getDefensa());

                }
            }

        }
    }

    public static void WilliamCBO() {
        Bombero Robot = new Bombero("Smith", 100, 15, 10, false);
        Gamin Trixi = new Gamin("Yurany", 100, 15, 10, true);
        JOptionPane.showMessageDialog(null, Trixi.getNombre() + " VS " + Robot.getNombre());
        while (Robot.getVida() > 0 && Trixi.getVida() > 0) {
            if (Math.random() > 0.5) {
                if (Robot.getDamage() > Trixi.getDefensa()) {
                    int ataque = Robot.getDamage() - Trixi.getDefensa();
                    Trixi.setVida(Trixi.getVida() - ataque);
                    System.out.println(Robot.getNombre() + " le pega a " + Trixi.getNombre() + " el damage es de " + -ataque);
                    System.out.println("la vida de " + Trixi.getNombre() + " deciende a " + Trixi.getVida());
                } else {
                    int rebote = Trixi.getDefensa() - Robot.getDamage();
                    Robot.setVida(rebote - Robot.getVida());
                    System.out.println("la vida de " + Robot.getNombre() + "se reduce a " + Robot.getVida());
                }
            } else {
                int ataque = Trixi.getDamage() - Robot.getDefenza();
                Robot.setVida(Robot.getVida() - ataque);
                System.out.println(Trixi.getNombre() + " le pega a " + Robot.getNombre() + " el damage es de " + -ataque);
                System.out.println("la vida de " + Robot.getNombre() + " se reduce a " + Robot.getVida());
            }
            if (Trixi.getVida() == 0 || Robot.getVida() == 0) {
                if (Trixi.getVida() == 0) {
                    System.out.println("El ganador es " + Robot.getNombre() + " con " + Robot.getVida() + " de vida");
                    JOptionPane.showMessageDialog(null, "El ganador es " + Robot.getNombre() + " con " + Robot.getVida() + " de vida");
                } else {
                    System.out.println("el ganador es " + Trixi.getNombre() + " con " + Trixi.getVida() + " de vida");
                    JOptionPane.showMessageDialog(null, "el ganador es " + Trixi.getNombre() + " con " + Trixi.getVida() + " de vida");
                }
            }
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////

    public static void JhonWOnka() {
        /*JhonWOnka*/

        Policia p1 = new Policia(100, "desconocido", 15, 10, 0);
        Guerrillero p2 = new Guerrillero(100, "desconocido", 15, 10, 0);
        boolean primero = false;
        while (p1.getVida() > 0 && p2.getVida() > 0);
        {
            if (Math.random() > 0.5) {
                primero = true;
            } else {
                primero = false;
            }
            if (primero) {
                p1.setVida(p2.getVida() - (p1.getDamage() - p2.getDefensa()));
            } else {
                p1.setVida(p2.getVida() - (p2.getDamage() - p1.getDefensa()));
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////

    /* jeisson (bald)*/
    public static void Jeisson() {
        Aliado Armado = new Aliado(10, "goku", 100, 10);
        Policia Tombo = new Policia(100, "maricon", 35, 20, 100);
        JOptionPane.showMessageDialog(null, Armado.getNombre() + "vs" + Tombo.getNombre());
        while (Armado.getVida() > 0 && Tombo.getVida() > 0) {
            boolean Primero = false;
            if (Math.random() > 0.5) {
                Primero = true;
            }
            if (Primero) {
                Armado.setVida(Armado.getVida() - (Armado.getDefensa() - Tombo.getDamage()));
                JOptionPane.showMessageDialog(null, Tombo.getNombre() + "lo casca a " + Armado.getNombre());
            } else {
                Tombo.setVida(Tombo.getVida() - (Tombo.getDefensa() - Armado.getDamage()));
                JOptionPane.showMessageDialog(null, Armado.getNombre() + "le hace la henkidama a" + Tombo.getNombre());
            }
        }
    }
}
