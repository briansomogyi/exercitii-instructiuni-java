import java.util.Scanner;

public class Problema9 {

	/** This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			boolean prim = true;
			if(n<2) {
				prim = false;
			}
			else if(n==2) {
				prim = true;
			}
			else if(n%2==0) {
				prim = false;
			}
			for(int i=3; i<=n/2 && prim; i+=2) {
				if(n%i==0) {
					prim = false;
				}
			}
			if(prim) {
				System.out.println("prim");
			}
			else {
				System.out.println("nu");
			}
		}
	}

}
