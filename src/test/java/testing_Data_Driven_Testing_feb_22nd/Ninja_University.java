package testing_Data_Driven_Testing_feb_22nd;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public interface Ninja_University {
public static  WebDriver driver= new ChromeDriver();
public  SoftAssert softassert = new SoftAssert();

	@Test
	public default void loginAllTest(String username, String password) {
	
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.linkText("input-email")).click();
		driver.findElement(By.linkText("input-password")).click();
		driver.findElement(By.linkText("input.btn.btn-primary")).click();
		softassert.assertTrue(driver.findElement(By.linkText("Edit your account")).isDisplayed());
		softassert.assertAll();
		driver.quit();
	}
	
	@DataProvider(name = "dataSupply")
		public static String [][] dataSupplier() {
			String [][] data = {{"seleniumpanda@gmail.com",""},
								 {"seleniumpanda1@gmail.com",""},
								 {"seleniumpanda2@gmail.com",""},
								 {"seleniumpanda3@gmail.com",""}};
			return data;
								 
	}

}
