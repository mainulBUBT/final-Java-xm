/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionlistnew;

import java.util.Comparator;

/**
 *
 * @author HP
 */
public class NewClass2 implements Comparator<NewClass1> {
    
    
   public int compare(NewClass1 x,NewClass1 y)
   {
       if(x.d>y.d)
       {
           return 1;
       }
       else
       {
           return -1;
       }
   }
    
    
    
}
