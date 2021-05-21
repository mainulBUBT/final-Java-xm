/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.handling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ExceptionHandling {

    public static void main(String[] args) {
        
        
        int m,l,z=10;
        int []s= new int [10];
        String p=null;
        Scanner x= new Scanner (System.in);
        System.out.println("Enter 1 for Input missmatch Exception 2 for Arithmetic Exception 3 for Arrayindexoutofbounds 4 null pointer exceptions 5 for create self exception 6 functions exception 7 for stop the loop");
        
        while(true)
        {
            System.out.println("Enter a Number :"); 
            m=x.nextInt();
            if(m==7)
            {
                System.out.println("you break the loop :( its ok! but dont break anyones heart");
                break;
            }
            if(m==1)
            {
              try{
                  System.out.println("enter A char");
                              l=x.nextInt();

              }  
              catch(InputMismatchException e)
              {
                  System.out.println(e.getMessage()); 
              }
              
            } 
          if(m==2)
            {
              try{
                             System.out.println(10/0);

              }  
              catch(ArithmeticException e)
              {
                  System.out.println(e.getMessage()); 
              }
              
            } 
           if(m==3)
            {
              try{
                  s[11]=30;

              }  
              catch(ArrayIndexOutOfBoundsException e)
              {
                  System.out.println(e.getMessage()); 
              }
              
            } 
           if(m==4)
            {
              try{
                  System.out.println(p.length());

              }  
              catch(NullPointerException e)
              {
                  System.out.println(e.getMessage()); 
              }
              
            } 
            if(m==5)
            {
              try{
           if(z>5)
           {
               throw new NewClass1 (" too big");
           }
           
              }  
              catch(Exception e)
              {
                  System.out.println(e.getMessage()); 
              }
              
            } 
             if(m==6)
            {
                System.out.println("chaain Exception");  
                try{
                    lol();
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());            }
                finally{
                    System.out.println("Perar kono sesh nai"); 
                }
              
            } 
        
        
        
        
        
        
        }
        
      
    }
    public static void lol() throws Exception
    {try
    {
        
       jhol() ;
    }
    catch(Exception e){
               throw new Exception("hi "+e.getMessage());
 
    }
}
     public static void jhol() throws Exception
    {
   
        throw new Exception("jack");
    
}
}
        

