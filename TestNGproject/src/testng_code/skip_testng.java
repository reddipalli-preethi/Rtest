package testng_code;

import org.testng.SkipException;

import org.testng.annotations.Test;
public class skip_testng {
	boolean flag = true;
	@Test
	public void f() {
		if(flag)
			throw new SkipException("Custom error  ");
			System.out.println("hello");
	}

}
