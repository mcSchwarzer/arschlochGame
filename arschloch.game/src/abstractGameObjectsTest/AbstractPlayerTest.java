package abstractGameObjectsTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import abstractGameObjects.AbstractCard.ArschlochCard;
import abstractGameObjects.AbstractCardStack.ArschlochCardStack;
import abstractGameObjects.AbstractPlayer.ArschlochPlayer;
import abstractGameObjects.DeckOfCards.DeckOfArschlochcards;


public class AbstractPlayerTest {

	ArschlochPlayer player1;
	ArschlochPlayer player2;
	ArschlochPlayer player3;
	ArschlochPlayer player4;
	ArschlochCardStack cardStack;
	DeckOfArschlochcards deckOfCards;
	
	@Before
	public void setUp(){
		player1 = new ArschlochPlayer("Markus Schwarzer");
		player2 = new ArschlochPlayer("Max Huber");
		player3 = new ArschlochPlayer("Martin Kempcke");
		player4 = new ArschlochPlayer("Jan Zimny");
		cardStack = new ArschlochCardStack();
		deckOfCards = new DeckOfArschlochcards();
		deckOfCards.shuffle_deck(20);
	}
	
	@Test
	public void addCardTohand(){
		int i = 0;
		for (ArschlochCard aC : deckOfCards.getDeckOfCards()) {
			if(i == 4){
				i=0;
			}

			switch (i) {
			case 0: player1.addCardToHand(aC); break;
			case 1: player2.addCardToHand(aC); break;
			case 2: player3.addCardToHand(aC); break;
			case 3: player4.addCardToHand(aC); break;

			}

			i++;
		}
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println(player4);
		assertEquals(8, player1.getCardsInHand().size());
		assertEquals(8, player2.getCardsInHand().size());
		assertEquals(8, player3.getCardsInHand().size());
		assertEquals(8, player4.getCardsInHand().size());
	}
	
	@Test
	public void placeCardsTest(){
	
		ArschlochCard aC1 = new ArschlochCard(1); 
		ArschlochCard aC2 = new ArschlochCard(9);
		
		try {
			player1.placeCards(new ArschlochCard[]{new ArschlochCard(1),  new ArschlochCard(9)},this.cardStack);
		} catch (Exception e) {
			fail("failed");
			e.printStackTrace();
		}
		
		assertEquals(this.cardStack.getCardStack().size(), 2);
		assertEquals(aC1, this.cardStack.getCardStack().get(0));
		assertEquals(aC2, this.cardStack.getCardStack().get(1));	
		assertEquals(new ArschlochCard[]{new ArschlochCard(1),  new ArschlochCard(9)}, this.cardStack.getLastCards());
		assertEquals(new ArschlochCard[]{new ArschlochCard(1),  new ArschlochCard(9)}.length, this.cardStack.getCardStack().size());
	}
	
	@Test
	public void removeCardFomHandTest(){
		int i = 0;
		for (ArschlochCard aC : deckOfCards.getDeckOfCards()) {
			if(i == 4){
				i=0;
			}

			switch (i) {
			case 0: player1.addCardToHand(aC); break;
			case 1: player2.addCardToHand(aC); break;
			case 2: player3.addCardToHand(aC); break;
			case 3: player4.addCardToHand(aC); break;

			}

			i++;
		}
		
		ArschlochCard aC = player1.getCardsInHand().get(0);
		player1.removeCardFomHand(player1.getCardsInHand().get(0));
		assertNotEquals(aC, player1.getCardsInHand().get(0));
		assertEquals(7, player1.getCardsInHand().size());
		
		aC = player2.getCardsInHand().get(0);
		player2.removeCardFomHand(player2.getCardsInHand().get(0));
		assertNotEquals(aC, player2.getCardsInHand().get(0));
		assertEquals(7, player2.getCardsInHand().size());

		aC = player3.getCardsInHand().get(0);
		player3.removeCardFomHand(player3.getCardsInHand().get(0));
		assertNotEquals(aC, player3.getCardsInHand().get(0));
		assertEquals(7, player3.getCardsInHand().size());

		aC = player4.getCardsInHand().get(0);
		player4.removeCardFomHand(player4.getCardsInHand().get(0));
		player4.removeCardFomHand(player4.getCardsInHand().get(0));
		assertNotEquals(aC, player4.getCardsInHand().get(0));
		assertEquals(6, player4.getCardsInHand().size());


		
	}
	


}
