package Newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationexe {
	ChromeDriver driver;

	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		//driver.manage().window().maximize();
	}
		@Test
		public void test1() throws Exception
		{
			driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")); 
			driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a"));
			//Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a"));
			driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a"));
		    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button"));
		}
}
