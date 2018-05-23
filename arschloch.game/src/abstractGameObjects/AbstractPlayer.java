package abstractGameObjects;

import java.util.ArrayList;

import abstractGameObjects.AbstractCard.ArschlochCard;
import abstractGameObjects.AbstractCardStack.ArschlochCardStack;

public class AbstractPlayer {
	
	public static class ArschlochPlayer{
		
		private String username;
		private ArrayList<ArschlochCard> cardsInHand;
		private int role; // 0 = normie, 1 = secondPlace, 2 = firstPlace, -1 = secondLastPlace, -2 = lastPlace 
		private int points;
		
		
		
		public ArschlochPlayer(String username){
			this.setUsername(username);
			cardsInHand = new ArrayList<ArschlochCard>();
			role = 0;
			points = 0;
		}
		
		public void placeCards(ArschlochCard[] cardsToPlace, ArschlochCardStack cardStack) throws Exception{
			cardStack.putOnStack(cardsToPlace);	
			String outputString = "";
			for (ArschlochCard aC : cardsToPlace) {
				outputString += "INFO\tPlaced card: " + aC.toString() + "\n";
			}
			System.out.println(outputString);

			for (ArschlochCard aC : cardsToPlace) {
				removeCardFomHand(aC);
			}

		}
		

		public void removeCardFomHand(ArschlochCard aC){
			if(this.getCardsInHand().contains(aC)){
				this.cardsInHand.remove(aC);
			}
		}
		
		public void addCardToHand(ArschlochCard aC){
			this.getCardsInHand().add(aC);
		}
		
		public boolean askForCard(ArschlochPlayer aP, ArschlochCard aC){
			boolean positive = false;
			if(aP.getCardsInHand().contains(aC)){
				aP.removeCardFomHand(aC);
				this.addCardToHand(aC);
				positive = true;
			}
			System.out.println("Player " + this.toString() + "aked for " + aC + " --> " + positive);
			return positive;
		}
		
		public void giveCard(ArschlochPlayer aP, ArschlochCard aC){
			this.removeCardFomHand(aC);
			aP.addCardToHand(aC);
			System.out.println("INFO\t" + aP + " got " + aC + " from " + this.toString());
		}
		
		
		
		
		
		public String toString(){
			String retString = this.getUsername() + ": ";
			
			for (ArschlochCard arschlochCard : cardsInHand) {
				retString += arschlochCard + " ";
			}
			return retString;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public ArrayList<ArschlochCard> getCardsInHand() {
			return cardsInHand;
		}
		public void setCardsInHand(ArrayList<ArschlochCard> cardsInHand) {
			this.cardsInHand = cardsInHand;
		}
		public int getRole() {
			return role;
		}
		public void setRole(int role) {
			this.role = role;
		}		
	}

}
