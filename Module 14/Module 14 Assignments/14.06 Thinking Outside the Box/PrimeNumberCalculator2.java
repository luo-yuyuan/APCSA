
/**
 * This class calculates all the prime numbers upto a specificed upper limit
 * 
 * Matthew Guthrie
 * 6/15/17
 */

import java.util.ArrayList;
public class PrimeNumberCalculator2
{
    private int upperLimit;
    
    //constructor
    PrimeNumberCalculator2(int upperLimit)
    {
        this.upperLimit = upperLimit;
    }
    
    //finds if an integer is prime
    public boolean isPrime(int n)
    {
        //if n is even and n!=2, then n is not prime
        if(n!=2 && n%2==0)
        {
            return false;
        }
        //if n is 2, then n is prime
        else if(n==2)
        {
            return true;
        }
        //if n is 1, then n is not prime
        else if(n==1)
        {
            return false;
        }
        //finds the remainder of n/x, where x is all odd numbers.
        //if the remainder is ever 0, then n is not prime
        //if the remainder is never 0, then n is prime.
        else
        {
            boolean check = true;
            
            for(int i=3; i<n; i+=2)
            {
                if(n%i==0)
                {
                    check = false;
                }
            }
            
            return check;
        }
    }
    
    //calculates all the primes using isPrime()
    public ArrayList<Integer> calculatePrimes()
    {
        ArrayList<Integer> primes = new ArrayList<Integer>(0);
        for(int i=0; i<upperLimit; i++)
        {
            if(isPrime(i+1))
            {
                primes.add(i+1);
            }
        }
        
        return primes;
    }

    //prints all previously calculated primes
    public void printPrimes(ArrayList<Integer> primes)
    {
        System.out.println("Printing primes...");
        for(int n : primes)
        {
            System.out.println(n);
        }
        System.out.println();
    }
    
    //allows for all primes to be calculated and printed in one function call.
    public void calculateAndPrintPrimes()
    {
        ArrayList<Integer> temp = calculatePrimes();
        printPrimes(temp);
    }
}
