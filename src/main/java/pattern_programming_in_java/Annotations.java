package pattern_programming_in_java;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Annotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this is the before suite annotation");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("this is the before test annotation");
}
	@BeforeTest
	public void beforeTest1() {
		System.out.println("this is the before test1 annotation");
	}
	@BeforeTest
	public void beforeTest2() {
		System.out.println("this is the before test2 annotation");
	}
	@BeforeTest
	public void beforeTest3() {
		System.out.println("this is the before test3 annotation");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("this is the before class annotation");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is the before method annotation");
	}
	@Test
	public void test() {
		System.out.println("this is my test case");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("this is after class annotation");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("this is after test annotation");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("this is after suite annotation");
	}
			
}
