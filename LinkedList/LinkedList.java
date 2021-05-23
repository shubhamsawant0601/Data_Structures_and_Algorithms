package LinkedList;

public class LinkedList {
	class Node{
		Node next ;
		int data;
	}
	
	Node head;
	
	public Node newnode(int data ) {
		Node node = new Node();
		node.data = data;
		node.next =  null;
		return node;
	}
	
	public void add(int data) {
		if (head==null) {
			head = newnode(data);
		}
		else{
			Node n = head;
			while (n.next!=null) {
				   n = n.next;	
			}
			
			Node node = newnode(data);
			n.next = node;
		}
	}
	
	public void insertAt(int index,int data) {
		Node node = newnode(data);
		if (index == 0) {
			node.next = head;
			head = node;
		}
		else {
		    int i = 0;
		    Node n = head;
		    while (i<index-1){
			      i++;
			      n = n.next;
	        }
	        node.next = n.next;
	        n.next = node;
	    }
	}
	
	public void insertAtStart(int data) {
		Node node = newnode(data);
		Node n = head;
	
		node.next = n ;
		head = node;
	}
	
	public void delete(int data) {
		Node n = head;
		while(n.next.data!=data) {
			n = n.next;
		}
		n.next = n.next.next;
		
	}
	public void deleteAt(int index) {
		int i = 0;
		Node n = head;
		while (i<index-1) {
			n = n.next;
			i++;
		}
		n.next = n.next.next;
	}
	
	
	
	public void print() {
		Node n = head ;
		while (n.next!=null) {
			System.out.print(n.data+" >> ");
			n = n.next;
		}
		System.out.println(n.data);
	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);	
		l.print();
		
		l.insertAt(1,10);
		l.print();
		
		l.delete(10);
		l.print();
		
		l.deleteAt(5);
		l.print();
	

	}
}