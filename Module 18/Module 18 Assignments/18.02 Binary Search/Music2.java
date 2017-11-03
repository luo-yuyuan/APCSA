
/**
 * A class used to create Music2 objects
 * 
 * Matthew Guthrie
 * 6/20/17
 */
public class Music2
{
    private String title, singer;
    private int year;
    
    Music2(String title, int year, String singer)
    {
        this.title = title;
        this.year = year;
        this.singer = singer;
    }
    
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    
    public String getSinger()
    {
        return singer;
    }
    public void setSinger(String singer)
    {
        this.singer = singer;
    }
    
    public String toString()
    {
        return String.format("%s, %s, %s", title, year, singer);
    }
}
