package TestNG;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon1 {
	 WebDriver driver;
	 @BeforeTest
	 public void setup()
	 {
		 Driver=new ChromeDriver();
		 Driver.get("https://www.amazon.in/");
		 Driver.manage().window().maximize();
	 }
	 @Test
	 public void test1()
	 {
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones",Keys.ENTER); 
	Driver.findElement(By.xpath("/html/body"));

}
