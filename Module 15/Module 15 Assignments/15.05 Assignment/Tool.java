
/**
 * Class made to create tool objects and allow them to be compared
 * 
 * @author Matthew Guthrie 
 * @version 6/18/17
 */
public class Tool implements Product, Comparable<Tool>
{
    String name;
    double cost;
    
    Tool(String name, double cost)
    {
        this.name = name;
        this.cost = cost;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public int compareTo(Tool obj)
    {
        if(cost<obj.getCost())
        {
            return -1;
        }
        else if(cost==obj.getCost())
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
