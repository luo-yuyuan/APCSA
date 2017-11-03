
/**
 * This program allows for the creation of Equilateral objects, which act as equilateral triangles
 * 
 * Matthew Guthrie
 * 6/7/2017
 */
public class Equilateral extends Triangle
{
    private double mySide;
    
    Equilateral(double s)
    {
        super(s,s,s);
        mySide = s;
    }
    
    public double getMySide()
    {
        return mySide;
    }
}
