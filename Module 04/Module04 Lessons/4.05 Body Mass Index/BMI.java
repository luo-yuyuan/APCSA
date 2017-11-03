
/**
 *
 *Matthew Guthrie
 *1/15/17
 *
 *This program is designed to calculate a user's BMI, or body mass index, which gives the user a general estimation of their body fat percentage.
 *
 */

import java.util.Scanner;
public class BMI
{
    public static void main(String args[])
    {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name (first last): ");
        String name = in.nextLine();
        System.out.println("");
        System.out.print("Enter your weight in LB (eg 175): ");
        String weightLBS = in.next();//weight in lb as a string
        System.out.println("");
        System.out.print("Enter your height in feet and inches (eg 5 11): ");
        String heightFTS = in.next();
        String heightINS = in.next();
        System.out.println("");
        System.out.println("");
        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");
        
        int weightLBI = Integer.parseInt(weightLBS);
        int heightINI = Integer.parseInt(heightFTS) * 12 + Integer.parseInt(heightINS);
        
        double weightKG = weightLBI * 0.453592;
        double heightM = heightINI * 0.0254;
        
        double BMI = weightKG/(heightM*heightM);
        
        boolean isUnderweight = BMI<18.5;
        boolean isHealthyWeight = 24.9>=BMI && BMI>=18.5;
        boolean isOverweight = 29.9>=BMI && BMI>=25.0;
        
        String Category;
        
        if(isUnderweight)
        {
            Category = "Underweight";
        }
        else if(isHealthyWeight)
        {
            Category = "Normal/Healthy Weight";
        }
        else if(isOverweight)
        {
            Category = "Overweight";
        }
        else
        {
            Category = "Obese";
        }
        
        System.out.print("Name: ");
        System.out.print(name);
        System.out.println();
        System.out.print("Height (m): ");
        System.out.print(heightM);
        System.out.println();
        System.out.print("Weight (kg): ");
        System.out.print(weightKG);
        System.out.println();
        System.out.print("BMI: ");
        System.out.print(BMI);
        System.out.println();
        System.out.print("Category:  ");
        System.out.print(Category);
        
    
    }
}
