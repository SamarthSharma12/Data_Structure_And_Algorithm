package Check_BST;
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
	
	public static boolean checkBST(Binary_tree_node<Integer> root) {
		if(root == null) return true;
		
		int leftmax = maximum(root.left);
		int rightmin = minimum(root.right);
		if(root.data <= leftmax ) return false;
		if(root.data > rightmin) return false;
		boolean isBSTleft = checkBST(root.left);
		boolean isBSTright = checkBST(root.left);
		if(isBSTleft && isBSTright) {
			return true;
		}
		else {
			return false;
		}
	}

	private static int minimum(Binary_tree_node<Integer> right) {
	if(right == null ) return Integer.MAX_VALUE;
	return Math.min(right.data,Math.min(minimum(right.left),minimum(right.right)));
	}

	private static int maximum(Binary_tree_node<Integer> left) {
		if(left == null ) return Integer.MIN_VALUE;
		return Math.min(left.data,Math.max(minimum(left.left),minimum(left.right)));
	}
	
	
	public static void main(String[] args) throws stack_empty {
		Binary_tree_node<Integer> root = take_input();
		System.out.println(checkBST(root));
	}


}
