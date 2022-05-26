package Tree_Level_wise;
import java.util.*;
public class Tree_node<T> {
 T data;
 ArrayList<Tree_node<T>> children;
public Tree_node(T data) {
	this.data = data;
	children = new ArrayList<>();
}
}
