package Assignments;

/**
 * Description: Sorts an Array of Movies by Title, Year, and Studio.
 *
 * @author  Brett Kind
 * @version 2015-03-07
 */
public class TestMovie2
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
        Movie2[] dest = new Movie2[ movies.length ];

        // ascending sort
        if(option == 1) {
            for (int i = 0; i < movies.length; i++) {
                Movie2 next = movies[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getStudio().compareTo(dest[k - 1].getStudio()) > 0) {
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }

                dest[insertindex] = next;
            }
        }

        // descending sort
        else if(option == 2)
        {
            for (int i = 0; i < movies.length; i++) {
                Movie2 next = movies[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getStudio().compareTo(dest[k - 1].getStudio()) < 0) {
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }

                dest[insertindex] = next;
            }
        }
        return dest;
    }

    /**
     * Sorts the Movies by Year
     * @param movies Array of Movies
     * @param option 1 for ascending, 2 for descending sort
     * @return Array of Movies sorted by Year either ascending or descending
     */
    public static Movie2[] sortYears(Movie2[] movies, int option)
    {
        Movie2[] dest = new Movie2[ movies.length ];

        // ascending sort
        if(option == 1) {
            for (int i = 0; i < movies.length; i++) {
                Movie2 next = movies[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getYear() > dest[k - 1].getYear()) {
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }

                dest[insertindex] = next;
            }
        }

        // descending sort
        else if(option == 2)
        {
            for (int i = 0; i < movies.length; i++) {
                Movie2 next = movies[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getYear() < dest[k - 1].getYear()) {
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }

                dest[insertindex] = next;
            }
        }
        return dest;
    }

    /**
     * Sorts the Movies by Title
     * @param movies Array of Movies
     * @param option 1 for ascending, 2 for descending sort
     * @return Array of Movies sorted by Title either ascending or descending
     */
    public static Movie2[] sortTitles(Movie2[] movies, int option)
    {
        Movie2[] dest = new Movie2[ movies.length ];

        // ascending sort
        if(option == 1) {
            for (int i = 0; i < movies.length; i++) {
                Movie2 next = movies[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getTitle().compareTo(dest[k - 1].getTitle()) > 0) {
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }

                dest[insertindex] = next;
            }
        }

        // descending sort
        else if(option == 2)
        {
            for (int i = 0; i < movies.length; i++) {
                Movie2 next = movies[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getTitle().compareTo(dest[k - 1].getTitle()) < 0) {
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }

                dest[insertindex] = next;
            }
        }
        return dest;
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

        System.out.println("\nSorted by Title - ascending:");
        printMovies(sortTitles(myMovies, 1));

        System.out.println("\nSorted by Year - descending:");
        printMovies(sortYears(myMovies, 2));

        System.out.println("\nSorted by Studio - ascending:");
        printMovies(sortStudios(myMovies, 1));
    }
}
