package abstractGameObjects;

import abstractGameObjects.AbstractCardStack.ArschlochCardStack;
import abstractGameObjects.DeckOfCards.DeckOfArschlochcards;

public class Config {
	private int stack_size;
	private int number_of_players;
	private static final String[] cardNames_32 = {		
			"Seven of Hearts","Eight of Hearts","Nine of Hearts","Ten of Hearts","Jack of Hearts","Queen of Hearts","King of Hearts","ACE of Hearts",
			"Seven of Diamonds","Eight of Diamonds","Nine of Diamonds","Ten of Diamonds","Jack of Diamonds","Queen of Diamonds","King of Diamonds","ACE of Diamonds",
			"Seven of Spades","Eight of Spades","Nine of Spades","Ten of Spades","Jack of Spades","Queen of Spades","King of Spades","ACE of Spades",
			"Seven of Clubs","Eight of Clubs","Nine of Clubs","Ten of Clubs","Jack of Clubs","Queen of Clubs","King of Clubs","ACE of Clubs"};
	
	private static final String[] cardNames_52 = {		
			"Two of Hearts","Three of Hearts","Four of Hearts","Five of Hearts","Six of Hearts","Seven of Hearts","Eight of Hearts","Nine of Hearts","Ten of Hearts","Jack of Hearts","Queen of Hearts","King of Hearts","ACE of Hearts",
			"Two of Diamonds","Three of Diamonds","Four of Diamonds","Five of Diamonds","Six of Diamonds","Seven of Diamonds","Eight of Diamonds","Nine of Diamonds","Ten of Diamonds","Jack of Diamonds","Queen of Diamonds","King of Diamonds","ACE of Diamonds",
			"Two of Spades","Three of Spades","Four of Spades","Five of Spades","Six of Spades","Seven of Spades","Eight of Spades","Nine of Spades","Ten of Spades","Jack of Spades","Queen of Spades","King of Spades","ACE of Spades",
			"Two of Clubs","Three of Clubs","Four of Clubs","Five of Clubs","Six of Clubs","Seven of Clubs","Eight of Clubs","Nine of Clubs","Ten of Clubs","Jack of Clubs","Queen of Clubs","King of Clubs","ACE of Clubs"};
	
	
	
	public Config(DeckOfArschlochcards deck, ArschlochGame game, ArschlochCardStack stack){
		DeckOfArschlochcards.setCARD_STACK_SIZE(stack_size);
	}
	
	public void initConfigValues(int stack_size, int number_of_players){
		this.stack_size = stack_size;
		this.number_of_players = number_of_players;
	}

	public int getStack_size() {
		return stack_size;
	}

	public void setStack_size(int stack_size) {
		this.stack_size = stack_size;
	}

	public int getNumber_of_players() {
		return number_of_players;
	}

	public void setNumber_of_players(int number_of_players) throws Exception {
		if(number_of_players < 2){throw new Exception("You cant play alone");}
		this.number_of_players = number_of_players;
	}

	public static String[] getCardNames32() {
		return cardNames_32;
	}

	public static String[] getCardNames52() {
		return cardNames_52;
	}
	
	
	
	
	
	
}
