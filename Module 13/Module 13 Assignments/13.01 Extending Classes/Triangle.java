
/**
 * This class allows the creation of Triangle objects, serves as a basis for the Equilateral and IsoscelesRight classes.
 * 
 * Matthew Guthrie
 * 6/7/2017
 */
public class Triangle
{
    private double mySideA, mySideB, mySideC;
    
    Triangle(double a, double b, double c)
    {
        mySideA = a;
        mySideB = b;
        mySideC = c;
    }
    
    public double getMySideA()
    {
        return mySideA;
    }
    
    public double getMySideB()
    {
        return mySideB;
    }
    
    public double getMySideC()
    {
        return mySideC;
    }
}
