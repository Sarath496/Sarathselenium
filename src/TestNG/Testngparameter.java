package TestNG;

public class Testngparameter {

	@parameters("v")
	@Test
	public void test(String v)
	{
		System.out.println(v);
		
	}
}
