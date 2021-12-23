import java.util.HashMap;
import java.util.Map;

public class LetterCount {

	public static void main(String[] args) {
		String s="bharath";
		
		char c[]=s.toCharArray();
		
		Map<Character,Integer> h =new HashMap();
		
		for(char d:c) {
			if(h.containsKey(d)) {
				h.put(d,h.get(d)+1);
			}else {
				h.put(d, 1);
			}
		}
		
		System.out.println(h);

	}

}
