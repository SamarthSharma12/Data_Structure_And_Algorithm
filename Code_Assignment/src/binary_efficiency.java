import java.util.*;
public class binary_efficiency {
	public static int binary_efficiency(int arr[]) {
		ArrayList<Integer> storage = new ArrayList<>();
		// Base Case
		if (arr[0] > arr[1]) {
			return arr[0];
		}
	
		
		for(int i =1 ;i < arr.length-2;i++) {
			if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
				 storage.add(arr[i]);
			}
		}
				
				return storage.get(0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i =0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The peak of the array is:"+binary_efficiency(arr));
		
	}

}
