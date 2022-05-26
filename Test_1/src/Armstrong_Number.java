import java.util.*;
public class Armstrong_Number {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int num = n , n1 = n ,d =0 , r,sum =0 ;
	while(n!=0) {
		++d;
		n=n/10;
	}
	while (n1!=0) {
		r = n1%10;
		sum = sum+(int)Math.pow(r,d);
		n1 = n1/10;
	}
	if (sum == num) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
}
}
