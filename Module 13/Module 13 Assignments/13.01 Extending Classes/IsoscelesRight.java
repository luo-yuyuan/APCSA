
/**
 * This class allows the creation of IsoscelesRight objects, which act as Isosceles Right Trianlges
 * 
 * Matthew Guthrie
 * 6/7/2017
 */

import java.lang.Math;
public class IsoscelesRight extends Triangle
{
    private double myLeg, myHypotenuse;
    
    IsoscelesRight(double s)
    {
        super(s,s,Math.sqrt(2*Math.pow(s, 2)));
        myLeg = s;
        myHypotenuse = Math.sqrt(2*Math.pow(s, 2));
    }

    public double getMyLeg()
    {
        return myLeg;
    }
    
    public double getMyHypotenuse()
    {
        return myHypotenuse;
    }
    
}
