package oopsconcepts;
interface shape 
{
	int area();
}
class length implements shape
{
	public int area()
	{
		return 120;
	}
}
class breadth implements shape
{
	public int area()
	{
		return 122;
	}
}
public class interface_sample
{
	public static void main(String args[]) {
shape l=new length();
shape b=new breadth();
System.out.println("length:"+l.area());
System.out.println("breadth:"+b.area());
	}
}
