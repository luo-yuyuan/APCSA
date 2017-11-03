
/**
 * Class for testing Candidate42 objects using ArrayLists
 * 
 * Matthew Guthrie
 * 6/19/17
 */

import java.util.*;
public class TestCandidate8
{
    
    public static void printVotes(List<Candidate4> e)
    {
        System.out.println("Results per Candidate4:");
        
        for(int i=0; i<e.size(); i++)
        {
            System.out.println(e.get(i).getName() + " received " + e.get(i).getNumVotes());
        }
        System.out.println();
        System.out.println();
    }
    
    public static int getTotal(List<Candidate4> e)
    {
        int count = 0;
        
        for(int i=0; i<e.size(); i++)
        {
            count += e.get(i).getNumVotes();
        }
        
        return count;
    }
    
    public static void printResults(List<Candidate4> e)
    {
        System.out.println("Candidate4" + "        " + "Votes Received" + "        " + "% of Total Votes");
        
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
    
    public static void replaceName(List<Candidate4> e, String oldName, String newName)
    {
        for(int i=0; i<e.size(); i++)
        {
            if(e.get(i).getName().equals(oldName))
            {
                e.get(i).changeName(newName);
            }
        }
    }
    
    public static void replaceVotes(List<Candidate4> e, String name, int newVotes)
    {
        for(int i=0; i<e.size(); i++)
        {
            if(e.get(i).getName().equals(name))
            {
                e.get(i).changeNumVotes(newVotes);
            }
        }
    }
    
    public static void replaceCandidate4(List<Candidate4> e, String oldName, String newName, int newVotes)
    {
        System.out.println("Changing "+ oldName +" to "+ newName +" ...");
        System.out.println();
        replaceName(e, oldName, newName);
        replaceVotes(e, newName, newVotes);
    }
    
    public static List<Candidate4> insertPosition(List<Candidate4> e, int position, String name, int votes)
    {
        e.add(position, new Candidate4(name, votes));
        return e;
    }
    
    public static List<Candidate4> insertCandidate(List<Candidate4> e, String candidate, String name, int votes)
    {
        int position = e.indexOf(candidate);
        
        e.add(position, new Candidate4(name, votes));
        return e;
    }
    
    public static List<Candidate4> deleteByName(List<Candidate4> e, String candidate)
    {
        int index = 0;
        
        for(Candidate4 c : e)
        {
            if(c.getName().compareTo(candidate) == 0)
            {
                break;
            }
            index++;
        }
        
        e.remove(index);
        
        return e;
    }
    
    public static List<Candidate4> deleteByLoc(List<Candidate4> e, int position)
    {
        e.remove(position);
        
        return e;
    }
    
    public static void main(String args[])
    {
        List<Candidate4> election = new ArrayList<Candidate4>();
        
        election.add( new Candidate4("John Smith", 5000));
        election.add( new Candidate4("Mary Miller", 4000));
        election.add( new Candidate4("Michael Duffy", 6000));
        election.add( new Candidate4("Tim Robinson", 2500));
        election.add( new Candidate4("Joe Ashtony", 1800));
        election.add( new Candidate4("Mickey Jones", 3000));
        election.add( new Candidate4("Rebecca Morgan", 2000));
        election.add( new Candidate4("Kathleen Turner", 8000));
        election.add( new Candidate4("Tory Parker", 500));
        election.add( new Candidate4("Ashton Davis", 10000));
        
        printResults(election);
        
        System.out.println("Delete position 6");
        
        System.out.println();
        
        election = deleteByLoc(election, 6);
        
        printResults(election);
        
        System.out.println("Delete Kathleen Turner");
        
        System.out.println();
        
        election = deleteByName(election, "Kathleen Turner");
        
        printResults(election);
    }
}
