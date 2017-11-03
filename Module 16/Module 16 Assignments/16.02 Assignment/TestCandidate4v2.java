
/**
 * Class for testing Candidate22 objects using ArrayLists
 * 
 * Matthew Guthrie
 * 6/19/17
 */

import java.util.*;
public class TestCandidate4v2
{
    
    public static void printVotes(List<Candidate2> e)
    {
        System.out.println("Results per Candidate2:");
        
        for(int i=0; i<e.size(); i++)
        {
            System.out.println(e.get(i).getName() + " received " + e.get(i).getNumVotes());
        }
        System.out.println();
        System.out.println();
    }
    
    public static int getTotal(List<Candidate2> e)
    {
        int count = 0;
        
        for(int i=0; i<e.size(); i++)
        {
            count += e.get(i).getNumVotes();
        }
        
        return count;
    }
    
    public static void printResults(List<Candidate2> e)
    {
        System.out.println("Candidate2" + "        " + "Votes Received" + "        " + "% of Total Votes");
        
        for(int i=0; i<e.size(); i++)
        {
            int adjust = 21 - e.get(i).getName().length();
            System.out.printf("%s%" + adjust + "s%20.2s", e.get(i).getName(), e.get(i).getNumVotes(), ((double)e.get(i).getNumVotes()/(double)getTotal(e))*100);
            System.out.println();
        }
        
        System.out.println("Total number of votes: " + getTotal(e));
        System.out.println();
        System.out.println();
    }
    
    public static void replaceName(List<Candidate2> e, String oldName, String newName)
    {
        for(int i=0; i<e.size(); i++)
        {
            if(e.get(i).getName().equals(oldName))
            {
                e.get(i).changeName(newName);
            }
        }
    }
    
    public static void replaceVotes(List<Candidate2> e, String name, int newVotes)
    {
        for(int i=0; i<e.size(); i++)
        {
            if(e.get(i).getName().equals(name))
            {
                e.get(i).changeNumVotes(newVotes);
            }
        }
    }
    
    public static void replaceCandidate2(List<Candidate2> e, String oldName, String newName, int newVotes)
    {
        System.out.println("Changing "+ oldName +" to "+ newName +" ...");
        System.out.println();
        replaceName(e, oldName, newName);
        replaceVotes(e, newName, newVotes);
    }
    
    public static void main(String args[])
    {
        List<Candidate2> election = new ArrayList<Candidate2>();
        
        election.add( new Candidate2("John Smith", 5000));
        election.add( new Candidate2("Mary Miller", 4000));
        election.add( new Candidate2("Michael Duffy", 6000));
        election.add( new Candidate2("Tim Robinson", 2500));
        election.add( new Candidate2("Joe Ashtony", 1800));
        election.add( new Candidate2("Mickey Jones", 3000));
        election.add( new Candidate2("Rebecca Morgan", 2000));
        election.add( new Candidate2("Kathleen Turner", 8000));
        election.add( new Candidate2("Tory Parker", 500));
        election.add( new Candidate2("Ashton Davis", 10000));
        
        printResults(election);
        
        System.out.println("Replacing Michael Duffy with John Elmos...");
        
        System.out.println();
        
        replaceName(election, "Michael Duffy", "John Elmos");
        
        printResults(election);
        
        System.out.println("Replacing Mickey Johns votes from 3000 to 2500...");
        
        System.out.println();
        
        replaceVotes(election, "Mickey Johns", 2500);
        
        printResults(election);
        
        replaceCandidate2(election, "Kathleen Turner", "John Kennedy", 8500);
        
        printResults(election);
    }
}
