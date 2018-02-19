

/**
 * DeckofCards class represents a deck of playing cards 
 * with 4 suits : Hearts,Spades,Clubs,Diamonds
 *		Face values:Ace,2-10,Jack,Queen,King
 * The class also has methods to shuffle() the deck 
 * and dealOneCard().
 */

/**
 * @author Divya Vajja
 * @date 02/12/2018
 *
 */



public class DeckofCards 
{
	//Array of Card objects.
	private Card Deck[];
	
	private int currentCard;
	
	//constructor for DeckofCards
	public DeckofCards()
	{
		String suits[] = { "Hearts","Spades","Clubs","Diamonds" };
		
		String faces[] = { "Ace","Two","Three","Four","Five","Six","Seven",
						"Eight","Nine","Ten","Jack","Queen","King" };
		
		Deck = new Card[52];
		
		currentCard = 0;
		
		//populating the Deck with Cards.
		for(int count = 0;count < Deck.length;count++)
			Deck[count] = new Card( faces[count % 13],suits[count / 13]);
	}
	
	
	public void shuffle()
	{
		if(currentCard >= 52)
		{
			currentCard = 0;
		}
		
		for(int i = currentCard;i < Deck.length;i++)
		{
			int j;
			do
			{
				j = randomInteger(i,Deck.length-1);
				
			}while(j<currentCard);
			
			//swap current card with a randomly selected card.
			Card temp = Deck[i];
			Deck[i] = Deck[j];
			Deck[j] = temp;
		}
	}
	
	//Returns a random integer.
	public static int randomInteger(int low, int high) 
	{
		double x = Math.random()*(high-low+1);
		return (int)x+low;
	}
	
	//Method to deal one card.
	public String dealOneCard()
	{
		if( currentCard < Deck.length)
		{
			return Deck[currentCard++].toString();
		}
		else
		{
			return null;
		}
	}
	
	public static void main(String[] args)
	{
		DeckofCards deck = new DeckofCards();
		
		System.out.println("Deck Before calling Shuffle method");
		for(int i = 0;i < 52;i++)
		{
			System.out.print(deck.dealOneCard()+".");
		}
		
		deck.shuffle();
		
		System.out.println("Shuffled Deck");
		for(int i = 0;i < 52;i++)
		{
			System.out.print(deck.dealOneCard()+".");
		}
		
		
	}
	
	

}
