package Check_BST_2;
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
	
	public static pair<Boolean,pair<Integer,Integer>> checkBST(Binary_tree_node<Integer> root) {
		if(root == null) {
			pair<Boolean,pair<Integer,Integer>> output = new pair<>();
			output.first = true;
			output.second = new pair<Integer,Integer>();
			output.second.first = Integer.MAX_VALUE;
			output.second.second = Integer.MIN_VALUE;
			return output;
		}
		pair<Boolean,pair<Integer,Integer>>	leftside = checkBST(root.left);
		pair<Boolean,pair<Integer,Integer>>	rightside = checkBST(root.right);
		int min = Math.min(root.data,Math.min(leftside.second.first, rightside.second.first));
		int max= Math.max(root.data,Math.max(leftside.second.second, rightside.second.second));
		
		Boolean isBST = (root.data > leftside.second.second )&&(root.data <= rightside.second.first)&&(leftside.first&&rightside.first);
		
		pair<Boolean,pair<Integer,Integer>> output = new pair<>();
		output.first = isBST;
		output.second = new pair<Integer,Integer>();
		output.second.first = min;
		output.second.second = max;
		return output;
		
	}
	public static void main(String[] args) throws stack_empty {
		Binary_tree_node<Integer> root = take_input();
		pair<Boolean,pair<Integer,Integer>> output= checkBST(root);
		System.out.println(output.first);
	}

}
