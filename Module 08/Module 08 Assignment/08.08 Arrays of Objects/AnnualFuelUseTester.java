
/**
 * Matthew Guthrie
 * 4/4/17
 * 
 * This program creates three objects based on 
 * three fillups of a car, analyzes that data, and then
 * prints the results to the user.
 */
public class AnnualFuelUseTester
{
    public static void main(String args[])
    {
        //creates an array of AnnualFuelUse objects
        AnnualFuelUse[] fillUps = new AnnualFuelUse[3];
        
        //assignes values to each object
        fillUps[0] = new AnnualFuelUse(1, 1, 64073, 64425, 346, 12.3, 28.13, 2.89, 35.55);
        fillUps[1] = new AnnualFuelUse(2, 7, 64425, 64810, 385, 13.8, 27.9, 2.49, 34.36);
        fillUps[2] = new AnnualFuelUse(3, 15, 64810, 65211, 401, 14.8, 27.1, 2.73, 40.40);
        
        //copys each array into the class definition for use in methods
        for(int i=0; i<fillUps.length; i++)
        {
            fillUps[i].copyArray(fillUps);
        }
        
        //calculates the minimum and maximum values for distance, MPG, and price respectively
        int distanceMIN = fillUps[0].calcDistanceMin();
        int distanceMAX = fillUps[0].calcDistanceMax();
        double MPGMIN = fillUps[0].calcMPGMin();
        double MPGMAX = fillUps[0].calcMPGMax();
        double priceMIN = fillUps[0].calcPriceMin();
        double priceMAX = fillUps[0].calcPriceMax();
        
        //calculates the total for for distance, MPG, and cost respectively
        int distanceTotal = fillUps[0].calcDistanceTotal();
        double gasTotal = fillUps[0].calcGasTotal();
        double costTotal = fillUps[0].calcCostTotal();
        
        //makes yearly projections for for distance, MPG, gas, and cost respectively
        double distanceProject = fillUps[0].calcDistanceProject(distanceTotal);
        double MPGProject = fillUps[0].calcMPGProject();
        double gasProject = fillUps[0].calcGasProject(gasTotal);
        double costProject = fillUps[0].calcCostProject(costTotal);
        
        
        //prints data to user
        fillUps[0].print(distanceMIN, MPGMIN, priceMIN, distanceMAX, MPGMAX, priceMAX, distanceTotal, gasTotal, costTotal, distanceProject, MPGProject, gasProject, costProject);
    }
}
