package Newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
	driver.get("https://automationexercise.com/login");
	
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("rayyan");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rayyan1234@gmail.com");
		driver.findElement(by.xpath(""))
	}
	
}
