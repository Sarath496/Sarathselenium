package Newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmaillog {
ChromeDriver Driver; 
@Before
public void setUp()
{
	Driver=new ChromeDriver();
	Driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
}
@Test
public void logoview()
{
	boolean logo=Driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
	if(logo)
	{
	System.out.println("logo is displayed");
	
	}
	else
	{
		System.out.println("logo is not displayed");
	}
}
}
