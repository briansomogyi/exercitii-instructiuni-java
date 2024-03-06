import java.util.Scanner;

public class Problema11 {

	/** This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			if(n<0) {
				System.out.println("Numarul "+n+" nu este un numar natural.");
			}
			else if (n==0) {
				System.out.println("Numarul 0 are o infinitate de divizori.");
			}
			else if(n==1) {
				System.out.println("Numarul 1 are un singur divizor: 1.");
			}
			else {
				System.out.print("Divizorii numarului "+n+" sunt: 1 ");
				for(int i=2; i<=n/2; i++) {
					if(n%i==0) {
						System.out.print(i+" ");
					}
				}
				System.out.println(n);
			}
		}
	}

}
