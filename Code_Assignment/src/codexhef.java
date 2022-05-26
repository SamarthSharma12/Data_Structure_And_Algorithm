import java.util.*;
public class codexhef {

public static int max(int arr[]) {
	int m = 0;
	for(int i =0;i < arr.length;i++) {
		if (arr[i] > m) {
			m = arr[i];
		}
	}
	return m;
}

public static int cal(int arr[]) {
	int op=0;
	if (arr.length == 0){
		return op;
	}
	if(arr.length == 2 || arr.length == 1) {
		return 1;
	}
	int m = max(arr);
	int i = 0;
	while(i < arr.length) {
		
	 if(arr[i]+arr[i+1] == m) {
		 int arr1[] = new int[arr.length-1];
		 int l=0;
		 while (l<i) {
			 arr1[l] = m;
			 l++;
		 }
		 for(int j =0;j < arr1.length;j++) {
			 int k =i;
			 if(j == i) {
				 arr1[j] = arr[k]+arr[k+1];
				 k=k+2;
				 i++;
			 }
			 else {
				 arr1[j] = arr[k];
				 k++;
			 }
		 }
		 arr = arr1;
		 op++;
	 }
	}
	for(int k =0; k <arr.length;k++) {
		System.out.print(arr[k]+" ");
	}
	System.out.println();
	return op;
}
	
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
for(int j =0;j < t;j++) {
int n = sc.nextInt();
int arr[] = new int[n];
for(int i =0;i < n;i++) {
	arr[i] = sc.nextInt();
}
System.out.println(cal(arr));
}

}
}
