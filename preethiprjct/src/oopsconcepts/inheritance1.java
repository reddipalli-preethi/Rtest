package oopsconcepts;
class student{
	 String name ="preethi";
}
class scholarship extends student{
	float money = 10000;
}
	
public class inheritance1 {
	public static void main(String args[])
	{
		scholarship s=new scholarship();
		System.out.println("Student name:"+s.name);
		System.out.println("Student scholarship:"+s.money);
		
	}

}

	
	


