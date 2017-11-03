
/**
 * Creates CO2Footprint objects for use in Co2FootprintTester
 * 
 * @author Matthew Guthrie
 * @version 4/6/17
 */

import java.util.ArrayList;
public class CO2FootprintV2
{
    private int NumPeople, BulbsReplaced, months = 12;
    private double GasUsed, AvgElecBill, AvgElecPrice, projectedGas, tonsCO2, poundsCO2, gasToTons = 8.78*Math.pow(10, -3), tonsToPounds = 2204.62;
    private boolean Paper, Plastic, Glass, Cans;
    private double Emissions, RecycleReduction, ElectricEmissions, ElectricReductions, NetEmissions, TotalCo2Footprint;
    
    /**
     * Default constructor for CO2Footprint Objects
     * 
     * @param double gasUsed
     * @param double avgElecBill
     * @param double avgElecPrice
     * @param double numPeople
     * @param boolean paper
     * @param boolean glass
     * @param boolean cans
     * @param int bulbsReplaced
     */
    CO2FootprintV2(double GasUsed, double AvgElecBill, double AvgElecPrice, int NumPeople, boolean Paper, boolean Plastic, boolean Glass, boolean Cans, int BulbsReplaced)
    {
        this.GasUsed = GasUsed;
        this.AvgElecBill = AvgElecBill;
        this.AvgElecPrice = AvgElecPrice;
        this.NumPeople = NumPeople;
        this.Paper = Paper;
        this.Plastic = Plastic;
        this.Glass = Glass;
        this.Cans = Cans;
        this.BulbsReplaced = BulbsReplaced;
    }
    
    /**
    * Mutator method to calculate the total emissions, without any recycling (no parameters)
    */
   public void calcGrossWasteEmission()
   {
        Emissions = NumPeople * 1018;
   }

   /**
    * Mutator method to calculate the emission reduction from recycling (no parameters)
    */
   public void calcWasteReduction()
   {
       if(Paper)
       {
           RecycleReduction += (184.0 * NumPeople);
       }

      if(Plastic)
      {
          RecycleReduction += (25.6 * NumPeople);
      }

      if(Glass)
      {
          RecycleReduction += (46.6 * NumPeople);
      }
      
      if(Cans)
      {
          RecycleReduction += (165.8 * NumPeople);
      }

   }

   /**
    * Mutator method to calculate the net emissions (no paramters)
    */
   public void calcNetWasteReduction()
   {
        NetEmissions = Emissions - RecycleReduction;
   }

   /**
    * Getter method to return the number of people (no paramters)
    */
   public int getNumPeople()
   {
       return NumPeople;
   }

   /**
    * Getter method to return paper's recycled status (true or false) (no paramters)
    */
   public boolean getPaper()
   {
       return Paper;
   }

   /**
    * Getter method to return glass's recycled status (true or false) (no paramters)
    */
   public boolean getGlass()
   {
       return Glass;
   }

   /**
    * Getter method to return plastic's recycled status (true or false) (no paramters)
    */
   public boolean getPlastic()
   {
       return Plastic;
   }

   /**
    * Getter method to return cans' recycled status (true or false) (no paramters)
    */
   public boolean getCans()
   {
       return Cans;
   }

   /**
    * Getter method to return the total emissions (no paramters)
    */
   public double getEmissions()
   {
       return Emissions;
   }

   /**
    * Getter method to return the recycling reduction amount (no paramters)
    */
   public double getRecycleReduction()
   {
       return RecycleReduction;
   }

   /**
    * Getter method to return the net emissions (no paramters)
    */
   public double getNetEmissions()
   {
       return NetEmissions;
   }
    
    /**
     * Method used to calculate the amount of CO2 made in Tons
     */
    public void calcTonsCO2()
    {
        tonsCO2 = gasToTons * GasUsed;
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
    * This method calculates the average bill for n number of months worth of bills
    * 
    * @param ArrayList<Double> monthlyBill An ArrayList of bills for n months
    * @return The average monthly bill
    */
   public double calcAverageBill(ArrayList<Double> monthlyBill)
   {
       double total = 0;
       
       for(double var : monthlyBill)
       {
           total+=var;
       }
       
       double avg = total/months;
       
       return avg;
   }

   /**
    * This method calculates the average price per month for n number of months
    * 
    * @param ArrayList<Double> monthlyPrice An ArrayList with prices per month
    * 
    * @return The average price per month
    */
   public double calcAveragePrice (ArrayList<Double> monthlyPrice)
   {
       double total = 0;
       
       for(double var : monthlyPrice)
       {
           total+=var;
       }
       
       double avg = total/months;
       
       return avg;
   }

   
   /**
    * This method calculates the emissions created by using electricity
    * 
    * @param Double avgBill The average bill for each month
    * @param Double avgPrice The average price for each month
    * 
    * 
    */
   public void calcElectricityCO2()
   {
       double emissionFactor = 1.37;
       
       double billOverPrice = AvgElecBill/AvgElecPrice;
       
       ElectricEmissions = billOverPrice * emissionFactor * months;
       
   }
   
   public double getElectricityCO2()
   {
       return ElectricEmissions;
   }
   
   public void replaceBulbs()
   {
      ElectricReductions += (double)BulbsReplaced * 1.37 * 73;
   }
   
   public double getElectricReduction()
   {
       return ElectricReductions;
   }
   
   public void totalCO2FootPrint()
   {
       double totalEmissions = poundsCO2 + ElectricEmissions + Emissions;
       
       double totalReduction = ElectricReductions + RecycleReduction;
       
       TotalCo2Footprint = totalEmissions - totalReduction;
   }
   
   public double getTotalCO2Footprint()
   {
       return TotalCo2Footprint;
   }
}
