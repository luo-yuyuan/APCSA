
/**
 * Write a description of class one here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class one
{
    
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
    
    public static int mystery(int n) { 
if (n > 6) { 
return 1 + mystery(n - 1); 
} 

return n % 3; 
} 
    public static void main(String args[])
    {
    	int[] a = {1,2,3,4};
    	
    	int i = 0; 
while (i < a.length) 
{ 
System.out.println(a[i]); 
i++; 
} 

 i=0;
for (i = 0; i < a.length; i++) 
{ 
System.out.println(a[i]); 
} 

System.out.println("a:"+mystery(10));

i=0;
for (int j : a) 
{ 
System.out.println(j); 
} 

System.out.printf("%s%20s%20s", 7/2.0, (double)(7/2), 7/(double)2);
System.out.println();

String[] fruits = { "apple", "pear", "mango", "peach" }; 
i = 3; 
String str = "p"; 

for (String item : fruits) { 
int l = item.indexOf("p") + 2; 
str += item.substring(l); 
} 

System.out.println(str); 

int index = 1 + 6 % 5 * 2;
System.out.println(index);

ArrayList r = new ArrayList();
r.add("test");
System.out.println(r.get(0));
    }
    
    
}
