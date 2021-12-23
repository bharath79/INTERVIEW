import java.util.*;

class ReverseString{
	
	static String reverse(String d) {
		char c[]=d.toCharArray();
		
		int start=0;
		int end=c.length-1;
		
		char temp;
		
		while(end>start) {
			temp=c[end];
			c[end]=c[start];
			c[start]=temp;
			
			end--;
			start++;
		}
		return new String(c);
		
	}
	
	public static void main(String[] args) {
		String x = "edcba";
		
//		approach 1
		StringBuilder  b =new StringBuilder();
		b.append(x);
//		System.out.println(b.reverse().toString());
		
		
//		approach 2
		System.out.println(reverse(x));
	}	

}