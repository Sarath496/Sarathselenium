package Newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertboxprogrm {
	ChromeDriver Driver;
	@Before
	public void setup()
	{
		Driver=new ChromeDriver();
		Driver.get("file:///C:/Users/Sarath%20M/Documents/alertbox.html");
	}

	@Test
	public void searchalert()
	{
		Driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=Driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		Driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("appu");
		Driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("mh");
	}
	
}
