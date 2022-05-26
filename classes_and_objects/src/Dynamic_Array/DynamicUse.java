package Dynamic_Array;
import java.util.*;
public class DynamicUse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n = sc.nextInt();
	Dynamic d = new Dynamic();
	for(int i =0 ; i < n ; i ++) {
		d.add(i);
	}
	System.out.println("Size of the dynamic array"+d.size());
	System.out.println("Setting the elements in the dynamic array");
	d.set(4,10);
	System.out.println(d.get(3));
	System.out.println(d.get(6));
	while (!d.isEmpty()) {
		System.out.println(d.removelast());System.out.println("Size of the array ="+d.size());
	}
}
}
