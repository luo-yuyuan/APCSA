
/**
 * Matthew Guthrie
 * 
 * 1/21/17
 * 
 * This program takes weather data for Key West, Florida, and uses it to calculate the HI for each month, and the yearly average.
 * This data is the formatted into a table and displayed for the user.
 */

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
public class HeatIndex
{
   public static void main(String args[]) throws IOException
   {
       Scanner in = new Scanner(System.in);
       File tempFile = new File("KeyWestTemp.txt");
       File humidFile = new File("KeyWestHumid.txt");
       Scanner tempScanner = new Scanner(tempFile);
       Scanner humidScanner = new Scanner(humidFile);
       PrintWriter outFile = new PrintWriter("Heat Index.txt");
       
       String City = "Key West";
       String State = "Florida";
       
       String month [] ={"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
       double temp[]  = new double[month.length];
       double humid[] = new double[month.length];
       double HI[] = new double[month.length];
       
       for(int n =0; n<month.length; n++)
       {
           temp[n]  = tempScanner.nextDouble();
       }
       
       for(int i=0; i<month.length; i++)
       {
           humid[i] = humidScanner.nextDouble();
       }
       
       tempScanner.close();
       humidScanner.close();
       
       for(int j=0; j<month.length; j++)
       {
           if(temp[j]<80 || humid[j]<40)
           {
               HI[j] = temp[j];
           }
           else
           {
               HI[j] = -42.4379+
                       2.04901523*temp[j]
                       +10.14333127*humid[j]
                       -0.22475541*temp[j]*humid[j] 
                       - 6.83783e-3*Math.pow(temp[j], 2) 
                       - 5.481717e-2*Math.pow(humid[j], 2) 
                       + 1.22874e-3*Math.pow(temp[j], 2)*humid[j]
                       + 8.5282e-4*temp[j]*Math.pow(humid[j], 2)
                       -1.99e-6*Math.pow(temp[j], 2)*Math.pow(humid[j], 2);           
            }
       }
       
       outFile.printf("%26s %s,  %s", "Heat Index:", City, State);
       outFile.println();
       outFile.printf("%29s", "Months");
       outFile.println();
       outFile.printf("%15s", "");
       for(String m : month)
       {
           outFile.printf("%s    ", m);
       }
       
       outFile.print("Avg.");
       outFile.println();
       outFile.print("********************************************************************************************************************");
       outFile.println();
       outFile.printf("%s%4s", "Temp (F)", "");
       
       double tempAvg = 0.0;
       double humidAvg = 0.0;
       double HIAvg = 0.0;
       
       
       for(int a=0; a<month.length; a++)
       {
           tempAvg += temp[a];
           humidAvg += humid[a];
           HIAvg += HI[a];
       }
       
       tempAvg/=temp.length;
       humidAvg/=humid.length;
       HIAvg/=HI.length;
       
       for(Double t : temp)
       {
           outFile.printf("%7.4s ", t);
       }
       
       outFile.printf("%7.4s", tempAvg);
       
       
       outFile.println();
       
       outFile.printf("%s", "Humidity (%)");
       
       for(Double h : humid)
       {
           outFile.printf("%7.2s ", h);
       }
       outFile.printf("%7.2s", humidAvg);
       
       outFile.println();
       
       outFile.printf("%s%6s", "HI (F)", "");
       
       for(Double s : HI)
       {
           outFile.printf("%7.4s ", s);
       }
       outFile.printf("%7.4s", HIAvg);
       
       outFile.close();
       
   }
}
