package Stack_Creation;

public class Stack_methods {

private int data[];
private int top;

// Initializing the array
public void array(int length) {
	data = new int[length];
	top=-1;
}

// Check for size of an array
public boolean isempty() {
	return (top == -1);
}

// returning the top element from the stack 
public int top() throws Stack_Empty_exception{
	if(top == -1) {
		// stack empty
		Stack_Empty_exception e = new Stack_Empty_exception();
		throw e;
	}
	return data[top];
}

//returning the size of the stack
public int size() {
	return top+1;
}


//To add element in the stack
public void push (int element) throws StackOverflow{
	if(size() == data.length) {
		StackOverflow e = new StackOverflow();
		throw e;
	}
	top++;
	data[top]  = element;
	
}

//To remove element from the stack
public int  pop () throws  Stack_Empty_exception{
	if(size()== 0) {
		// stack empty
		Stack_Empty_exception e = new Stack_Empty_exception();
		throw e;
	}
	
	int val = data[top];
	top--;
	return val;
}

}
