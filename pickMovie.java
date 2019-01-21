/* WIP */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class pickMovie {
	
	public static void main(String[] args) throws Exception{
		Scanner file = new Scanner(new File("src/movies.txt"));
		List<String> lines = new ArrayList<String>();
			while (file.hasNextLine()) {
				lines.add(file.nextLine());
			}
		Random rn = new Random();
		int x = rn.nextInt(7);
		String[] movie = lines.toArray(new String[0]);
		String hiddenTitle = movie[x].replaceAll("[a-zA-Z]", "_");
		MovieGame2 mg2 = new MovieGame2(hiddenTitle, movie[x]);
		}
}
	