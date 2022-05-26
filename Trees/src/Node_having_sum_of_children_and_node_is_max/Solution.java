package Node_having_sum_of_children_and_node_is_max;


public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	public static class MaxPair<T>{
		T sum;
		TreeNode<T> node;
		public MaxPair(TreeNode<T> node,T sum) {
			this.sum = sum;
			this.node = node;
		}
	}
	public static MaxPair<Integer> maxSumNodeHelper(TreeNode<Integer> root){
		if(root == null ) {
			MaxPair<Integer> pair = new MaxPair<>(root,Integer.MIN_VALUE);
			return pair;
		}
		int sum = root.data;
		for(int i =0;i < root.children.size();i++) {
			sum= sum+root.children.get(i).data; 
		}
		MaxPair<Integer> ans = new MaxPair<>(root,sum);

        for(int i =0 ;i < root.children.size();i++){
            MaxPair<Integer> childAns = maxSumNodeHelper(root.children.get(i));
            if(childAns.sum > ans.sum){
                ans = childAns;
            }
        }
        return ans;
	}
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		return maxSumNodeHelper(root).node;

	}}
