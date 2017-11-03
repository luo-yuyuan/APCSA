
/**
 * This classes tests contacts objects by creating, sorting, and searching for them.
 * 
 * Matthew Guthrie
 * 6/20/17
 */

import java.util.*;
public class TestContact
{
    public static void printContacts(Contact[] m)
    {
        System.out.println("Contact list:");
        System.out.printf("%s%20s%15s%15s%15s", "name", "relation", "bday", "phone", "email");
        System.out.println();
        for(Contact n : m)
        {
            System.out.println(n.toString());
        }
    }
    
    public static void searchName(Contact[] m, String t, int start, int end)
    {
        int middle = (start+end)/2;
        
        if(start>end)
        {
            System.out.println("Name - " + t + " not found.");
            System.out.println();
        }
        else if(m[middle].getName().compareTo(t) == 0)
        {
            System.out.println("Name found:");
            System.out.println(m[middle].toString());
            System.out.println();
        }
        else if(m[middle].getName().compareTo(t) < 0)
        {
            searchName(m,t,middle+1,end);
        }
        else if(m[middle].getName().compareTo(t) > 0)
        {
            searchName(m,t,start,middle-1);
        }
    }
    
    public static void searchEmail(Contact[] m, String t, int start, int end)
    {
        int middle = (start+end)/2;
        
        if(start>end)
        {
            System.out.println("Email - " + t + " not found.");
            System.out.println();
        }
        else if(m[middle].getEmail().compareTo(t) == 0)
        {
            System.out.println("Email found:");
            System.out.println(m[middle].toString());
            System.out.println();
        }
        else if(m[middle].getEmail().compareTo(t) < 0)
        {
            searchEmail(m,t,middle+1,end);
        }
        else if(m[middle].getEmail().compareTo(t) > 0)
        {
            searchEmail(m,t,start,middle-1);
        }
    }
    
    public static void searchRelationship(Contact[] m, String r)
    {
        int found = 0;
        
        List<Contact> list = new ArrayList<Contact>();
        
        for(int i=0; i<m.length; i++)
        {
            if(m[i].getRelationship().compareTo(r) == 0)
            {
                found++;
                list.add(m[i]);
            }
        }
        
        if(found!=0)
        {
            System.out.println("Found relationships:");
            for(Contact n : list)
            {
                System.out.println(n.toString());
            }
            System.out.println(found + " with relationship " + r);
        }
        
        if(found==0)
        {
            System.out.println("No " + r + " found");
            System.out.println();
        }
    }
    
    public static void searchByBMonth(Contact[] m, String r)
    {
        int found = 0;
        
        List<Contact> list = new ArrayList<Contact>();
        
        for(int i=0; i<m.length; i++)
        {
            if(m[i].getBday().substring(0,3).compareTo(r) == 0)
            {
                found++;
                list.add(m[i]);
            }
        }
        
        if(found!=0)
        {
            System.out.println("Found bday:");
            for(Contact n : list)
            {
                System.out.println(n.toString());
            }
            System.out.println(found + " with bday " + r);
        }
        
        if(found==0)
        {
            System.out.println("No " + r + " found");
            System.out.println();
        }
    }
    
    public static void searchByPhone(Contact[] m, String r)
    {
        int found = 0;
        
        List<Contact> list = new ArrayList<Contact>();
        
        for(int i=0; i<m.length; i++)
        {
            if(m[i].getPhone().compareTo(r) == 0)
            {
                found++;
                list.add(m[i]);
            }
        }
        
        if(found!=0)
        {
            System.out.println("Found phone:");
            for(Contact n : list)
            {
                System.out.println(n.toString());
            }
            System.out.println(found + " with phone " + r);
        }
        
        if(found==0)
        {
            System.out.println("No " + r + " found");
            System.out.println();
        }
    }
    
    public static Contact[] selectionSort(Contact[] m, int p)
    {
        if(p==1)
        {
            for(int i=0; i<m.length; i++)
            {
                int store = 0;
                Contact first = m[i];
                for(int j=1; j<m.length-i; j++)
                {
                    if(m[j-1].getName().compareTo(m[j].getName())>0)
                    {
                        Contact temp = m[j-1];
                        m[j-1] = m[j];
                        m[j] = temp;
                    }
                    
                    
                }
            }
        }
        else if(p==2)
        {
            for(int i=0; i<m.length; i++)
            {
                int store = 0;
                Contact first = m[i];
                for(int j=1; j<m.length-i; j++)
                {
                    if(m[j-1].getEmail().compareTo(m[j].getEmail())>0)
                    {
                        Contact temp = m[j-1];
                        m[j-1] = m[j];
                        m[j] = temp;
                    }
                    
                    
                }
            }
        }
        return m;
    }
    
    
    
    public static void main(String args[])
    {
        Contact[] myContacts = new Contact[6];
        
        myContacts[0] = new Contact("John Carter", "brother", "Mar 3", "(342) 555-7069", "jcarter@carter.com");
        myContacts[1] = new Contact("Elise Carter", "mom", "Apr 19", "(342) 555-7011", "carterMom@carter.com");
        myContacts[2] = new Contact("Ellie Carter", "me", "Jun 10", "(342) 555-8102", "ecarter@carter.com");
        myContacts[3] = new Contact("Sue Ellen", "friend", "Mar 9", "(341) 555-9182", "susieE@hotmail.com");
        myContacts[4] = new Contact("Frank Carter", "dad", "Dec 1", "(342) 555-7011", "carterDad@carter.com");
        myContacts[5] = new Contact("Johnnie", "friend", "Jan 21", "(341) 555-7189", "jDawg5555@yahoo.com");
        
        printContacts(myContacts);
        System.out.println("---------------------------------------------------------");
        System.out.println();
        System.out.println();
        
        myContacts = selectionSort(myContacts,1);
        searchName(myContacts, "Johnnie", 0, myContacts.length);
        searchName(myContacts, "Sam Parker", 0, myContacts.length);
        System.out.println("---------------------------------------------------------");
        System.out.println();
        System.out.println();
        
        searchRelationship(myContacts, "friend");
        searchRelationship(myContacts, "Aunt");
        System.out.println("---------------------------------------------------------");
        System.out.println();
        System.out.println();
        
        searchByPhone(myContacts, "(333) 555-8989");
        searchByPhone(myContacts, "(342) 555-7011");
        System.out.println("---------------------------------------------------------");
        System.out.println();
        System.out.println();
        
        searchByBMonth(myContacts, "May");
        searchByBMonth(myContacts, "Mar");
        System.out.println("---------------------------------------------------------");
        System.out.println();
        System.out.println();
        
        myContacts = selectionSort(myContacts,2);
        searchEmail(myContacts, "rgoodman@hotmail.com", 0, myContacts.length);
        searchEmail(myContacts, "susieE@hotmail.com", 0, myContacts.length);
    }
}
