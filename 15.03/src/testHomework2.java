/**
 * Description: Tester class for Homework type objects
 *
 * @author Brett Kind
 * @version 2015-02-28
 */
import java.util.ArrayList;

public class testHomework2
{
    public static void main(String args[])
    {
        //create new ArrayList
        ArrayList<Homework2> homework2 = new ArrayList<Homework2>();

        homework2.add(new MyMath2());
        homework2.add(new MyScience2());
        homework2.add(new MyEnglish2());
        homework2.add(new MyJava2());

        //populate ArrayList with assignments
        homework2.get(0).createAssignment(4);
        homework2.get(1).createAssignment(6);
        homework2.get(2).createAssignment(10);
        homework2.get(3).createAssignment(5);

        //output data
        for (Homework2 output : homework2)
        {
            System.out.println("Before reading:");
            System.out.println(output);
            System.out.println("After reading:");
            output.doReading();
            System.out.println(output);
        }


    }
}
