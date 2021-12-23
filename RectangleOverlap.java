
public class RectangleOverlap {

	static class Point{
		int x,y;
	}
	
	static boolean overlap(Point l1,Point r1,Point l2,Point r2) {
		
		//check if straight line
		//if l1==r1 & l2==r2
		if(l1.x==r1.x || l1.y==r1.y || l2.x==r2.x || l2.y==r2.y) {
			return false;
		}
		
		//left or right condition
		//if l1 is beyond r2
		if(l1.x>r2.x || l2.x>r1.x) {
			return false;
		}
		
		//up or below condition
		if(r1.y>l2.y || r2.y >l1.y) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {

		Point l1=new Point();
		Point r1=new Point();
		Point l2=new Point();
		Point r2=new Point();
		
		 l1.x=0;
		 l1.y=10; 
		 r1.x=10;
		 r1.y=0;
		 
         l2.x=15;
         l2.y=15; 
         r2.x=25;
         r2.y=25;
         
        if(overlap(l1,r1,l2,r2)) {
        	System.out.println("true");
        }else {
        	System.out.println("no");
        }
	}

}
