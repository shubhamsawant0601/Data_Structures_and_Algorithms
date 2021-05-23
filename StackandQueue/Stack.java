package StackandQueue;

public class Stack {
   
		int capacity = 2;
		int top = 0;
		int Stack[] = new int[capacity];
   
	public void push(int data) {
		if (top == capacity) {
			capacity = 2*capacity;
			int newStack[] = new int[capacity];
			
			for (int i = 0; i < Stack.length; i++) {
				newStack[i] = Stack[i];
			}
			
			newStack[top]=data;
			Stack = newStack;
			top++;
			
		}else {
			
			Stack[top]=data;
			top++;
			
		}
	}
	
	public void pop(){
		top--;
		if (top<capacity/2) {
			capacity = capacity/2;
			int newStack[] = new int[capacity];
			
			for (int i = 0; i < newStack.length; i++) {
				newStack[i] = Stack[i];
			}
			newStack[top] = 0;
			Stack = newStack;
		}else {
			Stack[top] = 0;
		}
	}
	
	public void show() {
		for (int i = 0; i < Stack.length; i++) {
			System.out.println(Stack[i]);
		}
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.pop();
		s.pop();
		s.pop();
		s.show();
	}

}
