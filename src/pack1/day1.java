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
		System.out.println("Personal Loan 1");
		System.out.println("Personal Loan2");
		System.out.println("Personal Loan3");
		
		
	}
@Test(groups = {"smoke"})
public void demo()
{
	System.out.println("Hello");
}
}
