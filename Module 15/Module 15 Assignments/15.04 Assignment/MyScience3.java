
/**
 * Class to create and manage science assignments.
 * 
 * Matthew Guthrie
 * 6/18/17
 */
public class MyScience3 extends Homework3
{
    MyScience3()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("Science");
    }
    
    public String toString()
    {
        return "Science - must read " + Integer.toString(getPagesRead()) + " pages.";
    }
}
