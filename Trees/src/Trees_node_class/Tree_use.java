package Trees_node_class;
import java.util.*;
public class Tree_use {
	public static tree_node<Integer> input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter next node data");
		int n = sc.nextInt();
		tree_node<Integer> root = new tree_node<>(n);
		System.out.println("Enter no children of root "+n);
		int childcount = sc.nextInt();
		for(int i =0; i< childcount ;i++) {
			tree_node<Integer> child_node = input();
			root.children.add(child_node);
		}
		return root;
	}
	
	public static void print(tree_node<Integer> root) {
		String s = root.data+":";
		for(int i = 0 ;i < root.children.size();i++) {
			s = s+root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i = 0 ;i < root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	
	public static void main(String[] args) {
//		tree_node<Integer> root = new tree_node<>(4);
//		tree_node<Integer> node1 = new tree_node<>(2);
//		tree_node<Integer> node2 = new tree_node<>(3);
//		tree_node<Integer> node3 = new tree_node<>(5);
//		tree_node<Integer> node4 = new tree_node<>(6);
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		node3.children.add(node4);
//	
//		System.out.print(root);
	
		tree_node<Integer> root = input();
		print(root);
		
	}

}
