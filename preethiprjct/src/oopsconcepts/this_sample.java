package oopsconcepts;

class this_sampl {
int cars=0;
int bikes=0;
 void this_sampl(int cars, int bikes){
	 this.cars= cars;
	 this.bikes= bikes;
 }
 void this_sample() 
 {
	 int cars = 5;
	 int bikes = 6;
 }
 public void vehicles() {
	 System.out.println("The number of cars:" +cars+"The number of bikes:"+bikes);
	// System.out.println("The number of bikes:"+bikes);
 }
}
 public class this_sample{
 public static void main(String[] args) {
	 this_sampl obj=new this_sampl();
	 obj.vehicles();
	 obj.this_sampl(5,6);
	 obj.vehicles();
	 
  
 }}
