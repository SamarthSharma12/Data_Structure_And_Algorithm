import java.util.*;
public class lol{
	public static int sub_ret(int arr[],int sum) {
	 if(arr.length == 0) return 0;
	 int count =0;
	 for(int i =0; i < arr.length-1;i++) {
		 int l = i+1;
		 int r  = arr.length-1;
		 while(l < r) {
			 if(arr[i]+arr[l]+arr[r] == sum) {
				 count++;
				 l++;
				 r--;
			 }
			 if(arr[i]+arr[l]+arr[r] < sum) {
				 l++;
			 }
			 else {
				 r--;
			 }
		 }
	 }
	 return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i =0 ; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		int sum = sc.nextInt();
		System.out.println(sub_ret(arr,sum));
	
	}
} 