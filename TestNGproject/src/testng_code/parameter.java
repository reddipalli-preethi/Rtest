package testng_code;

import org.testng.annotation.Test;
import org.testng.annotations.Parameters;

public class parameter {
	@Test
	@Parameters("Name")
	void f(String Name) {
		System.out.println("The name is :"+Name);
	}

}
