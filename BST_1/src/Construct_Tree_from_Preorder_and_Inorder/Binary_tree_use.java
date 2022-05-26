package Construct_Tree_from_Preorder_and_Inorder;
import java.util.*;
public class Binary_tree_use {
public static void printLevelWise(Binary_tree_node<Integer> root) {
		
		Queue<Binary_tree_node<Integer>> pendingnodes = new LinkedList<>();
	    pendingnodes.add(root);
	    while(!pendingnodes.isEmpty()){
	        Binary_tree_node<Integer> front_node = pendingnodes.poll();
	        if(front_node == null){
	            return;
	        }
	        else{
	            System.out.print(front_node.data+":L:");
	            if(front_node.left != null){
	                pendingnodes.add(front_node.left);
	                System.out.print(front_node.left.data);
	            }
	           
	            }
	             if(front_node.right != null){
	                pendingnodes.add(front_node.right);
	                System.out.print(",R:"+front_node.right.data);
	            }
	         
	            
	            System.out.println();
	            
	        }
	    
		} 
/*	private static Binary_tree_node<Integer> BuildTreehelper(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd) { 
	        if (preStart > preEnd || inStart > inEnd) { 
	            return null;
	        } 
	        int rootVal = preOrder[preStart];
	        Binary_tree_node<Integer> root = new Binary_tree_node<>(rootVal);
	        // Find root element index from inOrder array 
	        int k = 0; 
	        for (int i = inStart; i <= inEnd; i++) { 
	            if (rootVal == inOrder[i]) { 
	                k = i; break;
	            }
	        }
	        root.left = BuildTreehelper(preOrder, preStart + 1, preStart + (k - inStart), inOrder, inStart, k - 1); 
	        root.right = BuildTreehelper(preOrder, preStart + (k - inStart) + 1, preEnd, inOrder, k + 1, inEnd);
	        return root; 
	    }	*/
	
	public static Binary_tree_node<Integer> helper(int[]preOrder,int Prestart,int Preend,int[] Inorder,int Instart,int Inend){
	if(Prestart > Preend ) return null;
	int root_value = preOrder[Prestart];
	Binary_tree_node<Integer>  root = new Binary_tree_node<Integer> (root_value);
	int root_index = -1;
	for(int i = Instart; i <= Inend;i++) {
		if(root_value == Inorder[i]) {
			root_index =i;
			break;
		}
	}
	
	
	int leftInStart = Instart;
	int leftInEnd = root_index-1;
	int leftPreStart = Prestart +1;
	int leftPreEnd =  leftInEnd - leftInStart + leftPreStart;
	int rightPreStart = leftPreEnd+1;
	int rightPreEnd  = Preend;
	int rightInStart =  root_index +1;
	int rightInEnd = Inend;
	root.left = helper(preOrder,leftPreStart,leftPreEnd,Inorder,leftInStart,leftInEnd);
	root.right = helper(preOrder,rightPreStart,rightPreEnd,Inorder,rightInStart,rightInEnd);
	return root;	
	}
	
	public static Binary_tree_node<Integer> BuildTree(int[] preOrder,int[] inOrder){
		// preorder means = root,left,right
		// inorder means = left,root,right
		int Prestart = 0;
		int Preend = preOrder.length-1;
		int Instart = 0;
		int Inend = inOrder.length-1;
		return helper(preOrder,Prestart,Preend,inOrder,Instart,Inend);
	}
	public static void main(String[] args) {
		int Preorder[] = {1,2,4,5,3,6,7};
		int Inorder[] = {4,2,5,1,6,3,7};
		Binary_tree_node<Integer> root =BuildTree(Preorder,Inorder) ;
		printLevelWise(root);
	

	}

}
