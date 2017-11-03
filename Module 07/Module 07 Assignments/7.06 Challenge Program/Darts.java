
/**
 * Matthew Guthrie
 * 1/25/17
 * 
 * This program estimates the value of pi based on random x and y coordinates, which simulate darts being thrown onto a dart board.
 * The amount of times this is done is based on the number of trials and the darts per trial entered by the user.
 */

import java.util.Random;
import java.util.Scanner;
public class Darts
{
    
    public static double throwDart()
    {
        Random generator = new Random();
        
        return generator.nextDouble();
        
    }
    
    public static boolean check(double x, double y)
    {
        double ans = Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2)));
        
        if(ans<=1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void print(int t, double p)
    {
        System.out.printf("%s%s%s%.8s", "Trial[", t, "]: pi = ", p);
        System.out.println();
    }
    
    public static void estimatePi(double t, int c)
    {
        System.out.printf("%s%s", "Estimate of pi = ", t/c);
    }
    
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double h = 0.0;
        int n = 0;
        
        System.out.print("Please enter the number of trials: ");
        int trials = in.nextInt();
        System.out.print("Please enter the number of darts per trial: ");
        int darts = in.nextInt();
        
        double coordinates[] = {0.0, 0.0};
        double piTotal = 0.0;
        int piCount = 0;
        
        for(int i=0; i<trials; i++)
        {
            for(int j=0; j<darts;j++)
            {
                coordinates[0]=throwDart();
                coordinates[1]=throwDart();
                
                if(check(coordinates[0], coordinates[1]))
                {
                    h++;
                }
                n++;
            }
            double pi = (4*h)/n;
            piTotal+=pi;
            piCount++;
            
            print(i, pi);
            
        }
        estimatePi(piTotal, piCount);
    }
}
