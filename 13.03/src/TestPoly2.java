/**
 *
 * Description: Outputs center of a Circle/Circle type objects
 *
 * @author  Brett Kind
 * @version 2015-02-21
 *
 */
import java.util.ArrayList;

public class TestPoly2
{
    public static void showCenter(Circle2 c)
    {
        System.out.println("For " + c + " " + c.center());
    }

    public static void main(String args[])
    {
        ArrayList<Circle2> circles = new ArrayList<Circle2>();

        circles.add( new Circle2(2, 4, 6));
        circles.add( new Cylinder2(10, 15, 20, 25));
        circles.add( new Oval2(25, 10, 5, 10));
        circles.add( new OvalCylinder2(40, 10, 5, 10, 25));

        for(Circle2 c : circles)
        {
            showCenter(c);
        }
    }
}
