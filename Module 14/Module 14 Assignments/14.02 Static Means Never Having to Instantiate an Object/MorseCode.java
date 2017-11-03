
/**
 * Class containing methods to read and print morse code
 * 
 * Matthew Guthrie
 * 6/14/17
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class MorseCode
{
   public static String[] read() throws IOException
   {
       final int totalCode = 26+10;
       
       String[] morseCode = new String[totalCode];
       
       Scanner scanner = new Scanner(new File("morsecode.txt"));
       
       
       for(int i=0; i<totalCode; i++)
       {
           morseCode[i] = scanner.nextLine();
       }
       
       return morseCode;
   }
   
   public static void print(char[] c, String[] mc)
   {
       for(int i=0; i<c.length; i++)
       {
           if(Character.isLetter(c[i]))
           {
               if(Character.isUpperCase(c[i]))
               {
                   c[i] = Character.toLowerCase(c[i]);
               }
               
               int match = ((int)c[i])-97;
               System.out.print(mc[match]);
               System.out.print("   "); 
            }
           else if(Character.isDigit(c[i]))
           {
               int match = ((int)c[i])-48+26;
               System.out.print(mc[match]);
               System.out.print("   "); 
           }
           else
           {
               System.out.print("     "); 
           }
           
       }
   }
}
