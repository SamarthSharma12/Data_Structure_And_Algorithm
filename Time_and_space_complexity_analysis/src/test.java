import java.util.*;
public class test {
	public static boolean t(int arr[]) {
		 int n = arr.length;
	        int start = 0;
	        int lsum = 0;
	        int rsum = 0;
	        return helper(arr, n,
	                     start,lsum ,rsum);
	}
	public static boolean helper(int arr[], int n,
            int start, int lsum, int rsum) {
		if (start == n)
	        return lsum == rsum;
		if (arr[start] % 5 == 0)
	        lsum += arr[start];
		else if (arr[start] % 3 == 0)
		        rsum += arr[start];
		else
			 return helper(arr, n, start + 1, lsum + arr[start], rsum)
				        || helper(arr, n, start + 1, lsum, rsum + arr[start]);
		
		return helper(arr, n, start + 1, lsum, rsum);
	
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i =0 ; i < n;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println(t(arr));
}
}
