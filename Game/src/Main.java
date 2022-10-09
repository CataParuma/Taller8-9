import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Deck d = new Deck();
		d.print();
		d.shuffle();
		System.out.println("\nShuffle:\n");
		d.print();

		int i = 0;

		Hand player = new Hand();
		player.AddCard(d.cardArray[i]);
		i++;
		player.AddCard(d.cardArray[i]);

		player.ShowInfo();

		boolean contin = true;

		while (player.CurrentAmountCards() < 5 && player.GetPoints() < 21 && contin) {

			System.out.println("Do you want another card? Y/N");
			String msg = sc.next();

			if (msg.equalsIgnoreCase("N"))
				contin = false;

			if (contin) {
				i++;
				player.AddCard(d.cardArray[i]);
				if (player.GetPoints() > 21)
					player.CheckAces();
				player.ShowInfo();
			}
		}

		Hand ia = new Hand();

		while (ia.CurrentAmountCards() < 5 && ia.GetPoints() < 17) {

			i++;
			ia.AddCard(d.cardArray[i]);
		}

		System.out.println("Dealer Info = ");
		ia.ShowInfo();

		int plPts = player.GetPoints();
		int iaPts = ia.GetPoints();

		if (plPts == iaPts)
			System.out.println("Draw");
		else if (plPts > 21) {
			if (iaPts < 22)
				System.out.println("Dealer win");
			else if (plPts < iaPts)
				System.out.println("Player win");
			else
				System.out.println("Dealer win");
		} else {

			if (plPts > iaPts)
				System.out.println("Player win");
			else
				System.out.println("Dealer win");
		}
	}
}