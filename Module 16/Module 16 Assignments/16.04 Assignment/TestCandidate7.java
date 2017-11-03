
/**
 * Class for testing Candidate objects using arrays
 * 
 * Matthew Guthrie
 * 6/19/17
 */
public class TestCandidate7
{
    
    public static void printVotes(Candidate4[] e)
    {
        System.out.println("Results per Candidate4:");
        
        for(int i=0; i<e.length; i++)
        {
            System.out.println(e[i].getName() + " received " + e[i].getNumVotes());
        }
        System.out.println();
        System.out.println();
    }
    
    public static int getTotal(Candidate4[] e)
    {
        int count = 0;
        
        for(int i=0; i<e.length; i++)
        {
            count += e[i].getNumVotes();
        }
        
        return count;
    }
    
    public static void printResults(Candidate4[] e)
    {
        System.out.println("Candidate4" + "        " + "Votes Received" + "        " + "% of Total Votes");
        
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
    
    public static void replaceName(Candidate4[] e, String oldName, String newName)
    {
        for(int i=0; i<e.length; i++)
        {
            if(e[i].getName().equals(oldName))
            {
                e[i].changeName(newName);
            }
        }
    }
    
    public static void replaceVotes(Candidate4[] e, String name, int newVotes)
    {
        for(int i=0; i<e.length; i++)
        {
            if(e[i].getName().equals(name))
            {
                e[i].changeNumVotes(newVotes);
            }
        }
    }
    
    public static void replaceCandidate4(Candidate4[] e, String oldName, String newName, int newVotes)
    {
        System.out.println("Changing "+ oldName +" to "+ newName +" ...");
        System.out.println();
        replaceName(e, oldName, newName);
        replaceVotes(e, newName, newVotes);
    }
    
    public static Candidate4[] insertPosition(Candidate4[] e, int position, String name, int votes)
    {
        Candidate4[] array = new Candidate4[e.length+1];
        
        for(int i=0; i<position; i++)
        {
            array[i] = e[i];
        }
        
        array[position] = new Candidate4(name, votes);
        
        for(int j=position+1; j<array.length; j++)
        {
            array[j] = e[j-1];
        }
        
        return array;
    }
    
    public static Candidate4[] deleteByName(Candidate4[] e, String candidate)
    {
        Candidate4[] array = new Candidate4[e.length-1];
        
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
        
        for(int j=position; j<array.length; j++)
        {
            array[j] = e[j+1];
        }
        
        return array;
    }
    
    public static Candidate4[] deleteByLoc(Candidate4[] e, int position)
    {
        Candidate4[] array = new Candidate4[e.length-1];
        
        for(int i=0; i<position; i++)
        {
            array[i] = e[i];
        }
        
        for(int j=position; j<array.length; j++)
        {
            array[j] = e[j+1];
        }
        
        return array;
    }
    
    public static void main(String args[])
    {
        Candidate4[] election = new Candidate4[10];
        
        election[0] = new Candidate4("John Smith", 5000);
        election[1] = new Candidate4("Mary Miller", 4000);
        election[2] = new Candidate4("Michael Duffy", 6000);
        election[3] = new Candidate4("Tim Robinson", 2500);
        election[4] = new Candidate4("Joe Ashtony", 1800);
        election[5] = new Candidate4("Mickey Jones", 3000);
        election[6] = new Candidate4("Rebecca Morgan", 2000);
        election[7] = new Candidate4("Kathleen Turner", 8000);
        election[8] = new Candidate4("Tory Parker", 500);
        election[9] = new Candidate4("Ashton Davis", 10000);
        
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
