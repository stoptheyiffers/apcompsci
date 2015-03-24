/**
 * Description: Extension of Homework class for MyScience objects
 *
 * @author Brett Kind
 * @version 2015-02-28
 */
public class MyScience extends Homework
{
    public MyScience()
    {
    }

    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("Science");
    }

    public String toString()
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
    }
}
