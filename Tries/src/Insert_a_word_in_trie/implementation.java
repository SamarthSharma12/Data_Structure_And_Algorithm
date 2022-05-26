package Insert_a_word_in_trie;
import java.util.*;
class TrieNode{
	char data;
	TrieNode children[];
	boolean isTerminating;
	public TrieNode(char data) {
		this.data = data;
		this.isTerminating = false;
		this.children = new TrieNode[26];
	}
}
public class implementation {
	private TrieNode root;
	public implementation() {
	root = new TrieNode('\0');
	}
	
	private void add(TrieNode root ,String Word) {
		//Base Case 
		if(Word.length() == 0) {
			root.isTerminating =  true;
			return;
		}
		
		// Here we are considering only the lower case letters
		int index = Word.charAt(0) - 'a';
		TrieNode child = root.children[index];
		if(child == null) {
			child = new TrieNode(Word.charAt(index));
			root.children[index] = child;
		}
		add(child,Word.substring(1));
	}
	
	public void add(String word) {
		add(root,word);
	}
	
	// For Searching
	
	private boolean search(TrieNode root, String word) {
		// Base Case
		if(word.length() == 0) {
			return root.isTerminating;
		}
		int childindex = word.charAt(0)-'a';
		TrieNode child = root.children[childindex];
		if(child == null) {
			return false;
		}
		return search(child,word.substring(1));
	}
	
	public boolean search(String word) {
		return search(root,word);
	}
	
	private void remove(TrieNode root,String word) {
		if (word.length() == 0) {
			root.isTerminating = false;
			return;
		}
		int childindex = word.charAt(0) - 'a';
		TrieNode child = root.children[childindex];
		if(child == null) {
			return;
		}
		remove(child,word.substring(1));
		
		if(!child.isTerminating) {
			int numchild=0;
			for(int i =0;i< 26;i++) {
				if(child.children[i] != null) {
					numchild++;
					return ;
				}
			}
			if(numchild == 0) {
				child.children[childindex] = null;
				child = null;
			}
		}
	}
	public void remove(String word) {
		remove(word);
	}
	
	public void sample(){
        TrieNode child = root;
        ArrayList<String> vect = new ArrayList<>();
        for(int i =0 ;i < 26;i++){
        	TrieNode memb = child.children[i];
        String 
        for(int j = 0 ;j < memb.length();j++){
            vect.add(memb.substring(j,memb.length()));
        }
        }
    }
	public boolean patternMatching(ArrayList<String> vect, String pattern) {
		for(String i : vect){
            if(i == pattern){
                return true;
            }
        }
        return false;
	}

}
     