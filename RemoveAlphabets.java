import java.util.*;

public class RemoveAlphabets {

	public static void main(String[] args) {
		String s1="abc",s2="ad";
		
		String x1[]=s1.split("");
		String x2[]=s2.split("");

		List<String> l1=new ArrayList(Arrays.asList(x1));
		List<String> l2=new ArrayList(Arrays.asList(x2));
		
		String a2="";
		for(String d:l2) {
			if(l1.contains(d)) l1.remove(d);
			else a2+=d;
		}
		
		System.out.println(l1);
		System.out.println(a2);
	}

}
