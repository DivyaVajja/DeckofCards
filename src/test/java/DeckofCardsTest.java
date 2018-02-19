import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Divya Vajja
 * @Date 02/18/2018
 *
 */
public class DeckofCardsTest {
	
	DeckofCards Deck;
	
	@Before
	public void initializeDeck() 
	{
		Deck = new DeckofCards();
	}
	
	//To check if 53rd call to dealOneCard returns 
	//null after shuffle() call. 
	@Test
	public void test() 
	{
		Deck.shuffle();
		for(int i = 0;i < 52;i++)
		{
			Deck.dealOneCard();
		}
		
		assertEquals(null,Deck.dealOneCard());
	}

}
