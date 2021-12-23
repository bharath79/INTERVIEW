class QuickSort{
	public static void main(String[] args) {
		int a[]= {4,1,2,5,3};
		
		sort(a,0,a.length-1);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	static void sort(int a[],int low,int high){
		if(low<high) {
			int pi = partition(a,low,high);
			
			sort(a,low,pi-1);
			sort(a,pi+1,high);
		}
	}
	
	static int partition(int a[],int low,int high) {
		int pivot = a[high];
		int i = low-1;
		
		for(int j=low;j<high;j++) {
			if(a[j]<pivot) {
				i++;
				swap(a,i,j);
			}
		}
		swap(a,i+1,high);
		return i+1;
		
	}
	
	static void swap(int a[],int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}