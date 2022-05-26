package classes_and_objects;
import java.util.*;
public class Introduction_to_OOPS {
String name ;
int roll_number ;
public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	Introduction_to_OOPS s1 = new Introduction_to_OOPS();
	s1.name = "Samarth_Sharma";
	s1.roll_number = 400;
	System.out.println(s1.name);
	System.out.println(s1.roll_number);
	System.out.println();
	Introduction_to_OOPS s2 = new Introduction_to_OOPS();
	s2.name = "Suketa";
	s2.roll_number = 395;
	System.out.println(s2.name);
	System.out.println(s2.roll_number);
	
}
}
