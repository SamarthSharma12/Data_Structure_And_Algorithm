import java.util.*;
public class intersection_array {
	public static void intersection(int arr1[],int arr2[]) {
		sorted(arr1,0,arr1.length-1);
		sorted(arr2,0,arr2.length-1);
		ArrayList<Integer> arr_final = new ArrayList<>();
		int i = 0 ,j =0;
		while (i < arr1.length-1 && j < arr2.length-1) {
			if(arr1[i] == arr2[j]) {
				arr_final.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i] < arr2[j] ) {
				i++;
			}
			else if(arr1[j] < arr2[i] ) {
				j++;
			}
		}
		for (int k = 0; k < arr_final.size(); k++){
            System.out.print(arr_final.get(k) + " ");
    }
	}
	public static void sorted(int arr[],int si,int ei) {
		if(si>=ei)return ;
		int mid = (si+ei)/2;
		sorted(arr,si,mid);
		sorted(arr,mid+1,ei);
		merge(arr,si,ei);
	}
	private static void merge (int[] input, int si,int ei) {
		int mid = (si+ei)/2;
		int ans[] = new int[ei-si+1];
		int i = si;
		int j = mid+1;
		int k=0;
		while(i <= mid && j <= ei) {
			if(input[i] < input[j]) {
				ans[k] =input[i];
				i++;
				k++;
			}
			else {
				ans[k] = input[j];
				j++;
				k++;
			}
		}
	while (i <= mid) {
		ans[k] = input[i];
		i++;
		k++;
		}
	while (j <= ei) {
		ans[k] = input[j];
		j++;
		k++;
	}
	for(int index = 0 ; index <ans.length;index++) {
		input[si+index]= ans[index];
	} 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of the 1st array");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for(int i = 0; i < n;i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Size of the 2nd array");
		int m = sc.nextInt();
		int arr2[] = new int[m];	
		for(int i = 0; i < m;i++) {
			arr2[i] = sc.nextInt();
		}
		intersection(arr1,arr2);
	}
}
