/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionlistnew;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CollectionlistNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner x= new  Scanner(System.in);
        int n;
        System.out.println("enter 1 for collection 2 for arraylist 3 for list 5 for object ,emter 6 for collections copy  7 for linked list 8 for comapartor/collections sort list 4 for stop the loop");
        
        String q;
        
        
        while(true)
        {
            System.out.println("Enter a Number: ");
            n=x.nextInt();
            
           if(n==4)
           {
               break;
           }
            if(n==1)
            {
               Collection ob = new  ArrayList();
               ob.add(10);
               ob.add(20);
               
               ob.add(30);
               Iterator z=ob.iterator();
               while(z.hasNext())
               {
                   System.out.println(z.next());
               }
            }
            if(n==5)
        {
          ArrayList<NewClass> ob = new ArrayList<NewClass>();
        
        NewClass s = new NewClass(12,"nafiz");
        NewClass y = new NewClass(13,"fiz");
                ob.add(s);
                ob.add(y);

                for(NewClass f:ob)
                {
                    System.out.println(f.t+f.z);
                }
      
        
    }
             if(n==2)
            {
               ArrayList<String> ob = new  ArrayList<String>();
               ob.add("20");
               ob.add("30");
               
               ob.add("40");
               ob.add("55");
               ob.add("66");
               ob.add(2,"nafiz");
               ob.set(5, "alex");
               ob.get(5);
               Iterator itr = ob.iterator();
              while(itr.hasNext()){    
              
        System.out.println(itr.next());    
        }    
            }
              if(n==3)
            {
               List<String> ob = new  ArrayList<String>();
               
               ob.add("20");
               ob.add("30");
               
               ob.add("40");
               ob.add("55");
               ob.add("66");
               ob.add(2,"nafiz");
               ob.set(5, "alex");
               ob.get(5);
               Iterator itr = ob.iterator();
              while(itr.hasNext()){    
              
        System.out.println(itr.next());    
        }    
            }
               if(n==6)
            {
                ArrayList<String>ob = new ArrayList<String> ();
ob.add("nafiz");
                ArrayList<String> m = new ArrayList<String> ();
               m.add("alex");
                Collections.copy(ob, m);
                System.out.println(ob);
            }
               if(n==7)
               {
          LinkedList<String>ob = new LinkedList<String> ();
          
          
          
          
          while(true)
          {
            q=x.nextLine();
            if(q.equals("a"))
            {
            break;
            }
            ob.add(q);
          }
                   System.out.println(ob);
                }
               if(n==8)
               {
                   ArrayList<NewClass1> ob = new ArrayList<NewClass1>();
        
        NewClass1 s = new NewClass1(124);
        NewClass1 y = new NewClass1(13);
                ob.add(s);
                ob.add(y);
  Collections.sort(ob,new NewClass2() );
                   for(NewClass1 oba:ob)
                   {
                       System.out.println(oba.d);
                   }
               }
               }
               }
        }
        
    

