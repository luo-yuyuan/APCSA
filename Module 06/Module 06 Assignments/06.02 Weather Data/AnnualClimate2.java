
/**
 * Matthew Guthrie
 * 1/21/17
 * 
 * This program contains weather data for Miami, Florida and Orlando, Florida.
 * The user can choose whether to have data for which ever set is chosen in F or C and in cm or in.
 */
import java.util.Scanner;
public class AnnualClimate2
{
    public static void main (String [ ] args)
    {

        //Declare and intialize variables - programmer to provide initial values
        Scanner in = new Scanner(System.in);
        //String city = "Miami";
        String city = "Orlando";
        String state = "Florida";

        String month [] ={"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        //first data set for Miami
        //double temperature [] ={68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9};        //initialize with Fahrenheit values
        //double precipitation [] ={1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2};  //initialize with inches values
      
        //second data set for Orlando
        double temperature [] = {60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63.0};
        double precipitation [] = {2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};
        
        
        String tempLabel = "F";   //initialize to F
        String precipLabel = "in"; //initialize to cm


        //INPUT - ask user for temp and preciptation scale choice
        System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        String tempChoice = in.next();
        System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
        String precipChoice = in.next();


        //PROCESSING - convert from F to C and in to cm based on user's choices
        // remember 5/9 = 0, 5.0/9 = .5555

        if(tempChoice.equalsIgnoreCase("C"))
        {
            tempLabel="(C)";
            for( int index = 0; index < temperature.length; index++)
            {
                temperature[index] = (temperature[index]-32)*5.0/9.0;
            }

        }

        //Convert in values to cm; replace the current values in precipitation
        if(precipChoice.equalsIgnoreCase("c"))
        {
            precipLabel="(cm)";
            for(int i=0; i<precipitation.length; i++)
            {
                precipitation[i] = precipitation[i]*2.54;
            }

        }
        
        
        //calculate average temp and annual rainfall
        double average=0.0;
        for(int k=0; k<temperature.length; k++)
        {
            average += temperature[k];
        }
        average/=temperature.length;
        
        double annual = 0.0;
        for(int n=0; n<precipitation.length;n++)
        {
            annual += precipitation[n];
        }
        annual/=precipitation.length;
        
        //OUTPUT - print table using printf to format and align data

        System.out.println();
        System.out.printf("%33s","Climate Data");
        System.out.println();
        System.out.printf("%13s" + "Location: " + city +", " + state, "");
        System.out.println();
        System.out.println();
        System.out.printf("%5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
        System.out.println();
        System.out.printf("***************************************************");
        System.out.println();
        for(int j=0; j<month.length; j++)
        {
            System.out.printf( "%s ", month[j]);
                        System.out.printf( "%18.4s", temperature[j]);
            if((int)(precipitation[j])<10)
            {
                System.out.printf(" %18.3s ", precipitation[j]);
            }
            else
            {
                System.out.printf(" %18.4s ", precipitation[j]);
            }
            System.out.print("\n");
        }
        System.out.printf("***************************************************");
        System.out.println();
        System.out.printf( "%23.4s ", average);
        System.out.printf( "%18.4s ", annual);



    }//end main
}
