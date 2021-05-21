/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compareableinterface;

/**
 *
 * @author HP
 */
public class NewClass implements Comparable<NewClass> {
    int s;
    NewClass(int x)
    {
        s=x;
    }
    
  public int compareTo(NewClass ob)
  {
     if(this.s>ob.s)
     {
         return 1;
     }
     
      else
     {
         return -1;
  }
}
}
