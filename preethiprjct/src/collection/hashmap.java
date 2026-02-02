package collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
public class hashmap {
	public static void main(String args[])
	{
		HashMap<Integer, String> students = new HashMap<>();
		students.put(1, "chutki");
		students.put(2, "minnie");
		students.put(3, "shizuka");
		students.put(4, "dorami");
		System.out.println("students:"+students);
		System.out.println("name of roll.no:"+students.get(3));
		System.out.println(students.remove(2));
		//System.out.println(students);
		for(Integer key: students.keySet())
		{
			System.out.println(key +" "+students.get(key));
		}
		Set sn = students.entrySet();
		Iterator it = sn.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
