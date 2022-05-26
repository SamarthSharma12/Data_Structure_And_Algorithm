import java.util.*;
public class find_the_unique_element {
	public static int unique_element(int arr[]) {
		int result = arr[0];
	    for(int i=1;i<arr.length;i++)
	    {
	        result ^= arr[i];
	    }
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
	System.out.println(unique_element(arr));
	}

}
