package collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {
	public static void main(String args[]) {
		
	
	HashSet<String> people = new HashSet<String>();
	people.add("Abhi");
	people.add("Bhargav");
	people.add("Chintu");
	people.add("Dinu");
	System.out.println(people);
	System.out.println(people.remove("Abhi"));
	System.out.println(people.isEmpty());
	System.out.println(people.size());
	for(String out : people) {
	System.out.println(out);

}
	Iterator<String> i1 = people.iterator();
	{
	while(i1.hasNext())
		System.out.println(i1.next());
	}
}
}
