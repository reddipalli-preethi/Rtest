package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
public class assert_sample {
	@Test
	public void f() {
		String actualresult ="preethi";
				String expectedresult="preethi.R";
				Assert.assertEquals(actualresult, expectedresult);
				Assert.assertTrue(5<2,"error msg");
				//Assert.fail();
				//System.out.println("Hard asserts A");
				//Assert.fail("error msg");
				//System.out.println("Hard asserts B");
	}

}

	
