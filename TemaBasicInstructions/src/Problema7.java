import java.util.Scanner;

public class Problema7 {
	
	/** This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int sum = 0;
			for(int i=0; i<n; i++) {
				int x = scanner.nextInt();
				sum += x;
			}
			try {
			    // Block of code to try
				System.out.println(sum/n);
			} catch (Exception e) {
			    // Block of code to handle errors
				System.out.println(e);
			}

		}
	}

}
