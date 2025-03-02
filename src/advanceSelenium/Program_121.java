package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program_121 {
	static WebDriver driver;
	@Test
	public void Tc_006()
	{
		Reporter.log("TestCase_06",true);
		driver=new ChromeDriver();
		driver.get("https://www.zomato.com");
		driver.close();
	}
	@Test
	public void Tc_007()
	{
		Reporter.log("TestCase_07",true);
		driver=new ChromeDriver();
		driver.get("https://www.swiggy.com");
		driver.close();
	}
	@Test
	public void Tc_008()
	{
		Reporter.log("TestCase_08",true);
		driver=new ChromeDriver();
		driver.get("https://www.zepto.com");
		driver.close();
	}
	@Test
	public void Tc_009()
	{
		Reporter.log("TestCase_09",true);
		driver=new ChromeDriver();
		driver.get("https://www.dunzo.com");
		driver.close();
	}
	@Test
	public void Tc_010()
	{
		Reporter.log("TestCase_10",true);
		driver=new ChromeDriver();
		driver.get("https://www.yahoo.com");
		driver.close();
	}

}
