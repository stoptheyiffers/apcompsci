package Assignments;

/**
 * Description: Sorts an Array of Movies by Title, Year, and Studio.
 *
 * @author  Brett Kind
 * @version 2015-03-08
 */
public class TestMovie3
{
    /**
     * Prints out the Array of Movies
     * @param movies Array of Movies
     */
    public static void printMovies(Movie2[] movies)
    {
        for(int i = 0; i < movies.length; i++)
            System.out.println(movies[i]);
    }

    /**
     * Sorts the Movies by Studio
     * @param movies Array of Movies
     * @param option 1 for ascending, 2 for descending sort
     * @return Array of Movies sorted by Studio either ascending or descending
     */
    public static Movie2[] sortStudios(Movie2[] movies, int option)
    {
        int i;
        int k;
        int posmax;
        Movie2 temp;

        if(option == 1) {
            for (i = movies.length - 1; i >= 0; i--) {
                posmax = 0;
                for (k = 0; k <= i; k++) {
                    if (movies[k].getStudio().compareTo(movies[posmax].getStudio()) > 0)
                        posmax = k;
                }

                temp = movies[i];
                movies[i] = movies[posmax];
                movies[posmax] = temp;
            }
        }
        else if(option == 2)
        {
            for (i = movies.length - 1; i >= 0; i--) {
                posmax = 0;
                for (k = 0; k <= i; k++) {
                    if (movies[k].getStudio().compareTo(movies[posmax].getStudio()) < 0)
                        posmax = k;
                }

                temp = movies[i];
                movies[i] = movies[posmax];
                movies[posmax] = temp;
            }
        }
        return movies;
    }

    /**
     * Sorts the Movies by Year
     * @param movies Array of Movies
     * @param option 1 for ascending, 2 for descending sort
     * @return Array of Movies sorted by Year either ascending or descending
     */
    public static Movie2[] sortYears(Movie2[] movies, int option)
    {
        int i;
        int k;
        int posmax;
        Movie2 temp;

        // ascending sort
        if(option == 1) {
            for ( i = movies.length - 1 ; i >= 0 ; i-- ) {
                posmax = 0;
                for (k = 0; k <= i; k++) {
                    if (movies[k].getYear() > movies[posmax].getYear())
                        posmax = k;
                }

                temp = movies[i];
                movies[i] = movies[posmax];
                movies[posmax] = temp;
            }
        }

        // descending sort
        else if(option == 2)
        {
            for ( i = movies.length - 1 ; i >= 0 ; i-- ) {
                posmax = 0;
                for (k = 0; k <= i; k++) {
                    if (movies[k].getYear() < movies[posmax].getYear())
                        posmax = k;
                }

                temp = movies[i];
                movies[i] = movies[posmax];
                movies[posmax] = temp;
            }
        }
        return movies;
    }

    /**
     * Sorts the Movies by Title
     * @param movies Array of Movies
     * @param option 1 for ascending, 2 for descending sort
     * @return Array of Movies sorted by Title either ascending or descending
     */
    public static Movie2[] sortTitles(Movie2[] movies, int option)
    {

        int i;
        int k;
        int posmax;
        Movie2 temp;

        // ascending sort
        if(option == 1) {
            for (i = movies.length - 1; i >= 0; i--) {
                posmax = 0;
                for (k = 0; k <= i; k++) {
                    if (movies[k].getTitle().compareTo(movies[posmax].getTitle()) > 0)
                        posmax = k;
                }

                temp = movies[i];
                movies[i] = movies[posmax];
                movies[posmax] = temp;
            }
        }

        // descending sort
        else if(option == 2)
        {
            for (i = movies.length - 1; i >= 0; i--) {
                posmax = 0;
                for (k = 0; k <= i; k++) {
                    if (movies[k].getTitle().compareTo(movies[posmax].getTitle()) < 0)
                        posmax = k;
                }

                temp = movies[i];
                movies[i] = movies[posmax];
                movies[posmax] = temp;
            }
        }
        return movies;
    }

    public static void main(String[] args)
    {
        Movie2[] myMovies = new Movie2[10];
        myMovies[0] = new Movie2("The Muppets Take Manhattan", 2001, "Columbia Tristar");
        myMovies[1] = new Movie2("Mulan Special Edition", 2004, "Disney");
        myMovies[2] = new Movie2("Shrek 2", 2004, "Dreamworks");
        myMovies[3] = new Movie2("The Incredibles", 2004, "Pixar");
        myMovies[4] = new Movie2("Nanny McPhee", 2006, "Universal");
        myMovies[5] = new Movie2("The Curse of the Were-Rabbit", 2006, "Aardman");
        myMovies[6] = new Movie2("Ice Age", 2002, "20th Century Fox");
        myMovies[7] = new Movie2("Lilo & Stitch", 2002, "Disney");
        myMovies[8] = new Movie2("Robots", 2005, "20th Century Fox");
        myMovies[9] = new Movie2("Monsters Inc.", 2001, "Pixar");

        System.out.println("Before Sorting:");
        printMovies(myMovies);

        System.out.println("\nSorted by Title - descending:");
        printMovies(sortTitles(myMovies, 2));

        System.out.println("\nSorted by Year - descending:");
        printMovies(sortYears(myMovies, 2));


        System.out.println("\nSorted by Studio - ascending:");
        printMovies(sortStudios(myMovies, 1));
    }
}
