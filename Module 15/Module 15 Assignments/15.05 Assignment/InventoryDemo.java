
/**
 * A tester class made to test the Product interface, Vehicle abstract class, and Tool, Car, and Truck classes
 * 
 * @author Matthew Guthrie 
 * @version 6/18/17
 */

import java.util.*;
public class InventoryDemo
{
    public static List<Product> products = new ArrayList<Product>();
    
    public static void takeInventory(String name)
    {
        int quantity=0;
        double totalCost=0.0;
        for(Product p : products)
        {
            if(name == p.getName())
            {
                quantity++;
                totalCost+=p.getCost();
            }
        }
        
        System.out.println(name + ": Quantity = " + quantity + ", Total cost = " + totalCost);
    }
    
    
    public static void main(String args[])
    {
        products.add(new Car("Jaguar", 100000.00));
        products.add(new Car("Neon", 17000.00));
        products.add(new Tool("Jigsaw", 149.18));
        products.add(new Car("Jaguar", 110000.00));
        products.add(new Car("Neon", 17500.00));
        products.add(new Car("Neon", 17875.32));
        products.add(new Truck("RAM", 35700.00));
        products.add(new Tool("CircularSaw", 200.00));
        products.add(new Tool("CircularSaw", 150.00));
        
        takeInventory("Jigsaw");
        takeInventory("Neon");
        takeInventory("Jaguar");
        takeInventory("RAM");
        takeInventory("CircularSaw");
        
        Tool saw1 = new Tool("Saw", 100.00);
        Tool saw2 = new Tool("Saw", 75.00);
        
        if(saw1.compareTo(saw2) == 1)
        {
            System.out.println("Saw One is more expensive");
        }
        else if(saw1.compareTo(saw2) == 0)
        {
            System.out.println("The saws cost the same");
        }
        else if(saw1.compareTo(saw2) == -1)
        {
            System.out.println("Saw One is more expensive");
        }
    }
}
