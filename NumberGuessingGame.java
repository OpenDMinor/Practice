import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
	
	public static void main (String [] args) {
		int min = 1;
		int max = 50;
		Random random = new Random();
		int secret = random.nextInt(max + 1 - min) + min;
		System.out.println("Hello, please guess a number between 1 and 50.");
		guess(secret);
	}
		
	public static void guess(int secret) {
		Scanner guess = new Scanner(System.in);
		int g = guess.nextInt();
		if (g == secret) {
			System.out.println("Great job, it was " + secret);
		}
		if (g > secret) {
			System.out.println("Not quite...your guess is too high.");
			if (g>50) {
				System.out.println("Your guess was larger than 50!");
			}
			System.out.println("Try again!");
			guess(secret);
		}
		if (g < secret) {
			System.out.println("Not quite...your guess is too low.");
			if (g<1) {
				System.out.println("Your guess was less than 1!");
			}
			System.out.println("Try again!");
			guess(secret);
		}
	}
}