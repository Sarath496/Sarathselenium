package TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazone {
	 WebDriver driver;
	 @BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
	 }
	 @Test
	 public void test1()
	 {
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones",Keys.ENTER); 
	driver.findElement(By.xpath("/html/body"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
	
	String firstWindow=driver.getWindowHandle();
	driver.getTitle().contains("Amazone.in:mobilephnes");
	
	Set<String>allwindow=driver.getWindowHandles();
	for(String handle:allwindow)
	{
		driver.switchTo().window(handle);
	}
	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	 }

}
