
/**
 * This program allows the user to find the distances a catapult will shoot at
 * based on the number of speeds and angles desired. Both variables start at
 * 20 and 25 respectively, and increment by 5.
 * 
 * @author Matthew Guthrie
 * @version 4/6/17
 */
public class CatapultTester
{
    public static void main(String args[])
    {
        //initialization and assignment of variables
        int speedNum = 7, anglesNum = 6;
        
        //creation of Catapult object
        Catapult catapult = new Catapult(speedNum, anglesNum);
        
        //creation 2d array
        double[][] data = new double[speedNum][anglesNum];
        
        //filling the 2d array with distances
        data = catapult.fillArray();
        
        //printing data to the user
        System.out.printf("Projectile Distance (feet)\n");
        System.out.printf("%s%10s%10s%10s%10s%10s%10s\n", "MPG", "25 deg", "30 deg", "35 deg", "40 deg", "45 deg", "50 deg");
        System.out.println("================================================================");
        for(int i=0; i<speedNum; i++)
        {
            System.out.printf("%s", (i+4)*5);
            for(int j=0; j<anglesNum; j++)
            {
                System.out.printf("%10.5s", data[j][i]);
            }
            System.out.println();
        }
    }
}
