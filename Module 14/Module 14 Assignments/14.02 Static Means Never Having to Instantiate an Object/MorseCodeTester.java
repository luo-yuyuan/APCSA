
/**
 * Class to test the MorseCode Class
 * 
 * Matthew Guthrie
 * 6/14/17
 */

import java.io.IOException;
import java.util.Scanner;
public class MorseCodeTester
{
    public static void main(String args[]) throws IOException
    {
        String[] morseCode = MorseCode.read();
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a line to be translated. Include no punctuation.");
        
        String line = scan.nextLine();
        
        char[] charArray = line.toCharArray();
        
        MorseCode.print(charArray, morseCode);
    }
}
