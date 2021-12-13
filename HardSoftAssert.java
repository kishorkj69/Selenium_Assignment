HARD ASSERT


package testng.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test(priority=1)
	public void hardAssertTest() {
		Assert.assertEquals("Kishor", "Kishor");
		Assert.assertEquals("Kumar", "Kumar");
	
	}
	
	@Test(priority=2)
	public void hardAssertTest2() {
		Assert.assertEquals("KKJ@gmail.com", "kkj@gmail.com");
	}

}




SOFT ASSERT


package testng.assertion;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SoftAssert {
	
	org.testng.asserts.SoftAssert sf;
	
	@BeforeMethod
	public void setUp() {
		sf=new org.testng.asserts.SoftAssert();
	}
	
	@Test(priority=1)
	public void softAssertTest() {
		
		sf.assertEquals("Kishor", "Kishor");
		sf.assertEquals("Jha", "Jha");
		sf.assertEquals("kkj@gmail.com", "kkj@gmail.com");
		sf.assertEquals("", "9864401638");
		sf.assertEquals("", "Quality Engineer");
		sf.assertAll();
	}
	
	@Test(priority=2)
	public void softAssertTest2() {
		sf.assertTrue(true);
		sf.assertAll();
	}

}
