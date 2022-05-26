package class_bst;
import java.util.*;
public class Binary_Use {
	public static Binary_tree_node<Integer> take_input() throws stack_empty{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter root data");
		int root_data = sc.nextInt();
		if(root_data == -1) {
			return null;
		}
		Queue<Binary_tree_node<Integer>> pendingnodes = new LinkedList<>();
		Binary_tree_node <Integer> root = new Binary_tree_node<>(root_data);
		pendingnodes.add(root);
		
		while(!pendingnodes.isEmpty()) {
			Binary_tree_node<Integer> front;
			front = pendingnodes.poll();
			System.out.println("Enter left child of"+front.data);
			int leftchild = sc.nextInt();
			if(leftchild != -1) {
				Binary_tree_node<Integer> child = new Binary_tree_node<>(leftchild);
				pendingnodes.add(child);
				front.left = child;
			}
			
			System.out.println("Enter right child of"+front.data);
			int rightchild = sc.nextInt();
			if(rightchild != -1) {
				Binary_tree_node<Integer> child = new Binary_tree_node<>(rightchild);
				pendingnodes.add(child);
				front.right = child;
			
			}
		}
		return root;
	}
	
	
	public static void main(String[] args) throws stack_empty {
		Binary_tree_node<Integer> root = take_input();
		if (root.left.data == 3)
			System.out.println(true);
		//methods_bst_class b = new methods_bst_class();
		//System.out.println(b.datacheck(3));
	}


}
