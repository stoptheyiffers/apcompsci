package Music;

/**
 * Description: Class for Music.Music type objects
 *
 * @author  Brett Kind
 * @version 2015-03-14
 */
public class Music
{
    private String title;
    private int year;
    private String singer;

    public Music(String t, int y, String s)
    {
        title = t;
        year = y;
        singer = s;
    }

    public String getTitle()
    {
        return title;
    }

    public int getYear()
    {
        return year;
    }

    public String getSinger()
    {
        return singer;
    }

    public String toString()
    {
        return title + ", " + year + ", " + singer;
    }
}
