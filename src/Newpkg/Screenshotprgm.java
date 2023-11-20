package Newpkg;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotprgm {
ChromeDriver driver;

@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
}

@Test
public void test() throws Exception
{
	File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("C:\\Users\\Sarath M\\Desktop\\ytube.png"));
	
	WebElement button=driver.findElement(By.xpath("//*[@id=\"logo-icon\"]/yt-icon-shape/icon-shape/div"));
    File src1=button.getScreenshotAs(OutputType.FILE);
    FileHandler.copy(src1, new File("./screenshot/buttonscreenshot.png"));
}
}