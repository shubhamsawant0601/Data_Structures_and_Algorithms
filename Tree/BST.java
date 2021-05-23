package Tree;

public class BST {
	
	class Node{
		Node right,left;
		int data;
	}
	
	Node root;
	BST(){
		root=null;
	}
	
	public void insert(int data) {
		root = insertelement(root,data);
	}

	private Node insertelement(Node node, int data) {
		if(node==null) {
			node = newNode(data);
		}else {
			
			if(data<node.data) {
				node.left = insertelement(node.left,data);
			}else if(data>node.data){
				node.right = insertelement(node.right,data);
			}
		}
		return node;
	}
	

	private Node newNode(int data) {
		Node node = new Node();
		node.data = data;
		node.left = node.right = null;
		return node;
	}
	
	public void inorder() {
		System.out.println("Inorder traversal");
		inorder(root);
	}
	
	private void inorder(Node node) {
		if(node!=null) {
			inorder(node.left);
			System.out.print(node.data+" ");
			inorder(node.right);
		}
	}
	
	public void preorder() {
		System.out.println("\nPreorder traversal ");
		preorder(root);
	}
	private void preorder(Node node) {
		if (node!=null) {
			System.out.print(node.data+" ");
			preorder(node.left);
            preorder(node.right);
		}
	}

	public void postorder() {
		System.out.println("\nPostorder traversal ");
		postorder(root);
	}

	private void postorder(Node node) {
		if (node!=null) {
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data+" ");
		}
	}	
	
	public void sum() {
		int sum = sum(root);
		System.out.println("\nThe Sum of all Element "+sum);
	}	
	public int sum(Node node) {
		if (node==null) {
			return 0; 
		}
		return node.data + sum(node.left) + sum(node.right);
	}
	
	public void diffOddEven() {
		int diff = diffOddEven(root);
	    System.out.println("Difference of Odd Even "+diff);
	}
	

	private int diffOddEven(Node node) {
		if (node==null) {
			return 0;
		}
		return node.data - (node.left.data+node.right.data);
	}

	public static void main(String[] args) {
	      BST s = new BST();
	      
	      s.insert(15);
	      s.insert(7);
	      s.insert(4);
	      s.insert(10);
	      s.insert(2);
	      s.insert(5);
	      s.insert(8);
	      s.insert(11);
	      s.insert(25);
	      s.insert(20);
	      s.insert(35);
	    
	      s.inorder();
	      s.preorder();
	      s.postorder();
	      
	      s.sum();
	      s.diffOddEven();

				
	}

}
