
public class Pattern {

	public static void main(String[] args) {

		int n=10;
		
		for (int i = 0; i<n; i++) {
// for inverted
//			for (int i = n; i>0; i--) {
			for (int k = 2*(n-i); k >0 ; k--) {
				System.out.print(" ");	
				}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
