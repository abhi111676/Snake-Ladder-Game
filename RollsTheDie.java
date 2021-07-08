
public class RollsTheDie {

	public static void main(String[] args) {

		int diceRoll = 0;

		double randomnumber = Math.random() * 6 + 1; // generating random number
		diceRoll = (int) randomnumber;
		System.out.println("Dice Number =" + " " + diceRoll); // it'll give the output of the dice number came after
																// rolling the dice

	}
}
