
/**
 * This class allows for the creation of WinterMountain objects.
 * 
 * Matthew Guthrie
 * 6/7/17
 */
public class WinterMountain extends Mountain
{
    private double myTemperature;
    
    WinterMountain(int l, int w, int m, double t)
    {
        super(l,w,m);
        myTemperature = t;
    }
    
    public double getMyTemperature()
    {
        return myTemperature;
    }
    
    public String printWinterMountain()
    {
        return " and has temperature " + myTemperature;
    }
}
