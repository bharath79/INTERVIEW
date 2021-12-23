
public class CustomException {

	static class MyException extends Exception{
		String s;
		
		public MyException(String s) {
			this.s=s;
		}
		
		public String toString() {
			return s;
		}
	}
	
	public static void main(String[] args) {
		try {
			throw new MyException("hello world");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
