/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;

/**
 *
 * @author User
 */
     /**
     * @param args the command line arguments
     */
    class employee
    {
           int id;
    String name, department, designation;
    Scanner s = new Scanner(System.in);
   
    {
        System.out.println("Enter Name of the Employee:");
        name = s.nextLine();
        System.out.println("Enter the id:");
        id = s.nextInt();
        System.out.println("Enter department the Employee:");
        department = s.nextLine();
        System.out.println("Enter designation:");
        designation = s.nextLine();
    }
    
           
    }
      
public class JavaApplication3 {

   public static void main(String[] args) {
        // TODO code application logic here
     employee c=new employee();
    
    
    
    }
}

    
    
    
    
    
    

    
    
        
        
        
        
    
    

