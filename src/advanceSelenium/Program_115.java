package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program_115 {
	@BeforeClass
	public void OpenBrowser()
	{
	Reporter.log("Open the Browser",true);	
	}
	@AfterClass
	public void CloseBrowser()
	{
	Reporter.log("Close the Browser",true);	
	}
	@BeforeMethod
	public void Login()
	{
		
	Reporter.log("Login",true);
	}
	@AfterMethod
	public void Logout()
	{
		Reporter.log("Logout",true);
	}
	@Test
	public void CreateCustomer()
	{
	Reporter.log("Create the customer",true);	
	}
	@Test
	public void DeleteCustomer()
	{
	Reporter.log("Delete the customer",true);	
	}
}
