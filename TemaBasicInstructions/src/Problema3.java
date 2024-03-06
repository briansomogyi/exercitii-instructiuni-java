/**
 * 
 */

/**
 * 
 */
import java.util.Scanner;

public class Problema3 {

	/** This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner scanner = new Scanner(System.in)) {
			int number1 = scanner.nextInt();
			int number2 = scanner.nextInt();
			if(number1%2==0 && number2%2==0) {
				System.out.println((number1+number2)/2);
			}
			else if(number1%2==1 && number2%2==1) {
				System.out.println(number1*number2);
			}
			else {
				System.out.println(number1+number2);
			}
		}
	}

}
