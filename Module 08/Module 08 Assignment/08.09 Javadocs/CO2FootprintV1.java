
/**
 * This class allows the creation of CO2FootprintV1 objects, which allows
 * for one to view their impact on the envirorment for the amount of gas they enter.
 * 
 * @author Matt Guthrie 
 * @version 4/6/17
 */

import java.lang.Math;

/**
 * 
 */
public class CO2FootprintV1
{
    private double projectedGas, tonsCO2, poundsCO2, gasToTons = 8.78*Math.pow(10, -3), tonsToPounds = 2204.62;
    
    /**
     * Default constructor for CO2FootprintV1 Objects
     */
    CO2FootprintV1(double gas)
    {
        projectedGas = gas;
    }
    
    /**
     * Method used to calculate the amount of CO2 made in Tons
     */
    public void calcTonsCO2()
    {
        tonsCO2 = gasToTons * projectedGas;
    }
    
    /**
     * Method used to calculate the amount of CO2 in Tons into pounds
     */
    public void calcPoundsCO2()
    {
        poundsCO2 = tonsToPounds * tonsCO2;
    }
    
    /**
     * Method used to return the amount of CO2 in tons
     * @return CO2 in Tons
     */
    public double getTonsCO2()
    {
        return tonsCO2;
    }
    
    /**
     * Method used to return the amount of CO2 in Pounds
     * @return CO2 in Pounds
     */
    public double getPoundsCO2()
    {
        return poundsCO2;
    }
    
    /**
     * Method used to print the gas entered, CO2 in Pounds, and the CO2 in Tons to the user.
     */
    public void print()
    {
        System.out.printf("%31s\n", "CO2 Emissions");
        
        System.out.printf("%s%18s%16s\n", "Gallons of Gas", "Pounds from Gas", "Tons from Gas");
        System.out.printf("*************************************************\n");
                                                                           
        System.out.printf("%14s%18.8s%16.4s", projectedGas, poundsCO2, tonsCO2);
    }
}
