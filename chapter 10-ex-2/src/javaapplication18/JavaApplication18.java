/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author User
 */
class games
{
    public void showmenu() {
        int option;
        Scanner sc = new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1.play");
        System.out.println("2. instructions");
        System.out.println("3 .exit");
        System.out.println("choose the option");
        option = sc.nextInt();
         switch (option) {
          case 1:
                System.out.println("1.play");
                playgame();
                break;
               case 2:
                System.out.println("2. instructions");
                showmenu();
                
            case 3:
                System.out.println("3 .exit");
                showmenu();
               
            default:
                System.out.println("incorrect menu");
                
        }
    }
    
    public void playgame()
    {
        int option;
       Scanner sc = new Scanner(System.in);  
     System.out.println("enter the name");
      String  name = sc.next(); 
       System.out.println("start");
       
       System.out.println("enter catogories");  
       
     
    }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
}
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        games obj=new games();
        obj.showmenu();
    }
    
}
