
/**
 * Class for testing Student objects
 * 
 * Matthew Guthrie
 * 6/20/17
 */

import java.util.*;
public class TestStudent
{
    public static void printBook(List<Student> s)
    {
        for(Student n : s)
        {
            System.out.print(n.getName() + ":");
            for(int i=1; i<=s.size(); i++)
            {
                System.out.printf("%6s", n.getQuiz(i));
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
    
    public static void replaceName(List<Student> s, String oldName, String newName)
    {
        int count = 0;
        for(Student n : s)
        {
            if(n.getName().compareTo(oldName) == 0)
            {
                int index = count;
                break;
            }
            count++;
        }
        
        s.get(count).setName(newName);
    }
    
    public static void replaceQuiz(List<Student> s, String student, int quiz, int grade)
    {
        int count = 0;
        for(Student n : s)
        {
            if(n.getName().compareTo(student) == 0)
            {
                int index = count;
                break;
            }
            count++;
        }
        
        s.get(count).setQuiz(quiz, grade);
    }
    
    
    public static List<Student> replaceStudent(List<Student> s, String oldName, String newName, int qz1, int qz2, int qz3, int qz4, int qz5)
    {
        int count = 0;
        int index=0;
        for(Student n : s)
        {
            if(n.getName().compareTo(oldName) == 0)
            {
                index = count;
                break;
            }
            count++;
        }
        
        s.remove(s.get(index));
        
        Student student = new Student(newName, qz1, qz2, qz3, qz4, qz5);
        
        s.add(index, student);
        
        return s;
    }
    
    public static List<Student> insertStudent(List<Student> s, String afterName, String name, int qz1, int qz2, int qz3, int qz4, int qz5)
    {
        int count = 0;
        int index=0;
        for(Student n : s)
        {
            if(n.getName().compareTo(afterName) == 0)
            {
                index = count;
                break;
            }
            count++;
        }
        
        Student student = new Student(name, qz1, qz2, qz3, qz4, qz5);
        
        s.add(index, student);
        
        return s;
    }
    
    public static List<Student> deleteStudent(List<Student> s,String name)
    {
        int count = 0;
        int index=0;
        for(Student n : s)
        {
            if(n.getName().compareTo(name) == 0)
            {
                index = count;
                break;
            }
            count++;
        }
        
        s.remove(s.get(index));
        
        return s;
    }
    
    public static void main(String args[])
    {
        List<Student> myClass = new ArrayList<Student>();
        
        myClass.add( new Student("Mark Kennedy", 70, 80, 90, 100, 90));
        myClass.add( new Student("Max Gerard", 80, 85, 90, 85, 80));
        myClass.add( new Student("Jean Smith", 50, 79, 89, 99, 100));
        myClass.add( new Student("Betty Farm", 85, 80, 85, 88, 89));
        myClass.add( new Student("Dilbert Gamma", 70, 70, 90, 70, 80));
        
        
        printBook(myClass);
        
        System.out.println("Replacing Mark Kennedy's name with Joan Baez");
        replaceName(myClass, "Mark Kennedy", "Joan Baez");
        printBook(myClass);
        
        System.out.println("Replacing Betty's qz1 name with 95");
        replaceQuiz(myClass, "Betty Farm", 1, 95);
        printBook(myClass);
        
        System.out.println("Replacing Jean with George Orwell, 100, 100, 100, 19, 84");
        replaceStudent(myClass, "Jean Smith", "George Orwell", 100, 100, 100, 19, 84);
        printBook(myClass);
        
        System.out.println("Inserting Bob Dylan, 67, 45, 22, 59, 20 before George Orwell");
        insertStudent(myClass, "George Orwell", "Bob Dylan", 67, 45, 22, 59, 20);
        printBook(myClass);
        
        System.out.println("Deleting Max Gerard");
        deleteStudent(myClass, "Max Gerard");
        printBook(myClass);
    }
}
