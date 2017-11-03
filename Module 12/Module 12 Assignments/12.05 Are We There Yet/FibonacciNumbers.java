
/**
 * This program uses recursion to calculate a particular Fibonacci number entered by the user.
 * 
 * @author Matt Guthrie 
 * @version 5/15/17
 */

import java.util.Scanner;
import java.lang.Math;
public class FibonacciNumbers
{
    
   public static int fibonacci(int n)
   {
       if(n==1)
       {
           return 1;
       }
       else if(n==0)
       {
           return 0;
       }
       
       else
       {
           return fibonacci(n-1)+fibonacci(n-2);
       }
   }
    
   public static void main(String args[])
   {
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter an integer, or q to quit");
       
       while(scan.hasNext())
       {
           if(scan.hasNextInt())
           {    
               int input = Math.abs(scan.nextInt());
               int ans = fibonacci(input);
               System.out.println("Answer is " + ans);
               System.out.println("Enter another integer, or q to quit");
            }
           else if(scan.next().equals("q"))
           {
            break; 
           }
           else
           {
            System.out.println("Please enter a valid number");
           }
       }
       
       scan.close();
    }
}
