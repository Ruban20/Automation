package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program_103 {
	@Test(priority = 1)
	public void CreateCustomer()
	{
	Reporter.log("Create the Customer",true);	
	}
	@Test(priority = 2,dependsOnMethods = "CreateCustomer" )
	public void ModifyCustomer()
	{
	Reporter.log("Modify the Customer",true);	
	}
	@Test(priority = 3)
	public void DeleteCustomer()
	{
	Reporter.log("Delete the Customer",true);	
	}
	
	
	
}
