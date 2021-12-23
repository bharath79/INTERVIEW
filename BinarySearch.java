import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BinarySearch{
	
	static int a[]= {1,2,3,4,5,6};
	
	static int search(int a[],int key) {
	
		int left=0;
		int right=a.length-1;
		
		while(left<=right) {
			int mid =left+(right-left)/2;
			
			if(a[mid]==key) return mid;
			
			if(a[mid]<key) left=mid+1;

			if(a[mid]>key) right=mid-1;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
	
		
		System.out.println(search(a,4));
	}
	
	@Test
	void canSearch() {
		assertEquals(3, search(a,4));
	}
}

