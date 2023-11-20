package Newpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LInkcount {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		
	}
@Test
public void test1()
{
	List<WebElement>li=driver.findElements(By.tagName("a"));
	 System.out.println("total no of links="+li.size());
	 for(WebElement element:li)
	 {
		 String link=element.getAttribute("href");
		 verifyinglink(link);
	 }
	 
	 
	 
	 
}
private void verifyinglink(String link) {
	try
	{
		URL u=new URL(link);
				HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("response code is 200"+link);
			
		}
				
}

catch(Exception e)
{
	System.out.println(e.getMessage());
}
}
}
