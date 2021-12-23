import java.util.Arrays;

public class Anagram {

	
	static boolean anagram(String a,String b) {
		
		if(a.length()!=b.length()) return false;
		
		char aa[]=a.toLowerCase().toCharArray();
		char bb[]=b.toLowerCase().toCharArray();
		
		Arrays.sort(aa);
		Arrays.sort(bb);
		
		return Arrays.equals(aa, bb);
	}
	public static void main(String args[]) {

		if(anagram("like","kilE")) {
			System.out.println("ano");
		}else {
			System.out.println("nono");
		}
		
		
	}
	
}
