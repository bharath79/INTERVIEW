public class OddEvenMultiThread{
	static int n;
	int count=1;
	public static void main(String s[]) {
		n=10;
		OddEvenMultiThread m = new OddEvenMultiThread();
		
		Thread t1= new Thread(new Runnable() {
			@Override
			public void run() {
				m.printOdd();
			}
		});
		
		Thread t2= new Thread(new Runnable() {
			@Override
			public void run() {
				m.printEven();
			}
		});
		
		t1.start();
		t2.start();
	}
	
	
	void printOdd() {
		synchronized(this) {
			while(count<n) {
				while(count%2==1) {
					try {
						wait();
					} catch (InterruptedException e) {
					}
				}
				System.out.print(count+" ");
				count++;
				notify();
			}
		}
	}
	
	void printEven() {
		synchronized(this) {
			while(count<n) {
				while(count%2==0) {
					try {
						wait();
					} catch (InterruptedException e) {
					}
				}
				System.out.print(count+" ");
				count++;
				notify();
			}
		}
	}
	
}