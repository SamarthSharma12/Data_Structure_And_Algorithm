package Tree_Level_wise;
import java.util.*;


public class Tree_use {
	public static Tree_node<Integer> input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the root data");
		int data = sc.nextInt();
		Tree_node<Integer> root = new Tree_node<>(data);
		queue_method<Tree_node<Integer>> pendingNodes = new queue_method<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isempty()) {
			try {
				Tree_node<Integer> frontnode  = pendingNodes.dequeue();
				System.out.println("Enter number of children of "+ frontnode.data);
				int numchildren = sc.nextInt();
				for(int i =0; i< numchildren;i++) {
					System.out.println("Enter"+(i+1)+"th child of "+frontnode.data);
					int childdata = sc.nextInt();
					Tree_node<Integer> childNode = new Tree_node<>(childdata);
					frontnode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} 
			catch (Queue_empty e) {
				// This is never be get executed
			}
		}
		return root;
	}
	public static void print(Tree_node<Integer> root) {
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
		Tree_node<Integer> root = input();
		print(root);

	}

}
