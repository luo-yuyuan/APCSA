
/**
 * Write a description of class two here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
public class two
{
    public static void removeValue(ArrayList<Integer> a, int val) { 
int i; 

for (i = 0; i < a.size(); i++) { 
if (a.get(i) == val) { 
a.remove(i); 
} 
} 

for(int p:a)
{
    System.out.print(p + "  ");
}
} 
    
    
    
    public static void main(String args[])
    {
    ArrayList<Integer> a = new ArrayList<Integer>();
    
    
    a.add(2);
    a.add(3);
    a.add(4);
    a.add(3);
    a.add(3);
    a.add(4);
    a.add(4);
    a.add(5);
    a.add(4);
    a.add(3);
    a.add(2);
    a.add(1);
    
    removeValue(a,3);
    
    int arr[][] = {{1, 2, 3, 4},
                  {5, 6, 7, 8},
                  {9, 10, 11, 12}};
                  System.out.println();
     System.out.println(arr.length);
     System.out.println(arr[0].length);
     System.out.println(arr[2][3]);
    }
}
