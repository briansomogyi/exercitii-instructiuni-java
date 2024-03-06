

public class Problema10 {

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

		for(int i=1000; true; i++) {
			if(prim(i)) {
				System.out.println(i);
				break;
			}
		}
	}

}
