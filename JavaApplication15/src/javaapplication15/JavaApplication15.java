/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;
import java.util.*;

/**
 *
 * @author User
 */
class division
{
    
}
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
         try
         {
         System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        int result=num1/num2;
         System.out.println("div:"+result);
         }catch(ArithmeticException ae)
         {
            System.out.println("exception arised:"+ae);
           
         }
             
    
}
