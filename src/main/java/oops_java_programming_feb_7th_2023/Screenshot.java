package oops_java_programming_feb_7th_2023;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static WebDriver driver;
	
	public void checkingschreenshot() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://openweathermap.org");
		
		WebElement logo = driver.findElement(By.cssSelector("div.select.where-to"));
		
		File destination = new File("C:\\Users\\theab\\OneDrive\\Desktop\\HOMEWORK\\ScreenShots\\openscreenshot1.png");
		File source = logo.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(source, destination);
	
	}	
		
}
