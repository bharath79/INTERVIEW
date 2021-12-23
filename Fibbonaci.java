
public class Fibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fib(9);
	}

	private static void fib(int i) {
		int d[]=new int[i+2];
		d[0]=0;
		d[1]=1;
		
		for (int j = 2; j < d.length; j++) {
			d[j]=d[j-1]+d[j-2];
			System.out.print(d[j]+" ");
		}
		
	}

}
