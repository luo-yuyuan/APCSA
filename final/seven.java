
/**
 * Write a description of class seven here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class seven
{
    public static void main(String args[])
    {
    	
        int x=9;
        int y=9;
        
        System.out.println("Case: " + !((x > y) && (y <= 0)));
    	System.out.println("I." + (!(x > y) || !(y <= 0)) );
    	System.out.println("II." + (!(x > y) && !(y <= 0)) );
    	System.out.println("III." + ((x <= y) || (y > 0)));
    }
}
