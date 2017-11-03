
/**
 * Class for testing Candidate32 objects using ArrayLists
 * 
 * Matthew Guthrie
 * 6/19/17
 */

import java.util.*;
public class TestCandidate6
{
    
    public static void printVotes(List<Candidate3> e)
    {
        System.out.println("Results per Candidate3:");
        
        for(int i=0; i<e.size(); i++)
        {
            System.out.println(e.get(i).getName() + " received " + e.get(i).getNumVotes());
        }
        System.out.println();
        System.out.println();
    }
    
    public static int getTotal(List<Candidate3> e)
    {
        int count = 0;
        
        for(int i=0; i<e.size(); i++)
        {
            count += e.get(i).getNumVotes();
        }
        
        return count;
    }
    
    public static void printResults(List<Candidate3> e)
    {
        System.out.println("Candidate3" + "        " + "Votes Received" + "        " + "% of Total Votes");
        
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
    
    public static void replaceName(List<Candidate3> e, String oldName, String newName)
    {
        for(int i=0; i<e.size(); i++)
        {
            if(e.get(i).getName().equals(oldName))
            {
                e.get(i).changeName(newName);
            }
        }
    }
    
    public static void replaceVotes(List<Candidate3> e, String name, int newVotes)
    {
        for(int i=0; i<e.size(); i++)
        {
            if(e.get(i).getName().equals(name))
            {
                e.get(i).changeNumVotes(newVotes);
            }
        }
    }
    
    public static void replaceCandidate3(List<Candidate3> e, String oldName, String newName, int newVotes)
    {
        System.out.println("Changing "+ oldName +" to "+ newName +" ...");
        System.out.println();
        replaceName(e, oldName, newName);
        replaceVotes(e, newName, newVotes);
    }
    
    public static List<Candidate3> insertPosition(List<Candidate3> e, int position, String name, int votes)
    {
        e.add(position, new Candidate3(name, votes));
        return e;
    }
    
    public static List<Candidate3> insertCandidate(List<Candidate3> e, String candidate, String name, int votes)
    {
        int position = e.indexOf(candidate);
        
        e.add(position, new Candidate3(name, votes));
        return e;
    }
    
    public static void main(String args[])
    {
        List<Candidate3> election = new ArrayList<Candidate3>();
        
        election.add( new Candidate3("John Smith", 5000));
        election.add( new Candidate3("Mary Miller", 4000));
        election.add( new Candidate3("Michael Duffy", 6000));
        election.add( new Candidate3("Tim Robinson", 2500));
        election.add( new Candidate3("Joe Ashtony", 1800));
        election.add( new Candidate3("Mickey Jones", 3000));
        election.add( new Candidate3("Rebecca Morgan", 2000));
        election.add( new Candidate3("Kathleen Turner", 8000));
        election.add( new Candidate3("Tory Parker", 500));
        election.add( new Candidate3("Ashton Davis", 10000));
        
        printResults(election);
        
        System.out.println("Adding Woody Pride, 19300 Votes");
        
        System.out.println();
        
        insertPosition(election, 5, "Woody Pride", 19300);
        
        printResults(election);
        
        System.out.println("Placing Joy Anderson, 1100 Votes Ahead of Kathleen Turner");
        
        System.out.println();
        
        printResults(election);
    }
}
