import java.util.*;
public class check_array_rotation {
	public static int arrayRotateCheck(int[] arr){
        return array_rotate(arr);
    }
	public static int array_rotate(int arr[]){
		       
        if(arr.length == 0 ){
           return 0;
       }
        int min_index =0;
        if(min_index < arr.length-1) {
        
        int min = arr[0];
        for(int i =0 ; i < arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
                min_index = i;
            }
        }
        
    return min_index;}
        else {
        	return min_index;
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int arr[] =new int [n];
		for(int i =0 ;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(arrayRotateCheck(arr));
	}
	
}
