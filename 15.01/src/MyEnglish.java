/**
 * Description: Extension of Homework class for MyEnglish objects
 *
 * @author Brett Kind
 * @version 2015-02-28
 */
public class MyEnglish extends Homework
{
    public MyEnglish()
    {
    }

    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("English");
    }

    public String toString()
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
    }
}

