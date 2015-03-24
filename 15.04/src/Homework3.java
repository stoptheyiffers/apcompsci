package assignment;

/**
 * Description: Abstract Homework class
 *
 * @author  Brett Kind
 * @version 2015-02-28
 */
public abstract class Homework3 implements Processing,
                                Comparable<Homework3>

{
    int pagesRead;
    String typeHomework;

    public Homework3()
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

    public int compareTo(Homework3 obj)
    {
        if(pagesRead < obj.getPagesRead())
            return -1;
        else if (pagesRead == obj.pagesRead)
            return 0;
        else
            return 1;
    }


}
