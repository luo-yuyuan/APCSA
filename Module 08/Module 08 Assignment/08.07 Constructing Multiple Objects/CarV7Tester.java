
/**
 * Matthew Guthrie
 * 4/3/17
 * 
 * This program calculates and compares the data for three
 * different models of car: the 2014 Honda Accord, the
 * 2017 Chevy Suburban, and the 2017 Ford Focus.
 */
public class CarV7Tester
{
     public static void main(String args[])
    {
        //initialize local variables
        String carType1;
        int startMiles1, endMiles1, distance1;
        double gallons1, MPG1, price1;
        
        String carType2;
        int startMiles2, endMiles2, distance2;
        double gallons2, MPG2, price2;
        
        String carType3;
        int startMiles3, endMiles3, distance3;
        double gallons3, MPG3, price3;
        
        //assign local variables
        carType1 = "2014 Honda Civic";
        gallons1 = 12.3;
        price1 = 2.89;
        startMiles1 = 64079;
        endMiles1 = 64425;
        
        carType2 = "2017 Chevrolet Suburban";
        MPG2 = 19;
        price2 = 2.89;
        startMiles2 = 64079;
        endMiles2 = 64425;
        
        carType3 = "2017 Ford Focus";
        MPG3 = 34;
        price3 = 2.89;
        startMiles3 = 64079;
        endMiles3 = 64425;
        
        //create car object
        
        //create Honda Accord Object
        CarV7 car1 = new CarV7(carType1, startMiles1, endMiles1, 0, gallons1, price1, 0, 0, 0);
        
        //create Chevy Suburban object
        CarV7 car2 = new CarV7(carType2, startMiles2, endMiles2, 346, 0, price2, 0, MPG2, 0);
        
        //create Ford Focus Object
        CarV7 car3 = new CarV7(carType3, startMiles3, endMiles3, 0, 0, price3, 0, MPG3, 0);
        
        //apply methods to each car object
        car1.calcDistance();
        car1.calcMPG();
        car1.calcGPM();
        car1.calcCost();
        
        car2.calcDistance();
        car2.calcGallons();
        car2.calcCost();
        car2.calcGPM();
        
        car3.calcDistance();
        car3.calcGallons();
        car3.calcCost();
        car3.calcGPM();
        
        //print information to user
        car1.printHeader();
        
        car1.printData1();
        car2.printData2();
        car3.printData3();
    }
}
