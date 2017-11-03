
/**
 * This class contains StudentData objects, which much follow certain guidelines, otherwise exceptions are thrown.
 * 
 * Matthew Guthrie
 * 6/21/17
 */
public class StudentData
{
    private String firstName, lastName;
    private double[] testScores;
    private char grade;
    
    StudentData(String firstName, String lastName, double[] testScores)
    {
        if(firstName == "" || lastName == "")
        {
            throw new IllegalArgumentException("First Name and Last Name must exist.");
        }
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;
        this.grade = courseGrade(testScores);
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public double[] getTestScores()
    {
        return testScores;
    }
    public void setTestScores(double[] testScores)
    {
        this.testScores = testScores;
    }
    
    public char getGrade()
    {
        return grade;
    }
    public void setGrade(char grade)
    {
        this.grade = grade;
    }
    
    public String toString()
    {
        return String.format("%s%8s%8s%6s%6s%6s%6s%8s", firstName, lastName, testScores[0], testScores[1], testScores[2], testScores[3], testScores[4], grade);
    }
    
    public char courseGrade(double[] list)
    {
        if(list.length==0)
        {
            String msg;
            msg = "Error: List cannot be empty.";
            throw new IllegalArgumentException(msg);
        }
        
        else
        {
            double total = 0.0;
            
            for(double d : list)
            {
                total+=d;
            }
            
            total/=list.length;
            
            if(total<50)
            {
                return 'F';
            }
            else if(total<60)
            {
                return 'D';
            }
            else if(total<70)
            {
                return 'C';
            }
            else if(total<80)
            {
                return 'b';
            }
            else
            {
                return 'A';
            }
            
            
        }
    }
}
