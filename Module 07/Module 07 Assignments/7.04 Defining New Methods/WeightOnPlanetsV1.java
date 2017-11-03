
/**
 * Matthew Guthrie
 * 1/23/16
 * 
 * This program calculates the user's weight on all planets in the 
 * solar system, using the weight defined in the program and the
 * surface gravity found in 7.03
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class WeightOnPlanetsV1
{
    public static double[] readGravityFile(int length) throws IOException
    {
        File file = new File("gravity1.txt");
        Scanner inFile = new Scanner(file);
        
        double data[] = new double[length];
        double earthGravity = 9.794740681676519;
        
        for(int i=0; i<length; i++)
        {
            data[i] = inFile.nextDouble();
            data[i]/=earthGravity;
        }
        inFile.close();
        return data;
        
    }
    
    public static double[] calculateWeights(double[] g, double userWeight)
    {
        double w[] = new double[g.length];
        double userMassG = userWeight*433.59237;
        
        for(int i=0; i<g.length; i++)
        {
            w[i] = (userMassG * g[i])/433.59237;
        }
        return w;
    }
    
    public static void print(String [] n, double[] g, double[] w)
    {
        System.out.printf("%32s", "My Weight on the Planets");
        System.out.println();
        System.out.printf("%s%15s%15s", "Planet  ", "Gravity", "Weight(lb)");
        System.out.println();
        System.out.println("---------------------------------------");
        for(int i=0; i<n.length; i++)
        {
            System.out.printf("%s%15.4s%15.5s", n[i], g[i], w[i]);
            System.out.println();
        }
    }
    
    
    public static void main(String args[]) throws IOException
    {
        
        double userWeight = 100.0;//in lb
        
        String[] names = {"Mercury", "Venus  ", "Earth  ", "Mars   ", "Jupiter", "Saturn ", "Uranus ", "Neptune", "Pluto  "};
        double gravity[] = new double[names.length];
        gravity = readGravityFile(names.length);
        
        double weights[] = new double[names.length];
        weights = calculateWeights(gravity, userWeight);
        
        print(names, gravity, weights);
        
        
    }
}
