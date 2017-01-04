/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.application;
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
       BufferedReader br;
       BufferedReader br1;
       Scanner sc = new Scanner(System.in);  
       System.out.println("enter the name");
       String  name = sc.next(); 
      
       System.out.println("start");
       try
       {
           
           br=new  BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\master.txt"));
           {
               String s;
               System.out.println("catogaries are");
               while((s=br.readLine())!=null)
               {
                   System.out.println(s); 
               }
                System.out.println("catogary name");
                String catogaryname=sc.next();
               try
               {
                 br1=new  BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\countries.txt")); 
                 {
                   String s1;
               System.out.println("countries are");
               while((s1=br.readLine())!=null)
               {
                   System.out.println(s1); 
               } 
               System.out.println("country name");
                String countryname=sc.next();
                 }
               }
           }
           
       }
       catch(IOException e) 
    {
            System.out.println("file not exist");
       }
       
     
    }
       






public class GameApplication {

    /**
     * @param args the command line arguments
     */
}
    public static void main(String[] args) {
        // TODO code application logic here
         games obj=new games();
        obj.showmenu();
        
        
    }
 
}
