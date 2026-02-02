package oopsconcepts;

public class superclass {
	
	public void parent(int s) 
	{
		int a=s*s;
		System.out.println("The value of square:"+a);

	}
}
class subclass extends superclass
{
	public void child()
	{
		System.out.println("super class");
		super.parent(2);
	}
	
public static void main(String[] args) 
{
	subclass su= new subclass();
	su.child();
}
}

