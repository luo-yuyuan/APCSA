
/**
 * This program Tests the thrown exceptions of the StudentDate class
 * 
 * Matthew Guthrie
 * 6/21/17
 */
public class TestProgStudentData
{
    public static void testInvalid()
    {
        //test for invalid names
        double[] invalidGrades = new double[0];
        StudentData s = new StudentData("", "", invalidGrades);
        
        //test for invalid grades
        StudentData p = new StudentData("Tom", "Sawyer", invalidGrades);
    }
    
    public static void testValid()
    {
        double[] validGrades = {70.00, 90.00, 85.00, 100.00, 75.00};
        StudentData s = new StudentData("Tom", "Sawyer", validGrades);
        
        System.out.print(s);
    }
    
    public static void main(String args[])
    {
    
        //testInvalid();
        testValid();
    
    
    }
    
}
