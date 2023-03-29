package pattern_programming_in_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialNinja {

	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("http://www.tutorialsninja.com/demo/");
		
	}
		
		@Test(priority = 1)
		
		public void clickOnmyAccountLink() {
			driver.findElement(By.className("MyAccount")).click();
			
		}
		
		@Test(priority = 2)
		
		public void clickOnRigisterLink() {
			driver.findElement(By.linkText("Rigister")).click();
			
		}
		
		@Test(priority = 3)
		
		public void clickOnShoppingCartLink() {
			driver.findElement(By.linkText("ShopingCart")).click();
		}
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
}
