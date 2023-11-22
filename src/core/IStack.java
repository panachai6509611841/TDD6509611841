package core;

public interface IStack {
	boolean isEmpty();
	boolean isFull();
	int getSize();
	void push(int item);
	int pop() ;
	int top();
	

}
