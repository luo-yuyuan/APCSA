
/**
 * Write a description of class five here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
public class five
{
    // precondition: a is not null 
public static String doSomething(ArrayList a, int b) { 
int i; 
String s; 

for (i = 0; i <= a.size(); i++) { 
s = (String)(a.get(i)); 
if (s.length() == b) { 
return s; 
} 
} 
return null; 
}
    
    
    
    public static void main(String args[])
    {
    	ArrayList<Scanner> s = new ArrayList<Scanner>();
    	s.add(new Scanner(System.in));
    	s.add(new Scanner(System.in));
    	
    	doSomething(s, 1);
    }
}
