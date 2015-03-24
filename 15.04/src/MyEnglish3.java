package assignment;

/**
 * Description: Extension of Homework class for MyEnglish objects
 *
 * @author Brett Kind
 * @version 2015-02-28
 */
public class MyEnglish3 extends Homework3
{
    public MyEnglish3()
    {
    }

    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("English");
    }

    public void doReading()
    {
        setPagesRead(getPagesRead()-1);
    }


    public String toString()
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
    }
}

