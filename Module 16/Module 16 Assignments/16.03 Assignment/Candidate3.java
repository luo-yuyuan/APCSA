
/**
 * Class for creating Candidate objects
 * 
 * Matthew Guthrie
 * 6/19/17
 */
public class Candidate3
{
   private String name;
   private int numVotes;
    
   Candidate3(String name, int numVotes)
   {
       this.name = name;
       this.numVotes = numVotes;
   }
   
   public String getName()
   {
       return name;
   }
   
   public int getNumVotes()
   {
       return numVotes;
   }
   
   public String toString()
   {
       return name + ": " + numVotes;
   }
   
    public void changeName(String name)
   {
       this.name = name;
   }
   
   public void changeNumVotes(int numVotes)
   {
       this.numVotes = numVotes;
   }
}
