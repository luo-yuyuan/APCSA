
/**
 * Matthew Guthrie
 * 1/21/17
 * 
 * This program uses hurricane data from 1980-2006 to
 * calculate the category of each hurricane, the wind speed in MPH,
 * and then the average of each data category. This information is then formatted,
 * and both displayed to the user and put into the file results.txt.
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class Hurricanes2
{
    public static void main(String[] args) throws IOException
    {   
        //declarations
        File inFile = new File("hurcdata2.txt");
        Scanner inFileScanner = new Scanner(inFile);
        File outFile = new File("results.txt");
        PrintWriter outFileWriter = new PrintWriter(outFile);
        
        int numberHurricanes = 59;
        
        String year[] = new String[numberHurricanes];
        String month[] = new String[numberHurricanes];
        int pressure[] = new int[numberHurricanes];
        int windSpeedKnots[] = new int[numberHurricanes];
        double windSpeedMPH[] = new double[numberHurricanes];
        String name[] = new String[numberHurricanes];
        
        double pressureAvg = 0.0;
        double windSpeedMPHAvg = 0.0;
        double categoryAvg = 0.0;
        
        
        //reads in the data from the infile. Also finds windSpeedMPH, and the numerators of pressureAvg and windSpeedMPHAvg
        for(int i=0; i<numberHurricanes; i++)
        {
            year[i] = inFileScanner.next();
            month[i] = inFileScanner.next();
            pressure[i] = inFileScanner.nextInt();
            pressureAvg+=pressure[i];
            windSpeedKnots[i] = inFileScanner.nextInt();
            windSpeedMPH[i] = windSpeedKnots[i]*1.15078;
            windSpeedMPHAvg+=windSpeedMPH[i];
            name[i] = inFileScanner.next();
        }
        //closes the infile
        inFileScanner.close();
        
        //calculates categories and finds the totals
        int category[] = new int[numberHurricanes];
        int categoryTotals[] = {0,0,0,0,0};
        
        for(int j=0; j<numberHurricanes; j++)
        {
            if(windSpeedMPH[j]>74 && windSpeedMPH[j]<95)
            {
                category[j] = 1;
                categoryTotals[0]++;
            }
            else if(windSpeedMPH[j]>=95 && windSpeedMPH[j]<110)
            {
                category[j] = 2;
                categoryTotals[1]++;
            }
            else if(windSpeedMPH[j]>=110 && windSpeedMPH[j]<129)
            {
                category[j] = 3;
                categoryTotals[2]++;
            }
            else if(windSpeedMPH[j]>=129 && windSpeedMPH[j]<156)
            {
                category[j] = 4;
                categoryTotals[3]++;
            }
            else
            {
                category[j] = 5;
                categoryTotals[4]++;
            }
            
            categoryAvg+=category[j];
        
        }
        
        //finds all averages by dividing the totals by the number of each item that exists
        pressureAvg/=pressure.length;
        windSpeedMPHAvg/=windSpeedMPH.length;
        categoryAvg/=category.length;
        
        //finds the min and max of each data set
        int pressureMax = Integer.MIN_VALUE;
        int pressureMin = Integer.MAX_VALUE;
        double windSpeedMPHMax = Integer.MIN_VALUE;
        double windSpeedMPHMin = Integer.MAX_VALUE;
        int categoryMax = Integer.MIN_VALUE;
        int categoryMin = Integer.MAX_VALUE;
        
        for(int n=0; n<numberHurricanes; n++)
        {
            if(pressure[n]>pressureMax)
            {
                pressureMax = pressure[n];
            }
            else if(pressure[n]<pressureMin)
            {
                pressureMin = pressure[n];
            }
            if(windSpeedMPH[n]>windSpeedMPHMax)
            {
                windSpeedMPHMax = windSpeedMPH[n];
            }
            else if(windSpeedMPH[n]<windSpeedMPHMin)
            {
                windSpeedMPHMin = windSpeedMPH[n];
            }
            if(category[n]>categoryMax)
            {
                categoryMax = category[n];
            }
            else if(category[n]<categoryMin)
            {
                categoryMin = category[n];
            }
        }
        
        
        //prints to the terminal
        System.out.printf("%47s", "Hurricanes 1980 - 2006");
        System.out.println();
        System.out.printf("%s%15s%15s%20s%20s", "Year", "Name", "Category", "Pressure (mb)", "Wind Speed (MPH)");
        System.out.println();                                                                         
        System.out.println("==========================================================================");
        for(int k=0; k<numberHurricanes; k++)
        {
            System.out.printf("%s%15s%15s%20s%20.6s", year[k], name[k], category[k], pressure[k], (int)windSpeedMPH[k]);
            System.out.println();
        }
        System.out.println("==========================================================================");
        System.out.printf("%s%27.1s%20.3s%20.3s", "Average", categoryAvg, pressureAvg, (int)windSpeedMPHAvg);
        System.out.println();
        System.out.printf("%s%31s%20s%20.3s", "Max", categoryMax, pressureMax, (int)windSpeedMPHMax);
        System.out.println();
        System.out.printf("%s%31s%20s%20.2s", "Min", categoryMin, pressureMin, (int)windSpeedMPHMin);
        System.out.println();
        
        for(int c = 0; c<5; c++)
        {
            System.out.printf("Number of Category %s: %s", c, categoryTotals[c]);
            System.out.println();
        }
        
        
        //prints to the outfile
        outFileWriter.printf("%47s", "Hurricanes 1980 - 2006");
        outFileWriter.println();
        outFileWriter.printf("%s%15s%15s%20s%20s", "Year", "Name", "Category", "Pressure (mb)", "Wind Speed (MPH)");
        outFileWriter.println();                                                                         
        outFileWriter.println("==========================================================================");
        for(int k=0; k<numberHurricanes; k++)
        {
            outFileWriter.printf("%s%15s%15s%20s%20.6s", year[k], name[k], category[k], pressure[k], (int)windSpeedMPH[k]);
            outFileWriter.println();
        }
        outFileWriter.println("==========================================================================");
        outFileWriter.printf("%s%27.1s%20.3s%20.3s", "Average", categoryAvg, pressureAvg, (int)windSpeedMPHAvg);
        outFileWriter.println();
        outFileWriter.printf("%s%31s%20s%20.3s", "Max", categoryMax, pressureMax, (int)windSpeedMPHMax);
        outFileWriter.println();
        outFileWriter.printf("%s%31s%20s%20.2s", "Min", categoryMin, pressureMin, (int)windSpeedMPHMin);
        outFileWriter.println();
        
        for(int c = 0; c<5; c++)
        {
            outFileWriter.printf("Number of Category %s: %s", c, categoryTotals[c]);
            outFileWriter.println();
        }
        
        //closes the outfile
        outFileWriter.close();
        
    }
}