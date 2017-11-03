
/**
 * This program allows for the calculation of 
 * the CO2 output in both Pounds and Metric Tons, 
 * for a specific amount of gas used.
 * 
 * @author Matt Guthrie
 * @version 4/6/17
 */
public class CO2FootprintV1Tester
{
    public static void main(String args[])
    {
        //initalization and assignment of gas variable
        double projectedGas = 995.2;
        
        //createion of CO2Footprint object gas
        CO2FootprintV1 gas = new CO2FootprintV1(projectedGas);
        
        //calculates the CO2 in Tons
        gas.calcTonsCO2();
        
        //calculates the CO2 in Pounds
        gas.calcPoundsCO2();
        
        //prints data to the user
        gas.print();
    }
}
