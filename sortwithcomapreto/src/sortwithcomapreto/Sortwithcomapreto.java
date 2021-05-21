/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortwithcomapreto;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class Sortwithcomapreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     NewClass [] ob = new NewClass [3];
     ob[0]=new NewClass(45);
          ob[1]=new NewClass(34);

               ob[2]=new NewClass(1);
               Arrays.sort(ob);

    for(NewClass x:ob)
    {
        System.out.println(x.x);
    }
}
}