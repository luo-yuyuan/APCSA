/**
 * Prompts user to select a category and tests the menu structure.
 * 
 * Matthew Guthrie
 * 1/15/17
 */
import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println("[A] BMI");
        System.out.println("[B] BMR");
        System.out.println("[C] Healthy Eating");
        System.out.println("[D] Food Pyramid");
        System.out.println("[E] Fitness Training");
        System.out.println("Please enter A, B, C, D, or E to select your choice.");
        String choice = in.next(); 
        System.out.println();
        
        if(choice.equalsIgnoreCase("A"))
        {
            System.out.println("Testing: You chose A for BMI");
        }
        else if(choice.equalsIgnoreCase("B"))
        {
            System.out.println("Testing: You chose B for BMR");
        }
        else if (choice.equalsIgnoreCase("C"))
        {
            System.out.println("Testing: You chose C for Healthy Earing");
        }
        else if (choice.equalsIgnoreCase("D")) 
        {
            System.out.println("Testing: You chose D for Food Pyramid");
        }
        else if (choice.equalsIgnoreCase("E"))
        {
            System.out.println("Testing: You chose E for Fitness Training");
        }
        else
        {
            System.out.println("You entered an invalid character, please try again!");
        }
    }
}