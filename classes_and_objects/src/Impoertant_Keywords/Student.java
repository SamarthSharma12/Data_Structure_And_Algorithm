package Impoertant_Keywords;

public class Student {
public String name;
private final int roll_no ;
public Student(String str , int rn) {
	name = str;
	roll_no = rn;
}
public void print() {
	System.out.println("Name of the student"+" "+name+" "+"and roll_no"+" "+roll_no);
}
}
