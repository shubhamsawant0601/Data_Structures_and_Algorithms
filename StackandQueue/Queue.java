package StackandQueue;

public class Queue {
	int capacity = 2;
	int Queue[] = new int[capacity];
	int top = 0;
	int base = 0;
	int size = 0;
	
	public void enqueue(int data) {
		if (top==capacity) {
			capacity = 2*capacity;
			int newQueue[] = new int[capacity];
			for (int i = base; i < Queue.length; i++) {
				newQueue[i] = Queue[i];
			}
			newQueue[top]=data;
			Queue = newQueue;
			top++;
						
		}else {
			Queue [top]=data;
			top++;
		}
	}
	public void dequeue() {
		if (size()<capacity/2) {
			capacity = capacity/2;
			int newQueue[] = new int[capacity];
			for (int i = 0; i < newQueue.length; i++) {
				base++;
				newQueue[i] = Queue[base];
			}
			Queue = newQueue;
			base = 0;
		}else {
			base++;
		}
	}
	public int size() {
		
		return (top-base+1);
	}
	public void show() {
		for (int i = base; i < Queue.length; i++) {
			System.out.println(Queue[i]);
		}
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);
		
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		q.show();
	}
}
