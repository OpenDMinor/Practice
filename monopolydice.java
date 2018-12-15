/* This program counts how many rolls it takes to roll a pair of dice until you roll doubles three times in
 * a row. */

public class monopolydice {

	public static void main(String[] args) {
		monopolyRoll();
		}
	
	public static int diceRoll() { 
		int sides = 6;
		double randomNumber = (Math.random() * sides)+1;
		return (int) randomNumber;

	}
	public static void monopolyRoll() {
		boolean isJailed = false;
		int counter = 0;
		while (!isJailed) {
			int roll1 = diceRoll(); 
			int roll2 = diceRoll(); 
			int total = roll1 + roll2;
			counter++;
			System.out.println("Die 1: " + roll1 + "\rDie 2: " + roll2 + 
					"\r\rTotal: " + total + "\rRoll Number: 1");
			if (roll1 == roll2) { 
				int roll3 = diceRoll(); 
				int roll4 = diceRoll(); 
				total = total + roll3 + roll4; 
				counter++;
				System.out.println("\rDie 1: " + roll3 + "\rDie 2: " + roll4 + 
						"\r\rTotal: " + total + "\rRoll Number: 2");
				if (roll3 == roll4) { 
					int roll5 = diceRoll(); 
					int roll6 = diceRoll(); 
					total = total + roll5 + roll6; 
					counter++;
					System.out.println("\rDie 1: " + roll5 + "\rDie 2: " + roll6 + 
							"\r\rTotal: " + total + "\rRoll Number: 3");
					if (roll5 == roll6) {
						System.out.println("GO TO JAIL!");
						isJailed = true;
						System.out.println("It took " + counter + " rolls to go to jail.");
						}
					}
				}
			}
		}
	}