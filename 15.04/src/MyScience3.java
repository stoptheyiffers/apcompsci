package assignment;

/**
 * Description: Extension of Homework class for MyScience objects
 *
 * @author Brett Kind
 * @version 2015-02-28
 */
public class MyScience3 extends Homework3
{
    public MyScience3()
    {
    }

    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("Science");
    }

    public void doReading()
    {
        setPagesRead(getPagesRead()-3);
    }


    public String toString()
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
    }
}
