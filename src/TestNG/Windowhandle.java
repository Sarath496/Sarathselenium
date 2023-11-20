package TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandle {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		
	}
	@Test
	public void test1()
	{
	String parantWindow = driver.getWindowHandle();
	
	driver.findElement(By.xpath("/html/body/p/a")).click();
	
	Set<String>allwindowhandles=driver.getWindowHandles();
	
	for(String handle : allwindowhandles)
	{
		if(!handle.equalsIgnoreCase(parantWindow))
		{
			driver.switchTo().window(handle);
			WebElement sm = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input"));
			System.out.println(sm);
			driver.close();
		}driver.switchTo().window(parantWindow);
		
	}
	
	}

}
