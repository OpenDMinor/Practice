
import java.util.Scanner;

public class MovieGame2 {

	public MovieGame2(String hiddenTitle, String movie) throws Exception {
		System.out.println("Welcome to the Movie Guessing Game!\nCapital letters count separately from lowercase.\nKeep this in mind as you make your guesses. Good luck!");
		String wrongLetters = "";
		int tries = 0;
		int maxTries = 10;
		gameStart(hiddenTitle, movie, tries, maxTries, wrongLetters);
		}
	
	private void gameStart(String hiddenTitle, String movie, int tries, int maxTries, String wrongLetters) throws Exception {
		if (!hiddenTitle.contains(movie)) {
			if (tries < maxTries) {
			System.out.println(hiddenTitle);
			System.out.println("You have " + (maxTries - tries) + " tries left.\nWrong Letters Guessed: " + wrongLetters + "\nEnter your guess:");
			guesses(hiddenTitle, movie, tries, maxTries, wrongLetters);
			} else {
				gameLoss(maxTries);
			}
		} else {
			gameWin(hiddenTitle, movie, tries);
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	private void guesses(String hiddenTitle, String movie, int tries, int maxTries, String wrongLetters) throws Exception {
		@SuppressWarnings("resource")
		Scanner guess = new Scanner(System.in);
		CharSequence c = guess.next();
		char c2 = c.charAt(0);
		
		if (wrongLetters.contains(c)) {
			System.out.println("You've already guessed " + c + ". Try again.");
			gameStart(hiddenTitle, movie, tries, maxTries, wrongLetters);
		}else {
			checkGuess(hiddenTitle, movie, tries, maxTries, c2, c, wrongLetters);
		}
	}

	private void checkGuess(String hiddenTitle, String movie, int tries, int maxTries, char c2, CharSequence c, String wrongLetters) throws Exception {
		for (int x = 0; x < movie.length(); x++) {
			if (c2 == movie.charAt(x)) {
				hiddenTitle = (hiddenTitle.substring(0, x) + c + hiddenTitle.substring(x+1));
			}
		}
		if (!movie.contains(c)) {
			wrongLetters += c + " ";
			tries++;
		}
		gameStart(hiddenTitle, movie, tries, maxTries, wrongLetters);
	}

	private void gameWin(String hiddenTitle, String movie, int tries) throws Exception {
		System.out.println(movie + " is correct! You guessed it in " + tries + " tries.\nPlay again (y/n)?");
		endGame();
	}

	private void gameLoss(int maxTries) throws Exception {
		System.out.println("Sorry, but you did not guessed in " + maxTries + " tries. Game over!\nPlay again (y/n)?");
		endGame();
	}
	
	private void endGame() throws Exception {
		@SuppressWarnings("resource")
		Scanner replay = new Scanner(System.in);
		char r = replay.next().charAt(0);
		switch (r) {
			case ('y' | 'Y'): pickMovie.main(null); break;
			case ('n' | 'N'): System.out.println("GAME OVER!"); break;
			default: System.out.println("Please enter (y/n).");
		}	
	}
}