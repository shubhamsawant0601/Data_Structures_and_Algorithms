import java.util.*;
public class LinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    Node head;
   
   Node newNode(int data){
        Node node = new Node(data);
        return node;
   }
   void add(int data){
       if(head == null){
          head = newNode(data);
       }
       else{
          Node n = head;
          while(n.next!=null){
               n = n.next;
          }
         n.next = newNode(data);
       }
   }
   int get(int index){
       int i = 0;
       Node n = head;
       while(i<index){
            n = n.next;
            i++;
       }
       return n.data;
   }
  public static void main(String args[]){
    LinkedList list = new LinkedList();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n>0){
      int d = sc.nextInt(); 
      list.add(d);
    }
    int index = sc.nextInt();
    System.out.println(list.get(index));
  }
}