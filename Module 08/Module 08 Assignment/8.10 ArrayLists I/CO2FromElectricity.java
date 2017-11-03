/**
 * @purpose: Calculate yearly CO2 emissions from electricity (8.10)
 *
 * @author: Matthew Guthrie
 * @version: 4/6/17
 */
import java.util.ArrayList;
public class CO2FromElectricity

{
    //initizalize and assign a variable for the number of months worth of data exists
    private int months = 12; 
   
   /**
    * Default constructor for CO2FromElectricity objects
    */
    CO2FromElectricity()
   {
       //default constructor to be used
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
    * @return The emissions in Tons
    */
   public double calcElectricityCO2 (double avgBill, double avgPrice)
   {
       double emissionFactor = 1.37;
       
       double billOverPrice = avgBill/avgPrice;
       
       double emissions = billOverPrice * emissionFactor * months;
       
       return emissions;
   }
}
