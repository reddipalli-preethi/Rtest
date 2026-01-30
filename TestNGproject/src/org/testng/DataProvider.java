package org.testng;
import org.testng.DataProvider;
public class DataProvider {
	@DataProvider(name="preethi")
	public Object[][] dataProviderMethod(){
		return new Object[][] {("1. Abhi"),
			("2. Rishi"),
			("3. Harsha");
		}
		@Test(dataProvider = "preethi")
		public void testMethod(String data) {
			System.Out.println("Data is: "+data);
		}
	}
}
