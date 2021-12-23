
public class TripletSum {

	public static void main(String[] args) {
		int a[] = { 1, 4, 45, 6, 10, 8 };
        int d = 22;
        
        sum(a,d);
	}
	
	static void sum(int a[],int d) {
		for (int i = 0; i < a.length-2; i++) {
			for (int j = i+1; j < a.length-1; j++) {
				for (int k = j+1; k < a.length; k++) {
					if(a[i]+a[j]+a[k]==d) {
						System.out.println(a[i]+","+a[j]+","+a[k]);
					}
				}
			}
		}
		
	}

}
