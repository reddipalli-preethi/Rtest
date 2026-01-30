package testng_code;
import org.testng.annotations.Test;
public class groups_testng {
 @Test(groups = {"rikku"})
  public void  testlogin() {
	 System.out.println("Executing Login Test");
 }
 
	 @Test(groups = {"rikku"})
	 public void testDashboard() {
		 System.out.println("Executing Dashboard Test");
		 
	 }
	 
	 @Test(groups = {"rikku"})
	 public void testlogout() {
		 System.out.println("Executing Logout Test");
		 
	 }
	 
	 

 
}
