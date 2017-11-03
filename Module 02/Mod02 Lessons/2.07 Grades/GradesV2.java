
/**
 * Write a description of class GradesV2 here.
 * 
 * Matthew Guthrie
 * 1/5/17
 * 
 * This program is designed find and display information about tests a student has taken.
 * 
 */
public class GradesV2
{
    public static void main(String[] args)
    {
    //local variables
    int numTest=0;          //counts number of tests
    int testGrade=0;        //individual test grade
    int totalPoints =0;     //total points for all tests
    double average = 0.0;   //average grade
    
    //Test1
    numTest++;
    testGrade=97;
    totalPoints+=testGrade;
    average=totalPoints/numTest;
    
    System.out.print("n = " +numTest+ " New Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average+ "\n");
    
    //Test2
    numTest++;
    testGrade=79;
    totalPoints+=testGrade;
    average=(double)totalPoints/(double)numTest;
    
    System.out.print("n = " +numTest+ " New Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average+ "\n");
    
    //Test3
    numTest++;
    testGrade=83;
    totalPoints+=testGrade;
    average=(double)totalPoints/(double)numTest;
    
    System.out.print("n = " +numTest+ " New Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average+ "\n");
    
    //Test4
    numTest++;
    testGrade=88;
    totalPoints+=testGrade;
    average=(double)totalPoints/(double)numTest;
    
    System.out.print("n = " +numTest+ " New Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average+ "\n");
    
    //Test5

    numTest++;
    testGrade=99;
    totalPoints+=testGrade;
    average=(double)totalPoints/(double)numTest;
    
    System.out.print("n = " +numTest+ " New Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average+ "\n");
    
    //Test6
    numTest++;
    testGrade=64;
    totalPoints+=testGrade;
    average=(double)totalPoints/(double)numTest;
    
    System.out.print("n = " +numTest+ " New Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average+ "\n");
    
    //Test7
    numTest++;
    testGrade=71;
    totalPoints+=testGrade;
    average=(double)totalPoints/(double)numTest;
    
    System.out.print("n = " +numTest+ " New Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average+ "\n");
    
    //Test8
    numTest++;
    testGrade=68;
    totalPoints+=testGrade;
    average=(double)totalPoints/(double)numTest;
    
    System.out.print("n = " +numTest+ " New Test Grade: " + testGrade + " Total Points: " + totalPoints + " Average Score: " + average+ "\n");
    }
    
}
