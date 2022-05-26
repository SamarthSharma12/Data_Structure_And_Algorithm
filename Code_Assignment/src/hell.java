import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class hell
{
    public static boolean check(String str) {
		int i =0;
		int j = str.length()-1;
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			else {
				i++;
				j--;
			}
		}
		return true;
	}
	public static boolean cal(int op ,String no){
        if(op == 0){
            return false;
        }
        int k = 0;
        String str ="";
        int i = 0;
        int j = no.length()-1;
        while(i <= j && k < op){
            if (no.charAt(i) == no.charAt(j)){
                str+=no.charAt(i);
                i++;
                j--;
            }
            else{
                str+=no.charAt(j);
                i++; 
                j--;
                k++;
            }
        }
       
        while( i < no.length()){
                str+=no.charAt(i);
                i++;
        }
        return check(str);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0;i < n;i++){
		    int leng = sc.nextInt();
		    int op = sc.nextInt();
		    String no = sc.next();
		    if (cal(op ,no)) {
		    	System.out.println("YES");
		    }
		    else {
		    	System.out.println("NO");
		    }
		}
	}
}
