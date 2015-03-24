/**
 * Description: Extension of Homework class for MyJava objects
 *
 * @author Brett Kind
 * @version 2015-02-28
 */
public class MyJava extends Homework
{
    public MyJava()
    {
    }

    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("Java");
    }

    public String toString()
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
    }
}
