
/**
 * Abstract class which is the basis of the MyClass classes
 * 
 * Matthew Guthrie
 * 6/18/17
 */
public abstract class Homework3 implements Comparable<Homework3>
{
    private int pagesRead;
    private String typeHomework;
    
    Homework3()
    {
        pagesRead = 0;
        typeHomework = "none";
    }
    
    public void setPagesRead(int pagesRead)
    {
        this.pagesRead = pagesRead;
    }
    
    public int getPagesRead()
    {
        return pagesRead;
    }
    
    public void setTypeHomework(String typeHomework)
    {
        this.typeHomework = typeHomework;
    }
    
    public String getTypeHomework()
    {
        return typeHomework;
    }
    
    public abstract void createAssignment(int p);
    
    public int compareTo(Homework3 obj)
    {
        if(pagesRead < obj.getPagesRead())
        {
            return -1;
        }
        else if(pagesRead == obj.getPagesRead())
        {
            return 0;
        }
        else
        {
            return 1;
        }
    
    }
}
