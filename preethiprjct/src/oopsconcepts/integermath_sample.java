package oopsconcepts;


interface IntegerMath
{
	int operation(int a, int b);
}
public class integermath_sample {
public int operateBinary(int a,int b, IntegerMath op) {
	return op.operation(a, b);
}
public static void main(String args[]) {
	integermath_sample myApp=new integermath_sample();
	IntegerMath addition = (a,b)-> a+b;
	IntegerMath subtraction = (a,b) -> a-b;
	System.out.println("40 + 2 ="+ myApp.operateBinary(40, 2, addition));
	System.out.println("20 - 10 ="+ myApp.operateBinary(20,10,subtraction));
}
}
