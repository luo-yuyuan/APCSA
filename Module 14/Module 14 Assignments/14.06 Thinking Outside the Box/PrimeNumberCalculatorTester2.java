
/**
 * This class tests the PrimeNumberCalculator class
 * 
 * Matthew Guthrie
 * 6/15/17
 */

import java.util.Scanner;
public class PrimeNumberCalculatorTester2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to the prime number calculator.");
        System.out.println("Please print the upper limit you wish to calculate to.");
        
        int upperLimit = scan.nextInt();
        
        PrimeNumberCalculator2 calculator = new PrimeNumberCalculator2(upperLimit);
        
        calculator.calculateAndPrintPrimes();
    }
}
