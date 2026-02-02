package oopsconcepts;
 abstract class details{
	 public abstract void myprofession();
	
 }
 class pilot extends details
 {
	 
	public void myprofession() {
		System.out.println("my profession is pilot");
	}
 }
 class lecturer extends details
 {
	 
	public void myprofession() {
		System.out.println("my profession is lecturer");
	}
 }
 class designer extends details
 {
	 
	public void myprofession() {
		System.out.println("my profession is designer");
	}
 }
public class abstract_class {
	public static void main(String args[])
	{
		details p1=new pilot();
		p1.myprofession();
		details l1=new lecturer();
		l1.myprofession();
		details d1=new designer();
		d1.myprofession();
		
	}

}
