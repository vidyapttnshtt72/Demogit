package pack1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day2 {
@Test(groups = {"smoke"})
public void paying()
{
	System.out.println("paying");
}
@AfterTest
public void close()
{
	System.out.println("close");
}
}
