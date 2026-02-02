package assesment1;

class employee{
	 
		 String name;
		 double salary;
		 public employee(String name, double salary) {
			// TODO Auto-generated constructor stub
		
		// void Employee(String name, double salary){
			 this.name=name;
			 this.salary=salary;
			 
}
double 	calculatesalary()
{
	return salary;
}
}
class supervisior extends employee{
	supervisior(String name,double salary){
		super(name,salary);
	}
	double calculatesalary() {
		return salary+(salary*50);
		
	}
	
}
class manager extends employee{
	manager(String name,double salary){
		super(name,salary);
	}
	double calculatesalary() {
		return salary+(salary*60);
		
	}
	
}
class trainee extends employee{
	trainee(String name,double salary){
		super(name,salary);
	}
	double calculatesalary() {
		return salary+(salary*3);
		
	}
	
}

public class program_1 {
	public static void main(String args[]) {
	employee s1= new supervisior("supervisior",70000);
	employee m2=new manager("manager",90000);
	employee t3=new trainee("trainee",40000);
	System.out.println("supervisior salary:"+s1.calculatesalary());
	System.out.println("manager salary:"+m2.calculatesalary());
	System.out.println("trainee salary:"+t3.calculatesalary());
		
	}

}
