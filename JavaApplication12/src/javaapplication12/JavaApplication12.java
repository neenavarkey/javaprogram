/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
import java.util.regex.*;

/**
 *
 * @author User
 */
class reg
{
    
}
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String str ="http:\\www.niit.com\\";
        Pattern p=Pattern.compile("http:");
Matcher m=p.matcher(str);
if(m.find())
{
    System.out.println("matched");
}
    }
    
}
