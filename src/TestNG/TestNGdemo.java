package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGdemo {
	
	@BeforeTest
	public void setup()
	{
		System.out.println("open browser");
	}
	
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("url details");
	}
   
	@Test(groups = {"somke","sanity"})
	public void test1()
	{
	System.out.println("tes1");
	}
	
	@Test(groups = {"smoke"})
	public void test2()
	{
	System.out.println("test2");	
	}
	
	@Test(groups = {"sanity"})
	public void test3()
	{
	System.out.println("test3");	
	}
	
	@Test(groups = {"sanity"})
	public void test4()
	{
	System.out.println("test4");	
	}
	
	@AfterMethod
	public void aftermthd()
	{
		System.out.println("aftermethod");
	}
	
	@AfterTest
	public void browserclose()
	{
		System.out.println("browser close");
	}
}
