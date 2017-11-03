
/**
 * Class test the classes of type Homework.
 * 
 * Matthew Guthrie
 * 6/18/17
 */

import java.util.ArrayList;
public class testHomework2
{
    public static void main(String args[])
    {
        ArrayList<Homework2> homework = new ArrayList<Homework2>();
        
        homework.add(new MyMath2());
        homework.add(new MyScience2());
        homework.add(new MyEnglish2());
        homework.add(new MyJava2());
        

        homework.get(0).createAssignment(4);
        homework.get(1).createAssignment(6);
        homework.get(2).createAssignment(10);
        homework.get(3).createAssignment(5);

        
        for(Homework2 n : homework)
        {
            System.out.println("Before reading:");
            System.out.println(n);
            n.doReading();
            System.out.println("After reading:");
            System.out.println(n);
        }
    }
}
