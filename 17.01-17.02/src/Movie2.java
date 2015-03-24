package Assignments;

/**
 * Description: Class for Assignments.Movie2 type objects.
 *
 * @author  Brett Kind
 * @version 2015-03-07
 */
public class Movie2
{
    private String title, studio;
    private int year;

    /**
     * Constructor for Assignments.Movie2 type objects
     * @param t Movie Title
     * @param y Movie Year
     * @param s Movie Studio
     */
    public Movie2(String t, int y, String s)
    {
        title = t;
        studio = s;
        year = y;
    }

    /**
     *
     * @return Movie's Title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     *
     * @return Movie's Studio
     */
    public String getStudio()
    {
        return studio;
    }

    /**
     *
     * @return Year the Movie was released
     */
    public int getYear()
    {
        return year;
    }

    public String toString()
    {
        return title + ", " + year + ", " + studio;
    }
}
