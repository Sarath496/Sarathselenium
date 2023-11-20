package Newpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.emulation.Emulation;

public class Responsecodepgm {
	String baseurl="https://www.ebay.com";
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
@Test
public void test()throws Expectation

}
