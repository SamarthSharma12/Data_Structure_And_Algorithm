package Trees_node_class;
import java.util.*;
public class tree_node<T> {
T data;
ArrayList <tree_node<T>> children ;
public tree_node(T data) {
	this.data = data;
	children = new ArrayList<>();
}
}
