package problem1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read a value. Print out from 1 to the input
		Scanner in=new Scanner(System.in);
		
		
		int input = 0 ;				
		System.out.println( "Give something. Please. I'm poor" ) ;
		int x = in.nextInt() ;
		
		
		
		while (x>input) { 
			input=input+1  ;
			System.out.println(input);
		}
			
	}
	
	
	
}
