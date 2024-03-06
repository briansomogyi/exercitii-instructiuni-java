import java.util.Scanner;

public class Problema12 {

	public static boolean prim(int x) {
		if(x<2) {
			return false;
		}
		if(x==2) {
			return true;
		}
		if(x%2==0) {
			return false;
		}
		for(int i=3; i<=x/2; i+=2) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}
	
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
				System.out.println("Numarul 0 are o infinitate de divizori primi.");
			}
			else if(n==1) {
				System.out.println("Numarul 1 are un singur divizor, iar acesta nu este prim.");
			}
			else {
				System.out.print("Divizorii primi ai numarului "+n+" sunt: ");
				for(int i=2; i<=n/2; i++) {
					if(n%i==0 && prim(i)) {
						System.out.print(i+" ");
					}
				}
				if(prim(n)) {
					System.out.print(n);
				}
				System.out.println();
			}
		}
	}

}
