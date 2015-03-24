package assignment;

/**
 * Description: Extension of Homework class for MyMath objects
 *
 * @author  Brett Kind
 * @version 2015-02-28
 */
public class MyMath3 extends Homework3
{
    public MyMath3()
    {
    }

    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("Math");
    }

    public void doReading()
    {
       setPagesRead(getPagesRead()-2);
    }

    public String toString()
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
    }

}
