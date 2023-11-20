package TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Systemcopy {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
	}
	
@Test
public void fileuploadpgm() throws Exception
{
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
	
	fileUpload("C:\\Users\\Sarath M\\Downloads\\eclipse-committers-2023-09-R-win32-x86_64");
	
	}
public void fileUpload (String p) throws AWTException
{
	StringSelection strselection = new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection,null);
	
	
	Robot robot = new Robot();
	
	robot.delay(300);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.delay(2000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	
}
}
