package oopsconcepts;
import java.util.Scanner;

class Students
{
	String name;
	void details()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter your name:"+name);
	}
}
class Remburisement extends Students
{
	int  cash;
	void amount()
	{ 
	System.out.println("The remburisement cash is:"+cash);
	}
}
public class inheritance2 
{
	public static void main(String args[])
	{
		Remburisement r1=new Remburisement();
		r1.details();
		r1.cash=50000;
		r1.amount();
	}
	

}
