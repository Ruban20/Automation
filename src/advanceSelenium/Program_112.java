package advanceSelenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Program_112 {
	@Test
	public void Testcase_001()throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	String ExpectedResult="Google";
	String ActualResult=driver.getTitle();
	SoftAssert sa=new SoftAssert();
   sa.assertEquals(ActualResult, ExpectedResult);
	Reporter.log("The Test Case is Pass",true);
	driver.close();
	sa.assertAll();
	}
	}
