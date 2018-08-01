package Lab6;
import java.util.Scanner; 

public class MinInts {
	public static int min( int n , int m) {
		if(n < m) {
			return n; 
		}else {
			return m; 
		}
	}
	
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first integer : ");
		int a = s.nextInt();
		System.out.println("Enter the second integer : ");
		int b = s.nextInt();
		System.out.println("the min int is : " + min(a, b));
		
	}
}
