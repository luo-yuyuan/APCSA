
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
	public static double pizzaTip(int numPizzas)
{
double tip;
tip=((double)numPizzas)*.1;
return tip;
}

public static double pizzaTip(double cost)
{
double tip;
tip = (int)cost;
return tip;
}
    
    public static void main(String args[])
	{
	   System.out.println(pizzaTip(5));
	   System.out.println(pizzaTip(13.00));
	   }
}
