import java.util.Scanner;

public class Problema6 {
	
	/** This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int sum = 0;
			for(int i=1; i<=n; i+=2) {
				sum += i;
			}
			System.out.println(sum);
		}
	}

}
