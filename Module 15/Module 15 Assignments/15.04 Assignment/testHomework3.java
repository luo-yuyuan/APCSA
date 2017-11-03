
/**
 * Class test the classes of type Homework.
 * 
 * Matthew Guthrie
 * 6/18/17
 */

import java.util.ArrayList;
public class testHomework3
{
    public static void main(String args[])
    {
        ArrayList<Homework3> homework = new ArrayList<Homework3>();
        
        homework.add(new MyMath3());
        homework.add(new MyScience3());
        homework.add(new MyEnglish3());
        homework.add(new MyJava3());
        
        homework.get(0).createAssignment(4);
        homework.get(1).createAssignment(6);
        homework.get(2).createAssignment(4);
        homework.get(3).createAssignment(4);
        
        for(Homework3 n : homework)
        {
            System.out.println(n);
        }
        
        for(int i=0; i<homework.size(); i++)
        {
            for(int j=i+1; j<homework.size(); j++)
            {
                if(homework.get(i).compareTo(homework.get(j)) == 0)
                {
                    System.out.println(homework.get(i).getTypeHomework() + " and " + homework.get(j).getTypeHomework() + " have the same number of pages.");
                }
            }
        }
    }
}
