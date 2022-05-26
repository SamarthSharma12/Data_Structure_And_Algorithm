import java.util.*;
public class Array_Sum {
public static int[] Array() {
	Scanner sc = new Scanner(System.in);
	int n  = sc.nextInt();
	int arr[] = new int[n];
	for(int i =0; i < n ; i++) {
		arr[i] = sc.nextInt();
	}
return arr;
}
public static int Sum(int arr[]) {
	int size = arr.length;
	int sum = 0;
	for (int i = 0; i < size ; i++) {
		sum = sum + arr[i];
	}
return sum;
}
public static void main(String[] args) {
	int k[] = Array();
	System.out.println(Sum(k));
}
}
