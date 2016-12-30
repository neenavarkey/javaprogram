/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;
import java.util.*;

/**
 *
 * @author User
 */
 class scanner
{
    
}
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        String input="1:00 am";
        Scanner s =new Scanner(input).useDelimiter(":");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        s.close();
        }catch(Exception e){}
    }
    
}
