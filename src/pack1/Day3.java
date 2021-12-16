package pack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Day3 {
	@AfterSuite
	public void closedatabaseconnection()
	{
		System.out.println("Close data base connection");
	}
	@Test
	public void webLoginHomeLaon()
	{
		System.out.println("WebLoginHomeLoan");
	}
	@Test(groups={"smoke"})
	public void mobileLoginHomeLaon()
	{
		System.out.println("MobileLoginHomeLogin");
	}
	@Test
	public void loginAPIHomeLoan()
	{
		System.out.println("APILoginHomeLoan");
	}

}
