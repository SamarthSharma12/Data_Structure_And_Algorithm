
public class Main {

	public static void main(String[] args) {
		// Here I've to directly insert values in Linked List and if I want to terminate use -1
		linked_list l = new linked_list();
		node head = l.LL();
		int k = l.findPeak(head);
		System.out.println("The peak in the array is:" +k);
	}

}
