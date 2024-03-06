
public class Problema14 {

	/** This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<1001;i++) {
			for(int j=0;j<1001;j++) {
				if(i+j==1000 && (i%17==0 || i%13==0) && (j%19==0 || j%7==0)) {
					System.out.print("("+i+", "+j+") ");
				}
			}
		}
		
		System.out.println();
	}

}
