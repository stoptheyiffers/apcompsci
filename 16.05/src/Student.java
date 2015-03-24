/**
 * Description: Class to handle Student type objects.
 *
 * @author  Brett Kind
 * @version 2015-03-01
 */

public class Student
{
    //int private instance variables
    private int qz1, qz2, qz3, qz4, qz5;
    private String name;

    /**
     * Student constructor
     * @param n Name for the Student
     * @param q1 Quiz 1 grade for the student
     * @param q2 Quiz 2 grade for the student
     * @param q3 Quiz 3 grade for the student
     * @param q4 Quiz 4 grade for the student
     * @param q5 Quiz 5 grade for the student
     */
    public Student(String n, int q1, int q2, int q3, int q4, int q5)
    {
        name    = n;
        qz1     = q1;
        qz2     = q2;
        qz3     = q3;
        qz4     = q4;
        qz5     = q5;
    }

    /**
     * Gets the student's name
     * @return Student's name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the student's name
     * @param n New name to replace previous name
     */
    public void setName(String n)
    {
        name = n;
    }

    /**
     * Gets quiz values for student
     * @param quizNumber Quiz number to be returned
     * @return The value of the score of quizNumber
     */
    public int getQuiz( int quizNumber)
    {
        if(quizNumber == 1)
        {
            return qz1;
        }
        else if(quizNumber == 2)
        {
            return  qz2;
        }
        else if(quizNumber == 3)
        {
            return qz3;
        }
        else if(quizNumber == 4)
        {
            return  qz4;
        }
        else
        {
            return  qz5;
        }
    }

    /**
     * Sets quiz value for student
     * @param quizNumber Number of quiz to be set
     * @param quizPercent New percentage to be set
     */
    public void setQuiz(int quizNumber, int quizPercent)
    {
        if(quizNumber == 1)
        {
            qz1 = quizPercent;
        }
        else if(quizNumber == 2)
        {
            qz2 = quizPercent;
        }
        else if(quizNumber == 3)
        {
            qz3 = quizPercent;
        }
        else if(quizNumber == 4)
        {
            qz4 = quizPercent;
        }
        else
        {
            qz5 = quizPercent;
        }
    }

    /**
     *
     * @return String containing Student's name along with their quiz scores.
     */
    public String toString()
    {
        return name + qz1 + qz2 + qz3 + qz4 + qz5;
    }

}
