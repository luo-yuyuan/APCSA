
/**
 * Matthew Guthrie
 * 4/4/17
 * 
 * Object Class for objects in AnnualFuelUseTester
 */

//imports Java lang class to allow use of MAX_VALUE and MIN_VALUE
import java.lang.*;

//class header
public class AnnualFuelUse
{
    //initialize private variables
    private int fillUp, days, startMiles, endMiles, distance, dayTotal = 15; 
    private double gallonsUsed, MPG, price, cost;
    
    //Object constructor
    AnnualFuelUse(int f, int da, int sm, int em, int dis, double gu, double mpg, double p, double c)
    {
        fillUp = f;
        days = da;
        startMiles = sm;
        endMiles = em;
        distance = dis;
        gallonsUsed = gu;
        MPG = mpg;
        price = p;
        cost = c;
    }
    
    //create new array and records it's size
    private AnnualFuelUse[] array = new AnnualFuelUse[3];
    private int arraySize = array.length;
    
    //method to copy the AnnualFuelUse array in AnnualFuelUseTester into the class definition, to allow access to each object
    public void copyArray(AnnualFuelUse[] a)
    {
        for(int i=0; i<arraySize; i++)
        {
            array[i] = a[i];
        }
    }
    
    //calculates the minimum distance travelled by car
    public int calcDistanceMin()
    {
        int dmin = Integer.MAX_VALUE;
        
        for(int i=0; i<arraySize; i++)
        {
            if(array[i].distance < dmin)
            {
                dmin = array[i].distance;
            }
        }
        return dmin;
    }
    
    
    //calculates the maximum distance travelled by car
    public int calcDistanceMax()
    {
        int dmax = Integer.MIN_VALUE;
        
        for(int i=0; i<arraySize; i++)
        {
            if(array[i].distance > dmax)
            {
                dmax = array[i].distance;
            }
        }
        return dmax;
    }
    
    //calculates the min MPG
    public double calcMPGMin()
    {
        double mpgmin = Double.MAX_VALUE;
        
        for(int i=0; i<arraySize; i++)
        {
            if(array[i].MPG < mpgmin)
            {
                mpgmin = array[i].MPG;
            }
        }
        return mpgmin;
    }
    
    //calculates the max MPG
    public double calcMPGMax()
    {
        double mpgmax = Double.MIN_VALUE;
        
        for(int i=0; i<arraySize; i++)
        {
            if(array[i].MPG > mpgmax)
            {
                mpgmax = array[i].MPG;
            }
        }
        return mpgmax;
    }
    
    //calculates the minimum price of gas
    public double calcPriceMin()
    {
        double pmin = Double.MAX_VALUE;
        
        for(int i=0; i<arraySize; i++)
        {
            if(array[i].price < pmin)
            {
                pmin = array[i].price;
            }
        }
        return pmin;
    }
    
    //calculates the maximum price of gas
    public double calcPriceMax()
    {
        double pricemax = Double.MIN_VALUE;
        
        for(int i=0; i<arraySize; i++)
        {
            if(array[i].price > pricemax)
            {
                pricemax = array[i].price;
            }
        }
        return pricemax;
    }
    
    //calculates the total distace travelled
    public int calcDistanceTotal()
    {
        int dtotal = 0;
        for(int i=0; i<arraySize; i++)
        {
            dtotal+=array[i].distance;
        }
        
        return dtotal;
    }
    
    //calculates the total gas used in gal
    public double calcGasTotal()
    {
        double gastotal = 0;
        for(int i=0; i<arraySize; i++)
        {
            gastotal+=array[i].gallonsUsed;
        }
        
        return gastotal;
    }
    
    //calcualtes the total cost of all fillups
    public double calcCostTotal()
    {
        double costtotal = 0;
        for(int i=0; i<arraySize; i++)
        {
            costtotal+=array[i].cost;
        }
        
        return costtotal;
    }
    
    //calculates the projected distance travelled for a year
    public double calcDistanceProject(int d)
    {
        double dPerDay = d/dayTotal;
        
        double project = dPerDay * (double)365;
        
        return project;
    }
    
    //calcuates the projected MPG for a year
    public double calcMPGProject()
    {
        double mpgtotal = 0;
        for(int i=0; i<arraySize; i++)
        {
            mpgtotal+=array[i].MPG;
        }
        
        double project = mpgtotal/arraySize;
        
        return project;
    }
    
    //calculates the projected gas use for a year in gal
    public double calcGasProject(double g)
    {
        double gPerDay = g/dayTotal;
        
        double project = gPerDay * (double)365;
        
        return project;
    }
    
    
    //calcualtes the projected cost for a year
    public double calcCostProject(double c)
    {
        double cPerDay = c/dayTotal;
        
        double project = cPerDay * (double)365;
        
        return project;
    }
    
    //prints all data to the user
    public void print(int dmin, double mpgmin, double pmin, int dmax, double mpgmax, double pmax, int dtotal, double gtotal, double ctotal, double dpro, double mpgpro, double gpro, double cpro)
    {
        System.out.printf("Gas Milage Calculations\n");
        System.out.printf("%s%8s%15s%13s%12s%15s%7s%9s%8s\n", "Fillup", "Days", "Start Miles", "End Miles", "Distance", "Gallons Used", "MPG", "Price", "Cost");
        System.out.printf("==============================================================================================\n");
                                                         
        for(int i=0; i<arraySize; i++)
        {
            System.out.printf("%s%13s%15s%13s%12.3s%15.4s%7.5s%9s%8.5s\n", array[i].fillUp, array[i].days, array[i].startMiles, array[i].endMiles, array[i].distance, array[i].gallonsUsed, array[i].MPG, array[i].price, array[i].cost);
        }
        
        System.out.println();
        
        System.out.printf("%s%47s%22s%9s\n", "Minimum", dmin, mpgmin, pmin);
        System.out.printf("%s%47s%22s%9s\n", "Maximum", dmax, mpgmax, pmax);
        
        System.out.println();
        
        System.out.printf("%s%48s%15.5s%24s\n", "Totals", dtotal, gtotal, ctotal);
        System.out.printf("%s%44s%15.5s%7.5s%17.7s\n", "Projection", dpro, gpro, mpgpro, cpro);
    }
}
