package abstractGameObjectsTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import abstractGameObjects.AbstractCard.ArschlochCard;
import abstractGameObjects.AbstractPlayer.ArschlochPlayer;
import abstractGameObjects.DeckOfCards.DeckOfArschlochcards;

public class DeckOfCardsTest {

	private DeckOfArschlochcards deckOfCards;
	private ArschlochPlayer player1;
	
	@Before
	public void setUp(){
		this.deckOfCards = new DeckOfArschlochcards();
		this.player1 = new ArschlochPlayer("Me");
	}
	
	
	
	
	@Test
	public void CardsTest() {
		assertEquals(ArschlochCard.getCardNames()[0], deckOfCards.getDeckOfCards().get(0).getName());
		System.out.println(ArschlochCard.getCardNames()[0] + " : " + deckOfCards.getDeckOfCards().get(0).getName());
		
		assertEquals(ArschlochCard.getCardNames()[5], deckOfCards.getDeckOfCards().get(5).getName());
		System.out.println(ArschlochCard.getCardNames()[5] + " : " + deckOfCards.getDeckOfCards().get(5).getName());
		
		assertEquals(ArschlochCard.getCardNames()[28], deckOfCards.getDeckOfCards().get(28).getName());
		System.out.println(ArschlochCard.getCardNames()[28] + " : " + deckOfCards.getDeckOfCards().get(28).getName());
	}
	
	@Test
	public void ShuffleTest(){
		assertEquals(ArschlochCard.getCardNames()[19], deckOfCards.getDeckOfCards().get(19).getName());
		System.out.println(ArschlochCard.getCardNames()[19] + " : " + deckOfCards.getDeckOfCards().get(19).getName());
		
		System.out.println("SHUFFLE");
		this.deckOfCards.shuffle_deck(30);
		System.out.println(this.deckOfCards);
		
		assertNotEquals(ArschlochCard.getCardNames()[0], this.deckOfCards.getDeckOfCards().get(0));
		assertNotEquals(ArschlochCard.getCardNames()[31], this.deckOfCards.getDeckOfCards().get(31));
		assertNotEquals(ArschlochCard.getCardNames()[15], this.deckOfCards.getDeckOfCards().get(15));
	}
	
	@Test
	public void giveOutArschlochCardTest(){
		System.out.println("giveOutTest:");
		this.deckOfCards.sort_deck(1);
		for(int i = 0; i < 13; i++){
			
			this.deckOfCards.giveOutArschlochCard(this.player1);
			assertEquals(ArschlochCard.getCardNames()[i], player1.getCardsInHand().get(i).getName());
			System.out.println(ArschlochCard.getCardNames()[i] + " : " + player1.getCardsInHand().get(i).getName());
			assertNotEquals(ArschlochCard.getCardNames()[i], this.deckOfCards.getDeckOfCards().get(i).getName());
			
		}
	}
	

	
	
	//expected --> actual
}
