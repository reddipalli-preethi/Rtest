package oopsconcepts;

public class exercise_1 {
String name;
exercise_1(String name){
	this.name=name;
}
}
class employee extends exercise_1{
	double salary;
	int startyear;
	String healthinsurancenumber=healthinsurancenumber;
}
boolean equal(employee other) {
	return this.name.equal(other.name)&&
			this.healthinsurancenumber.equals(other.healthinsurancenumber);
}
}
class  employeeTest{
	public static void main(String args[])
	{
		employee e1=new employee("abhi",50000,2023,"INS100");
		employee e2=new employee("neha",60000,2024,"INS101");
		System.out.println("name:"+e1.name);
		System.out.println("salary:"+e1.salary);
		System.out.println("startyear:"+e1.startyear);
		System.out.println("healthinsurancenumber:"+e1.healthinsurancenumber);
		if(e1.equals(e2))
		{
			System.out.println("both employee are equal");
		}
		else
		{
			System.out.println("employee are not equal");
		}
	}
}