
/**
 * This class creates Contact objects for use in TestContact
 * 
 * Matthew Guthrie
 * 6/20/17
 */
public class Contact
{
    private String name, relation, bday, phone, email;
    
    Contact(String name, String relation, String bday, String phone, String email)
    {
        this.name = name;
        this.relation = relation;
        this.bday = bday;
        this.phone = phone;
        this.email = email;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String Name)
    {
        this.name = name;
    }
    
    public String getRelationship()
    {
        return relation;
    }
    public void setRelationship(String relation)
    {
        this.relation = relation;
    }
    
    public String getBday()
    {
        return bday;
    }
    public void setBday(String bday)
    {
        this.bday = bday;
    }
    
    public String getPhone()
    {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String toString()
    {
        return String.format("%s%15s%15s%15s%25s", name, relation, bday, phone, email);
    }
}

