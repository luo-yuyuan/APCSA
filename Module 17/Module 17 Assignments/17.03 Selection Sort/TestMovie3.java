
/**
 * Class for testing Movie3 objects and for sorting them
 * 
 * Matthew Guthrie
 * 6/20/17
 */
public class TestMovie3
{
    
    public static void printMovies(Movie3[] m)
    {
        System.out.println("Title, Year, Studio");
        
        for(Movie3 n : m)
        {
            System.out.println(n.toString());
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
    public static Movie3[] sortTitles(Movie3[] m, int p)
    {
        if(p==1)
        {
            for(int i=0; i<m.length; i++)
            {
                int store = 0;
                Movie3 first = m[i];
                for(int j=1; j<m.length-i; j++)
                {
                    if(m[j-1].getTitle().compareTo(m[j].getTitle())>0)
                    {
                        Movie3 temp = m[j-1];
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
                Movie3 first = m[i];
                for(int j=1; j<m.length-i; j++)
                {
                    if(m[j-1].getTitle().compareTo(m[j].getTitle())<0)
                    {
                        Movie3 temp = m[j-1];
                        m[j-1] = m[j];
                        m[j] = temp;
                    }
                    
                    
                }
            }
        }
        return m;
    }
    
    
    public static Movie3[] sortYears(Movie3[] m, int p)
    {
        if(p==1)
        {
            for(int i=0; i<m.length; i++)
            {
                int store = 0;
                Movie3 first = m[i];
                for(int j=1; j<m.length-i; j++)
                {
                    if(m[j-1].getYear()>m[j].getYear())
                    {
                        Movie3 temp = m[j-1];
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
                Movie3 first = m[i];
                for(int j=1; j<m.length-i; j++)
                {
                    if(m[j-1].getYear()>m[j].getYear())
                    {
                        Movie3 temp = m[j-1];
                        m[j-1] = m[j];
                        m[j] = temp;
                    }
                    
                    
                }
            }
        }
        return m;
    }
    
    
    public static Movie3[] sortStudios(Movie3[] m, int p)
    {
        if(p==1)
        {
            for(int i=0; i<m.length; i++)
            {
                int store = 0;
                Movie3 first = m[i];
                for(int j=1; j<m.length-i; j++)
                {
                    if(m[j-1].getStudio().compareTo(m[j].getStudio())>0)
                    {
                        Movie3 temp = m[j-1];
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
                Movie3 first = m[i];
                for(int j=1; j<m.length-i; j++)
                {
                    if(m[j-1].getStudio().compareTo(m[j].getStudio())<0)
                    {
                        Movie3 temp = m[j-1];
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
        int movieTotal=10;
        
        Movie3[] myMovies = new Movie3[movieTotal];
        
        myMovies[0] = new Movie3("The Muppets Take Manhatten", 2001, "Columbia Tristar");
        myMovies[1] = new Movie3("Mulan Special Edition", 2004, "Disney");
        myMovies[2] = new Movie3("Shrek 2", 2004, "Dreamworks");
        myMovies[3] = new Movie3("The Incredibles", 2004, "Pixar");
        myMovies[4] = new Movie3("Nanny McPhee", 2006, "Universal");
        myMovies[5] = new Movie3("The Curse of the Were-Rabbit", 2006, "Aardman");
        myMovies[6] = new Movie3("Ice Age", 2002, "20th Century Fox");
        myMovies[7] = new Movie3("Lilo & Stitch", 2002, "Disney");
        myMovies[8] = new Movie3("Robots", 2005, "20th Century Fox");
        myMovies[9] = new Movie3("Monsters Inc.", 2001, "Pixar");
        
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
