package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program_113 {
@BeforeMethod
public void openbrowser()
{
	Reporter.log("open the browser",true);
}
@AfterMethod
public void closebrowser()
{
Reporter.log("close the browser",true);	
}
@Test(invocationCount = 2)
public void TestCase_001()
{
Reporter.log("Test case-001",true);	
}
}
