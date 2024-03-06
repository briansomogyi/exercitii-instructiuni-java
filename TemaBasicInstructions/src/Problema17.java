import java.util.Scanner;

public class Problema17 {

	/** This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int x = n;
			int max = -1;
			
			do {
				int c = x % 10;
				if(c > max) {
					max = c;
				}
				x /= 10;
			}
			while(x>0);
			
			System.out.println("Cifra maxima a numarului "+n+" este: "+max);
		}
	}

}
