/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 *
 *
 * ©CSA/FLVS 2011
 * @author Maria Vieta Jacquard
 * @version 09/01/11
 * 
 * Edited By;
 * Matthew Guthrie
 * 1/5/2017
 * 
 * The purpose of this program is to find the amount spend by Jacquard in USD, and her remaining funds in USD.
 * 
 * The purpose of the V2 of this program is to allow user inputs for currency conversions, instead of hardcoded values.
 * 
 */

import java.util.Scanner;
public class CurrencyConversionV2
{
    public static void main(String [ ] args)
    {
        double startingUsDollars = 5000.00;     // local variable for US Dollars
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent
        double pesoExchangeRate;// = 1/0.0501;     // local variable for exchange rate of US Dollars to Pesos
        double dollarsSpentInMexico = 0.0;      // local variable for dollars spent in Mexico
        double yenSpent = 99939.75;
        double yenExchangeRate;// = 1/0.00896;
        double dollarsSpentInJapan = 0.0;
        double euroSpent = 624.95;
        double euroExchangeRate;// = 1/1.1014;
        double dollarsSpentInFrance = 0.0;
        double remainingUsDollars = 0.0;        // local variable for US Dollars remaining
        //remaining variables below here

        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Please enter an exchange rate for 1 Peso to USD. ");
        pesoExchangeRate = 1/in.nextDouble();
        // convertion for Mexican pesos
        // code goes below here
        dollarsSpentInMexico = (pesosSpent/pesoExchangeRate);
        remainingUsDollars = startingUsDollars - dollarsSpentInMexico;
        
        System.out.print("Please enter an exchange rate for 1 Yen to USD. ");
        yenExchangeRate = 1/in.nextDouble();
        // convertion for Japanese yen
        // code goes below here
        dollarsSpentInJapan = (yenSpent/yenExchangeRate);
        remainingUsDollars-= dollarsSpentInJapan;
        
        System.out.print("Please enter an exchange rate for 1 Euro to USD. ");
        euroExchangeRate = 1/in.nextDouble();
        // convertion for Euros
        // code goes below here
        dollarsSpentInFrance = euroSpent/euroExchangeRate;
        remainingUsDollars-= dollarsSpentInFrance;

        //print output to the screen
        // code goes below here
        System.out.print("Starting US Dollars:         ");
        System.out.println(startingUsDollars);
        System.out.print("US dollars spent in Mexico:  ");
        System.out.println(dollarsSpentInMexico);
        System.out.print("US dollars spent in Japan:   ");
        System.out.println(dollarsSpentInJapan);
        System.out.print("US dollars spent in France:  ");
        System.out.println(dollarsSpentInFrance);
        System.out.println("==============================================");
        System.out.print("Remaining US Dollars:  ");
        System.out.println(remainingUsDollars);
        System.out.println();
        

        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 4;                          //cost per item of first souvenir
        int budget1 = 50;                           //budget for first item
        int totalItem1 = budget1/costItem1;         //how many items can be purchased
        double fundsRemaining1 = (double)budget1%(double)costItem1;  //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItem1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        
        

        //Calculations for Souvenir #2
        double costItem2 = 32.55;                       //cost per item of second souvenir
        int budget2 = 713;                              //budget for second item
        double totalItem2 = ((double)budget2/costItem2);     //how many items can be purchased
        double fundsRemaining2 = (double)budget2%(double)costItem2;   //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  (int)totalItem2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
