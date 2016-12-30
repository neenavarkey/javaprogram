/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;
import java.util.*;

/**
 *
 * @author User
 */
class disco
{
    
}
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        try{
           System.out.println("enter name");
       String name=sc.next();
       System.out.println("enter no");
       String no=sc.next();
        System.out.println("enter age");
       int age=sc.nextInt();
       if(age>=18&&age<=55)
       {
          System.out.println("valid"); 
       }
       else
       {
       System.out.println(" not valid"); 
        }
        }
  catch(ArithmeticException ae)
               {
               System.out.println("exception arised:"+ae);
               }
    }
        }
    


        
    
             
    
    

