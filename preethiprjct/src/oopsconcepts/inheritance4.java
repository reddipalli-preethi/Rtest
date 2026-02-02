package oopsconcepts;
public class inheritance4 extends inheritance3{
int sum()
{
	return a+b;
}
int sub()
{
	return a-b;
}
int mul()
{
	return a*b;
}
public static void main(String args[]) {
	inheritance4 i2=new inheritance4();
	i2.number();
	System.out.println("sum ="+i2.sum());
	System.out.println("substraction ="+i2.sub());
	System.out.println("multiplication ="+i2.mul());
}
}
