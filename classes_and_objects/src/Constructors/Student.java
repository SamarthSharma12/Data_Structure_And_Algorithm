package Constructors;

public class Student {
	String name;
	private int roll_no;
public Student(String str , int rn) {
	name = str;
	roll_no = rn;
}
public  void print() {
	System.out.println("Name of the student"+" "+name+" "+"and roll number"+" "+roll_no);
}
}
