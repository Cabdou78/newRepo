package automation_code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarDemo {

	public static void main(String[] args, WebDriverWait wait) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-cy ='myTrips']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder = 'From'")).sendKeys("New York");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(test(), 'New York, United States)]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("toCity")).click();
		wait = new WebDriverWait(driver,DurationofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder = 'To'")));
		Object until = new Object();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder = 'To'")).sendKeys("Boston");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(test(), 'Boston, United States)]")).click();

	}

	private static Duration DurationofSeconds(int i) {
		
		return null;
	}

	}

	

