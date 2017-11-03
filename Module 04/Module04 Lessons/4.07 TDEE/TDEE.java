
/**
 * 
 * Matthew Guthrie
 * 1/15/17
 * 
 * This program calculates a person's TDEE, or Total Daily Energy Expenditure, 
 * based on Actvity Level, BMR, and Gender
 * 
 */

import java.util.Scanner;
public class TDEE
{
    public static void main(String args[])
    {
     Scanner in = new Scanner(System.in);
     
     System.out.print("Please enter your name: ");
     String name  = in.nextLine();
     System.out.println();
     System.out.print("Please enter your BMR: ");
     String BMRS  = in.next();
     double BMRD = Double.parseDouble(BMRS);
     System.out.println();
     System.out.print("Please enter your gender (M/F): ");
     String gender  = in.next();
     System.out.println();
     
     System.out.println("Select your activity level");
     System.out.println("[0] Resting (Seleeping, Reclining)");
     System.out.println("[1] Sedentary (Minimal Movement)");
     System.out.println("[2] Light (Sitting, Standing)");
     System.out.println("[3] Moderate (Light Manual Labor, Dancing, Riding Bike)");
     System.out.println("[4] Very Active (Team Sports, Hard Manual Labor)");
     System.out.println("[5] Extremely Active (Full-tiem Athlete, Heavy Manual Labor)");
     System.out.print("Enter the number coresponding to your activity level: ");
     String AL = in.next();
     System.out.println();
        
     double AF = 0;
     boolean isMale = gender.equalsIgnoreCase("M");
     
     if(AL.equals("0"))
     {
         AF=1.0;
     }
     else if(AL.equals("1"))
     {
         AF=1.3;
     }
     else if(AL.equals("2"))
     {
         if(isMale)
         {
             AF=1.6;
         }
         else
         {
             AF=1.5;
         }
     }
     else if(AL.equals("3"))
     {
         if(isMale)
         {
             AF=1.7;
         }
         else
         {
             AF=1.6;
         }
     }
     else if(AL.equals("4"))
     {
         if(isMale)
         {
             AF=2.1;
         }
         else
         {
             AF=1.9;
         }
     }
     else if(AL.equals("5"))
     {
         if(isMale)
         {
             AF=2.4;
         }
         else
         {
             AF=2.2;
         }
     }
     else
     {
         System.out.print("Incorrect option chosen, please try again.");
     }
        
     double TDEE = BMRD*AF;
     
     System.out.print("Name: ");
     System.out.print(name);
     System.out.println();
     System.out.print("Gender: ");
     System.out.print(gender);
     System.out.println();
     System.out.print("BMR: ");
     System.out.print(BMRS);
     System.out.println();
     System.out.print("Activity Factor: ");
     System.out.print(AF);
     System.out.println();
     System.out.print("TDEE: ");
     System.out.print(TDEE);
     
     
    }
}
