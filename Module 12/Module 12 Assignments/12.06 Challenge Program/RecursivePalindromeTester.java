
/**
 * This class allows for the testing of the RecursivePalindrome class, which finds
 * if a Scanner line is a palindrome.
 * 
 * Matthew Guthrie
 * 5/30/17
 */

import java.util.Scanner;
public class RecursivePalindromeTester
{
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
       RecursivePalindrome palindrome = new RecursivePalindrome();
       
       System.out.println("Enter an string, or q to quit");
       
       while(scan.hasNextLine())
       {
           String next = scan.nextLine();
           if(next.equals("q"))
           {
               break; 
           }
           else
           {
               boolean isPalindrome = palindrome.palindromeFinder(next);
               if(isPalindrome == true)
               {
                   System.out.println("The string entered is a palindrome");
               }
               else
               {
                   System.out.println("The string entered is not a palindrome");
               }
           }
           
       }
       
       scan.close();
    }
}
