
/**
 * Write a description of class RecursivePalindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecursivePalindrome
{
    RecursivePalindrome()
    {
    }
    
    private String helper(String s)
    {
        if(s.lastIndexOf(",") != -1)
        {
            s = s.replaceAll(",", "");
        }
        if(s.lastIndexOf(".") != -1)
        {
            s = s.replaceAll(".", "");
        }
        if(s.lastIndexOf("!") != -1)
        {
            s = s.replaceAll("!", "");
        }
        if(s.lastIndexOf("?") != -1)
        {
            s = s.replaceAll("?", "");
        }
        if(s.lastIndexOf(" ") != -1)
        {
            s = s.replaceAll(" ", "");
        }
        
        s = s.toLowerCase();
        
        return s;
    }
    
    public boolean palindromeFinder(String s)
    {
        String word = helper(s);
        
        if(s.length() == 1 || s.length() == 0)
        {
            return true;
        }
        
        String letterOne = word.substring(0,1);
        String letterTwo = word.substring(word.length() - 1);
        
        if(letterOne.equals(letterTwo) == false)
        {
            return false;
        }
        else
        {
            palindromeFinder(word.substring(1, (word.length()-1)));
        }
        
        return true;
    }
}
