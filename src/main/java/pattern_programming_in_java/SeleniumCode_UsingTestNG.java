package pattern_programming_in_java;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class SeleniumCode_UsingTestNG {

	public WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://rediff.com");
		
	}
		
		@Test(priority = 1)
		
		public void clickOnSignInLink() {
			driver.findElement(By.className("signin")).click();
			
		}
		
		@Test(priority = 2)
		
		public void clickOnMoneyLink() {
			driver.findElement(By.linkText("Money")).click();
		}
		

}
