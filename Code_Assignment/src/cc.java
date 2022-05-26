
import java.util.*;
class cc
{
    public static void print(String str){
        int z =0 ;
		int one = 0;
		for (int i =0 ;i < str.length();i++){
		    if(str.charAt(i) == '0'){
		        z++;
		    }
		    else{
		    	one++;
		    }
		}
		if(z > 0  && one == 0){
		    System.out.println("Yes");
		}
		else if(z == one){
		    System.out.println("YES");
		}
		else if(z%2==0 || one%2==0){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j =0;j < t;j++){
		int n = sc.nextInt();
		String str = "";
		str=sc.next();
		print(str);
	}
}
}