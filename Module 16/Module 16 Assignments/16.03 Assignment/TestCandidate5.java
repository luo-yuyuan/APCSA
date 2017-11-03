
/**
 * Class for testing Candidate objects using arrays
 * 
 * Matthew Guthrie
 * 6/19/17
 */
public class TestCandidate5
{
    
    public static void printVotes(Candidate3[] e)
    {
        System.out.println("Results per Candidate3:");
        
        for(int i=0; i<e.length; i++)
        {
            System.out.println(e[i].getName() + " received " + e[i].getNumVotes());
        }
        System.out.println();
        System.out.println();
    }
    
    public static int getTotal(Candidate3[] e)
    {
        int count = 0;
        
        for(int i=0; i<e.length; i++)
        {
            count += e[i].getNumVotes();
        }
        
        return count;
    }
    
    public static void printResults(Candidate3[] e)
    {
        System.out.println("Candidate3" + "        " + "Votes Received" + "        " + "% of Total Votes");
        
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
    
    public static void replaceName(Candidate3[] e, String oldName, String newName)
    {
        for(int i=0; i<e.length; i++)
        {
            if(e[i].getName().equals(oldName))
            {
                e[i].changeName(newName);
            }
        }
    }
    
    public static void replaceVotes(Candidate3[] e, String name, int newVotes)
    {
        for(int i=0; i<e.length; i++)
        {
            if(e[i].getName().equals(name))
            {
                e[i].changeNumVotes(newVotes);
            }
        }
    }
    
    public static void replaceCandidate3(Candidate3[] e, String oldName, String newName, int newVotes)
    {
        System.out.println("Changing "+ oldName +" to "+ newName +" ...");
        System.out.println();
        replaceName(e, oldName, newName);
        replaceVotes(e, newName, newVotes);
    }
    
    public static Candidate3[] insertPosition(Candidate3[] e, int position, String name, int votes)
    {
        Candidate3[] array = new Candidate3[e.length+1];
        
        for(int i=0; i<position; i++)
        {
            array[i] = e[i];
        }
        
        array[position] = new Candidate3(name, votes);
        
        for(int j=position+1; j<array.length; j++)
        {
            array[j] = e[j-1];
        }
        
        return array;
    }
    
    public static Candidate3[] insertCandidate(Candidate3[] e, String candidate, String name, int votes)
    {
        Candidate3[] array = new Candidate3[e.length+1];
        
        int position = 0;
        
        for(int n=0; n<e.length; n++)
        {
            if(e[n].getName().compareTo(candidate) == 0)
            {
                position = n;
                break;
            }
        }
        
        for(int i=0; i<position; i++)
        {
            array[i] = e[i];
        }
        
        array[position] = new Candidate3(name, votes);
        
        for(int j=position+1; j<array.length; j++)
        {
            array[j] = e[j-1];
        }
        
        return array;
    }
    
    public static void main(String args[])
    {
        Candidate3[] election = new Candidate3[10];
        
        election[0] = new Candidate3("John Smith", 5000);
        election[1] = new Candidate3("Mary Miller", 4000);
        election[2] = new Candidate3("Michael Duffy", 6000);
        election[3] = new Candidate3("Tim Robinson", 2500);
        election[4] = new Candidate3("Joe Ashtony", 1800);
        election[5] = new Candidate3("Mickey Jones", 3000);
        election[6] = new Candidate3("Rebecca Morgan", 2000);
        election[7] = new Candidate3("Kathleen Turner", 8000);
        election[8] = new Candidate3("Tory Parker", 500);
        election[9] = new Candidate3("Ashton Davis", 10000);
        
        printResults(election);
        
        System.out.println("Adding Woody Pride, 19300 Votes");
        
        System.out.println();
        
        election = insertPosition(election, 5, "Woody Pride", 19300);
        
        printResults(election);
        
        System.out.println("Placing Joy Anderson, 1100 Votes Ahead of Kathleen Turner");
        
        System.out.println();
        
        election = insertCandidate(election, "Kathleen Turner", "Joy Anderson", 1100);
        
        printResults(election);
    }
}
