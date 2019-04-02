package problem4;
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// Ask the user 10 multiplication questions. Check their answers and
		//give them their score
		Random rnd=new Random();
		Scanner in=new Scanner(System.in);

		System.out.println("Here is some Math");
		
		int Points = 0 ; 
		
		for (int i = 0; i < 10; i++) {
			int x = rnd.nextInt(10000000);
			int y = rnd.nextInt(10000000);
			System.out.println(x + "x" + y);
			int z = in.nextInt();
			if (z != x * y) {
				System.out.println("nope");
			}
			else {
				System.out.println("You got it!");
				Points++;
			} 
			
		} 
		
		if (Points<5)  {
		System.out.println(Points+" /10" );
		System.out.println("You failed");
		}
		else {
			System.out.println(Points+" /10" );
			System.out.println("You passes!");
		}

		}
	}


