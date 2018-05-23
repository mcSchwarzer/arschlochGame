package abstractGameObjectsTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import abstractGameObjects.AbstractCard.ArschlochCard;
import abstractGameObjects.AbstractCardStack.ArschlochCardStack;
import abstractGameObjects.DeckOfCards.DeckOfArschlochcards;

public class AbstractCardStackTest {

	ArschlochCardStack aCStack;
	DeckOfArschlochcards deckOfCards;
	
	@Before
	public void setUp(){
		this.aCStack = new ArschlochCardStack();
		this.deckOfCards = new DeckOfArschlochcards();
	}
	
	
	@Test
	public void putOnStackTest() {
		
		for (ArschlochCard aC : this.deckOfCards.getDeckOfCards()) {
			ArschlochCard[] aCArr = {aC};
			try {
				this.aCStack.putOnStack(aCArr);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			assertEquals(this.aCStack.getCardStack().get(this.aCStack.getCardStack().size()-1), aC);
			
			if(aC.getPosInType() == 7){
				this.aCStack = new ArschlochCardStack();
			}
		}

	}

}
