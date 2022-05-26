import java.util.*;
public class duplicate_time_complexity {
	public static int duplicate(int arr[]) {
		int sumofminimustwonaturalnumber =0;
		int sum=0;
		for(int i =0 ; i < (arr.length-1);i++ ) {
			sumofminimustwonaturalnumber += i;
		}
		for(int i =0 ; i < arr.length;i++) {
			sum+=arr[i];
		}
	return (sum-sumofminimustwonaturalnumber);
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int [n];
	for(int i = 0 ; i < n;i++) {
		arr[i] = sc.nextInt();
	}
	System.out.println(duplicate(arr));
	}
}



/*
   First Approach
public static int duplicate(int arr[]) {
int num=0;
for(int i =0; i < arr.length;i++) {
for(int j = 1; j < arr.length;j++) {
	if(arr[i] == arr[j]&& i!=j) {
		num = arr[i];
	}
}
}
return num;
}

*/


/*
int duplicate =-1;
for(int i =0 ; i < arr.length;i++) {
	int cur = Math.abs(arr[i]);
	if(arr[cur] < 0) {
		duplicate = cur;
		break;
	}
	arr[cur]*=-1;
}
for(int i =0 ; i < arr.length;i++) {
	arr[i] = Math.abs(arr[i]);
}
return duplicate ;
*/