
/**
 * Class to create and manage java assignments.
 * 
 * Matthew Guthrie
 * 6/18/17
 */
public class MyJava extends Homework
{
    MyJava()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("Java");
    }
    
    public String toString()
    {
        return "Java - must read " + Integer.toString(getPagesRead()) + " pages.";
    }
}
