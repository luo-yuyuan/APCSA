
/**
 * Write a description of class Music here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Music
{
    private String title, singer;
    private int year;
    
    Music(String title, int year, String singer)
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
