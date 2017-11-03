
/**
 * Write a description of class four here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
public class four
{
    public static void main(String args[])
    {
        ArrayList a = new ArrayList(); 
ArrayList b = a; 
a.add(new Integer(4)); 
b.add(new Integer(5)); 
a.add(new Integer(6)); 
b.add(new Integer(7)); 
System.out.println(a.get(1));
    }
}
