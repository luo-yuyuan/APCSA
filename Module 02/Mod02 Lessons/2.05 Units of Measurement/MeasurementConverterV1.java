/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * ©FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: Matthew Guthrie
 * Date: 1/1/2017
 * Description:
 *  This program is designed to convert between set units of measurement using variables.
 *  Conversion factors are set into variables and are used to convert between to measurements, both ways.
 *  The purpose of this program is to practice using variables
 *  
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles; //distance in miles
        double feet; //distance in feet
        double feetPerMile = 5280; //amount of feet in one mile
        
        double kilometers; //distance in kilometers
        double kilometersPerMile = 1.609344; //amount of kilometers in one mile
        
        double kilograms; //weight in kilograms
        double pounds; //weight in pounds
        double kilogramsPerPound = 0.453592; //amount of kilograms in one pound
        
        double gallons; //volume in gallons
        double liters; //volume in liters
        double gallonsPerLiter = 0.264172; //amoount of gallons in one liter
        
        double kilojoules; //energy in kilojoules
        double Calories; //energy in Calories(kilocalories)
        double kilojoulesPerCalorie = 4.184; //amount of kilojoules in one Calorie
        

        //ASCII Art and Text Introduction
        System.out.println("***********************************************");
        System.out.println("           This program converts between");
        System.out.println("           selected units of measurement");
        System.out.println("***********************************************");
        
        
        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");


        //convert miles to feet
        miles = 3.2;
        feet = miles * feetPerMile;
        System.out.println(miles + " mi. = " + feet + " ft. ");

        //convert kilometers to miles
        kilometers = 5.6;
        miles = kilometers / kilometersPerMile;
        System.out.println(kilometers + " km. = " + miles + " mi.");
        
        //convert miles to kilometers
        miles = 3.2;
        kilometers = miles * kilometersPerMile;
        System.out.println(miles + " mi. = " + kilometers + " km. ");
        
        //convert kilograms to pounds
        kilograms = 14.7;
        pounds = kilograms / kilogramsPerPound;
        System.out.println(kilograms + " kg. = " + pounds + " lb. ");
        
        //convert pounds to kilograms
        pounds = 9.8;
        kilograms = pounds * kilogramsPerPound;
        System.out.println(pounds + " lb. = " + kilograms + " kg. ");
        
        //convert gallons to liters
        gallons = 6.7;
        liters = gallons / gallonsPerLiter;
        System.out.println(gallons + " gal. = " + liters + " L. ");
        
        //convert liters to gallons
        liters = 2.2;
        gallons = liters * gallonsPerLiter;
        System.out.println(liters + " L. = " + gallons + " gal. ");
        
        //convert kilojoules to Calories
        kilojoules = 15.8;
        Calories = kilojoules / kilojoulesPerCalorie;
        System.out.println(kilojoules + " kJ. = " + Calories + " Cal. ");
        
        
        //convert Calories to kilojoules
        Calories = 101.99;
        kilojoules = Calories * kilojoulesPerCalorie;
        System.out.println(Calories + " Cal. = " + kilojoules + "kJ. ");
        

    }//end of main method
}//end of class
