import java.util.*;

public class linked_list {
	
	public static node LL(){
		node  head = null;
		Scanner sc = new Scanner (System.in);
		int data = sc.nextInt();
		while(data!=-1) {
			node  newnode = new node (data);
			if(head == null) {
				head = newnode;
			}
			else {
				node temp = head;
				while(temp.next_index != null) {
					temp = temp.next_index;
				}
				temp.next_index = newnode;
			}
			data = sc.nextInt();
		}
		return head;
	}
	
	
	
	 
	static int findPeak( node head)
	{
	    
	    if (head == null)
	        return -1;
	 

	    if (head.next_index == null)
	        return head.element;
	 
	    int prev = head.element;
	    node curr;
	    for (curr = head.next_index; curr.next_index != null;
	        curr = curr.next_index)
	    {
	 
	        if (curr.element > curr.next_index.element
	            && curr.element > prev)
	            return curr.element;
	 
	        prev = curr.element;
	    }
	 
	    if (curr.element > prev)
	        return curr.element;
	 
	   
	    else
	        return -1;
	}
	
	
	}

	

