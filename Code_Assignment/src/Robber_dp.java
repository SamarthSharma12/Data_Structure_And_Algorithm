import java.util.*;
public class Robber_dp {
	public static int Robbery(int nums[]) {
		int n = nums.length;
        int dp[] = new int[n];
        dp[0]=nums[0];
        if(n==1){
            return nums[0];
        }
        
        dp[1] = Math.max(nums[0],nums[1]);
        
        for(int i=2;i<n;i++){
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        
        return dp[n-1];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of an array");
		int n = sc.nextInt();
		System.out.println("Size of a house");
		int k = sc.nextInt(); 
		int arr[] = new int[n];
		for(int i =0 ;i < n; i++) {
			arr[i] = (i+1)*k;
		}
		System.out.println(Robbery(arr));
	}

}
