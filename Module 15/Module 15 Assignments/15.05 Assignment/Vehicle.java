
/**
 * Abstract Class declaring methods and variables of Car and Truck objects
 * 
 * @author Matthew Guthrie 
 * @version 6/18/17
 */
public abstract class Vehicle implements Product
{
    String name;
    double cost;
    
    Vehicle(String name, double cost)
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
}
