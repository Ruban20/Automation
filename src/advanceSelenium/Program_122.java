package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program_122 {
	static WebDriver driver;
	@Test
	public void Tc_011()
	{
		Reporter.log("TestCase_11",true);
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.close();
	}
	@Test
	public void Tc_012()
	{
		Reporter.log("TestCase_012",true);
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.close();
	}
	@Test
	public void Tc_013()
	{
		Reporter.log("TestCase_013",true);
		driver=new ChromeDriver();
		driver.get("https://www.meesho.com");
		driver.close();
	}
	@Test
	public void Tc_014()
	{
		Reporter.log("TestCase_014",true);
		driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.close();
	}
	@Test
	public void Tc_015()
	{
		Reporter.log("TestCase_015",true);
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.close();
	}


}
