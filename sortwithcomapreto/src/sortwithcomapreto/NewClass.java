/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortwithcomapreto;

/**
 *
 * @author HP
 */
public class NewClass implements Comparable<NewClass> {
      public int x;
    public NewClass (int x)
    {
       this.x=x;
    }
    public int compareTo(NewClass ob)
    {
         if(this.x>ob.x)
         {
             return 1;
         }
         else
         {
             return -1;
         }
         
    }
}
