package Newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathprgm {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://www.blazedemo.com/register");
	}
	@Test
	public void register() {
	
		driver.findElement(By.name("//input[@name='name']")).sendKeys("sarath");
		driver.findElement(By.id("//input@[id='company']")).sendKeys("kingfra");
		driver.findElement(By.id("//input[@id='email']")).sendKeys("sarathms496@gmail.com");
		driver.findElement(By.id("//input[@name='password']")).sendKeys("aaabbb123");
		driver.findElement(By.id("//input[@name='password_confirmation']")).sendKeys("aaabbb123");
		driver.findElement(By.id("//button[@class='btn btn-primary']")).click();
	}

}
