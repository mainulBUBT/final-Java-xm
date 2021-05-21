/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compareableinterface;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class Compareableinterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       NewClass [] ob = new NewClass [4];
       ob[0]= new NewClass (12);
               ob[1]= new NewClass (102);
       ob[2]= new NewClass (2);
       ob[3]= new NewClass (1);
      Arrays.sort(ob);

       for(NewClass x:ob)
       {
           System.out.println(x.s);
       }
         }
    
    
    
    
}
