
/**
 * Write a description of class TextMessageV1 here.
 * 
 * Matthew Guthrie
 * 1/6/17
 * 
 * The purpose of this program is to convert a text message into a shorter message using common abbreviations. 
 * 
 */
public class TextMessageV1_2
{
    public static void main(String args[])
    {
        String message = "oh my god, i am laughing out loud at that. to be honest, it was very funny. i got to go, don't forget to be awesome!";
        
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
        
        System.out.println();
        
        int TIndex = message.indexOf('T');
        System.out.println("String method samples:");
        System.out.print("indexOf \"T\": " + TIndex + "\n");
        System.out.print("substring (two parameters): " + message.substring(0, TIndex) + "\n");
        System.out.print("substring (one parameter): " + message.substring(TIndex+5) + "\n");
        System.out.print("replaceAll vowels: ");
        message = message.replaceAll("a", " ");
        message = message.replaceAll("e", " ");
        message = message.replaceAll("i", " ");
        message = message.replaceAll("o", " ");
        message = message.replaceAll("u", " ");
        System.out.println(message);
    
    }
}
