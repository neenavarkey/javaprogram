/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
import java .io.*;

/**
 *
 * @author User
 */
class digits
{
    
}
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        String str;
		int letters = 0, digits = 0, blanks = 0;
		char ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter string  :");
        str = br.readLine();

		for(int i = 0; i < str.length(); i ++)
		{
                    ch=str.charAt(i);

			if(Character.isLetter(ch))
				letters ++;
			else if(Character.isDigit(ch))
				digits ++;
			else if(Character.isWhitespace(ch))
				blanks ++;
		}

		System.out.println("letters : " + letters);
		System.out.println("Digits : " + digits);
		System.out.println("Blanks : " + blanks);
    }
}
