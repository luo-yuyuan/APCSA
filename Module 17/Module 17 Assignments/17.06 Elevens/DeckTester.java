/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck[] decks = new Deck[3];
		
		String[] ranks1 = {
		  "Queen",
		  "Seven",
		  "Two"
		};
		String[] ranks2 = {
		  "Five",
		  "King",
		  "Ace",
			};
		String[] ranks3 = {
		  "Four",
		  "Nine",
		  "Ten"
		  };
		  
		String[] suits1 = {
		  "Hearts",
		  "Spades",
		  "Clubs",
			};
		  String[] suits2 = {
		  "Clubs",
		  "Diamonds",
		  "Hearts",
			};
		  String[] suits3 = {
		  "Diamonds",
		  "Hearts",
		  "Spades"
		};
		
		int[] values1 = {
		  10,
		  7,
		  2
			};
		int[] values2 = {
		  5,
		  13,
		  10
			};
		int[] values3 = {
		  4,
		  9,
		  10
		};
		
		
		decks[0] = new Deck(ranks1, suits1, values1);
		decks[1] = new Deck(ranks2, suits2, values2);
		decks[2] = new Deck(ranks3, suits3, values3);
		
		for(Deck d : decks)
		{

		  System.out.println();
		  System.out.println("Size: "+d.size());
		  System.out.println(d.deal());
		  System.out.println(d.toString());
		  System.out.println();
		  System.out.println();
		  }
		
	};
};