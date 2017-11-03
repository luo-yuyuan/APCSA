/**
 * Box2 demo.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Box3 extends Rectangle3
{
    // instance variables 
    private int height;

    /**
     * Constructor for objects of class box
     */
    public Box3(int l, int w, int h)
    {
        // call superclass
        super(l, w);
        // initialise instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }
    
    public String toString()
    {
        return "Box - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
        
    public String equals(Box3 b)
    {
       if(getLength() == b.getLength() && getWidth() == b.getWidth() && getHeight() == b.getHeight())
       {
           return toString() + " is the same size as " + b.toString();
       }
       else
       {
           return toString() + " is not the same size as " + b.toString();
       }
    }
    
    public String equals(Rectangle3 r)
    {
        return toString() + " is not the same size as " + r.toString();
    }

}