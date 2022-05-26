package class_bst;

public class methods_bst_class {
private static Binary_tree_node<Integer> root;
	
	
public static boolean datacheck(int data) {
return datacheckhelper(data,root);	
}


private static boolean datacheckhelper(int data, Binary_tree_node<Integer> root) {
	if(root == null) return false;
	
	if(root.data == data) {
		return true;
	}
	
	else if(root.data > data) {
		return datacheckhelper(data,root.left);
	}
	else  {
		return datacheckhelper(data,root.right);
	}

}

}
