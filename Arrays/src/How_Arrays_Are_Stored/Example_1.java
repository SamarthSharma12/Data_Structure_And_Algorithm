 package How_Arrays_Are_Stored;

public class Example_1 {
public static void cal(int input[]) {
	input  =  new int[5];
	for(int i =0 ; i < input.length ; i ++) {
		// Since it is pre-increment therefore the value of each element is increased by one instantly.
		System.out.print(++input[i]);
	}
	System.out.println();
}
public static void main (String[] args) {
	int arr[] = {1,2,3,4,5};
	cal(arr);
for(int i = 0 ; i < arr.length ; i++) {
	System.out.print(arr[i]);
}
}
}
