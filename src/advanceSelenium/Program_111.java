package advanceSelenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program_111 {
	@Test
	public void Testcase_001()throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	String ExpectedResult="Facebook";
	String ActualResult=driver.getTitle();
	assertEquals(ActualResult, ExpectedResult);
	Reporter.log("Test case is pass",true);
	driver.close();
}
}
