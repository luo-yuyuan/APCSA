
/**
 * Class for creating Student Objects
 * 
 * Matthew Guthrie
 * 6/20/17
 */
public class Student
{
    private String name;
    private int qz1, qz2, qz3, qz4, qz5;
    
    Student(String name, int qz1, int qz2, int qz3, int qz4, int qz5)
    {
        this.name = name;
        this.qz1 = qz1;
        this.qz2 = qz2;
        this.qz3 = qz3;
        this.qz4 = qz4;
        this.qz5 = qz5;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getQuiz(int q)
    {
        if(q==1)
        {
            return qz1;
        }
        else if(q==2)
        {
            return qz2;
        }
        if(q==3)
        {
            return qz3;
        }
        if(q==4)
        {
            return qz4;
        }
        else
        {
            return qz5;
        }
    }
    
    public void setQuiz(int q, int grade)
    {
        if(q==1)
        {
            this.qz1 = grade;
        }
        else if(q==2)
        {
            this.qz2 = grade;
        }
        if(q==3)
        {
            this.qz3 = grade;
        }
        if(q==4)
        {
            this.qz4 = grade;
        }
        else
        {
            this.qz5 = grade;
        }
    }
    
    public String toString()
    {
        return name + ": " + qz1 + "   " + qz2 + "   " + qz3 + "   " + qz4 + "   " + qz5; 
    }
}
