package testing_hardvssoftassert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TN_SoftAssert {

	public static WebDriver driver;
	
	@BeforeMethod
	public void openTN() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		
	}
	
	@Test
	public void loginTest() throws Exception {
		String actualTitle = "Your Store";
		String expectedTitle = driver.getTitle();
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.xpath("//a[@title = 'My Account']")).click();
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("christineabdou78@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Cabdou78");
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("rd_logout")).click();
		
		
	}
	
	
	@Test
	
	public void validateLogOutPageTest() throws Exception {
		//successfully logged out - message... use that as a WebElement and apply Assert
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("christineabdou78@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Cabdou78");
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("rd_logout")).click();
	}
	
}
