
/**
 * This program encrypts messages using a caesar cypher.
 * 
 * Matthew Guthrie
 * 6/14/17
 */

import java.util.Scanner;
public class CaesarShiftEncryption
{
    public static void printWelcome()
    {
        System.out.println("Please enter the shift key value, and then the message.");
    }
    
    public static String cypher(int n, String s)
    {
        char[] c = s.toCharArray();
    
        for(int i=0; i<c.length; i++)
        {
            if(c[i] == (' '))
            {}
            else
            {
                c[i] = Character.toLowerCase(c[i]);
                
                int temp = (int)c[i] - 97;
            
            
            
                c[i] = CaesarShiftTester.ALPHABET[(temp+n)%26];
            }
        }
        
        String newWord = new String(c);
        
        return newWord;
    }
}
