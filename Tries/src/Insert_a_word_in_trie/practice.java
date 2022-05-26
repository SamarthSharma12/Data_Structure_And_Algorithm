package Insert_a_word_in_trie;
import java.util.*;
class TrieNode{
	int data;
	TrieNode children[];
	boolean flag;
	
	
	TrieNode(char data){
		this.data =  data;
		this.children = new TrieNode[26];
		this.flag = false;
	}
}
public class practice {
	
	private static TrieNode root;
	
	public practice(){
		root = new TrieNode('\0');
	}
	public static boolean search(TrieNode  root,String word) {
		
		// Base Cases
		if(word.length() == 0) {
			return true;
		}
		
		int index_search = word.charAt(0)-'a';
		TrieNode child = root.children[index_search];
		if(child != null) {
			return search(child,word.substring(1));
		}
		return false;
	}
	
	public static void add(TrieNode root ,String word) {
		if (word.length() == 0) {
			root.flag = true;
			return;
		}
		int letter_index  = word.charAt(0)-'a';
		TrieNode child = root.children[letter_index];
		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[letter_index] = child;
		}
		add(child,word.substring(1));
	}
	public static void add(String word) {
		add(root,word);
	}
	public static boolean search(String word) {
		return search(root,word);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.next();
		add(str);
		//System.out.println(search(str));
	}

}
