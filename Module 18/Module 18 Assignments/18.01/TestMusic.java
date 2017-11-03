
/**
 * Write a description of class TestMusic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestMusic
{
    public static void printMusic(Music[] m)
    {
        System.out.println("Music library:");
        for(Music n : m)
        {
            System.out.println(n.toString());
        }
    }
    
    public static void searchTitle(Music[] m, String t)
    {
        int found = -1;
        
        for(int i=0; i<m.length; i++)
        {
            if(m[i].getTitle().compareTo(t) == 0)
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
            System.out.println(t + " not found.");
            System.out.println();
        }
    }
    
    public static void searchYear(Music[] m, int y)
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
            System.out.println(y + " not found.");
            System.out.println();
        }
    }
    
    public static void searchSinger(Music[] m, String s)
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
            System.out.println(s + " not found.");
            System.out.println();
        }
    }
    
    public static void main(String args[])
    {
        Music[] myMusic = 
        {
				new Music("Pieces of You", 1994, "Jewel"),	
				new Music("Jagged Little Pill", 1995, "Alanis Morissette"),
				new Music("What If It’s You", 1995, "Reba McEntire"),
				new Music("Misunderstood", 2001, "Pink"),
				new Music("Laundry Service", 2001, "Shakira"),
				new Music("Taking the Long Way", 2006, "Dixie Chicks"),
				new Music("Under My Skin", 2004, "Avril Lavigne"),
				new Music("Let Go", 2002, "Avril Lavigne"),
				new Music("Let It Go", 2007, "Tim McGraw"),
				new Music("White Flag", 2004, "Dido")
		};
		
		searchTitle(myMusic, "Let Go");
		searchTitle(myMusic, "Some Day");
		searchYear(myMusic, 2001);
		searchYear(myMusic, 2003);
		searchSinger(myMusic, "Avril Lavigne");
		searchSinger(myMusic, "Tony Curtis");
    }
}
