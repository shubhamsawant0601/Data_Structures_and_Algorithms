package Tree;

public class BinaryTree {
	class Node{
		Node right,left;
		int data;
	}
	Node head;
	public Node Node(int data) {
		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;
		return node;
	}
	
	public void inorder(Node node) {
		if(node==null) {
			return;	
		}
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	public void preorder(Node node) {
		if (node==null) {
			return;
		}
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	public void postorder(Node node) {
		if (node==null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");
	}
 //   public boolean isPresent(Node node,int data) { 	
 //}
	
	public int sum(Node node) {
		if (node==null) {
			return 0;
		}
		return node.data+sum(node.left)+sum(node.right);
	}
	
	public int diffOfEvenOdd(Node node) {
		if (node==null) {
			return 0;
		}
		return node.data-(diffOfEvenOdd(node.left)+diffOfEvenOdd(node.right));				
	}
	
	public int noOfNodes(Node node) {
		if (node==null) {
			return 0;
		}
		return 1 + noOfNodes(node.left) + noOfNodes(node.right);
	}
	
	public int noOfLeaves(Node node) {
		if (node==null) {
			return 0;
		}
		if (node.left==null && node.right==null) {
			return 1;
		}
		return noOfLeaves(node.left) + noOfLeaves(node.right);
	}
	
	public int height(Node node) {
		if (node==null) {
			return -1;
		}
		return (max(height(node.left),height(node.right))+1);
	}
	private int max(int a,int b) {
		return a>b?a:b;
	}
	
	public void elementAt(Node node,int level) {
		if(node==null) {
			return;
		}
		if (level==1) {
			System.out.print(node.data+" ");
		}
		 elementAt(node.left,level-1);
		 elementAt(node.right,level-1);
	}
	
	public void levelorder(Node node) {
		int h = height(node);
		for (int i = 0; i < h+1; i++) {
			elementAt(node,i+1);
			System.out.println();
		}
	}
	public void reverselevelorder(Node node) {
		int h = height(node);
		for (int i = h+1; i >= 0 ; i--) {
			elementAt(node,i);
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		
		Node root = bt.Node(8);
		root.left = bt.Node(4);
		root.right = bt.Node(10);
		root.left.left = bt.Node(2);
		root.left.left.right = bt.Node(3);
		root.left.right = bt.Node(5);
		root.right.left = bt.Node(9);
		root.right.right = bt.Node(11);
		root.right.right.right = bt.Node(12);
		root.left.left.left=bt.Node(1);
		
		
		System.out.println("\ninorder");
		bt.inorder(root);
        System.out.println("\npreorder");
        bt.preorder(root);
        System.out.println("\npostorder");
        bt.postorder(root);
        
        System.out.println("\nSum of all elements "+bt.sum(root));
        System.out.println("Difference of Even Odd Level Elements "+bt.diffOfEvenOdd(root));
        System.out.println("Total no. of Nodes "+bt.noOfNodes(root));
        System.out.println("Total no. of Leaves "+bt.noOfLeaves(root));
        System.out.println("Height of Tree "+bt.height(root));
        System.out.println("Elements at given Level");
        bt.elementAt(root, 4);
        System.out.println("\nLevel Order Traversal");
        bt.levelorder(root);
        System.out.println("\nReverse Level Order Traversal");
        bt.reverselevelorder(root);
        
        
        
        //  System.out.println("\n"+bt.isPresent(root,4));
	}

}
