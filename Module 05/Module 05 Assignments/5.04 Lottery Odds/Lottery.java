
/**
 * Matthew Guthrie
 * 1/16/17
 * 
 * This program prompts the user for a number, 000-999, and then compares it to a random value 
 * to see if they matched a pair of numbers.
 */

import java.util.Scanner;
public class Lottery
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int randNum = (int)(Math.random()*1000);
        
        String randNumS = "";
        
        int numCopy = randNum;
        
        for(int i=0; i<3; i++)
        {
            randNumS = randNum%10 + randNumS;
            randNum/=10;
        }
         
        
        System.out.print("Please enter your guess between 000 and 999: ");
        int guess = in.nextInt(); 
        String guessS = "";
        
        for(int i=0; i<3; i++)
        {
            guessS = guess%10 + guessS;
            guess/=10;
        }
        
        boolean firstPair = false, secondPair = false;
        
        if(guessS.substring(0,2).equals(randNumS.substring(0,2)))
        {
            firstPair = true;
        }
        if(guessS.substring(1).equals(randNumS.substring(1)))
        {
            secondPair = true;
        }
        
        System.out.print("Winner: " + randNumS + "\n");
        if(firstPair&&secondPair)
        {
            System.out.print("Congrats, your whole number matched!");
        }
        else if(firstPair)
        {
            System.out.print("Congrats, your first pair matched!");
        }
        else if(secondPair)
        {
            System.out.print("Congrats, your second pair matched!");
        }
        else
        {
            System.out.print("None of your pairs matched, sorry!");
        }
    }
}
