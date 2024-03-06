
public class Problema15 {

	/** This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				int x = 3*1000+i*100+2*10+j;
				if(x%9==0) {
					System.out.print(x+" ");
				}
			}
		}
		
		System.out.println();
	}

}
