
/**
 * Matthew Guthrie
 * 1/16/17
 * 
 * 
 * This program selects a random number between two ranges given by the user, and then asks them to guess said integer.
 * 
 */

import java.util.Scanner;
public class GuessingGameV2
{
    public static void main(String args[])
    {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a range of values for the random number (e.g 125 175): ");
        int lowEnd = Integer.parseInt(in.next());
        int highEnd = Integer.parseInt(in.next());
        
        int difference = highEnd-lowEnd;
        
        int number = (int)((Math.random()*difference)+lowEnd);
        
        int totalGuesses = 0;
        
        System.out.print("Please guess a value between " + lowEnd + " and " + highEnd + ": ");
        int guess = in.nextInt();
        totalGuesses++;
        
        while(number!=guess)
        {
            if(number>guess)
            {
                System.out.print("Too low\n");
            }
            else
            {
                System.out.print("Too high\n");
            }
            System.out.print("Please enter a new guess: ");
            guess = in.nextInt();
            totalGuesses++;
        }
        
        System.out.print("Correct, you win!\n");
        System.out.print("The correct number was: " + number);
        System.out.print("\nNumber of guesses: " + totalGuesses);
    
    }
}
