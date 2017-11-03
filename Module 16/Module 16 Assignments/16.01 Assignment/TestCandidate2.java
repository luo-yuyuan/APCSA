
/**
 * Class for testing Candidate objects using an ArrayList
 * 
 * Matthew Guthrie
 * 6/19/17
 */

import java.util.*;
public class TestCandidate2
{
    
    public static void printVotes(List<Candidate> e)
    {
        System.out.println("Results per candidate:");
        
        for(Candidate c : e)
        {
            System.out.println(c.getName() + " received " + c.getNumVotes());
        }
        System.out.println();
        System.out.println();
    }
    
    public static int getTotal(List<Candidate> e)
    {
        int count = 0;
        
        for(Candidate c : e)
        {
            count += c.getNumVotes();
        }
        
        return count;
    }
    
    public static void printResults(List<Candidate> e)
    {
        System.out.println("Candidate" + "        " + "Votes Received" + "        " + "% of Total Votes");
        
        for(Candidate c : e)
        {
            int adjust = 21 - c.getName().length();
            System.out.printf("%s%" + adjust + "s%20.2s", c.getName(), c.getNumVotes(), ((double)c.getNumVotes()/(double)getTotal(e))*100);
            System.out.println();
        }
        
        System.out.print("Total number of votes: " + getTotal(e));
    }
    
    public static void main(String args[])
    {
        List<Candidate> election = new ArrayList<Candidate>();
        
        election.add(new Candidate("John Smith", 5000));
        election.add(new Candidate("Mary Miller", 4000));
        election.add(new Candidate("Michael Duffy", 6000));
        election.add(new Candidate("Tim Robinson", 2500));
        election.add(new Candidate("Joe Ashtony", 1800));
        
        printVotes(election);
        printResults(election);
    }
}
