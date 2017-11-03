/**
 * @purpose: Calculate yearly CO2 emissions from electricity 8.10
 *
 * @author: Matthew Guthrie
 * @version: 4/6/17
 */
import java.util.ArrayList;
public class CO2FromElectricityTester
{
   public static void main(String[] args)
   {
       //creates a CO2FromElectricityObject 
       CO2FromElectricity CO2 = new CO2FromElectricity();
       
       //creates ArrayLists for the monthly electricity bill and monthly price per KWH
        ArrayList<Double> monthlyBill = new ArrayList<Double>(12);
        ArrayList<Double> monthlyPrice = new ArrayList<Double>(12);

       //adds user data to monthlyBill ArrayList
       monthlyBill.add(262.30);
       monthlyBill.add(277.80);
       monthlyBill.add(221.56); 
       monthlyBill.add(202.77); 
       monthlyBill.add(195.15); 
       monthlyBill.add(224.94); 
       monthlyBill.add(242.37);
       monthlyBill.add(245.29);
       monthlyBill.add(215.42);
       monthlyBill.add(212.48);
       monthlyBill.add(198.37);
       monthlyBill.add(212.79);
       
       //adds user data to monthlyPrice ArrayList
       monthlyPrice.add(0.1154);
       monthlyPrice.add(0.1157);
       monthlyPrice.add(0.0940);
       monthlyPrice.add(0.0829);
       monthlyPrice.add(0.0757);
       monthlyPrice.add(0.0810);
       monthlyPrice.add(0.0865);
       monthlyPrice.add(0.0816);
       monthlyPrice.add(0.0765);
       monthlyPrice.add(0.0797);
       monthlyPrice.add(0.0790);
       monthlyPrice.add(0.0918);
        
       //calculates the user's average bill
       double avgBill = CO2.calcAverageBill(monthlyBill);
       
       //calculates the user's average price per KWH
       double avgPrice = CO2.calcAveragePrice(monthlyPrice);

       //calcualtes the user's emissions
       double emissions = CO2.calcElectricityCO2(avgBill, avgPrice);

       //prints the data to the user
       System.out.printf("Average Monthly Electricity Bill: %6.2f%n", avgBill);
       System.out.printf("Average Monthly Electricity Price: %4.2f%n", avgPrice);
       System.out.printf("Annual CO2 Emissions from Electricity Usage:   %7.1f pounds", emissions);
   }
}
