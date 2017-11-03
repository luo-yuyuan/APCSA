
/**
 * Rectangle2 demo
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/6/2007
 */
public class Rectangle3
{
	// instance variables 
	private int length;
	private int width;

	/**
	 * Constructor for objects of class rectangle
	 */
	public Rectangle3(int l, int w)
	{
		// initialise instance variables
		length = l;
		width = w;
	}

	// return the height
	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
	    return width;
	}
	
	public String toString()
	{
	    return "Rectangle - " + length + " X " + width;
	}
	
	public String equals(Rectangle3 r)
    {
       if(getLength() == r.getLength() && getWidth() == r.getWidth())
       {
           return toString() + " is the same size as " + r.toString();
       }
       else
       {
           return toString() + " is not the same size as " + r.toString();
       }
    }
    
    public String equals(Box3 b)
    {
        return toString() + " is not the same size as " + b.toString();
    }
}