
/**
 * Class for creating Item objects
 * 
 * Matthew Guthrie
 * 6/20/17
 */
public class Item
{
    private String itemID, itemName;
    private int inStore;
    private double price;
    
    Item(String itemID, String itemName, int inStore, double price)
    {
        this.itemID = itemID;
        this.itemName = itemName;
        this.inStore = inStore;
        this.price = price;
    }
    
    public String getItemID()
    {
        return itemID;
    }
    public void setItemID(String itemID)
    {
        this.itemID = itemID;
    }
    
    public String getItemName()
    {
        return itemName;
    }
    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }
    
    public int getInStore()
    {
        return inStore;
    }
    public void setInStore(int inStore)
    {
        this.inStore=inStore;
    }
    
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public String toString()
    {
        return String.format("%5s%15s%10s%10.5s", itemID, itemName, inStore, price);
    }
}
