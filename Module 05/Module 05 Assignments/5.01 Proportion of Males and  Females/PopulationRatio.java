
/**
 * 
 * Matthew Guthrie
 * 1/16/17
 * 
 * This program creates a possible population ratio of males and females,
 * based on the ratio of Ireland(1:1)
 * 
 * Modelled off of 5.01 Coin Flips
 */
import java.util.Scanner;
public class PopulationRatio
{
	public static void main(String[] args)
	{
	    int males = 0;
	    int females = 0;
	    int counter = 1;
	    double randNum = 0.0;
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("What is the population size? ");
	    int population = in.nextInt();
	    
	    while(counter <= population)
	    {
	        randNum = Math.random();
	        System.out.print(counter + "\t" + randNum);
	        
	        if(randNum < .5)
	        {
	            males++;
	            System.out.println("\t male");
	        }
	        else
	        {
	            females++;
	            System.out.println("\t female");
	           }
	        counter++;      
	    }
	    System.out.println();
	    System.out.println("Number of Males = " + males);
	    System.out.println("Number of Females = " + females);
	    
	    
	    
	}
}