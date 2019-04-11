package problem6;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in a name, and print out the box
		/*
		 * Example input: Zebarth
		 * Output:
		 * Zebarth
		 * ebarthZ
		 * barthZe
		 * arthZeb
		 * rthZeba
		 * thZebar
		 * hZebart
		 */
		Scanner in=new Scanner(System.in);
		
		System.out.println("Give me a word");
		String word = in.nextLine(); 
		
		for (int j = 0; j < word.length(); j++) {
			System.out.println(word.substring(j) + word.substring(0,j));
		}
	}

}
