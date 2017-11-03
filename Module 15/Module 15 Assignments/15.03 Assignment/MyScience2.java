
/**
 * Class to create and manage science assignments.
 * 
 * Matthew Guthrie
 * 6/18/17
 */
public class MyScience2 extends Homework2 implements Processing
{
    MyScience2()
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
    
    public void doReading()
    {
        setPagesRead(getPagesRead() - 3);
    }
}
