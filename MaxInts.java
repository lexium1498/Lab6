package Lab6;
import java.util.Scanner;

public class MaxInts {
	public static double max ( int m , int n) {
		if (m<n) {
			return n ; 
		}return m ; 
	}
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first integer : ");
		int a = s.nextInt();
		System.out.print("Enter the second integer : ");
		int b = s.nextInt();
		
		System.out.println( "max(" + a + ", " + b + ") = " + max(a, b)); 
	}
}
