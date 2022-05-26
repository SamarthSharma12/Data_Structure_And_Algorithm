package classes_and_objects;
public class Student {
// Here I am going to use Access modifiers like public , private and default.
	String name; // This one is default modifier , it is accessible within this package .
	private int roll_no; // Now this one is accessible inside this class only, even not within this package .
	 
// Now if we want to access this roll_number in another class within this package we have to write get and set function 
	public void set_function(int rn) {
		roll_no = rn;
	}
	public int get_function() {
		return roll_no;
	}
}
