//depth first search (pre,in,post order)
//breadth first search
import java.util.*;

class BinaryTreeImplementation{
	
	public class Node{
		int value;
		Node left;
		Node right;
		
		public Node(int value) {
			this.value=value;
			this.left=left;
			this.right=right;
		}
	}
	
	static Node root = null;
	
	public static void main(String[] args) {
		BinaryTreeImplementation bt = new BinaryTreeImplementation();
		
			bt.add(6);
		    bt.add(4);
		    bt.add(8);
		    bt.add(3);
		    bt.add(5);
		    bt.add(7);
		    bt.add(9);

//		    bt.bfs();
		    bt.traversePreOrder(root);
		    
	}
	
	public void add(int value) {
		root = addRecursively(root,value);
	}
	
	public Node addRecursively(Node current,int value) {
		if(current==null) return new Node(value);
		
		if(value<current.value) {
			current.left=addRecursively(current.left,value);
		}else if(value >current.value) {
			current.right=addRecursively(current.right,value);
		}else {
			//value exists
			return current;
		}
		return current;
		
	}
	public Node mirror(Node node)
	    {
	        if (node == null)
	            return node;
	 
	        Node left = mirror(node.left);
	        Node right = mirror(node.right);
	 
	        node.left = right;
	        node.right = left;
	 
	        return node;
	    }
	 
	
	public void traversePreOrder(Node node) {
	    if (node != null) {
	        System.out.print(" " + node.value);
	        traversePreOrder(node.left);
	        traversePreOrder(node.right);
	    }
	}
	
	
	public void bfs() {
	    if (root == null) {
	        return;
	    }

	    LinkedList<Node> nodes = new LinkedList<>();
	    nodes.add(root);

	    while (!nodes.isEmpty()) {

	        Node node = nodes.remove();

	        System.out.print(" " + node.value);

	        if (node.left != null) {
	            nodes.add(node.left);
	        }

	        if (node.right != null) {
	            nodes.add(node.right);
	        }
	    }
	}
}