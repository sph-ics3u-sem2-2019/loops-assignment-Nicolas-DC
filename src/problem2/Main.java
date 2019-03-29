package problem2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in two numbers. Add up all the values between them
		Scanner in=new Scanner(System.in);

		System.out.println(" Give first nubmer");
		int y = in.nextInt() ; 
		
		System.out.println( "Give a second number") ;
		int x = in.nextInt() ; 
		
		int w = 0 ;
	/*if ( y>x ) {
		
		for ( int t=y; t >= x; t-- ) {
			w = y - t;
		 System.out.println( w );
		}
	}
	  else {    */
		
		for ( int z = y; z <= x; z++ ) {
			w= w + z ; 
			
			 } 
		System.out.println( w ) ; 
	// }
	}

}
