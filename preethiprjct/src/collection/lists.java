package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lists {
	public static void main(String args[]) {
       List<Integer> price=new ArrayList<Integer>();
    		   price.add(100);
    		   price.add(200);
    		   price.add(300);
    		   price.add(400);
    		   price.add(500);
    		  // price.remove(234);
    		   System.out.println("Id Nos");
    		   System.out.println("total :"+price.size());
    		   System.out.println("first :"+price.get(0));
    		   System.out.println("second :"+price.get(1));
    		   System.out.println("unsorted list :"+price);
    		   Collections.sort(price);
    		   Collections.sort(price,Collections.reverseOrder());
    		   System.out.println("Sorted list in descending order:"+price);
    		   for(int Id :price) {
    			   System.out.println(Id);
    			   
    		   }
       
		
		
		
	}

}
