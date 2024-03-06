/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class Problema1 {

	/**
	 * This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {
			int number = scanner.nextInt();
			if(number < 1 || number > 10) {
				System.out.println("INVALID");
			}
			else if(number >= 5) {
				System.out.println("ADMIS");
			}
			else {
				System.out.println("RESPINS");
			}
		}
	}

}
