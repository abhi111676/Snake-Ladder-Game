
public class PlayerThenChecksforOption {

	public static void main(String[] args) {

		// variables
		int diceRoll = 0;
		int playerPosition = 0;
		int SnakeArray[] = { 19, 48, 77 };
		int LadderArray[] = { 34, 64, 86 };

		// computing
		for (playerPosition = 0; playerPosition <= 100; playerPosition++) {
			double randomnumber = Math.random() * 6 + 1; // generating random number
			diceRoll = (int) randomnumber;
			playerPosition = playerPosition + diceRoll; // it'll give the player position
			if (diceRoll == 0) {
				playerPosition = playerPosition - diceRoll;
				System.out.println(
						"You have to stay on the same position!!"); /*
																	 * if this condition is true then the player has to
																	 * stay on the same position
																	 */
			}
			/*
			 * if these condition comes true then the player has to go back because of the
			 * snake
			 */
			if (playerPosition == SnakeArray[0]) {
				playerPosition = 5;
				System.out.println("OOH! THERE'S A SNAKE.");
				System.out.println("So Now, Player is at " + playerPosition + " position.");
			} else if (playerPosition == SnakeArray[1]) {
				playerPosition = 28;
				System.out.println("OOH! THERE'S A SNAKE.");
				System.out.println("So Now, Player is at " + playerPosition + " position.");
			} else if (playerPosition == SnakeArray[2]) {
				playerPosition = 50;
				System.out.println("OOH! THERE'S A SNAKE.");
				System.out.println("So Now, Player is at " + playerPosition + " position.");

				/*
				 * if these condition comes true then the player will climb the ladders and will
				 * be then at the end of the ladder
				 */
			} else if (playerPosition == LadderArray[0]) {
				playerPosition = 54;
				System.out.println("WOW ! Player GOT A LADDER.");
				System.out.println("So Now, Player is at " + playerPosition + " position.");
			} else if (playerPosition == LadderArray[1]) {
				playerPosition = 89;
				System.out.println("WOW ! Player GOT A LADDER.");
				System.out.println("So Now, Player is at " + playerPosition + " position.");
			} else if (playerPosition == LadderArray[2]) {
				playerPosition = 99;
				System.out.println("WOW ! Player GOT A LADDER.");
				System.out.println("So Now, Player is at " + playerPosition + " position.");
			}
		}
	}
}
