
/**
 *Matthew Guthrie
 *1/17/16
 *
 *This program asks the user for the sides of a die and how many
 *times to roll said die, and then prints the probability of getting
 *each possible sum of the two die.
 */

import java.util.Random;
import java.util.Scanner;
public class DiceProbability
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Random randNum = new Random();
        
        System.out.print("Please enter the number of sides of each die.");
        int sides = in.nextInt();
        int totalSides = sides*2;
        System.out.print("Please enter the number of rolls.");
        int rolls = in.nextInt();
        
        int match=0;
        double probability=0.0;
        int die1=0, die2=0;
        
        System.out.print("\nSum of dice \tProbability \n");

        for(int i=2; i<=totalSides; i++)
        {
            match=0;
            System.out.print(i + "\t\t");
            for(int n=0; n<rolls; n++)
            {
                die1 = randNum.nextInt( sides ) +1;
                die2 = randNum.nextInt( sides )+1;
                
                if(die1+die2==i)
                {
                    match++;
                }
                
                
                
                
            }
            probability = ((double)match / rolls) * 100;
            System.out.print(probability + "\n");
        
        }
        
    }
}
