
/**
 * This class allows for the creation of Cube objects, which act as real life cubes.
 * 
 * Matthew Guthrie
 * 6/7/2017
 */
public class Cube3 extends Box3
{
   Cube3(int s)
   {
       super(s, s, s);
   }
   
   public String toString()
	{
	    return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
	}
	

}
