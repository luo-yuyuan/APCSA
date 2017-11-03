
/**
 * Class for testing Movie4 objects and for sorting them
 * 
 * Matthew Guthrie
 * 6/20/17
 */
public class TestMovie4
{
    
    public static void printMovies(Movie4[] m)
    {
        System.out.println("Title, Year, Studio");
        
        for(Movie4 n : m)
        {
            System.out.println(n.toString());
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
    public static void sortTitles(Movie4[] m, int low, int high, int p)
    {
        if(low == high)
        {
            return;
        }
        else
        {
            int mid = (low + high) /2;
            
            sortTitles(m, low, mid, p);
            sortTitles(m, mid + 1, high, p);
            
            mergeTitles(m, low, mid, high, p);
        }
    }
    public static void mergeTitles(Movie4[] m, int low, int mid, int high, int p)
    {
        if(p==1)
        {
            Movie4[] temp = new Movie4[high-low+1];
            
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
                else if(m[i].getTitle().compareTo(m[j].getTitle())<0)
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
            Movie4[] temp = new Movie4[high-low+1];
            
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
                else if(m[i].getTitle().compareTo(m[j].getTitle())>0)
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
    }
    
    
    public static void sortYears(Movie4[] m, int low, int high, int p)
    {
        if(low == high)
        {
            return;
        }
        else
        {
            int mid = (low + high) /2;
            
            sortYears(m, low, mid, p);
            sortYears(m, mid + 1, high, p);
            
            mergeYears(m, low, mid, high, p);
        }
    }
    public static void mergeYears(Movie4[] m, int low, int mid, int high, int p)
    {
        if(p==1)
        {
            Movie4[] temp = new Movie4[high-low+1];
            
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
                else if(m[i].getYear() < m[j].getYear())
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
            Movie4[] temp = new Movie4[high-low+1];
            
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
                else if(m[i].getYear() > m[j].getYear())
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
    }
    
    
    public static void sortStudios(Movie4[] m, int low, int high, int p)
    {
        if(low == high)
        {
            return;
        }
        else
        {
            int mid = (low + high) /2;
            
            sortStudios(m, low, mid, p);
            sortStudios(m, mid + 1, high, p);
            
            mergeStudios(m, low, mid, high, p);
        }
    }
    public static void mergeStudios(Movie4[] m, int low, int mid, int high, int p)
    {
        if(p==1)
        {
            Movie4[] temp = new Movie4[high-low+1];
            
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
                else if(m[i].getStudio().compareTo(m[j].getStudio())<0)
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
            Movie4[] temp = new Movie4[high-low+1];
            
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
                else if(m[i].getStudio().compareTo(m[j].getStudio())>0)
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
    }
    
    
    
    public static void main(String args[])
    {
        int movieTotal=10;
        
        Movie4[] myMovies = new Movie4[movieTotal];
        
        myMovies[0] = new Movie4("The Muppets Take Manhatten", 2001, "Columbia Tristar");
        myMovies[1] = new Movie4("Mulan Special Edition", 2004, "Disney");
        myMovies[2] = new Movie4("Shrek 2", 2004, "Dreamworks");
        myMovies[3] = new Movie4("The Incredibles", 2004, "Pixar");
        myMovies[4] = new Movie4("Nanny McPhee", 2006, "Universal");
        myMovies[5] = new Movie4("The Curse of the Were-Rabbit", 2006, "Aardman");
        myMovies[6] = new Movie4("Ice Age", 2002, "20th Century Fox");
        myMovies[7] = new Movie4("Lilo & Stitch", 2002, "Disney");
        myMovies[8] = new Movie4("Robots", 2005, "20th Century Fox");
        myMovies[9] = new Movie4("Monsters Inc.", 2001, "Pixar");
        
        printMovies(myMovies);
        
        System.out.println("Sorting by title - ascending...");
        
        sortTitles(myMovies, 0,  myMovies.length - 1, 1);
        
        printMovies(myMovies);
        
        System.out.println("Sorting by year - ascending...");
        
        sortYears(myMovies, 0,  myMovies.length - 1, 1);
        
        printMovies(myMovies);
        
        System.out.println("Sorting by studio - ascending...");
        
        sortStudios(myMovies, 0,  myMovies.length - 1, 1);
        
        printMovies(myMovies);
        
        System.out.println("Sorting by title - decending...");
        
        sortTitles(myMovies, 0,  myMovies.length - 1, 2);
        
        printMovies(myMovies);
        
        System.out.println("Sorting by year - decending...");
        
        sortYears(myMovies, 0,  myMovies.length - 1, 2);
        
        printMovies(myMovies);
        
        System.out.println("Sorting by studio - decending...");
        
        sortStudios(myMovies, 0, myMovies.length - 1 , 2);
        
        printMovies(myMovies);
    }
}
