package practice;
import java.util.*;
public class TreeUse {

public static void print_level_wise(TreeNode<Integer> root) {
	System.out.println("print the tree level_wise");
	Queue<TreeNode<Integer>> mainqueue = new LinkedList<>();
	mainqueue.add(root);
	Queue<TreeNode<Integer>> childqueue = new LinkedList<>();
	while(!mainqueue.isEmpty()) {
		TreeNode<Integer> frontnode = mainqueue.poll();
		System.out.print(frontnode.data+" ");
		for(int i =0 ;i < frontnode.children.size();i++) {
			childqueue.add(frontnode.children.get(i));
		}
		
	if(mainqueue.isEmpty()) {
		mainqueue = childqueue;
		childqueue = new LinkedList<>();
		System.out.println();
	}
	}
}
public TreeNode<Integer> TakeInput(){ 
	Scanner sc = new Scanner(System.in);
	System.out.println("Take root input");
	int data = sc.nextInt();
	TreeNode<Integer> root = new TreeNode<Integer>(data);
	System.out.println("Take no of children of root"+data);
	int n = sc.nextInt();
	for(int i =0;i <n;i++) {
		TreeNode<Integer> node = TakeInput();
		root.children.add(node);
	}
	return root;
}
public static TreeNode<Integer> TakeInput_LevelWise (){
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter Root Data");
	int root_data = sc.nextInt();
	TreeNode<Integer> root = new TreeNode<Integer>(root_data);
	Queue<TreeNode<Integer>> pendingnodes = new LinkedList<>();
	pendingnodes.add(root);
	while(!pendingnodes.isEmpty()) {
		TreeNode<Integer> front_node =  pendingnodes.poll();
		System.out.println("Now Input the number children of "+front_node.data);
		int n = sc.nextInt();
		for(int i =0; i < n;i++) {
			System.out.println("Enter the"+ (i+1)+"th element of "+front_node.data);
			int element_data = sc.nextInt();
			TreeNode<Integer> root_element = new TreeNode<>(element_data);
			
			pendingnodes.add(root_element);
			front_node.children.add(root_element);
		}
	}
	return root;
}
public static void print_recursively(TreeNode<Integer> root) {
	String s = root.data+":";
	for(int i =0 ; i < root.children.size();i++) {
		s = s+" "+root.children.get(i).data;
	}
	System.out.println(s);
	for(int i =0 ; i < root.children.size();i++) {
		print_recursively(root.children.get(i));
	}
}
public static int No_of_nodes(TreeNode<Integer> root) {
	int count = 1;
	for(int i =0 ;i < root.children.size();i++) {
		 count  =count+No_of_nodes(root.children.get(i));
	}
	return count;
}

public static int sum_of_nodes(TreeNode<Integer> root) {
	int sum = root.data;
	for(int i =0 ;i < root.children.size();i++) {
		 sum  =sum+sum_of_nodes(root.children.get(i));
	}
	return sum;
}
public static int largest_node(TreeNode<Integer> root) {
	if (root == null) return Integer.MIN_VALUE;
	int ans  = root.data;
	for(int i =0 ;i < root.children.size();i++) {
		int largest = largest_node(root.children.get(i));
		if(largest > ans) {
			ans = largest;
		}
	}
	return ans;
}
static int count =0; 
public static int numNodeGreater(TreeNode<Integer> root, int x) {
	// Here we have to return number of nodes greater than x
	if(root.data > x)count++; 
	for(int i =0 ;i < root.children.size();i++) {
		numNodeGreater(root.children.get(i),x);
	}
	return count;
}

public static int findheight(TreeNode<Integer> root) {
	if(root == null) {
		return 0;
	}
	int heightprev =0;
	for(int i =0 ;i < root.children.size();i++) {
	int	heightinst=findheight(root.children.get(i));
	if(heightinst > heightprev) {
		heightprev = heightinst;
	}
	}
	return heightprev+1;
}
public static void depth_of_the_node(TreeNode<Integer> root,int k) {
	if( k < 0) {
		return;
	}
	if(k == 0) {
		System.out.print(root.data+" ");
		return;
	}
	
	else {
		for(int i =0 ;i < root.children.size();i++) {
			depth_of_the_node(root.children.get(i),k-1);
		}
	}
}

public static int count_leaf_nodes(TreeNode<Integer> root) {
	if(root.children.size() == 0) {
		return 1;
	}
	int c =0;
	for(int i =0;i < root.children.size();i++) {
		c+= count_leaf_nodes(root.children.get(i));
	}
	return c;
}
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	TreeUse object1 = new TreeUse();
	TreeNode<Integer> root = object1.TakeInput_LevelWise();
	//print_level_wise(root);
	//System.out.println("No of nodes"+No_of_nodes(root));
	//System.out.println("Sum of nodes"+sum_of_nodes(root));
	//System.out.println("Largest of all the nodes"+largest_node(root));
	//System.out.println("Enter the value of X");
	//int x = sc.nextInt();
	//System.out.println("Number of Nodes greater than "+x+"is"+numNodeGreater(root,x));
	//System.out.println("Height of a tree"+findheight(root));
	System.out.println("Depth of the node");
	int k = sc.nextInt();
	object1.depth_of_the_node(root, k);
}


}
