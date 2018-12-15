/* This program is a text-based game used to test various techniques */

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
	greeting();
	}
	
	public static void greeting() {
		System.out.println("Hello. This is a game. You are an adventurer. What is your name?");
		Scanner name = new Scanner(System.in);
		String player = name.nextLine();
		System.out.println("Hello, " + player);
		firstChoice(player);
	}
		
	public static void firstChoice(String player) {
		System.out.println("\rYou start off at home do you want to:\r[1] Go outside\r[2] Stay in\rPlease input the number of your choice: ");
		Scanner choice1 = new Scanner(System.in);
		int c1 = choice1.nextInt();
		switch (c1) {
		case 1: goOutside(player); break;
		case 2: System.out.println("Well, that's pretty boring. Game over!"); break;
		default: System.out.println("Sorry, I don't think you made a valid choice. Try again."); firstChoice(player);
		}
	}
	
	public static void goOutside(String player) {
		System.out.println("So "+player+", you decided to go outside, huh?\rYou immediately stub your toe on a box. You open it up and rummage around inside.");
		String[] outcome = {"slimy snails", "fluffy ducks"};
		int random = (int) (Math.random()+.5);
		System.out.println("It feels like you're touching a box of "+ outcome[random]);
		}
}
	