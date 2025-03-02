package advanceSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program_110 {
@Test
public void Testcase_001()throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(2000);
driver.get("https://www.google.com/");
Thread.sleep(2000);
String ExpectedResult="Facebook";
String ActualResult=driver.getTitle();
if(ExpectedResult.equals(ActualResult))
{
Reporter.log("The Test case is Pass",true);
}
else
{
Reporter.log("The Test case is Fail",true);	
}
driver.close();
}
}
