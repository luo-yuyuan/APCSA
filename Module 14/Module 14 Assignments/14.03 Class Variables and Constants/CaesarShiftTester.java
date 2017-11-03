
/**
 * This program tests the CaesarShiftEncryption and CaesarShiftDecryption classes.
 * 
 * Matthew Guthrie
 * 6/14/17
 */

import java.util.Scanner;
public class CaesarShiftTester
{
    public static final char[] ALPHABET= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
    public static void printWelcome()
    {
            System.out.println("Welcome to the Caeser Cypher!");
            System.out.println("Enter:");
            System.out.println("E for encryption");
            System.out.println("or");
            System.out.println("D for Decryption");
            System.out.println("or");
            System.out.println("q to quit");
            System.out.print("Enter: ");
    }
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
    
        printWelcome();
        
        //String response = scan.nextLine();
        
        for(int i=0; i<26; i++)
        {
           
               //CaesarShiftDecryption.printWelcome();
               
               int shiftKey = i;
               
               String message = "IBQQJOFTT JTBQSPHSBNXJUIP VUFSSPST";
               
               //message = message.substring(1, message.length());
               
               String decryptedMessage = CaesarShiftDecryption.cypher(shiftKey, message);
               
               System.out.println(decryptedMessage);
               System.out.println();
           
        }
    }
}
