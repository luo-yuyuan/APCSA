
/**
 * Matthew Guthrie
 * 4/3/17
 * 
 * Class to create car objects. Used in CarV7Tester
 * 
 */


public class CarV7
{  
    //initialize private variable
    private String myCarType;
    private int myStartMiles, myEndMiles, myDistance;
    private double myGallons, myMPG, myPrice, myCost, myGPM;
    
    //car constructor
    CarV7(String t, int sm, int em, int d, double g, double p, double c, double mpg, double gpm)
    {
        //assign car variables
        myCarType = t;
        myStartMiles = sm;
        myEndMiles = em;
        myDistance = d;
        myGallons = g;
        myPrice = p;
        myCost = c;
        myMPG = mpg;
        myGPM = gpm;
    }
    
    //method to calculate distance
    public void calcDistance()
    {
        myDistance = myEndMiles-myStartMiles;
    }
    
    //method to calculate mpg
    public void calcMPG()
    {
        myMPG = myDistance/myGallons;
    }
    
    //method to calculate gpm
    public void calcGPM()
    {
        myGPM = myGallons/myDistance;
    }
    
    //method to calculate gas cost
    public void calcCost()
    {
        myCost = myGallons*myPrice;    
    }
    
    //method to print top portion of output
    public void printHeader()
    {
        System.out.printf("Gas Milage Calculations\n");
        System.out.printf("%s%29s%12s%11s%10s%6s%12s%10s%10s\n", "Car Type", "Start Miles", "End Miles", "Distance", "Gallons", "MPG", "Price", "Cost", "GPM");
        System.out.printf("==============================================================================================================\n");
    }
    
    //methods to print each car's data (for formatting putposes)
    public void printData1()
    {
        System.out.printf("%s%15s%14s%10.3s%12s%11.5s%9s%12.5s%11.5s\n", myCarType, myStartMiles, myEndMiles, myDistance, myGallons, myMPG, myPrice, myCost, myGPM);
    }
    public void printData2()
    {
        System.out.printf("%s%8s%14s%10.3s%12.4s%11.5s%9s%12.5s%11.5s\n", myCarType, myStartMiles, myEndMiles, myDistance, myGallons, myMPG, myPrice, myCost, myGPM);
    }
    public void printData3()
    {
        System.out.printf("%s%16s%14s%10.3s%12.4s%11.5s%9s%12.5s%11.5s\n", myCarType, myStartMiles, myEndMiles, myDistance, myGallons, myMPG, myPrice, myCost, myGPM);
    }
    
    //method for calculating the gallons used by a car based on distance and MPG
    public void calcGallons()
    {
        myGallons = myDistance/myMPG;
    }
   
}
