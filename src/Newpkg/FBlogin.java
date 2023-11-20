package Newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogin {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void fblogin()
	{
		driver.findElement(By.id("email")).sendKeys("sarathms496@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abcd23445");
		driver.findElement(By.name("login")).click();
	}
}
