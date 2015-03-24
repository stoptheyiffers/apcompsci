package Music;

/**
 * Description: Searches for song titles, years, and singers using a binary search.
 *
 * @author  Brett Kind
 * @version 2015-03-21
 */
public class TestMusic2
{
    /**
     * Prints array of Music objects to the console
     * @param music Array of Music type objects
     */
    public static void printMusic(Music[] music)
    {
        for(Music musics : music)
        {
            System.out.println(musics);
        }
    }

    /**
     * Sorts the Array of Music type objects by Title
     * @param music Array of Music type objects
     */
    public static void selectionSort(Music[] music)
    {
        int i, k, posmax;
        Music temp;

        for (i = music.length - 1; i >= 0; i--) {
            posmax = 0;
            for (k = 0; k <= i; k++) {
                if (music[k].getTitle().compareTo(music[posmax].getTitle()) > 0)
                    posmax = k;
            }

            temp = music[i];
            music[i] = music[posmax];
            music[posmax] = temp;
        }
    }

    /**
     * Searches through the Array of Music objects for a Title
     * @param musics Array of Music type objects
     * @param toFind Title of the song to find
     * @return value of the location in the array of toFind
     */
    public static int binarySearch(Music[] musics, String toFind )
    {
        int high = musics.length;
        int low = -1;
        int probe;

        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( musics[probe].getTitle().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        if ( (low >= 0) && (musics[low].getTitle().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;
    }

    /**
     * Searches through the Array of Music objects for a Year
     * @param music Array of Music type objects
     * @param locate Year to locate in the array
     */
    public static void searchYear(Music[] music, int locate)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < music.length; i++)
            if (music[i].getYear() == locate)
            {
                System.out.println(music[i]);
                found++;
                if (found == music.length)
                    break;
            }
        if (found == 0)
        {
            System.out.println(locate + " is not in the library");
        }
        System.out.println("There were " + found + " listings for " + locate + "\n");
    }

    /**
     * Searches through the Array of Music objects for a Singer
     * @param music Array of Music type objects
     * @param locate Name of Singer to locate
     */
    public static void searchSinger(Music[] music, String locate)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < music.length; i++)
            if (music[i].getSinger().equals(locate))
            {
                System.out.println(music[i]);
                found++;
                if (found == music.length)
                    break;
            }
        if (found == 0)
        {
            System.out.println(locate + " is not in the library");
        }
        System.out.println("There were " + found + " listings for " + locate + "\n");
    }

    public static void main(String[] args)
    {
        int test;
        Music[] myMusic = new Music[10];

        myMusic[0] = new Music("Pieces of You", 1994, "Jewel");
        myMusic[1] = new Music("Jagged Little Pill", 1995, "Alanis Morissette");
        myMusic[2] = new Music("What If It's You", 1995, "Reba McEntire");
        myMusic[3] = new Music("Misunderstood", 2001, "Pink");
        myMusic[4] = new Music("Laundry Service", 2001, "Shakira");
        myMusic[5] = new Music("Taking the Long Way", 2006, "Dixie Chicks");
        myMusic[6] = new Music("Under My Skin", 2002, "Avril Lavigne");
        myMusic[7] = new Music("Let Go", 2002, "Avril Lavigne");
        myMusic[8] = new Music("Let It Go", 2007, "Tim McGraw");
        myMusic[9] = new Music("White Flag", 2004, "Dido");

        System.out.println("Music Library:\n--------------");
        printMusic(myMusic);
        System.out.println();

        //sort for binary search
        selectionSort(myMusic);

        //binary searches
        System.out.println("Search - Title - Misunderstood");
        test = binarySearch(myMusic, "Misunderstood");
        if (test != -1)
            System.out.println("Found: " + myMusic[test] + "\n");
        else
            System.out.println("Not found. \n" );

        System.out.println("Search - Title - Under Paid");
        test = binarySearch(myMusic, "Under Paid");
        if (test != -1)
            System.out.println("Found: " + myMusic[test] + "\n");
        else
            System.out.println("Not found. \n" );
        //end of binary searches

        System.out.println("Search - Year - 2005");
        searchYear(myMusic, 2005);

        System.out.println("\nSearch - Year - 2006");
        searchYear(myMusic, 2006);

        System.out.println("\nSearch - Singer - Darth Maul");
        searchSinger(myMusic, "Darth Maul");

        System.out.println("\nSearch - Singer - Dido");
        searchSinger(myMusic, "Dido");

    }
}
