
/**
 * Class to create and manage english assignments.
 * 
 * Matthew Guthrie
 * 6/18/17
 */
public class MyEnglish extends Homework
{
    MyEnglish()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("English");
    }
    
    public String toString()
    {
        return "English - must read " + Integer.toString(getPagesRead()) + " pages.";
    }
}
