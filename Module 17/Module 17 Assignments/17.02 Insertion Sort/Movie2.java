
/**
 * Class for making Movie2 Objects
 * 
 * Matthew Guthrie
 * 6/20/17
 */
public class Movie2
{
    private String title, studio;
    private int year;
    
    Movie2(String title, int year, String studio)
    {
        this.title = title;
        this.year = year;
        this.studio = studio;
    }
    
    public String getTitle()
    {
        return title;
    }
    public int getYear()
    {
        return year;
    }
    public String getStudio()
    {
        return studio;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public void setStudio(String title)
    {
        this.studio = studio;
    }
    
    public String toString()
    {
        return title + ", " + Integer.toString(year) + ", " + studio;
    }
}
