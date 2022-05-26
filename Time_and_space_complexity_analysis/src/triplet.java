import java.util.*;
public class triplet {
	public static int triplet_sum(int arr[],int n) {
		int triple_count =0;
		for(int i =0; i < arr.length;i++) {
			int sum = n-arr[i];
			triple_count+= pair_count(arr,i+1,arr.length-1,sum);
		}
	return triple_count;
	}
	public static int pair_count(int arr[],int l,int e,int sum) {
		int count=0;
		while(l<e) {
			if(arr[l]+arr[e] < sum)l++;
			else if(arr[l]+arr[e] > sum)e--;
			else {
				int startelementindex = arr[l];
				int endelementindex = arr[e];
				if(startelementindex == endelementindex) {
					int total_no_of_elements = (e-l)+1;
					count+=(total_no_of_elements*(total_no_of_elements+1))/2;
					return count;
				}
				int tempstartindex = l+1;
				int tempendindex   = e-1;
				while(tempstartindex <= tempendindex && startelementindex == arr[tempstartindex]) {
					tempstartindex++;
				}
				while(tempstartindex <= tempendindex && endelementindex == arr[tempendindex]) {
					tempstartindex++;
				}
				
				// No of count
				count+=(tempstartindex-l)*(e-tempendindex);
				
				e =tempendindex;
				l =tempstartindex;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the value of n");
		int n = sc.nextInt();
		int arr[] = new int [n];
		for(int i = 0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Pairs equal to sum");
		int sum = sc.nextInt();
		System.out.println(triplet_sum(arr,sum)); 
		}
}
/*
 My Approach
 int l,r;
		int count = 0;
		Arrays.sort(arr);
		 for (int i = 0; i <= aar_size ; i++) {
			 l = i + 1;
			 r = aar_size ;
			 
			 while (l < r) {
	                if (arr[i] + arr[l] + arr[r] == sum) {
	                    count++;
	                    l++;
	                    r--;
	                }
	                else if (arr[i] + arr[l] + arr[r] < sum)
	                    l++;
	 
	                else // A[i] + A[l] + A[r] > sum
	                    r--;
	            }
		 }
		 return count;
 */



