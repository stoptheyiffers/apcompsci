package assignment; /**
 * Description: Tester class for Homework type objects
 *
 * @author Brett Kind
 * @version 2015-02-28
 */
import java.util.ArrayList;

public class testHomework3
{
    public static void main(String args[])
    {
        //create new ArrayList
        ArrayList<Homework3> homework3 = new ArrayList<Homework3>();

        homework3.add(new MyMath3());
        homework3.add(new MyScience3());
        homework3.add(new MyEnglish3());
        homework3.add(new MyJava3());

        //populate ArrayList with assignments
        homework3.get(0).createAssignment(4);
        homework3.get(1).createAssignment(6);
        homework3.get(2).createAssignment(4);
        homework3.get(3).createAssignment(5);

        //output data
        for (Homework3 output : homework3)
        {
            System.out.println(output);
        }

        if(homework3.get(0).compareTo(homework3.get(2)) == 0)
            System.out.println("The homework for " + homework3.get(0).getTypeHomework() + " and " + homework3.get(2).getTypeHomework() + " are the same number of pages.");
        else
            System.out.println("The homework for " + homework3.get(0).getTypeHomework() + " and " + homework3.get(2).getTypeHomework() + " are not the same number of pages.");
    }
}
