/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;
import java.util.*;



/**
 *
 * @author User
 */
 class student
{
     String sname,smark;
     
     public student(String sname,String smark)
     {
         this.sname=sname;
         this.smark=smark;
     }
     class ListDemo
     {
         
     }
     
     
    
}
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList list=new ArrayList();
        list.add("neena 71");
        list.add("meenu  67");
        list.add("leena  63");
        list.add("riya 82");
        list.add("ammu 86");
        System.out.println("list");
        for(Object k : list)
        {
        System.out.println("");
        }
        
        
       

    }
}
    

