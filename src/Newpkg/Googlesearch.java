package Newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	ChromeDriver driver;
	@Before
	public void setup()
	{
	
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	}
	
	@Test
	public void googlesearch()
	{
		driver.findElement(By.name("q")).sendKeys("games");
		//driver.findElement(By.name("btnK")).click();
	}
}
