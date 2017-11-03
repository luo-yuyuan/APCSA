
/**
 * Class to create and manage math assignments.
 * 
 * Matthew Guthrie
 * 6/18/17
 */
public class MyMath2 extends Homework2 implements Processing
{
    MyMath2()
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
    
    public void doReading()
    {
        setPagesRead(getPagesRead() - 2);
    }
}
