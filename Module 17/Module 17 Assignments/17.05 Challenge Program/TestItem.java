
/**
 * Class for testing Item objects and sorting them.
 * 
 * Matthew Guthrie
 * 6/20/17
 */
public class TestItem
{
    public static void printInventory(Item[] h)
    {
        System.out.printf("%5s%15s%10s%10s", "itemID", "itemName", "inStore", "price");
        System.out.println();
        for(Item n : h)
        {
            System.out.println(n.toString());
        }
    }
    
    
    public static Item[] sortID(Item[] m, int p)
    {
        int size = m.length;
        
        Item[] n = new Item[size];
        
        n[0] = m[0];
        
        if(p==1)
        {
            for(int i=0; i<size; i++)
            {
                String next = m[i].getItemID();
                int insertindex = 0;
                int k=i;
                while(k>0 && insertindex == 0)
                {
                    if(next.compareTo(n[k-1].getItemID())>0)
                    {
                        insertindex = k;
                    }
                    else
                    {
                        n[k] = n[k-1];
                    }
                    k--;
                }
                
                n[insertindex] = m[i];
            }
            
            return n;
        }
        else
        {
            for(int i=0; i<size; i++)
            {
                String next = m[i].getItemID();
                int insertindex = 0;
                int k=i;
                while(k>0 && insertindex == 0)
                {
                    if(next.compareTo(n[k-1].getItemID())<0)
                    {
                        insertindex = k;
                    }
                    else
                    {
                        n[k] = n[k-1];
                    }
                    k--;
                }
                
                n[insertindex] = m[i];
            }
            
            return n;
        }
    }
    
    
    public static Item[] sortName(Item[] m, int p)
    {
        int size = m.length;
        
        Item[] n = new Item[size];
        
        n[0] = m[0];
        
        if(p==1)
        {
            for(int i=0; i<size; i++)
            {
                String next = m[i].getItemName();
                int insertindex = 0;
                int k=i;
                while(k>0 && insertindex == 0)
                {
                    if(next.compareTo(n[k-1].getItemName())>0)
                    {
                        insertindex = k;
                    }
                    else
                    {
                        n[k] = n[k-1];
                    }
                    k--;
                }
                
                n[insertindex] = m[i];
            }
            
            return n;
        }
        else
        {
            for(int i=0; i<size; i++)
            {
                String next = m[i].getItemName();
                int insertindex = 0;
                int k=i;
                while(k>0 && insertindex == 0)
                {
                    if(next.compareTo(n[k-1].getItemName())<0)
                    {
                        insertindex = k;
                    }
                    else
                    {
                        n[k] = n[k-1];
                    }
                    k--;
                }
                
                n[insertindex] = m[i];
            }
            
            return n;
        }
    }
    
    
    public static Item[] sortInStore(Item[] m, int p)
    {
        if(p==1)
        {
            for(int i=0; i<m.length; i++)
            {
                int store = 0;
                Item first = m[i];
                for(int j=1; j<m.length-i; j++)
                {
                    if(m[j-1].getInStore()>m[j].getInStore())
                    {
                        Item temp = m[j-1];
                        m[j-1] = m[j];
                        m[j] = temp;
                    }
                    
                    
                }
            }
        }
        else if(p==2)
        {
            for(int i=0; i<m.length; i++)
            {
                int store = 0;
                Item first = m[i];
                for(int j=1; j<m.length-i; j++)
                {
                    if(m[j-1].getInStore()>m[j].getInStore())
                    {
                        Item temp = m[j-1];
                        m[j-1] = m[j];
                        m[j] = temp;
                    }
                    
                    
                }
            }
        }
        return m;
    }
    
    
    public static void sortPrice(Item[] m, int low, int high, int p)
    {
        if(low == high)
        {
            return;
        }
        else
        {
            int mid = (low + high) /2;
            
            sortPrice(m, low, mid, p);
            sortPrice(m, mid + 1, high, p);
            
            mergePrice(m, low, mid, high, p);
        }
    }
    public static void mergePrice(Item[] m, int low, int mid, int high, int p)
    {
        if(p==1)
        {
            Item[] temp = new Item[high-low+1];
            
            int i=low;
            int j=mid+1;
            int n=0;
            
            while(i<=mid || j<=high)
            {
                if(i>mid)
                {
                    temp[n] = m[j];
                    j++;
                }
                else if(j>high)
                {
                    temp[n] = m[i];
                    i++;
                }
                else if(m[i].getPrice() < m[j].getPrice())
                {
                    temp[n] = m[i];
                    i++;
                }
                else
                {
                    temp[n] = m[j];
                    j++;
                }
                n++;
            }
            
            for(int k=low; k<=high; k++)
            {
                m[k] = temp[k-low];
            }
        }
        else if(p==2)
        {
            Item[] temp = new Item[high-low+1];
            
            int i=low;
            int j=mid+1;
            int n=0;
            
            while(i<=mid || j<=high)
            {
                if(i>mid)
                {
                    temp[n] = m[j];
                    j++;
                }
                else if(j>high)
                {
                    temp[n] = m[i];
                    i++;
                }
                else if(m[i].getPrice() > m[j].getPrice())
                {
                    temp[n] = m[i];
                    i++;
                }
                else
                {
                    temp[n] = m[j];
                    j++;
                }
                n++;
            }
    }
    }
    
    public static void main(String args[])
    {
        Item[] hardware = new Item[6];
        
        hardware[0] = new Item("1011", "Air Filters", 200, 10.5);
        hardware[1] = new Item("1034", "Door Knobs", 60, 21.5);
        hardware[2] = new Item("1101", "Hammers", 90, 9.99);
        hardware[3] = new Item("1600", "Levels", 80, 19.99);
        hardware[4] = new Item("1500", "Ceiling Fans", 100, 59);
        hardware[5] = new Item("1201", "Wrench Sets", 55, 80);
        
        printInventory(hardware);
        System.out.println();
        System.out.println();
        
        System.out.print("Sorted by ID");
        System.out.println();
        hardware = sortID(hardware, 1);
        printInventory(hardware);
        System.out.println();
        System.out.println();
        
        System.out.print("Sorted by Name");
        System.out.println();
        hardware = sortName(hardware, 1);
        printInventory(hardware);
        System.out.println();
        System.out.println();
        
        System.out.print("Sorted by inStore");
        System.out.println();
        sortInStore(hardware, 1);
        printInventory(hardware);
        System.out.println();
        System.out.println();
        
        System.out.print("Sorted by Price");
        System.out.println();
        sortPrice(hardware, 0, hardware.length-1, 1);
        printInventory(hardware);
    }

}
