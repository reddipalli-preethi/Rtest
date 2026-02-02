package preethiprjct;

import java.util.Scanner;

public class sample_recursion {
	static public int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);
		
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int result = factorial(num);
	System.out.println("Factorial of"+num+"is:"+result);
	sc.close();
	
	
	}
}
