package Assignments;

/**
 * Description: Sorts Movie array using Merge sort by Title, Year, and Studio
 *
 * @author  Brett Kind
 * @version 2015-03-08
 */
public class TestMovie4
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
     * @param low low value
     * @param high high value
     * @return Array of Movies sorted by Studio either ascending or descending
     */
    public static Movie2[] sortStudios(Movie2[] movies, int low, int high)
    {
        if ( low == high )
            return movies;

        int mid = ( low + high ) / 2;

        sortStudios(movies, low, mid);
        sortStudios(movies, mid + 1, high);

        return mergeStudios(movies, low, mid, high);
    }

    /**
     *
     * @param movies Array of Movies
     * @param low low value
     * @param mid mid value
     * @param high high value
     * @return Merged + Sorted Array
     */
    public static Movie2[] mergeStudios( Movie2[] movies, int low, int mid, int high )
    {
        Movie2[] temp = new Movie2[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while ( i <= mid || j <= high )
        {
            if ( i > mid )
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            else if ( j > high )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else if ( movies[ i ].getStudio().compareTo(movies[j].getStudio()) < 0 )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            n++;
        }

        for ( int k = low ; k <= high ; k++ )
            movies[ k ] = temp[ k - low ];

        return movies;
    }

    /**
     * Sorts the Movies by Year
     * @param movies Array of Movies
     * @param low low value
     * @param high high value
     * @return Array of Movies sorted by Year either ascending or descending
     */
    public static Movie2[] sortYears(Movie2[] movies, int low, int high)
    {
        if ( low == high )
            return movies;

        int mid = ( low + high ) / 2;

        sortYears(movies, low, mid);
        sortYears(movies, mid + 1, high);

        return mergeYears(movies, low, mid, high);
    }

    /**
     *
     * @param movies Array of Movies
     * @param low low value
     * @param mid mid value
     * @param high high value
     * @return Merged + Sorted Array
     */
    public static Movie2[] mergeYears(Movie2[] movies, int low, int mid, int high)
    {
        Movie2[] temp = new Movie2[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while ( i <= mid || j <= high )
        {
            if ( i > mid )
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            else if ( j > high )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else if ( movies[ i ].getYear() > movies[ j ].getYear() )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            n++;
        }

        for ( int k = low ; k <= high ; k++ )
            movies[ k ] = temp[ k - low ];

        return movies;
    }

    /**
     * Sorts the Movies by Title
     * @param movies Array of Movies
     * @param low low value
     * @param high high value
     * @return Array of Movies sorted by Title either ascending or descending
     */
    public static Movie2[] sortTitles(Movie2[] movies, int low, int high)
    {
        if ( low == high )
            return movies;

        int mid = ( low + high ) / 2;

        sortTitles(movies, low, mid);
        sortTitles(movies, mid + 1, high);

        return mergeTitles(movies, low, mid, high);
    }

    /**
     *
     * @param movies Array of Movies
     * @param low low value
     * @param mid mid value
     * @param high high value
     * @return Merged + Sorted Array
     */
    public static Movie2[] mergeTitles( Movie2[] movies, int low, int mid, int high )
    {
        Movie2[] temp = new Movie2[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while ( i <= mid || j <= high )
        {
            if ( i > mid )
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            else if ( j > high )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else if ( movies[ i ].getTitle().compareTo(movies[j].getTitle()) < 0 )
            {
                temp[ n ] = movies[ i ];
                i++;
            }
            else
            {
                temp[ n ] = movies[ j ];
                j++;
            }
            n++;
        }

        for ( int k = low ; k <= high ; k++ )
            movies[ k ] = temp[ k - low ];

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

        System.out.println("\nSorted by Title - ascending:");
        printMovies(sortTitles(myMovies, 0, myMovies.length-1));

        System.out.println("\nSorted by Year - descending:");
        printMovies(sortYears(myMovies, 0, myMovies.length-1));


        System.out.println("\nSorted by Studio - ascending:");
        printMovies(sortStudios(myMovies, 0, myMovies.length-1));
    }
}
