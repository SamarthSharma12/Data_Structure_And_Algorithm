import java.util.*;
public class Zero_Star_Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = 1;
		int end = 2*n+1;
		int mid = n+1;
		for (int i = 1; i <= n ; i++){
			for (int j =1 ;j <= 2*n+1 ; j++ ) {
				if ( j == start || j == end || j == mid) {
					System.out.print("*");
				}
				else {
					System.out.print("0");
				}
			}
		
	System.out.println(" ");
	start ++;
	end -- ;
	}
}
}