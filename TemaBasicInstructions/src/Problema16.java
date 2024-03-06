import java.util.Scanner;

public class Problema16 {

	/** This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int x = n;
			
			System.out.print("Cifrele numarului "+n+" sunt: ");
			do {
				int c = x % 10;
				System.out.print(c + " ");
				x /= 10;
			}
			while(x>0);
			
			System.out.println();
		}
	}

}
