package Newpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void rediff()
	{
		
		WebElement day=driver.findElement(By.xpath("*//*[@id='tblcrtac']/tbody/tr[22]/tr[3]/select[3]"));
	Select daydetails=new Select(day);
	daydetails.selectByValue("02");
	List<WebElement> c1=daydetails.getOptions();
	System.out.println("day count="+c1.size());
	
	WebElement month=driver.findElement(By.xpath("*//*[@id='tblcrtac']/tbody/tr[22]/tr[3]/select[3]"));
	Select monthdetails=new Select(month);
	monthdetails.selectByValue("02");
	List<WebElement> c2=monthdetails.getOptions();
	System.out.println("month count="+c2.size());
	
	
	}
	
}
