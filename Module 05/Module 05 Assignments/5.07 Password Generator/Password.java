
/**
 * Matthew Guthrie
 * 1/19/17
 * 
 * This program creates a random password based on a set of possible
 * characters, which is selected by the user.
 */

import java.util.Random;
import java.util.Scanner;
public class Password
{
   public static void main(String args[])
   {
       //Variable Declarations
       Scanner in = new Scanner(System.in);
       Random generator = new Random();
       int input=0;
       int length=0;
       String password = "";
       
       //Prints menu
       System.out.println("Please enter the number of which character set to use");
       System.out.println("1. Only lower case letters");
       System.out.println("2. Lower Case and Upper Case");
       System.out.println("3. Lower Case, Upper Case, and Numbers 0-9");
       System.out.println("4. Lower Case, Upper Case, Numbers 0-9, and One set of Symbols");
       System.out.println("5. Lower Case, Upper Case, Numbers 0-9, and a different set of Symbols");
       System.out.println("6. All options");
       System.out.println("7. Quit");
       System.out.print("Choice: ");
       input = in.nextInt();
       System.out.println();
       if(input!=7)//Does not prompt for length if the user quits
       {
           System.out.println("Please enter the length of the password");
           System.out.print("Length: ");
           length = in.nextInt();
       }
       System.out.println();
       
       while(input!=7)//While the user does not quit
       {
           if(input==1)//if set 1
           {
               System.out.print("Password: ");
               for(int i=0; i<length; i++)//goes through every char
               {
                System.out.print((char)(generator.nextInt(('z' - 'a')) + 'a'));//picks a random lower case char
               }
               System.out.println();
               System.out.println();
               System.out.println();
           }
           else if(input==2)
           {
               System.out.print("Password: ");
               for(int i=0; i<length; i++)
               {
                   if(generator.nextInt(2)==1)//picks between lower or upper case numbers evenly(theoretically)
                   {
                       System.out.print((char)(generator.nextInt(('z' - 'a')) + 'a'));//picks a random lower case char
                   }
                   else
                   {
                       System.out.print((char)(generator.nextInt(('Z' - 'A')) + 'A'));//picks a random upper case char
                   }
               }
               System.out.println();
               System.out.println();
               System.out.println();
           }
           else if(input==3)
           {
               System.out.print("Password: ");
               for(int i=0; i<length; i++)
               {
                   
                   int type = generator.nextInt(3);//picks which type of character to use for next char
                   if(type==1)
                   {
                       System.out.print((char)(generator.nextInt(('z' - 'a')) + 'a'));//picks a random lower case char
                   }
                   else if(type==2)
                   {
                       System.out.print((char)(generator.nextInt(('Z' - 'A')) + 'A'));//picks a random upper case char
                   }
                   else
                   {
                       System.out.print((char)(generator.nextInt(('9' - '0')) + '0'));//picks a random int
                   }
               }
               System.out.println();
               System.out.println();
               System.out.println();
           }
           else if(input==4)
           {
               System.out.print("Password: ");
               for(int i=0; i<length; i++)
               {
                   int type = generator.nextInt(4);//picks which type of character to use for next char
                   if(type==1)
                   {
                       System.out.print((char)(generator.nextInt(('z' - 'a')) + 'a'));//picks a random lower case char
                   }
                   else if(type==2)
                   {
                       System.out.print((char)(generator.nextInt(('Z' - 'A')) + 'A'));//picks a random upper case char
                   }
                   else if(type==3)
                   {
                       System.out.print((char)(generator.nextInt(('9' - '0')) + '0'));//picks a random int
                   }
                   else
                   {
                       System.out.print((char)(generator.nextInt(('@' - ':')) + ':'));//picks a random symbol from this set
                   }
               }
               System.out.println();
               System.out.println();
               System.out.println();
           }
           else if(input==5)
           {
               System.out.print("Password: ");
               for(int i=0; i<length; i++)
               {
                   int type = generator.nextInt(5);//picks which type of character to use for next char
                   if(type==1)
                   {
                       System.out.print((char)(generator.nextInt(('z' - 'a')) + 'a'));//picks a random lower case char
                   }
                   else if(type==2)
                   {
                       System.out.print((char)(generator.nextInt(('Z' - 'A')) + 'A'));//picks a random upper case char
                   }
                   else if(type==3)
                   {
                       System.out.print((char)(generator.nextInt(('9' - '0')) + '0'));//picks a random int
                   }
                   else
                   {
                       System.out.print((char)(generator.nextInt(('`' - '[')) + '['));//picks a random symbol from this set
                   }
               }
               System.out.println();
               System.out.println();
               System.out.println();
           }
           else if(input==6)
           {
               System.out.print("Password: ");
               for(int i=0; i<length; i++)
               {
                   int type = generator.nextInt(6);//picks which type of character to use for next char
                   if(type==1)
                   {
                       System.out.print((char)(generator.nextInt(('z' - 'a')) + 'a'));//picks a random lower case char
                   }
                   else if(type==2)
                   {
                       System.out.print((char)(generator.nextInt(('Z' - 'A')) + 'A'));//picks a random upper case char
                   }
                   else if(type==3)
                   {
                       System.out.print((char)(generator.nextInt(('9' - '0')) + '0'));//picks a random int
                   }
                   else if(type==4)
                   {
                       System.out.print((char)(generator.nextInt(('@' - ':')) + ':'));//picks a random symbol from this set
                   }
                   else
                   {
                       System.out.print((char)(generator.nextInt(('`' - '[')) + '['));//picks a random symbol from this set
                   }
               }
               System.out.println();
               System.out.println();
               System.out.println();
           }
           else//catches user error
           {
               System.out.print("Error, please only enter an available number.");
               System.out.println();
               System.out.println();
           }
           
           //prints menu again
           System.out.println("Please enter the number of which character set to use");
           System.out.println("1. Only lower case letters");
           System.out.println("2. Lower Case and Upper Case");
           System.out.println("3. Lower Case, Upper Case, and Numbers 0-9");
           System.out.println("4. Lower Case, Upper Case, Numbers 0-9, and One set of Symbols");
           System.out.println("5. Lower Case, Upper Case, Numbers 0-9, and a different set of Symbols");
           System.out.println("6. All options");
           System.out.println("7. Quit");
           System.out.print("Choice: ");
           input = in.nextInt();
           if(input!=7)
           {
               System.out.println("Please enter the length of the password");
               System.out.print("Length: ");
               length = in.nextInt();
           }
           
       }
    
   }
}
