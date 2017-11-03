
/**
 * 
 *Matthew Guthrie
 *1/14/17
 *
 *The purpose of this program is to calculate if a person's heart rate after exercising is within the desired range according to the Karvonen formula 
 *
 */

import java.util.Scanner;
public class TargetZone
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Determine Your Target Heart Rate Zone for Cardiovascular Exercise");
        System.out.println("");
        System.out.println("");
        System.out.print("Enter your age: ");
        String ageS = in.next();
        System.out.print("Enter your resting heart rate: ");
        String restingHeartRateS = in.next();
        System.out.print("Enter your heart rate after exercising: ");
        String exerciseHeartRateS = in.next();
        
        int ageI = Integer.parseInt(ageS);
        int restingHeartRateI = Integer.parseInt(restingHeartRateS);
        int exerciseHeartRateI = Integer.parseInt(exerciseHeartRateS);
        
        double maximumHeartRate = 206.9 - (0.67*ageI);
        double HRR = maximumHeartRate - restingHeartRateI;
        double sixtyFiveHeartRate =  (HRR*0.65)+restingHeartRateI;
        double eightyFiveHeartRate =  (HRR*0.85)+restingHeartRateI;
        
        
        System.out.print("Your target zone is between ");
        System.out.print(sixtyFiveHeartRate);
        System.out.print(" and ");
        System.out.print(eightyFiveHeartRate);
        System.out.println("");
        System.out.println("");
        
        boolean aboveSixtyFivePercent = exerciseHeartRateI>=sixtyFiveHeartRate;
        boolean belowEightyFivePercent = exerciseHeartRateI<=eightyFiveHeartRate;
        
        if(aboveSixtyFivePercent && belowEightyFivePercent)
        {
            System.out.print("Just after exercising, your heart rate is WITHIN your target zone");
        }
        else if(!aboveSixtyFivePercent)
        {
            System.out.print("Just after exercising, your heart rate is BELOW your target zone");
        }
        else if(!belowEightyFivePercent)
        {
            System.out.print("Just after exercising, your heart rate is ABOVE your target zone");
        }
        
        
        
        
    }
}
