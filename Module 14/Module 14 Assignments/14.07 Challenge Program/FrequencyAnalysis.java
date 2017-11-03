
/**
 * Write a description of class FrequencyAnalysis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class FrequencyAnalysis
{
    private int[] frequency = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    private double[] percent = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    FrequencyAnalysis()
    {
    
    }
    
    public String read(String fileName) throws IOException
    {
        Scanner file = new Scanner(new File(fileName));
        
        String text = "";
        
        while(file.hasNext())
        {
            text += file.next();
        }
        
        text = text.trim();
        
        file.close();
        
        return text;
    }
    
    public void getFrequency(String text)
    {
        for(int i=0; i<text.length(); i++)
        {
            char temp = text.charAt(i);
            temp=Character.toLowerCase(temp);
            if(Character.isAlphabetic(temp))
            {
                frequency[((int)temp)-97]+=1;
            }
        }
    }
    
    public void getPercentage(String text)
    {
        for(int j=0; j<frequency.length; j++)
        {
            percent[j] = (double)frequency[j]/(double)text.length();
        }
    }
    
    public void printToFile(String fileName) throws IOException
    {
        PrintWriter outFile = new PrintWriter(new File(fileName));
        
        outFile.println("   "  + "Frequency " + "Percentage");
        
        for(int i=0; i<frequency.length; i++)
        {
            outFile.print((char)(i+97) + ": ");
            outFile.print(frequency[i] + " ");
            int move = 13 - 3 + Integer.toString(frequency[i]).length();
            outFile.printf("%" + move + ".5s", percent[i]*100);
            outFile.println();
        }
        
        
        
        outFile.close();
    }
    
    public void printToConsole()
    {
        System.out.println("  "  + "Frequency " + "Percentage");
        
        for(int i=0; i<frequency.length; i++)
        {
            System.out.print((char)(i+97) + ": ");
            System.out.print(frequency[i] + " ");
            int move = 13 - 3 + Integer.toString(frequency[i]).length();
            System.out.printf("%" + move + ".5s", percent[i]*100);
            System.out.println();
        }
    }
    
}
