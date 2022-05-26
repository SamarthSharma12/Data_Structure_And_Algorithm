import java.util.*;
public class pair_sum_in_array_time_complexity {	

	public static int pairSum(int[] array, int num) {
		   Arrays.sort(array);
      int i=0;
		int j=array.length-1;
		int count=0;
		while(i<j) {
			int val = array[i]+array[j];
			 if(val>num) {
				j--;
			}else if(val<num) {
				i++;
			}else {
				int  elemAtStart = array[i];
				int elemAtEnd = array[j];
				
				if(elemAtStart == elemAtEnd) {
					int totalElemFromStarttoEnd = (j-i)+1;
					count+=(totalElemFromStarttoEnd*(totalElemFromStarttoEnd-1)/2);
					return count;
				}
				int tempI = i+1;
				int tempJ = j-1;
				
				while(tempI<=tempJ && array[tempI]==elemAtStart) {
					tempI+=1;
				}
				
				while(tempJ>=tempI && array[tempJ]==elemAtEnd) {
					tempJ-=1;
				}
				int totalElementfromSTart = (tempI-i);
				int totalElementfromEnd = (j-tempJ);
				count += (totalElementfromSTart*totalElementfromEnd);
				
				i=tempI;
				j=tempJ;
				
			}
			
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0 ; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		System.out.println(pairSum(arr,num));
		}
	
}