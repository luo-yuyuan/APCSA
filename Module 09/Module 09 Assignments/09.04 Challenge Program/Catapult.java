
/**
 * Creates Catapult Objects for use in CatapultTester.
 * Allows user to find distance a catapult will launch
 * and object for a specific angle and initial speed.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.lang.Math;
public class Catapult
{
    //initializes variables which record number of angles and speeds
    private int speedNum, anglesNum;
    
    /**
     * Default constructor for Catapult objects.
     * 
     * @param int s The number of speeds for the table
     * @param int a The number of angles for the table
     */
    Catapult(int s, int a)
    {
        speedNum = s;
        anglesNum = a;
    }
    
    /**
     * Fills the array with distances based on the equation in 9.04 Virtual Lecture Notes Part 1
     * 
     * @return Returns a two-dimensional array of doubles with each element being the distance traveled. First dimension is angles, second dimension is speeds.
     */
    public double[][] fillArray()
    {
        double[][] array = new double[anglesNum][speedNum];
        
        int angle = 25;
        for(int i=0; i<anglesNum; i++)
        {
            int speed = 20;
            for(int j=0; j<speedNum; j++)
            {
                double speedSquared = Math.pow(speed, 2);
                
                double sinAngle = Math.sin(2*Math.toRadians(angle));
                
                double g = 9.8;

                double R = ((speedSquared*sinAngle)/g);
                
                array[i][j] = R;
                
                speed+=5;
            }
            angle+=5;
        }
        
        return array;
    }
}
