
/**
 * This class adds randomly selected Integers to an ArrayList
 * and then prints the list.
 * 
 * @author B. Jordan 
 * @version 06/05/07
 */
import java.util.ArrayList;
public class IntegerArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> intList = new ArrayList<Integer>();  //declare an ArrayList
        int rndNumber = 0;
        int position = 0;
        
        for(int i = 0; i < 50; i ++)                            //iterate a loop from 0 to 50
        {
            rndNumber = (int)(Math.random() * 100);             //choose a random number from 0 to 99
            intList.add(rndNumber);                             //add the random number to the next available open index position
        }
        System.out.println(intList);                            //print a list of all elements in the ArrayList
            
        for(int i = 0; i < intList.size(); i++)                 //iterate a through each index position in the ArrayList 
        {
            if(intList.get(i) < 50)                             //get the object from the ArrayList that is in index 
            {                                                   //position i and check to see if it is less than 50
                intList.remove(i);                              //if less than 50, remove the object at index position i fromthe ArrayList.
                i--;                                            //decrement the index counter by one
            }                                                   //why is this necessary?  remove it and see what happens.
        }
        System.out.println(intList);                            //print a list of all elements in the ArrayList
    
        for(int i = 0; i < intList.size(); i++)                 //iterate through each index position in the ArrayList
        {
            rndNumber = (int)(Math.random() * -100);            //choose a random number from 0 to -99 
            intList.set(i, rndNumber);                          //set the new numbers in each index position in the ArrayList
        }
        System.out.println(intList);                            //print a list of all elements in the ArrayList  
        
        for(int n = 0; n < 10; n++)                             //what is this last loop doing?
        {
            rndNumber = (int)(Math.random() * 100) + 100;       //what's the smallest random number that can be chosen if 100 is added to every one?
            position = (int)((Math.random() * intList.size())); //what's the range of values position can take on if every random number is multiplied times the size of the list?
            intList.add(position,rndNumber);                    //where is each new random number added?         
        }                                                       //what happens if you change add() to set()?
        System.out.println(intList);                            //print a list of all elements in the ArrayList  
    }
}