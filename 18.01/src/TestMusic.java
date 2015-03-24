package Music;

/**
 * Description: Searches for song titles, years, and singers using a sequential search.
 *
 * @author  Brett Kind
 * @version 2015-03-14
 */
public class TestMusic
{
    public static void printMusic(Music[] music)
    {
        for(Music musics : music)
        {
            System.out.println(musics);
        }
    }

    public static void searchTitle(Music[] music, String locate)
    {
        int found = -1;

        for(int i = 0; i < music.length; i++)
            if (music[i].getTitle().equals(locate))
            {
                found = i;
                break;
            }
        if (found != -1)
        {  //found the song
            System.out.println("We found " + locate + " in the library: ");
            System.out.println(music[found] + "\n");
        }
        else
            System.out.println(locate + " is not in the library\n");
    }

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

        System.out.println("Music.Music Library:\n--------------");
        printMusic(myMusic);

        System.out.println("\nSearch - Title - Let Go");
        searchTitle(myMusic, "Let Go");

        System.out.println("Search - Title - Some Day");
        searchTitle(myMusic, "Some Day");

        System.out.println("Search - Year - 2001");
        searchYear(myMusic, 2001);

        System.out.println("Search - Year - 2003");
        searchYear(myMusic, 2003);

        System.out.println("Search - Singer - Avril Lavigne");
        searchSinger(myMusic, "Avril Lavigne");

        System.out.println("Search - Singer - Tony Curtis");
        searchSinger(myMusic, "Tony Curtis");

    }
}
