
public class Deck {
	
	Card[] cardArray = new Card[52];

	Deck() { // constructor
		int suits = 4;
		int cardType = 13;
		int cardCount = 0;
		for (int i = 1; i <= suits; i++)
			for (int j = 1; j <= cardType; j++) {
				cardArray[cardCount] = new Card(i, j);
				cardCount++;
			}
	}

	public void print() {
		for (int i = 0; i < cardArray.length; i++)
			System.out.println(cardArray[i]);
	}
	
	public void shuffle() {
		
		for (int i = 0; i < 52; i++) {
			
			int random = (int)(Math.random()*52);
			
			Card temp = cardArray[random];
			cardArray[random] = cardArray[i];
			cardArray[i] = temp;
		}
	}
}
