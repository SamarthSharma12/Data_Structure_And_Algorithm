package diameter_better;
import java.util.*;

import Binary_tree_introduction.binary_tree_node;
public class Binary_tree_use {
	public static Binary_tree_node<Integer> take_input(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter root data");
		int root_data = sc.nextInt();
		if(root_data == -1) {
			return null;
		}
		queue<Binary_tree_node<Integer>> pendingnodes = new queue<>();
		Binary_tree_node <Integer> root = new Binary_tree_node<>(root_data);
		pendingnodes.enqueue(root);
		
		while(!pendingnodes.isempty()) {
			Binary_tree_node<Integer> front;
			try {
				front = pendingnodes.dequeue();
			} catch (stack_empty e) {
				return null;
			}
			System.out.println("Enter left child of"+front.data);
			int leftchild = sc.nextInt();
			if(leftchild != -1) {
				Binary_tree_node<Integer> child = new Binary_tree_node<>(leftchild);
				pendingnodes.enqueue(child);
				front.left = child;
			}
			
			System.out.println("Enter right child of"+front.data);
			int rightchild = sc.nextInt();
			if(rightchild != -1) {
				Binary_tree_node<Integer> child = new Binary_tree_node<>(rightchild);
				pendingnodes.enqueue(child);
				front.right = child;
			}
		}
		return root;
	}
	public static void print(Binary_tree_node<Integer> root) {
		if(root == null) {
			return ;
		}
		String Tobeprinted = root.data+" ";
		if(root.left != null) {
			Tobeprinted+= "L:"+root.left.data+",";
		}
		if(root.right != null) {
			Tobeprinted+= "R:"+root.right.data+",";
		}
		System.out.println(Tobeprinted);
		print(root.left);
		print(root.right);
	}
	// Better way to do this
	
//	public static int height(Binary_tree_node<Integer> root) {
//		if (root == null) return 0;
//		return Math.max(height(root.left), height(root.right))+1;
//	}
//	
//	public static int diameter(Binary_tree_node<Integer> root) {
//		if(root == null) return 0;
//		int option1 = height(root.left)+height(root.right);
//		int option2 = diameter(root.left);
//		int  option3 = diameter(root.right);
//		return Math.max(option3, Math.max(option1, option2));
//	}
	
	public static pair<Integer,Integer> heightanddiameter(Binary_tree_node<Integer> root){
		if(root == null) {
			pair<Integer,Integer> output = new pair<>();
			output.first=0;
			output.second  = 0;
			return output;
		}
		pair<Integer,Integer> lo = heightanddiameter(root.left);
		pair<Integer,Integer> ro = heightanddiameter(root.right);
		int height = Math.max(lo.first, ro.first)+1;
		int option1 = lo.first+ro.first;
		int option2 = lo.second;
		int option3 = ro.second;
		int diameter = Math.max(option1, Math.max(option2, option3));
		pair<Integer,Integer> output = new pair<>();
		output.first=height;
		output.second  =diameter;
		return output;
	}
	public static void main(String[] args) {
		Binary_tree_node<Integer> root = take_input();
		print(root);
		System.out.println("Diameter is:"+heightanddiameter(root).second);

	}

}
