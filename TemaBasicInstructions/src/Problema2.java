/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Problema2 {

	/**
	 * This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scanner = new Scanner(System.in)) {
			int number = scanner.nextInt();
			if(number == 1) {
				System.out.println("UNU");
			}
			else if(number == 2) {
				System.out.println("DOI");
			}
			else if(number == 3) {
				System.out.println("TREI");
			}
			else if(number == 4) {
				System.out.println("PATRU");
			}
			else if(number == 5) {
				System.out.println("CINCI");
			}
			else {
				System.out.println("INVALID");
			}
		}
	}

}
