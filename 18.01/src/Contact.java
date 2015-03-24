/**
 * Description: Class for Contact type objects
 *
 * @author  Brett Kind
 * @version 2015-03-21
 */
public class Contact
{
    private String name, relation, bday, phone, email;

    public Contact(String n, String r, String b, String p, String e)
    {
        name = n;
        relation = r;
        bday = b;
        phone = p;
        email = e;
    }

    public String getName()
    {
        return name;
    }

    public String getRelation()
    {
        return relation;
    }

    public String getBday()
    {
        return bday;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getEmail()
    {
        return email;
    }

    public String toString()
    {
        return String.format("%13s%13s%13s%17s%22s",name,relation, bday, phone, email );
    }
}
