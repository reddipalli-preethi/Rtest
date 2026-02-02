package oopsconcepts;

public class exception_handling {
public static void main(String args[]) {
	
	int a=10;
	for(int i=3;i>=0;i--)
		try {
			System.out.println(a/1);
		}
	catch(ArithmeticExpection e) {
		System.out.println(e);
		System.out.println("code for exception");
	}
}
}
