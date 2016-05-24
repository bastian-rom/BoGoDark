/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bogodark;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Dados {
    
    
   public static int[] opciones={2,3,4,6,8,10,12,14,20,24,50,100};
    
     
      public static int Dado(int x)
    {
     Random rnd = new Random();
      return (int)(rnd.nextDouble() * x + 1);
    };
   
    
}
