
/**
 * Class for testing Candidate objects using arrays
 * 
 * Matthew Guthrie
 * 6/19/17
 */
public class TestCandidate3v2
{
    
    public static void printVotes(Candidate2[] e)
    {
        System.out.println("Results per Candidate2:");
        
        for(int i=0; i<e.length; i++)
        {
            System.out.println(e[i].getName() + " received " + e[i].getNumVotes());
        }
        System.out.println();
        System.out.println();
    }
    
    public static int getTotal(Candidate2[] e)
    {
        int count = 0;
        
        for(int i=0; i<e.length; i++)
        {
            count += e[i].getNumVotes();
        }
        
        return count;
    }
    
    public static void printResults(Candidate2[] e)
    {
        System.out.println("Candidate2" + "        " + "Votes Received" + "        " + "% of Total Votes");
        
        for(int i=0; i<e.length; i++)
        {
            int adjust = 21 - e[i].getName().length();
            System.out.printf("%s%" + adjust + "s%20.2s", e[i].getName(), e[i].getNumVotes(), ((double)e[i].getNumVotes()/(double)getTotal(e))*100);
            System.out.println();
        }
        
        System.out.println("Total number of votes: " + getTotal(e));
        System.out.println();
        System.out.println();
    }
    
    public static void replaceName(Candidate2[] e, String oldName, String newName)
    {
        for(int i=0; i<e.length; i++)
        {
            if(e[i].getName().equals(oldName))
            {
                e[i].changeName(newName);
            }
        }
    }
    
    public static void replaceVotes(Candidate2[] e, String name, int newVotes)
    {
        for(int i=0; i<e.length; i++)
        {
            if(e[i].getName().equals(name))
            {
                e[i].changeNumVotes(newVotes);
            }
        }
    }
    
    public static void replaceCandidate2(Candidate2[] e, String oldName, String newName, int newVotes)
    {
        System.out.println("Changing "+ oldName +" to "+ newName +" ...");
        System.out.println();
        replaceName(e, oldName, newName);
        replaceVotes(e, newName, newVotes);
    }
    
    public static void main(String args[])
    {
        Candidate2[] election = new Candidate2[10];
        
        election[0] = new Candidate2("John Smith", 5000);
        election[1] = new Candidate2("Mary Miller", 4000);
        election[2] = new Candidate2("Michael Duffy", 6000);
        election[3] = new Candidate2("Tim Robinson", 2500);
        election[4] = new Candidate2("Joe Ashtony", 1800);
        election[5] = new Candidate2("Mickey Jones", 3000);
        election[6] = new Candidate2("Rebecca Morgan", 2000);
        election[7] = new Candidate2("Kathleen Turner", 8000);
        election[8] = new Candidate2("Tory Parker", 500);
        election[9] = new Candidate2("Ashton Davis", 10000);
        
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
