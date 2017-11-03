/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card[] cards = new Card[3];
		
		cards[0] = new Card("Queen", "Hearts", 12);
		cards[1] = new Card("Seven", "Spades", 7);
		cards[2] = new Card("Two", "Diamonds", 12);
		
		for(Card c : cards)
		{
			System.out.println(c.suit());
			System.out.println(c.rank());
			System.out.println(c.pointValue());
			System.out.println("It is "+c.matches(cards[1])+" that the current card is equals to Cards[1]");
			System.out.println(c.toString());
			System.out.println();
			System.out.println();
			System.out.println();
		}
		

}
}