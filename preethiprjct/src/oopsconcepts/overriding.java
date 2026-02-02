package oopsconcepts;
class Vehicle{
	void types() {
		System.out.println("Types of vehicles");
	}
}
class Car extends Vehicle{
	void type() {
		System.out.println("car is 4 wheeler");
	}
}

public class overriding {
	public static void main(String args[]) {
		Vehicle obj=new Car();
		obj.Vehicle();
	}

}
