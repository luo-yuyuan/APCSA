
/**
 * Matthew Guthrie
 * 1/18/17
 * 
 * This program calculates the average probability of getting a prize 
 * under a bottle cap, which is on 1 in every 5 caps
 */

import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
public class BottleCapPrize
{
    public static void main(String args[]) throws IOException
    {
        //Declarations for infile, Scanner, PrintWriter, and Random
        File file = new File("trials.txt");
        Scanner inFile = new Scanner(file);
        PrintWriter outFile = new PrintWriter(file);
        Random randNum = new Random();
        
        //System.out.print("Please enter the number of sides of each die.");
        int options = 5;//1:options is the odds of getting a 1
        //System.out.print("Please enter the number of trials.");
        int trials = 1000;//number of bottles to open
        
        //Variable Declaration
        double average=0.0;//average probability of getting a 1
        int totalRolls = 0;//total caps opened to get a 1
        int rollsNeeded = 1;//rolls needed to get a 1 for a single trial
        String line = "";
          
        for(int i=0; i<trials; i++)//loops through all trials
        {
            int cap = randNum.nextInt( options );//assigned a random int 1-5 to cap
            rollsNeeded = 1;//resets rollsNeeded
            
            while(cap!=1)//loops while the cap isn't a 1
            {
                rollsNeeded++;//increase rollsNeeded by 1
                cap = randNum.nextInt( options );//opens a new bottle
            }
            outFile.println(rollsNeeded);//prints the number of rolls needed to the outfile
        
        }
        outFile.close();//closes file
        
        for(int j=0; j<trials; j++)//loops through lines of file
        {
            line = inFile.nextLine( );
            totalRolls += Integer.parseInt(line);
        }
        inFile.close();//closes file
        
        average = (double)trials/(double)totalRolls;//calculates aveage
        System.out.print("Average: " + average);//prints average
        
        
        
        }
    }

