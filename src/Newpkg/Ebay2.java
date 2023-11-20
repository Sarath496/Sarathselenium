package Newpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay2 {
	
	ChromeDriver Driver;
	@Before
	public void setup()
	{
		Driver=new ChromeDriver();
		Driver.get("https://www.ebay.com");
		
	}

	@Test
	public void test1()

	{
		Driver.findElement(By.pathx(""))
		
	}
}

