package pack1;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	@BeforeSuite
	public void cleardata()
	{
		System.out.println("Clear data");
	}
	@BeforeTest
	public void personalloan()
	{
		System.out.println("personal loan");
	}
@Test(groups = {"smoke"})
public void demo()
{
	System.out.println("Hello");
}
}
