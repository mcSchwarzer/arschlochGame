package abstractGameObjects;

import abstractGameObjects.AbstractCardStack.ArschlochCardStack;
import abstractGameObjects.DeckOfCards.DeckOfArschlochcards;

public class Config {
	int stack_size;
	int number_of_players;
	
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
	
	
	
	
	
	
}
