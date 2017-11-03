
/**
 * Write a description of class FrequencyAnalysisTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.io.IOException;
public class FrequencyAnalysisTester
{
    public static void main(String args[]) throws IOException
    {
        FrequencyAnalysis program = new FrequencyAnalysis();
        
        String inFile = "cyphertext.txt";
        String outFile = "cyphertextfreq.txt";
        
        String text = program.read(inFile);
        program.getFrequency(text);
        program.getPercentage(text);
        program.printToConsole();
        program.printToFile(outFile);
    }
}
