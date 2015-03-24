package assignment;

/**
 * Description: Extension of Homework class for MyJava objects
 *
 * @author Brett Kind
 * @version 2015-02-28
 */
public class MyJava3 extends Homework3
{
    public MyJava3()
    {
    }

    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("Java");
    }

    public void doReading()
    {
        setPagesRead(getPagesRead()-4);
    }


    public String toString()
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
    }
}
