/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;
import java.util.*;
/**
 *
 * @author User
 */
class calculater
{
    
}
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Scanner op=new Scanner(System.in);
        String operater;
        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        System.out.println("enter operater");
         operater=op.next();
       
       
       if(operater="+")
       {
           int result=num1+num2;
           System.out.println("add:"+result);
       }
       else if(operater="-")
       {
           int result=num1-num2;
          System.out.println("sub:"+result);
           }
       
           else if(operater="*")
       {
           int result=num1*num2;
          System.out.println("mul:"+result);
       }
                    else if(operater="/")
       {
           int result=num1/num2;
          System.out.println("div:"+result);
       }
       else
                    {
                        System.out.println("not valid");
                    }
        
        
        
    }
    
}
