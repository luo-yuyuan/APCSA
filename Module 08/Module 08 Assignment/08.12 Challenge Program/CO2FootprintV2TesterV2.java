/**
 * Allows for the creation of different CO2FootprintV2 Objects, which
 * are used to calculate a family's annual CO2 footprint.
 * 
 * @author Matt Guthrie
 * @version 4/6/17
 */

import java.util.ArrayList;
public class CO2FootprintV2TesterV2
{
    public static void main(String args[])
    {
        ArrayList<CO2FootprintV2> family = new ArrayList<CO2FootprintV2>();
        
        family.add(new CO2FootprintV2(995.2, 225.94, 0.09, 4, false, true, false, true, 5));
        family.add(new CO2FootprintV2(750, 300, 0.1, 6, true, true, false, true, 10));
        family.add(new CO2FootprintV2(1300, 190, 0.08, 3, false, false, false, false, 2));
        family.add(new CO2FootprintV2(750, 100, 0.12, 2, true, true, true, true, 20));
        family.add(new CO2FootprintV2(1000, 200, 0.1, 5, false, true, false, true, 8));
        
        
        for(CO2FootprintV2 f : family)
        {
            f.calcTonsCO2();
            f.calcPoundsCO2();
            
            f.calcElectricityCO2();
            
            f.calcGrossWasteEmission();
            
            f.calcWasteReduction();
            
            f.replaceBulbs();
            
            f.totalCO2FootPrint();
        }
        
        System.out.printf("%s%50s\n", "Pounds of C02 from", "Pounds of CO2 Reduced");
        System.out.printf("%s%21s%15s%17s%19s%23s\n", "Gas", "Electricity", "Waste", "Recycling", "New Bulbs", "CO2 Footprint");
        
        for(CO2FootprintV2 f : family)
        {
            System.out.printf("%.7s%13.7s%18.4s%15s%19.6s%20.7s\n", f.getPoundsCO2(), f.getElectricityCO2(), f.getEmissions(), f.getRecycleReduction(), f.getElectricReduction(), f.getTotalCO2Footprint());
        }
    }
}
