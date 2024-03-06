/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class Problema4 {

	/** This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			if(a<b && a<c) {
				System.out.println(a);
			}
			else if(b<c) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
		}
	}

}
