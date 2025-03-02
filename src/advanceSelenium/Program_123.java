package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program_123 {
	static WebDriver driver;
	@Test
	public void Tc_016()
	{
		Reporter.log("TestCase_16",true);
		driver=new ChromeDriver();
		driver.get("https://www.hotstar.com");
		driver.close();
	}
	@Test
	public void Tc_017()
	{
		Reporter.log("TestCase_17",true);
		driver=new ChromeDriver();
		driver.get("https://www.jiocinema.com");
		driver.close();
	}
	@Test
	public void Tc_018()
	{
		Reporter.log("TestCase_018",true);
		driver=new ChromeDriver();
		driver.get("https://www.spotify.com");
		driver.close();
	}
}
