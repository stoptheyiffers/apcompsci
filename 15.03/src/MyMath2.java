/**
 * Description: Extension of Homework class for MyMath objects
 *
 * @author  Brett Kind
 * @version 2015-02-28
 */
public class MyMath2 extends Homework2
{
    public MyMath2()
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
