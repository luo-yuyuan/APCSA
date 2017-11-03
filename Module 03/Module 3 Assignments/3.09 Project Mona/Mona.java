
/**
 * Write a description of class Mona here.
 * 
 * Matthew Guthrie
 * 1/6/17
 * 
 * The purpose of this program is to stucture an email with data about an overdue library book, which is given by the user.
 * 
 */

import java.util.Scanner;
public class Mona
{
    
    public static void main(String args[])
    {
        //variable initializations
        String userName;
        String areaCode;
        String phoneNumber;
        String bookTitle;
        String dateCheckedOut;
        String daysLateString;
        double daysLateDouble;
        String dailyFineString;
        double dailyFineDouble;
        double totalFine;
        int comma;
        String lastName;
        String firstName;
        String email;
        String newDate;
        Scanner in = new Scanner(System.in);
        
        
        //variable assignment
        System.out.print("Enter the Name (Last, First): ");
        lastName = in.next();
        firstName = in.nextLine();
        System.out.print("\n");
        System.out.print("Enter the phone number (###) ###-####: ");
        areaCode = in.next();
        phoneNumber = in.nextLine();
        System.out.print("\n");
        System.out.print("Enter the title of the book: ");
        bookTitle = in.nextLine();
        System.out.print("\n");
        System.out.print("Enter the date checked out (mm/dd/yyyy): ");
        dateCheckedOut = in.next();
        System.out.print("\n");
        System.out.print("Days late: ");
        daysLateString = in.next();
        System.out.print("Daily fine: ");
        dailyFineString = in.next();
        
        //total fine calculation
        daysLateDouble = Double.parseDouble(daysLateString);
        dailyFineDouble = Double.parseDouble(dailyFineString);
        totalFine = daysLateDouble*dailyFineDouble;
        
       
        
        email = firstName.substring(1,2).toLowerCase() + lastName.substring(0,2).toLowerCase() + phoneNumber.substring((phoneNumber.indexOf("-"))+1) + "@csamediacenter.com";
        
        newDate = dateCheckedOut.replace("/", "-");
        
        //printing data to user
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("----------- Text for email message -----------");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("To: " + firstName + " " + lastName.substring(0, lastName.indexOf(",")) + " (" + email + ")");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("From: Mona (mona@csamediacenter.com)");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("Subject: Overdue Book Notice");
        System.out.print("\n");
        System.out.print("===============================================================================");
        System.out.print("\n");
        System.out.print(bookTitle + " was checked out on: " + newDate);
        System.out.print("\n");
        System.out.print("This book is currently " + daysLateString + " day(s) late.");
        System.out.print("\n");
        System.out.print("Your fine has accumulated to: $" + totalFine + " dollar(s)");
        
    }
    
    
}
