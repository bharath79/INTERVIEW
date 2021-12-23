import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {

		//approach 1
		Integer a[]= {1,2,3,3,4,5};
		ArrayList<Integer> al = new ArrayList(Arrays.asList(a));
		List l = al.stream().distinct().collect(Collectors.toList());
//		System.out.println(l);
		
		//aproach 2
		Set<Integer> s = new HashSet(al);
		System.out.println(s);
		
		//approach 3
		int n[] = {1,2,3,3,4,5};
		List ll = Arrays.stream(n).boxed().distinct().collect(Collectors.toList());
//		System.out.println(ll);
		
		
	}

}
