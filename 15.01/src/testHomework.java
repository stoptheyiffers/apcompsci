/**
 * Description: Tester class for Homework type objects
 *
 * @author Brett Kind
 * @version 2015-02-28
 */
import java.util.ArrayList;
public class testHomework
{
    public static void main(String args[])
    {
        //create new ArrayList
        ArrayList<Homework> homework = new ArrayList<Homework>();

        homework.add(new MyMath());
        homework.add(new MyScience());
        homework.add(new MyEnglish());
        homework.add(new MyJava());

        //populate ArrayList with assignments
        //I can't think of another way?
        homework.get(0).createAssignment(4);
        homework.get(1).createAssignment(6);
        homework.get(2).createAssignment(10);
        homework.get(3).createAssignment(5);

        //output data
        for (Homework output : homework)
        {
            System.out.println(output);
        }


    }
}
