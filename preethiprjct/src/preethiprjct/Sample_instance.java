package preethiprjct;

public class Sample_instance {
	void name(String a) {
		System.out.println(a);
	}
	void roll_no(int b) {
		System.out.println(b);
	}
	public static void main(String args[]) {
		Sample_instance obj=new Sample_instance();
		obj.name("Abhi");
		Sample_instance obj1=new Sample_instance();
		obj1.roll_no(15);
	}

}
