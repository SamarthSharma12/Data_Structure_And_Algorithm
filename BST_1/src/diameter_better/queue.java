package diameter_better;

public class queue<T> {
node<T> front;
node<T> rear;
int size;
public queue() {
	this.front = null;
	this.rear = null;
	this.size = 0;
}

public int size() {
	return this.size;
}

public T front() throws stack_empty {
	if(this.size == 0) {
		throw new stack_empty() ;
	}
	return this.front.data;
}

public void enqueue(T element) {
	node<T> newnode = new node<>(element);
	 this.size++;
	 if(this.front == null) {
		 this.front = newnode;
		 this.rear = newnode;
		 return;
	 }
	 this.rear.next = newnode;
	 this.rear = newnode;
}

public T dequeue() throws stack_empty {
	if (this.size == 0) {
		throw new stack_empty();
	}
	this.size --;
	T value = front.data;
	front = front.next;
	return value;
}
boolean isempty() {
	return this.size == 0;
}

}
