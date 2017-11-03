
/**
 * This program decrypts messages that were encrypted with a Caesar cypher.
 * 
 * Matthew Guthrie
 * 6/14/17
 */
public class CaesarShiftDecryption
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
            
                if(temp-n<0)
                {
                    temp = 26+temp-n;
                    c[i] = CaesarShiftTester.ALPHABET[temp%26];
                }
                else
                {
                    c[i] = CaesarShiftTester.ALPHABET[temp-n%26];
                }
                
            }
        }
        
        String newWord = new String(c);
        
        return newWord;
    }
}
