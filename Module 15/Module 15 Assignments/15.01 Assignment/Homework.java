
/**
 * Abstract class which is the basis of the MyClass classes
 * 
 * Matthew Guthrie
 * 6/18/17
 */
public abstract class Homework
{
    private int pagesRead;
    private String typeHomework;
    
    Homework()
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
}
