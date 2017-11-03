
/**
 * Matthew Guthrie
 * 3/28/17
 * 
 * The purpose of this program is to calculate the distance a car has traveled and it's MPG based on the the miles 
 * driven and gas used between two fill ups.
 * 
 */


public class CarV3_3
{
    //Constructor for car object
    CarV3_3()
    {
    }
    
    //Calculates distance traveled by car
    public int calcDistance(int sMiles, int eMiles)
    {
        return eMiles-sMiles;
    }
    
    //Calculates MPG of car
    public double calcMPG(int dist, double gals)
    {
        return dist/gals;
    }
    
    //Prints data in a readable format for the user
    public void printData(String type, int sMiles, int eMiles, int dist, double gals, double MPG)
    {
        System.out.printf("Gas Milage Calculations:\n");
        System.out.printf("%s%22s%12s%11s%10s%6s\n", "Car Type", "Start Miles", "End Miles", "Distance", "Gallons", "MPG");
        System.out.printf("=======================================================================\n");
        System.out.printf("%s%8s%14s%10s%12s%11.5s\n", type, sMiles, eMiles, dist, gals, MPG);    
    }
    
    //main method
    public static void main(String args[])
    {
        //varibale initionalization
        String carType;
        int startMiles, endMiles, distance;
        double gallons, MPG;
        CarV3_3 car1 = new CarV3_3();
        
        //variable assignment
        carType = "2014 Honda Civic";
        gallons = 12.3;
        startMiles = 64079;
        endMiles = 64425;
        
        //calculates distance by way of the calcDistance function
        distance = car1.calcDistance(startMiles, endMiles);
        
        //calculates miles per gallon by way of the calcMPG function
        MPG = car1.calcMPG(distance, gallons);
        
        //prints data to user by way of the printData function
        car1.printData(carType, startMiles, endMiles, distance, gallons, MPG);
    }
}
