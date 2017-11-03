
/**
 * Class for testing Candidate objects using arrays
 * 
 * Matthew Guthrie
 * 6/19/17
 */
public class TestCandidate
{
    
    public static void printVotes(Candidate[] e)
    {
        System.out.println("Results per candidate:");
        
        for(int i=0; i<e.length; i++)
        {
            System.out.println(e[i].getName() + " received " + e[i].getNumVotes());
        }
        System.out.println();
        System.out.println();
    }
    
    public static int getTotal(Candidate[] e)
    {
        int count = 0;
        
        for(int i=0; i<e.length; i++)
        {
            count += e[i].getNumVotes();
        }
        
        return count;
    }
    
    public static void printResults(Candidate[] e)
    {
        System.out.println("Candidate" + "        " + "Votes Received" + "        " + "% of Total Votes");
        
        for(int i=0; i<e.length; i++)
        {
            int adjust = 21 - e[i].getName().length();
            System.out.printf("%s%" + adjust + "s%20.2s", e[i].getName(), e[i].getNumVotes(), ((double)e[i].getNumVotes()/(double)getTotal(e))*100);
            System.out.println();
        }
        
        System.out.print("Total number of votes: " + getTotal(e));
    }
    
    public static void main(String args[])
    {
        Candidate[] election = new Candidate[5];
        
        election[0] = new Candidate("John Smith", 5000);
        election[1] = new Candidate("Mary Miller", 4000);
        election[2] = new Candidate("Michael Duffy", 6000);
        election[3] = new Candidate("Tim Robinson", 2500);
        election[4] = new Candidate("Joe Ashtony", 1800);
        
        printVotes(election);
        printResults(election);
    }
}
