package core;

public class Stack implements IStack {
	int[] values;
	int top;
	int size = 3;
	
	public Stack()
	{
		values = new int[size];
		top = -1;
	}
	
	@Override
	public boolean isEmpty() {
		
		return top == -1;
	}

	@Override
	public int getSize() {
		
		return size;
	}
	@Override
	public boolean isFull()
	{
		return top == 2;
	}
	@Override
	public void push(int item)
	{
		 {
			 top++;
			 values[top] = item;
		 }
	}
			
		
	
	@Override
	public int pop() 
	{
		int poppy = values [top];
		top--;
		return poppy;
	}
	@Override
	public int top()
	{
		return values[top];
	}

}
