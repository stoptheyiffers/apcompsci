/**
 * Description: Extension of Homework class for MyMath objects
 *
 * @author  Brett Kind
 * @version 2015-02-28
 */
public class MyMath extends Homework
{
    public MyMath()
    {
    }

    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("Math");
    }

    public String toString()
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages.";
    }

}
