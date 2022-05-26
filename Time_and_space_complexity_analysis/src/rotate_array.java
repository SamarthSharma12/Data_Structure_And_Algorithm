import java.util.*;
public class rotate_array {
	public static void rotate(int arr[] , int d) {
		if(arr.length == 0) {
			return;
		}
		d= d%arr.length;
		reverse(arr,0,arr.length-1);
		reverse(arr,0,arr.length-d-1);
		reverse(arr,arr.length-d,arr.length-1);
	}
	public static void reverse(int arr[],int low,int high) {
		while (low <= high){
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i =0 ; i < n;i++) {
		arr[i] = sc.nextInt();
	}
	int d = sc.nextInt();
	rotate(arr,d);
	for(int i = 0 ; i < arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	}
}



/*
public static void rotate(int arr[],int d) {
int arr_d[] = new int[d];
for(int i = 0 ; i < d;i++) {
	arr_d[i] = arr[i];
}
int l = 0;
for(int i = d ; i < arr.length;i++) {
	arr[l] = arr[i];
	l++;
}
int k = arr.length-1;
for(int i = 0 ; i < d;i++) {
	arr[k]=arr_d[i];
	k--;
}
}
*/