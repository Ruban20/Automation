package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program_102 {
@Test(priority = 2,invocationCount = 2)
public void ABDVilers()
{
	Reporter.log("South Africa",true);
}
@Test(priority = -3,invocationCount = 3,dependsOnMethods = "Gayle")
public void Willamson()
{
	Reporter.log("newZealand",true);
	}
@Test(priority = 0)
public void Azam()
{
Reporter.log("Pakistan",true);	
}
@Test
public void Gayle()
{
Reporter.log("W-Indies",true);	
}
@Test(priority = 3) 
public void Sangakara()
{
Reporter.log("Sri-Lanka-true");
}
@Test
public void Smiritimandhana()
{
Reporter.log("India",true); 	
}
}