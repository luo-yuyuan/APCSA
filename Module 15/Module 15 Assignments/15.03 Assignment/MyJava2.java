
/**
 * Class to create and manage java assignments.
 * 
 * Matthew Guthrie
 * 6/18/17
 */
public class MyJava2 extends Homework2 implements Processing
{
    MyJava2()
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
    
    public void doReading()
    {
        setPagesRead(getPagesRead() - 4);
    }
}
