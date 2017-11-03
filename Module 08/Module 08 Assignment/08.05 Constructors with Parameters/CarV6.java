
/**
 * Matthew Guthrie
 * 4/2/17
 * 
 * This program calculates the distance traveled, mpg, gpm, and total gas cost of a car
 * based on the start miles, end miles, gallons, and ppg. 
 * 
 */


public class CarV6
{  
    //initialize private variable
    private String CarType;
    private int StartMiles, EndMiles, Distance;
    private double Gallons, MPG, Price, Cost, GPM;
    
    //car constructor
    CarV6(String CarType, int StartMiles, int EndMiles, int Distance, double Gallons, double Price, double Cost, double MPG, double GPM)
    {
        //assign car variables
        this.CarType = CarType;
        this.StartMiles = StartMiles;
        this.EndMiles = EndMiles;
        this.Distance = Distance;
        this.Gallons = Gallons;
        this.Price = Price;
        this.Cost = Cost;
        this.MPG = MPG;
        this.GPM = GPM;
    }
    
    //method to calculate distance
    public void calcDistance()
    {
        Distance = EndMiles-StartMiles;
    }
    
    //method to calculate mpg
    public void calcMPG()
    {
        MPG = Distance/Gallons;
    }
    
    //method to calculate gpm
    public void calcGPM()
    {
        GPM = Gallons/Distance;
    }
    
    //method to calculate gas cost
    public void calcCost()
    {
        Cost = Gallons*Price;    
    }
    
    //method to print car data
    public void printData()
    {
        System.out.printf("Gas Milage Calculations\n");
        System.out.printf("%s%22s%12s%11s%10s%6s%12s%10s%10s\n", "Car Type", "Start Miles", "End Miles", "Distance", "Gallons", "MPG", "Price", "Cost", "GPM");
        System.out.printf("=======================================================================================================\n");
        System.out.printf("%s%8s%14s%10s%12s%11.5s%9s%12.5s%11.5s\n", CarType, StartMiles, EndMiles, Distance, Gallons, MPG, Price, Cost, GPM);
    }
    
    //main method
    public static void main(String args[])
    {
        //initialize local variables
        String carType1;
        int startMiles1, endMiles1, distance1;
        double gallons1, MPG1, price1;
        
        //assignlocal variables
        carType1 = "2014 Honda Civic";
        gallons1 = 12.3;
        price1 = 2.89;
        startMiles1 = 64079;
        endMiles1 = 64425;
        
        //create car object
        CarV6 car1 = new CarV6(carType1, startMiles1, endMiles1, 0, gallons1, price1, 0, 0, 0);
        
        //apply methods to car object
        car1.calcDistance();
        car1.calcMPG();
        car1.calcGPM();
        car1.calcCost();
        car1.printData();
    }
}
