
public class LinkedListImplementation {
	
	public class Node{
		int value;
		Node next;
		
		public Node(int value) {
			this.value=value;
			this.next=null;
		}
	}

	Node head=null;
	Node tail=null;
	
	public void insert(int value) {
		Node n = new Node(value);
		
		if(head==null) {
			head = n;
			tail = n;
		}else {
			tail.next=n;
			tail=n;
		}
	}
	
	public void display() {
		Node n =head;
		
		while(n!=null) {
			System.out.println(n.value);
			n=n.next;
		}
	}
	
	public void search(int value) {
		Node n= head;
		
		while(n!=null) {
			if(n.value==value) {
				System.out.println("found");
			}
			
			n=n.next;
		}
	}
	
	public void delete(int value) {
		Node n =head;
		
		while(n.next!=null) {
			
			if(n.next.value==value) {
				n.next=n.next.next;
				break;
			}
			n=n.next;
		}
	}
	
	public void sort() {
		Node n =head;
		Node tempNode = null;
		
		int temp;
		
		while(n!=null) {
			tempNode=n.next;
			
			while(tempNode!=null) {
				if(n.value<tempNode.value) {
					temp=n.value;
					n.value=tempNode.value;
					tempNode.value=temp;
				}
				
				tempNode=tempNode.next;
			}
			
			n=n.next;
		}
	}
	
    public Node reverse()
    {
        Node current = head;
        Node prev = null;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            
            current = next;
        }
        return prev;
    }
    
	public static void main(String[] args) {

		LinkedListImplementation ll = new LinkedListImplementation();
		
		ll.insert(5);
		ll.insert(6);
		ll.insert(2);
		ll.insert(4);
		
//		ll.search(7);
		
//		ll.delete(2);
		
//		ll.sort();
		
//		ll.display();
		
		
		//reverse
		Node n=ll.reverse();
		while(n!=null) {
			System.out.println(n.value);
			n=n.next;
		}
	}

}
