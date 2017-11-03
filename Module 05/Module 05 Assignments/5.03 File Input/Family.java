
/**
 *Matthew Guthrie
 *1/16/17
 *
 *This program takes data about the gender of kids in a family, and displays the total
 *number of families, and the overall percentages of having two boys, a boy and a girl, and two girls.
 *
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
   public static void main(String args[]) throws IOException
   {
       System.out.print("");
       
       String family = "";
       File fileName = new File("test2.txt");
       Scanner inFile = new Scanner(fileName);
       
       int twoGirls=0, twoBoys=0, girlBoy=0, total=0;
       
       while(inFile.hasNext())
       {
           family = inFile.nextLine( );
           System.out.println(family);
           
           if(family.equals("GG"))
           {
               twoGirls++;
               total++;
           }
           else if(family.equals("BB"))
           {
               twoBoys++;
               total++;
           }
           else
           {
               girlBoy++;
               total++;
           }
        
       }
       
       double twoBoysPercent = (double)twoBoys/(double)total;
       double girlBoyPercent = (double)girlBoy/(double)total;
       double twoGirlsPercent = (double)twoGirls/(double)total;
       
       System.out.print("Sample Size: " + total + "\n");
       System.out.print("Two boys: " + twoBoysPercent + "\n");
       System.out.print("Boy and girl: " + girlBoyPercent + "\n");
       System.out.print("Two girls: " + twoGirlsPercent + "\n");
    
   }
}
