
public class AdjacentDuplicate {
	public static void main(String[] args) {
		String d = "abbccd";
		
		StringBuilder s = new StringBuilder(d);
		
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				s.deleteCharAt(i);
			}
		}
		
		System.out.println(s);
	}

}
