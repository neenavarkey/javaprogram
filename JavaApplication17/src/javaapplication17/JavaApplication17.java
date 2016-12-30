/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author User
 */
class EnquiryForm {

    public void showmenu() {
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1 .initiate enquiry");
        System.out.println("2. view enquiry");
        System.out.println("3 .exit");
        System.out.println("choose the option");
        option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("initiate enquiry");
                initiateenquiry();
                showmenu();
                
            case 2:
                System.out.println("2. view enquiry");
                viewenquiry();
                showmenu();
            case 3:
                System.out.println("3 .exit");
               exit();
                showmenu();
            default:
                System.out.println("incorrect menu");
                
        }
    }

    public void initiateenquiry() 
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("name");
       String name=sc.next();
        System.out.println("cotact no");
        String no=sc.next();
       System.out.println("address");
       String address=sc.next();
       System.out.println("enquiry categary:prices/location/packages");
       String categary=sc.next();
       System.out.println(" enquiry description");
       String description=sc.next();
    }
    
   
    public void viewenquiry()
    {
     Scanner sc= new Scanner (System.in) ;  
 System.out.println("name of user");
       String name=sc.next();
    }
    public void exit()
    {
        System.out.println("terminated");
    }

}

public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
        // TODO code application logic here
    {
        EnquiryForm obj=new EnquiryForm();
       obj.showmenu();
       
  

    
        
       
    
            
        
    }
}
