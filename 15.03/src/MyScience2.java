/**
 * Description: Extension of Homework class for MyScience objects
 *
 * @author Brett Kind
 * @version 2015-02-28
 */
public class MyScience2 extends Homework2
{
    public MyScience2()
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
