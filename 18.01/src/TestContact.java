/**
 * Description: Demonstration of multiple search algorithms using
 * an Array of Contact type objects
 *
 * @author  Brett Kind
 * @version 2015-03-21
 */
public class TestContact
{
    /**
     * Prints contents of Array to console
     * @param contacts Array of Contact type objects
     */
    public static void printContacts(Contact[] contacts)
    {
        for(Contact contact : contacts)
        {
            System.out.println(contact);
        }
    }

    /**
     * Sorts the Array of Contact type objects by Name
     * @param contacts Array of Contact type objects
     */
    public static void selectionSort(Contact[] contacts)
    {
        int i, k, posmax;
        Contact temp;

        for (i = contacts.length - 1; i >= 0; i--) {
            posmax = 0;
            for (k = 0; k <= i; k++) {
                if (contacts[k].getName().compareTo(contacts[posmax].getName()) > 0)
                    posmax = k;
            }

            temp = contacts[i];
            contacts[i] = contacts[posmax];
            contacts[posmax] = temp;
        }
    }

    /**
     * Searches through the Array of Contact objects for a Person's Name
     * @param contacts Array of Contact type objects
     * @param toFind Name of the person to find
     * @return value of the location in the array of toFind
     */
    public static int findByName(Contact[] contacts, String toFind )
    {
        int high = contacts.length;
        int low = -1;
        int probe;

        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( contacts[probe].getName().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        if ( (low >= 0) && (contacts[low].getName().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;
    }

    /**
     * Searches through the Array of Contact objects for a Person's Relation
     * @param contacts Array of Contact type objects
     * @param locate Value of Relation to locate
     */
    public static void findByRelation(Contact[] contacts, String locate)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < contacts.length; i++)
            if (contacts[i].getRelation().toLowerCase().equals(locate.toLowerCase()))
            {
                System.out.println(contacts[i]);
                found++;
                if (found == contacts.length)
                    break;
            }
        System.out.println("There were " + found + " listings for " + locate + "\n");
    }

    /**
     * Searches through the Array of Contact objects for a Person's Bday
     * @param contacts Array of Contact type objects
     * @param locate Value of Bday to locate
     */
    public static void findByBMonth(Contact[] contacts, String locate)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < contacts.length; i++)
            if (contacts[i].getBday().toLowerCase().substring(0,3).equals(locate.toLowerCase()))
            {
                System.out.println(contacts[i]);
                found++;
                if (found == contacts.length)
                    break;
            }
        System.out.println("There were " + found + " listings for " + locate + "\n");
    }

    /**
     * Searches through the Array of Contact objects for a Person's Phone Number
     * @param contacts Array of Contact type objects
     * @param locate Value of Phone Number to locate
     */
    public static void findByPhone(Contact[] contacts, String locate)
    {
        int found = 0;

        System.out.println("Find results: ");
        for(int i = 0; i < contacts.length; i++)
            if (contacts[i].getPhone().equals(locate))
            {
                System.out.println(contacts[i]);
                found++;
                if (found == contacts.length)
                    break;
            }
        System.out.println("There were " + found + " listings for " + locate + "\n");
    }

    /**
     * Searches through the Array of Contact objects for a Person's Email
     * @param contacts Array of Contact type objects
     * @param toFind Name of the person to find
     * @return value of the Email in the array of toFind
     */
    public static int findByEmail(Contact[] contacts, String toFind )
    {
        int high = contacts.length;
        int low = -1;
        int probe;

        while ( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if ( contacts[probe].getEmail().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        if ( (low >= 0) && (contacts[low].getEmail().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;
    }

    public static void main(String[] args)
    {
        int bool;
        Contact[] myContacts = new Contact[6];

        myContacts[0] = new Contact("John Carter", "brother", "Mar 3", "(342) 555-7069", "jcarter@carter.com");
        myContacts[1] = new Contact("Elise Carter" , "mom", "Apr 19", "(342) 555-7011", "carterMom@cater.com");
        myContacts[2] = new Contact("Ellie Carter", "me", "Jun 10", "(342) 555-8102", "ecarter@carter.com");
        myContacts[3] = new Contact("Sue Ellen", "friend", "Mar 9", "(341) 555-9182", "susieE@hotmail.com");
        myContacts[4] = new Contact("Frank Carter", "dad", "Dec 1", "(342) 555-7011", "carterDad@carter.com");
        myContacts[5] = new Contact("Johnnie", "friend", "Jan 21", "(341) 555-7789", "jDawg5555@yahoo.com");

        System.out.printf("%42s\n\n", "Contact List");
        System.out.printf("%5s%20s%15s%12s%19s\n", "Name", "Relation", "Birthday", "Phone", "Email");
        System.out.println("------------------------------------------------------------------------------");
        printContacts(myContacts);
        System.out.println("------------------------------------------------------------------------------");

        System.out.println();
        //binary searches
        selectionSort(myContacts);
        System.out.println("Find Name - Johnnie");
        bool = findByName(myContacts, "Johnnie");
        if (bool != -1)
            System.out.println("Found: " + myContacts[bool] + "\n");
        else
            System.out.println("Not found. \n" );

        System.out.println("Find Name - Sam Parker");
        bool = findByName(myContacts, "Sam Parker");
        if (bool != -1)
            System.out.println("Found: " + myContacts[bool] + "\n");
        else
            System.out.println("Not found. \n" );
        //end of binary searches

        System.out.println("Find Relation - Friend");
        findByRelation(myContacts, "friend");

        System.out.println("Find Relation - Aunt");
        findByRelation(myContacts, "Aunt");

        System.out.println("Find Phone - (333) 555-8989");
        findByPhone(myContacts, "(333) 555-8989");

        System.out.println("Find Phone - (342) 555-7011");
        findByPhone(myContacts, "(342) 555-7011");

        System.out.println("Find Bday - May");
        findByBMonth(myContacts, "May");

        System.out.println("Find Bday - Mar");
        findByBMonth(myContacts, "Mar");

        //binary searches
        System.out.println("Find Email - rgoodman@hotmail.com");
        bool = findByEmail(myContacts, "rgoodman@hotmail.com");
        if (bool != -1)
            System.out.println("Found: " + myContacts[bool] + "\n");
        else
            System.out.println("Not found. \n" );

        System.out.println("Find Email - susieE@hotmail.com");
        bool = findByEmail(myContacts, "susieE@hotmail.com");
        if (bool != -1)
            System.out.println("Found: " + myContacts[bool] + "\n");
        else
            System.out.println("Not found. \n" );
        //end of binary searches

    }
}
