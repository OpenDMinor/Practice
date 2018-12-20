import java.util.Scanner;

public class TwentyOneSticks {

	public static void main(String[] args) {
		int sticks = 21;
		gameStart(sticks);
	}
	
	// Begin game
	public static void gameStart(int sticks) {
		System.out.println("Hello, let's play 21 sticks!\rYou may take either 1 or 2 sticks each turn."
				+ "\rWhomever takes the last stick loses.");
		int face = (int) (Math.random() * 2);
		if (face == 0) {
			cpuFirst(sticks);
		}else {
			playerFirst(sticks);
		}
	}
	// End of game start
	
	// If CPU goes first
	public static void cpuFirst(int sticks) {
		System.out.println("I'll start!");
		int turn = (int) ((Math.random() * 2)+1);
		System.out.println("I'll take " + turn + " sticks.");
		sticks -= turn;
		System.out.println("There are now " + sticks + " sticks left.");
		player(sticks);
	}
	// End CPU goes first
	
	// If player goes first
	public static void playerFirst(int sticks) {
		System.out.println("Please take 1 or 2 sticks.");
		Scanner sc = new Scanner(System.in);
		int num1;
		num1 = Integer.parseInt(sc.nextLine());
		if (num1 == 1 || num1 == 2) {
			sticks -= num1;
			System.out.println("There are now " + sticks + " sticks left.");
			cpu(sticks);
			
		} else {
			System.out.println("You have entered an invalid input. Please try again.");
			playerFirst(sticks);}
		}
	// End player goes first	
		
	// Subsequent CPU turns
	public static void cpu(int sticks) {
		int turn = (int) ((Math.random() * 2)+1);
		System.out.println("I'll take " + turn + " sticks.");
		sticks -= turn;
		System.out.println("There are now " + sticks + " sticks left.");
		
		switch (sticks) {
		case -1 | -2 | -3 | -4: System.out.println("I lose! Game over!"); break;
		case 0: System.out.println("I lose! Game over!"); break;
		default: player(sticks);
		}
	}
	// End subsequent CPU turns
	
	// Subsequent player turns
	public static void player(int sticks) {
		System.out.println("Please take 1 or 2 sticks.");
		Scanner sc = new Scanner(System.in);
		int num1;
		num1 = Integer.parseInt(sc.nextLine());
		
		switch (sticks) {
		case -1 | -2 | -3 | -4: System.out.println("You lose! Game over!"); break;
		case 0: System.out.println("You lose! Game over!"); break;
		default: if (num1 == 1 || num1 == 2) {
			sticks -= num1;
			System.out.println("There are now " + sticks + " sticks left.");
			if (sticks == 0) {
				System.out.println("You lose! Game over!"); 
				break;
			}else {
				cpu(sticks);
			}
		} else {
			System.out.println("You have entered an invalid input. Please try again.");
			player(sticks);
			}
		}
	}
	// End subsequent player turns
}
// PROGRAM END