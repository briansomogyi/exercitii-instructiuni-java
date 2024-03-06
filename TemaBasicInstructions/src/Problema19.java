import java.util.Scanner;

public class Problema19 {

	/** This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner scanner = new Scanner(System.in)) {
			int numar = scanner.nextInt();
			int copie = numar;
			int oglindit = 0;
			
			do {
				int ultimaCifra = copie % 10;
				oglindit = oglindit * 10 + ultimaCifra;
				copie /= 10;
			}
			while(copie > 0);
			
			System.out.println(oglindit);
		}
	}

}
