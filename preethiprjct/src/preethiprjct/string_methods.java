package preethiprjct;

public class string_methods {
	
	public static void main(String args[]) {
	String s=new String("Hello adibatla");
	String s1=new String("hello associates");
	int length=s1.length();
	System.out.println(length);
	char a=s1.charAt(9);
			System.out.println(a);
	String lower=s1.toLowerCase();
	System.out.println(lower);
	String upper=s1.toUpperCase();
	System.out.println(upper);
	String con=s.concat(s1);
	System.out.println(con);
	int index=s1.indexOf('t');
	System.out.println(index);
	
   
	 
	}	
	
}
