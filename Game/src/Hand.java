
public class Hand {

	private Card[] cards = new Card[5];

	public int GetPoints() {

		int points = 0;

		for (int i = 0; i < cards.length; i++) {

			if (cards[i] != null) {
				points += cards[i].points;
			}
		}

		return points;
	}

	public void ShowCards() {

		for (int i = 0; i < cards.length; i++) {
			if (cards[i] != null) {
				System.out.println(cards[i]);
			}
		}
	}

	public void ShowInfo() {

		System.out.println("\nCurrent cards = ");
		ShowCards();
		System.out.println("\nCurrent Points = " + GetPoints());
	}

	public int CurrentAmountCards() {

		int amount = 0;

		for (int i = 0; i < cards.length; i++) {
			if (cards[i] != null) {
				amount++;
			}
		}
		return amount;
	}

	public void AddCard(Card nCard) {
		for (int i = 0; i < cards.length; i++) {
			if (cards[i] == null) {
				cards[i] = nCard;
				break;
			}
		}
	}

	public void CheckAces() {

		for (int i = 0; i < cards.length; i++) {
			if (cards[i] != null) {
				if (cards[i].name.equals("Ace")) {

					cards[i].points = 1;
				}
			}
		}
	}
}
