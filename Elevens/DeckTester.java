/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] suits = new String[52];
	    String[] ranks = new String[52];
	    int[] values = new int[52];
	    for(int i=0; i<13; i++)
		{
			suits[i] = "Hearts";
			
		  	
		}
		for(int i=13; i<26; i++)
		{
			suits[i] = "Spade";
			
		  	
		}
		for(int i=26; i<39; i++)
		{
			suits[i] = "Diamonds";
			
		  	
		}
		for(int i=39; i<52; i++)
		{
			suits[i]= "clubs";
			
		  	
		}
		
		  	ranks[0] = "One";
		  	ranks[1] = "Two";
		  	ranks[2] = "Three";
		  	ranks[3] = "Four";
		  	ranks[4] = "Five";
		  	ranks[5] = "Six";
		  	ranks[6] = "Seven";
		  	ranks[7] = "Eight";
		  	ranks[8] = "Nine";
		  	ranks[9] = "Ten";
		  	ranks[10] = "Jack";
		  	ranks[11] = "Queen";
		  	ranks[12] = "King";
		  	ranks[13] = "One";
		  	ranks[14] = "Two";
		  	ranks[15] = "Three";
		  	ranks[16] = "Four";
		  	ranks[17] = "Five";
		  	ranks[18] = "Six";
		  	ranks[19] = "Seven";
		  	ranks[20] = "Eight";
		  	ranks[21] = "Nine";
		  	ranks[22] = "Ten";
		  	ranks[23] = "Jack";
		  	ranks[24] = "Queen";
		  	ranks[25] = "King";
		  	ranks[26] = "One";
		  	ranks[27] = "Two";
		  	ranks[28] = "Three";
		  	ranks[29] = "Four";
		  	ranks[30] = "Five";
		  	ranks[31] = "Six";
		  	ranks[32] = "Seven";
		  	ranks[33] = "Eight";
		  	ranks[34] = "Nine";
		  	ranks[35] = "Ten";
		  	ranks[36] = "Jack";
		  	ranks[37] = "Queen";
		  	ranks[38] = "King";
		  	ranks[49] = "One";
		  	ranks[40] = "Two";
		  	ranks[41] = "Three";
		  	ranks[42] = "Four";
		  	ranks[43] = "Five";
		  	ranks[44] = "Six";
		  	ranks[45] = "Seven";
		  	ranks[46] = "Eight";
		  	ranks[47] = "Nine";
		  	ranks[48] = "Ten";
		  	ranks[49] = "Jack";
		  	ranks[50] = "Queen";
		  	ranks[51] = "King";
		  	

		  	values[0] = 1;
		  	values[1] = 2;
		  	values[2] = 3;
		  	values[3] = 4;
		  	values[4] = 5;
		  	values[5] = 6;
		  	values[6] = 7;
		  	values[7] = 8;
		  	values[8] = 9;
		  	values[9] = 10;
		  	values[10] = 10;
		  	values[11] = 10;
		  	values[12] = 10;
		  	values[13] = 1;
		  	values[14] = 2;
		  	values[15] = 3;
		  	values[16] = 4;
		  	values[17] = 5;
		  	values[18] = 6;
		  	values[19] = 7;
		  	values[20] = 8;
		  	values[21] = 9;
		  	values[22] = 10;
		  	values[23] = 10;
		  	values[24] = 10;
		  	values[25] = 10;
		  	values[26] = 1;
		  	values[27] = 2;
		  	values[28] = 3;
		  	values[29] = 4;
		  	values[30] = 5;
		  	values[31] = 6;
		  	values[32] = 7;
		  	values[33] = 8;
		  	values[34] = 9;
		  	values[35] = 10;
		  	values[36] = 10;
		  	values[37] = 10;
		  	values[38] = 10;
		  	values[39] = 1;
		  	values[40] = 2;
		  	values[41] = 3;
		  	values[42] = 4;
		  	values[43] = 5;
		  	values[44] = 6;
		  	values[45] = 7;
		  	values[46] = 8;
		  	values[47] = 9;
		  	values[48] = 10;
		  	values[49] = 10;
		  	values[50] = 10;
		  	values[51] = 10;
		
		  
		Deck deck = new Deck(ranks,suits,values);
		
		for(int i=0; i<deck.size(); i++)
		{
		  System.out.println(deck.toString());  
		  }
	}
}