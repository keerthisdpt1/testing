package testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.xpath("//*[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("keysh4@gmail.com");
		driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("keysh4@gmail.com");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Himanshu#1");
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("9908289731");
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Himanshu#1");
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		
	}
}