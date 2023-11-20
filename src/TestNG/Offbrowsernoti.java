package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Offbrowsernoti {
	WebDriver driver;
	@BeforeTest
	public void setp()
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
	}
@Test
public void test1()
{
driver.get("https://www.justdial.com/");
}
}