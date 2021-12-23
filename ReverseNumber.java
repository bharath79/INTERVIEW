import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class ReverseNumber {
	
	
//String Approach
//	static int reverse(int n) {
//		StringBuilder s = new StringBuilder();
//		s.append(n);
//		s.reverse();
//		n=Integer.parseInt(s.toString());
//		return n;
//		
//	}
	
//number approach	
	static int reverse(int number){
		if(number<0) throw new IllegalArgumentException("positive");
		int reverse=0;
		int remainder=0;
		while(number>0) {
			remainder=number%10;
			reverse= reverse*10+remainder;
			number/=10;
		}
		return reverse;
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(reverse(321));
	}
	
	
	@Test
	void shouldReverse() {
		assertEquals(123, reverse(321));
		
		try {
			reverse(-321);
			fail("positive");
		}catch(Exception e) {
			
		}
		
	}

}
