/**
 * A java class which represents a single card
 */

/**
 * @author Divya Vajja
 * @date 02/10/2018
 *
 */
public class Card 
{

	String face;
	String suit;
	
	//constructor for a card.
	public Card(String f,String s)
	{
		this.face = f;
		this.suit = s;
	}
	
	public String getF()
	{
		return face;
	}
	
	public void setF(String f)
	{
		this.face = f;
	}
	
	public String getS()
	{
		return suit;
	}
	
	public void setS(String s)
	{
		this.suit = s;
	}
	
	//converting the given card to a string.
	@Override
	public String toString()
	{
		return "Card[face = " +face + " , suit=" + suit +"]";
	}
}
