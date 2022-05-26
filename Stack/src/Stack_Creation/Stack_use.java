package Stack_Creation;
import java.util.*;
public class Stack_use {
public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	int length = sc.nextInt();
	Stack_methods s = new Stack_methods();
	s.array(length);
	System.out.println(s.size());
	System.out.println(s.isempty());
	for(int i =1 ;i <= length;i++) {
		s.push(i);
	}
	System.out.println(s.pop());
	System.out.println(s.size());
	System.out.println(s.top());
	while(!s.isempty()) {
		try {
			s.pop();
		}
		catch(Stack_Empty_exception e){
			// Never get executed
		}
	}
	
	try {
		System.out.println(s.top());
	}
	catch(Stack_Empty_exception  e){
		System.out.println(e);
}
}
}
