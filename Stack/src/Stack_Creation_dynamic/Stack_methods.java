package Stack_Creation_dynamic;

public class Stack_methods {
private int data[];
private int top = -1;
	public void array(int length) {
	data = new int[length];
	top = -1;
	}
	
	public int size() {
		return top+1; 
	}
	
	public int pop() throws Stack_Empty{
		if(size() == 0) {
			Stack_Empty e = new Stack_Empty();
			throw e;
		}
		int val = data[top];
		top--;
		return val;
	}
	
	public void push(int element) {
		if(size() == data.length) {
			int newdata[] = data;
			data = new int[2*newdata.length];
		// or we can say i < newdata.length 
		for(int i =0 ; i <= top  ;i++) {
			data[i] = newdata[i];
		}
		}
		top++;
		data[top] = element;
	}
	
	public int top() throws Stack_Empty{
		if(size() == 0) {
			Stack_Empty e = new Stack_Empty();
			throw e;
		}
		return data[top];
	}
	
	public boolean isempty() {
		return (top == -1);
	}
}
