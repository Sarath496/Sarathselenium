package Newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonenable {
ChromeDriver driver;

@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
	@Test
	public void test1()
	{
		boolean b=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).isEnabled();
		
	if(b)	
	
	{
		System.out.println("button is enabled");
		
	}
	else
	{
		System.out.println("button is not enabled");
	}



}
}
