
/**
 * Class to create and manage math assignments.
 * 
 * Matthew Guthrie
 * 6/18/17
 */
public class MyMath3 extends Homework3
{
    MyMath3()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("Math");
    }
    
    public String toString()
    {
        return "Math - must read " + Integer.toString(getPagesRead()) + " pages.";
    }
}
