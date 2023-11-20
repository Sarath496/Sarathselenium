package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	
	WebDriver driver;
	 @BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 driver.get("https://www.trivago.com");
		 driver.manage().window().maximize();
	 }
	 @Test
	 public void test1()
	 {
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div/fieldset/button[1]")).click();
	datepickermethod("December 2023","25");

}
	private void datepickermethod(String expectedmonth, String expecteddate) {
     while(true)
     {
    	String month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();
    	 if(month.equals(expectedmonth))
    	 {
    		 System.out.println("month="+month);
    		 break;
    		 
    	 }
    	 else
    	 {
    		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
    		 
    	 }
    	 }
     
     List<WebElement>alldates=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
   for(WebElement datedetails:alldates)
   {
	   String date=datedetails.getText();
	   System.out.println("date1");
	   if(date.equals(expecteddate))
	   {
		   System.out.println("date="+date);
		   datedetails.click();
		   break;
	   }
   }
	}
	}
