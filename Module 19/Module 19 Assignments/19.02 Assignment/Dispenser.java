
/**
 * This class creates dispenser objects
 * 
 * Matthew Guthrie
 * 6/21/17
 */
public class Dispenser
{
    private int numberOfItems, cost;
    
    Dispenser()
    {
        this.numberOfItems = 50;
        this.cost = 50;
    }
    
    Dispenser(int numberOfItems, int cost)
    {
        if(numberOfItems <0 || cost<0)
        {
            throw new IllegalArgumentException("Number of Items and Cost but be non-negative.");
        }
        else
        {
            this.numberOfItems = numberOfItems;
            this.cost = cost;
        }
        
        
    }
    
    public int getCount()
        {
            return numberOfItems;
        }
        
        public int getProductCost()
        {
            return cost;
        }
        
        public void makeSale()
        {
            if(this.numberOfItems==0)
            {
                throw new IllegalArgumentException("Number of Items cannot be negative");
            }
            else
            {
                this.numberOfItems--;
            }
        }
}
