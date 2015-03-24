/**
 * Description: Creates a Gradebook of Students, manipulates it, and then prints it to console.
 *
 * @author  Brett Kind
 * @version 2015-03-01
 */
import java.util.List;
import java.util.ArrayList;

public class TestStudent
{

    /**
     * Prints Gradebook out into a nice table
     * @param list ArrayList of Student-type objects
     */
    public static void printBook(List<Student> list)
    {

        System.out.printf("%15s%8s%8s%8s%8s%8s\n", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("-------------------------------------------------------------");
        for(int i = 0; i < list.size(); i++)
        {
            System.out.printf("%15s", list.get(i).getName());
            for(int index = 1; index < 6; index++)
            {
                System.out.printf("%8d", list.get(i).getQuiz(index));
            }
            System.out.println();
        }
    }


    /**
     * Replaces a student's name with another
     * @param list ArrayList of Student-type objects
     * @param previousName Student name to search for
     * @param nameChange New name for Student
     */
    public static void replaceName(List<Student> list,String previousName, String nameChange)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getName().equals(previousName))
            {
                list.get(i).setName(nameChange);
            }

        }
    }

    /**
     * Replaces a student's quiz with another quiz grade
     * @param quizNumber Quiz number to be replaced
     * @param quizPercent New quiz percentage to be added
     */
    public static void replaceQuiz(List<Student> list, String studentName, int quizNumber, int quizPercent)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getName().equals(studentName))
            {
                list.get(i).setQuiz(quizNumber, quizPercent);
            }
        }
    }

    /**
     * Replaces a student with another student
     * @param list ArrayList of Student-type objects
     * @param studentName Name of student to be replaced
     * @param newName Replacement name of student
     * @param q1 Quiz 1 of new student
     * @param q2 Quiz 2 of new student
     * @param q3 Quiz 3 of new student
     * @param q4 Quiz 4 of new student
     * @param q5 Quiz 5 of new student
     */
    public static void replaceStudent(List<Student> list, String studentName, String newName,
                                      int q1, int q2, int q3, int q4, int q5)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getName().equals(studentName))
            {
                list.get(i).setName(newName);
                list.get(i).setQuiz(1, q1);
                list.get(i).setQuiz(2, q2);
                list.get(i).setQuiz(3, q3);
                list.get(i).setQuiz(4, q4);
                list.get(i).setQuiz(5, q5);
            }
        }
    }

    /**
     * Inserts a student before another student
     * @param list ArrayList of Student-type objects
     * @param locateStudent Name of student to be located
     * @param studentName Name of new student
     * @param q1 Quiz 1 of new student
     * @param q2 Quiz 2 of new student
     * @param q3 Quiz 3 of new student
     * @param q4 Quiz 4 of new student
     * @param q5 Quiz 5 of new student
     */
    public static void insertStudent(List<Student> list,String locateStudent, String studentName,
                                     int q1, int q2, int q3, int q4, int q5)
    {
        int location = 0;

        //finding location of the locateStudent string
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getName().equals(locateStudent))
                location = i;
        }
        list.add(location, new Student(studentName, q1, q2, q3, q4, q5));
    }

    /**
     * Removes a student from the list
     * @param list ArrayList of Student-type objects
     * @param deleteName Student's name to delete
     */
    public static void deleteStudent(List<Student> list, String deleteName)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).getName().equals(deleteName))
            {
                list.remove(i);
            }

        }
    }

    public static void main(String args[])
    {
        List<Student> myClass = new ArrayList<Student>();

        //int Student objects/test scores
        myClass.add(new Student("Mark Kennedy", 70, 80, 90, 100, 90));
        myClass.add(new Student("Max Gerard", 80 , 85, 90, 85, 80));
        myClass.add(new Student("Jean Smith", 50, 79, 89, 99, 100));
        myClass.add(new Student("Betty Farm", 85, 80, 85, 88, 89));
        myClass.add(new Student("Dilbert Gamma", 70, 70 , 90, 70, 80));

        System.out.println("Starting Gradebook:\n");
        printBook(myClass);

        System.out.println("\nChanging Betty's name to Betty Boop:\n");
        replaceName(myClass, "Betty Farm", "Betty Boop");
        printBook(myClass);

        System.out.println("\nChanging Jean's quiz 1 score to 80:\n");
        replaceQuiz(myClass, "Jean Smith", 1, 80);
        printBook(myClass);

        System.out.println("\nReplacing Dilbert with Mike Kappa: 80, 80, 80, 90, 90:\n");
        replaceStudent(myClass, "Dilbert Gamma", "Mike Kappa", 80, 80, 80, 90, 90);
        printBook(myClass);

        System.out.println("\nAdd student Lily Mu before Betty Boop: 85, 90, 100, 71, 95:\n");
        insertStudent(myClass, "Betty Boop", "Lily Mu", 85, 95, 70, 0, 100);
        printBook(myClass);

        System.out.println("\nDelete student Max Gerard:\n");
        deleteStudent(myClass, "Max Gerard");
        printBook(myClass);
    }
}
