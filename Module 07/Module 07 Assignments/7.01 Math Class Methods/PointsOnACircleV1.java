
/**
 * Matthew Guthrie
 * 1/22/17
 * 
 * This program gives a y value of a point on a circle
 * based on the x value of that point and the circle's radius
 */
public class PointsOnACircleV1
{
    public static void main(String args[])
    {
        double r = 1.00;
        double y = 0.00;
        
        System.out.printf("%s", "Points on a Circle of Radius 1.0");
        System.out.println();
        System.out.printf("%7.4s%7.4s%7.4s%7.4s", "x1", "y1", "x1", "y2");
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        
        for(int i=10; i>=-10; i--)
        {
            y = Math.sqrt(1 - Math.pow((((double)i)/10), 2));
            System.out.printf("%7.4s%7.4s%7.4s%7.5s", ((double)i)/10, y, ((double)i)/10, (y*-1));
            System.out.println();
        }
    }
}
