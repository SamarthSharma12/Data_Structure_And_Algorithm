package Tree_Level_wise;


public class queue_method<T> {
private int size;
private  node<T> front;
private node<T> rear;
public queue_method() {
	front = null;
	rear = null;
	size =0;
}

 int size() {
	return size;
}

T top() throws Queue_empty {
	if(size() == 0) {
		throw new Queue_empty();
	}
	
	return this.front.data;
}
 
void enqueue(T data) {
	node<T> newnode = new node<>(data);
	 this.size++;
	 if(this.front == null) {
		 this.front = newnode;
		 this.rear = newnode;
		 return;
	 }
	 this.rear.next = newnode;
	 this.rear = newnode;
}

T dequeue() throws Queue_empty {
	if(size() == 0) {
		throw new Queue_empty();
	}
	this.size--;
	T val = this.front.data;
	front = front.next;
	return val;
}

boolean isempty() {
	return size()==0;
}
}
