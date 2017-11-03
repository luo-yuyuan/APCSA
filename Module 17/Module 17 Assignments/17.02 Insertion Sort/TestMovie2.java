
/**
 * Class for testing Movie2 objects and for sorting them
 * 
 * Matthew Guthrie
 * 6/20/17
 */
public class TestMovie2
{
    
    public static void printMovies(Movie2[] m)
    {
        System.out.println("Title, Year, Studio");
        
        for(Movie2 n : m)
        {
            System.out.println(n.toString());
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
    public static Movie2[] sortTitles(Movie2[] m, int p)
    {
        int size = m.length;
        
        Movie2[] n = new Movie2[size];
        
        n[0] = m[0];
        
        if(p==1)
        {
            for(int i=0; i<size; i++)
            {
                String next = m[i].getTitle();
                int insertindex = 0;
                int k=i;
                while(k>0 && insertindex == 0)
                {
                    if(next.compareTo(n[k-1].getTitle())>0)
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
                String next = m[i].getTitle();
                int insertindex = 0;
                int k=i;
                while(k>0 && insertindex == 0)
                {
                    if(next.compareTo(n[k-1].getTitle())<0)
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
    
    public static Movie2[] sortYears(Movie2[] m, int p)
    {
        int size = m.length;
        
        Movie2[] n = new Movie2[size];
        
        n[0] = m[0];
        
        if(p==1)
        {
            for(int i=0; i<size; i++)
            {
                Movie2 next = m[i];
                int insertindex = 0;
                int k=i;
                while(k>0 && insertindex == 0)
                {
                    if(next.getYear() > (n[k-1].getYear()))
                    {
                        insertindex = k;
                    }
                    else
                    {
                        n[k] = n[k-1];
                    }
                    k--;
                }
                
                n[insertindex] = next;
            }
            
            return n;
        }
        else
        {
            for(int i=0; i<size; i++)
            {
                Movie2 next = m[i];
                int insertindex = 0;
                int k=i;
                while(k>0 && insertindex == 0)
                {
                    if(next.getYear() < n[k-1].getYear())
                    {
                        insertindex = k;
                    }
                    else
                    {
                        n[k] = n[k-1];
                    }
                    k--;
                }
                
                n[insertindex] = next;
            }
            
            return n;
        }
    }
    
    public static Movie2[] sortStudios(Movie2[] m, int p)
    {
        int size = m.length;
        
        Movie2[] n = new Movie2[size];
        
        n[0] = m[0];
        
        if(p==1)
        {
            for(int i=0; i<size; i++)
            {
                String next = m[i].getStudio();
                int insertindex = 0;
                int k=i;
                while(k>0 && insertindex == 0)
                {
                    if(next.compareTo(n[k-1].getStudio())>0)
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
                String next = m[i].getStudio();
                int insertindex = 0;
                int k=i;
                while(k>0 && insertindex == 0)
                {
                    if(next.compareTo(n[k-1].getStudio())<0)
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
    
    public static void main(String args[])
    {
        int movieTotal=10;
        
        Movie2[] myMovies = new Movie2[movieTotal];
        
        myMovies[0] = new Movie2("The Muppets Take Manhatten", 2001, "Columbia Tristar");
        myMovies[1] = new Movie2("Mulan", 2004, "Disney");
        myMovies[2] = new Movie2("Shrek 2", 2004, "Dreamworks");
        myMovies[3] = new Movie2("The Incredibles", 2004, "Pixar");
        myMovies[4] = new Movie2("Manny McPhee", 2006, "Universal");
        myMovies[5] = new Movie2("The Curse of the Were-Rabbit", 2006, "Aardman");
        myMovies[6] = new Movie2("Ice Age", 2002, "20th Century Fox");
        myMovies[7] = new Movie2("Lilo & Stitch", 2002, "Disney");
        myMovies[8] = new Movie2("Robots", 2005, "20th Century Fox");
        myMovies[9] = new Movie2("Monsters Inc.", 2001, "Pixar");
        
        printMovies(myMovies);
        
        System.out.println("Sorting by title - ascending...");
        
        myMovies = sortTitles(myMovies, 1);
        
        printMovies(myMovies);
        
        System.out.println("Sorting by year - ascending...");
        
        myMovies = sortYears(myMovies, 1);
        
        printMovies(myMovies);
        
        System.out.println("Sorting by studio - ascending...");
        
        myMovies = sortStudios(myMovies, 1);
        
        printMovies(myMovies);
        
        System.out.println("Sorting by title - decending...");
        
        myMovies = sortTitles(myMovies, 2);
        
        printMovies(myMovies);
        
        System.out.println("Sorting by year - decending...");
        
        myMovies = sortYears(myMovies, 2);
        
        printMovies(myMovies);
        
        System.out.println("Sorting by studio - decending...");
        
        myMovies = sortStudios(myMovies, 2);
        
        printMovies(myMovies);
    }
}
