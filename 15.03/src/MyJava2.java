/**
 * Description: Extension of Homework class for MyJava objects
 *
 * @author Brett Kind
 * @version 2015-02-28
 */
public class MyJava2 extends Homework2
{
    public MyJava2()
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
