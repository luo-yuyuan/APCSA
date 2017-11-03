
/**
 * Write a description of class TextMessageV1 here.
 * 
 * Matthew Guthrie
 * 1/6/17
 * 
 * The purpose of this program is to convert a text message into a shorter message using common abbreviations. 
 * 
 * The new purpose of this program is to do the previous task, but allow the user to enter a message, rather than hard-coding a message in. The same abbrevions remain.
 * 
 */

import java.util.Scanner;
public class TextMessageV2
{
    public static void main(String args[])
    {
        //String message = "oh my god, i am laughing out loud at that. to be honest, it was very funny. i got to go, don't forget to be awesome!";
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a text to be shortened. \n");
        String message = in.next();
        message += in.nextLine();
        System.out.print("\n");
        
        System.out.print("Original Message:\n");
        System.out.print(message+"\n");
        System.out.print("Message Length:" + message.length() + "\n\n");
        
        
        message = message.replaceAll("oh my god", "OMG");
        message = message.replaceAll("laughing out loud", "LOL");
        message = message.replaceAll("to be honest", "TBH");
        message = message.replaceAll("got to go", "GTG");
        message = message.replaceAll("don't forget to be awesome", "DFTBA");
        
        System.out.print("New Message:\n");
        System.out.print(message+"\n");
        System.out.print("Message Length:" + message.length() + "\n");

    
    }
}
