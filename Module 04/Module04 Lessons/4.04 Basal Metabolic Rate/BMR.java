
/**
 * 
 * Matthew Guthrie
 * 1/15/17
 * 
 * The purpose of this program is to calculate a person's base metabolic rate based on the Harris-Bennedict Formula
 * 
 * Revised Harris-Benedict formula was used
 */

import java.util.Scanner;
public class BMR
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.print("Gender (M or F): ");
        String genderS = in.next();
        System.out.print("Enter your age: ");
        String age = in.next();
        int ageI = Integer.parseInt(age);
        System.out.print("Height in inches: ");
        String heightIN = in.next();
        double heightIND = Double.parseDouble(heightIN);
        System.out.print("Weight in pounds: ");
        String weightLB = in.next();
        double weightLBD = Double.parseDouble(weightLB);
        
        System.out.println("");
        System.out.println("");
        System.out.print("Calculate Your Basal Metabolism");
        System.out.println("");
        System.out.println("");
        
        char genderC = genderS.charAt(0);
        boolean isMale = genderC == 'M';
        double heightCM = 2.54*heightIND;
        double weightKG = 0.453592*weightLBD;
        double BMR;
        
        if(isMale)
        {
            BMR = (13.397*weightKG) + (4.799*heightCM) - (5.677*ageI) + 88.362;
        }
        else
        {
            BMR = (9.247*weightKG) + (3.098*heightCM) - (4.330*ageI) + 447.593;
        }
        
        
        
        System.out.print("Name: ");
        System.out.println(name);
        System.out.print("Age: ");
        System.out.println(age);
        System.out.print("Weight (kg): ");
        System.out.println(weightKG);
        System.out.print("Height (cm): ");
        System.out.println(heightCM);
        System.out.print("Basal Metabolic Rate: ");
        System.out.print(BMR);
        System.out.print(" calories a day.");
    
    }
}
