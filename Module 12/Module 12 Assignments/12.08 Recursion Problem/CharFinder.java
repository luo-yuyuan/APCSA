
/**
 * This program is designed to find a single character within an array of the alphabet
 * 
 * Matthew Guthrie
 * 6/6/2017
 */
public class CharFinder
{
    static boolean search(char c, int i, char[] a)
    {
        if(a.length==i)
        {
            return false;
        }
        else if(a[i]==c)
        {
            return true;
        }
        else
        {
            i++;
            return search(c,i,a);
        }
    }
    
    
    public static void main(String args[])
    {
        char target = 'k';
        int start = 0;
        char[] array = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        System.out.print("It is " + search(target,start,array) + " that " + target + " is in the alphabet");
    }
}
