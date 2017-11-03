
/**
 * Class test the classes of type Homework.
 * 
 * Matthew Guthrie
 * 6/18/17
 */

import java.util.ArrayList;
public class testHomework
{
    public static void main(String args[])
    {
        ArrayList<Homework> homework = new ArrayList<Homework>();
        
        homework.add(new MyMath());
        homework.add(new MyScience());
        homework.add(new MyEnglish());
        homework.add(new MyJava());
        
        for(Homework h : homework)
        {
            h.createAssignment(5);
        }
        
        for(Homework n : homework)
        {
            System.out.println(n);
        }
    }
}
