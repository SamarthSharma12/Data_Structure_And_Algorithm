package Binary_tree_introduction;

public class Binary_Use {
public static void main(String[] args) {
	binary_tree_node<Integer> root = new binary_tree_node<>(1);
	binary_tree_node<Integer> node1 = new binary_tree_node<>(2);
	root.left = node1;
	binary_tree_node<Integer> node2 = new binary_tree_node<>(3);
	root.right = node2;
}
}
