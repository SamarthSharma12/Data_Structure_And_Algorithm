import java.util.*;
class Node
{
    int data;
    Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
// Main Class
public class TreeQuestion
{

    Node root;
 
    int minimumDepth()
    {
        return minimumDepth(root);
    }
 
   public static int minimumDepth(Node root)
    {
        if (root == null)
            return 0;
 
        if (root.left == null && root.right == null)
            return 1;
 
        if (root.left == null)
            return minimumDepth(root.right) + 1;
 
        if (root.right == null)
            return minimumDepth(root.left) + 1;
 
        return Math.min(minimumDepth(root.left),
                        minimumDepth(root.right)) + 1;
    }

public class stack_empty extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

public static Node take_input() throws stack_empty{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter root data");
		int root_data = sc.nextInt();
		if(root_data == -1) {
			return null;
		}
		Queue<Node> pendingnodes = new LinkedList<>();
		Node  root = new Node(root_data);
		pendingnodes.add(root);
		
		while(!pendingnodes.isEmpty()) {
			Node front;
			front = pendingnodes.poll();
			System.out.println("Enter left child of"+front.data);
			int leftchild = sc.nextInt();
			if(leftchild != -1) {
				Node child = new Node(leftchild);
				pendingnodes.add(child);
				front.left = child;
			}
			
			System.out.println("Enter right child of"+front.data);
			int rightchild = sc.nextInt();
			if(rightchild != -1) {
				Node child = new Node(rightchild);
				pendingnodes.add(child);
				front.right = child;
			
			}
		}
		return root;
	}
	
public static void main(String args[])
    {
        TreeQuestion tree = new TreeQuestion();
         try {
			Node  n1 = take_input();
			System.out.println("The minimum depth of "+
			          "binary tree is : " + minimumDepth(n1));
         } catch (TreeQuestion.stack_empty e) {
			e.printStackTrace();
		}
        
    }
} 
