/**
 * Description: Abstract Homework class
 *
 * @author  Brett Kind
 * @version 2015-02-28
 */
public abstract class Homework
{
    int pagesRead;
    String typeHomework;

    public Homework()
    {
        pagesRead = 0;
        typeHomework = "none";
    }

    public abstract void createAssignment(int p);

    public void setTypeHomework(String a)
    {
        typeHomework = a;
    }

    public String getTypeHomework()
    {
        return typeHomework;
    }

    public void setPagesRead(int a)
    {
        pagesRead = a;
    }

    public int getPagesRead()
    {
        return pagesRead;
    }
}
