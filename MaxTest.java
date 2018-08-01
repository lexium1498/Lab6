package Lab6;
import java.util.Scanner; 

public class MaxTest {
	public static boolean max(int a, int m, int n) {
		if(a >= m && a >= n) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first integer : ");
		int a = s.nextInt();
		System.out.println("Enter the second integer : ");
		int b = s.nextInt();
		System.out.println("Enter the third integer : ");
		int c = s.nextInt();
	
		System.out.println("The int a is biggest : " + max(a, b, c));
	}
}
