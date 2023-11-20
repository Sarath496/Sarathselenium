package Newpkg;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	
  ChromeDriver driver;
 @Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}

	}


