import java.util.*;
public class  Arrange_Number_in_a_Array{
public static void Array() {
	Scanner sc  = new Scanner(System.in);
	int n = sc.nextInt();
	int array[] = new int[n];
	int i = 0;
	int j = n-1;
	int l = 1;
	
	while (i <= j) {
		if( l % 2 ==0) {
			array[j] = l;
			j--;
		}
		else {
			array[i] = l;
			i++;
		}
	
	}
	l++;

}
public static void main (String[] args) {
	// Scanner sc = new Scanner(System.in);
	Array();
}
}
