
/**
 * A class used to test the creation of Music2 objects and to search through and array of them.
 * 
 * Matthew Guthrie
 * 6/20/17
 */
public class TestMusic2
{
    public static void printMusic2(Music2[] m)
    {
        System.out.println("Music2 library:");
        for(Music2 n : m)
        {
            System.out.println(n.toString());
        }
    }
    
    public static void searchTitle(Music2[] m, String t, int start, int end)
    {
        int middle = (start+end)/2;
        
        if(start>end)
        {
            System.out.println("Title - " + t + " not found.");
            System.out.println();
        }
        else if(m[middle].getTitle().compareTo(t) == 0)
        {
            System.out.println("Title found:");
            System.out.println(m[0].toString());
            System.out.println();
        }
        else if(m[middle].getTitle().compareTo(t) < 0)
        {
            searchTitle(m,t,middle+1,end);
        }
        else if(m[middle].getTitle().compareTo(t) > 0)
        {
            searchTitle(m,t,start,middle-1);
        }
    }
    
    public static void searchYear(Music2[] m, int y)
    {
        int found = -1;
        
        for(int i=0; i<m.length; i++)
        {
            if(m[i].getYear() == y)
            {
                found = i;
                break;
            }
        }
        
        if(found!=-1)
        {
            System.out.println("Title found:");
            System.out.println(m[found].toString());
            System.out.println();
        }
        
        if(found==-1)
        {
            System.out.println("Year - " + y + " not found.");
            System.out.println();
        }
    }
    
    public static void searchSinger(Music2[] m, String s)
    {
        int found = -1;
        
        for(int i=0; i<m.length; i++)
        {
            if(m[i].getSinger().compareTo(s) == 0)
            {
                found = i;
                break;
            }
        }
        
        if(found!=-1)
        {
            System.out.println("Title found:");
            System.out.println(m[found].toString());
            System.out.println();
        }
        
        if(found==-1)
        {
            System.out.println("Singer - " + s + " not found.");
            System.out.println();
        }
    }
    
    public static Music2[] selectionSort(Music2[] m, int p)
    {
        if(p==1)
        {
            for(int i=0; i<m.length; i++)
            {
                int store = 0;
                Music2 first = m[i];
                for(int j=1; j<m.length-i; j++)
                {
                    if(m[j-1].getTitle().compareTo(m[j].getTitle())>0)
                    {
                        Music2 temp = m[j-1];
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
                Music2 first = m[i];
                for(int j=1; j<m.length-i; j++)
                {
                    if(m[j-1].getTitle().compareTo(m[j].getTitle())<0)
                    {
                        Music2 temp = m[j-1];
                        m[j-1] = m[j];
                        m[j] = temp;
                    }
                    
                    
                }
            }
        }
        return m;
    }
    
    
    
    public static void main(String args[])
    {
        Music2[] myMusic2 = 
        {
                new Music2("Pieces of You", 1994, "Jewel"), 
                new Music2("Jagged Little Pill", 1995, "Alanis Morissette"),
                new Music2("What If It’s You", 1995, "Reba McEntire"),
                new Music2("Misunderstood", 2001, "Pink"),
                new Music2("Laundry Service", 2001, "Shakira"),
                new Music2("Taking the Long Way", 2006, "Dixie Chicks"),
                new Music2("Under My Skin", 2004, "Avril Lavigne"),
                new Music2("Let Go", 2002, "Avril Lavigne"),
                new Music2("Let It Go", 2007, "Tim McGraw"),
                new Music2("White Flag", 2004, "Dido")
        };
        
        myMusic2 = selectionSort(myMusic2, 1);
        
        searchTitle(myMusic2, "Misunderstood", 0, myMusic2.length);
        searchTitle(myMusic2, "Under Paid", 0, myMusic2.length);
        searchYear(myMusic2, 2005);
        searchYear(myMusic2, 2006);
        searchSinger(myMusic2, "Darth Maul");
        searchSinger(myMusic2, "Dido");
    }
}
