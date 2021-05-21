/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joinsleeprunnablethread;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Joinsleeprunnablethread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           //basic thread
        int x;
        Scanner t= new Scanner (System.in);
        
      //  System.out.println("EnTER 1 for basic thrad 2 for join thread 3 for runnable interface");
       
                  System.out.println("Its A infity loop 0_0 EnTER 1 for basic thrad 2 for join thread 3 for runnable interface and type 0 for end the loop");

    while(true){
                
                
                
           System.out.println("enter a number :");
          x=t.nextInt();
          if(x==4)
          {
              System.out.println("loop er sathe breakup huhh!!! ");
              break;
          }
     if(x==1)
     {
         NewClass ob = new NewClass ();
                  NewClass ob1 = new NewClass ();
                  ob.start();
                  ob1.start();

         
     }
      if(x==2)
     {
         NewClass ob = new NewClass ();
                  NewClass ob1 = new NewClass ();
                ob.start();
                try{
                  ob.join();
                }
                 catch(Exception e)
          {
              
          }
 
                
         
     }
       if(x==3)
     {
         NewClass1 ob = new NewClass1 ();
                  NewClass1 ob1 = new NewClass1 ();
                 
                  
                  
                  Thread o = new Thread (ob);
                                  
                  Thread o1 = new Thread (ob);
                  o.start();
                  o1.start();

     }
    
    
        
    }
    }
    
}
