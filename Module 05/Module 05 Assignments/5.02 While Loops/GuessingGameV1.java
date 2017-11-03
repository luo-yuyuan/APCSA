
/**
 * Matthew Guthrie
 * 1/16/17
 * 
 * 
 * This program selects a random number between 1 and 100, and then asks the user the guess the value.
 * 
 */

import java.util.Scanner;
public class GuessingGameV1
{
    public static void main(String args[])
    {
        int number = (int)(Math.random()*100.0);
        Scanner in = new Scanner(System.in);
        int totalGuesses = 0;
        
        System.out.print("Please guess a value between 1 and 100.");
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
