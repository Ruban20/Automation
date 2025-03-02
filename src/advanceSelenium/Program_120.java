package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program_120 {
static WebDriver driver;
@Test
public void Tc_001()
{
	Reporter.log("TestCase_01",true);
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.close();
}
@Test
public void Tc_002()
{
	Reporter.log("TestCase_02",true);
	driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	driver.close();
}
@Test
public void Tc_003()
{
	Reporter.log("TestCase_03",true);
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.close();
}
@Test
public void Tc_004()
{
	Reporter.log("TestCase_04",true);
	driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.close();
}
@Test
public void Tc_005()
{
	Reporter.log("TestCase_05",true);
	driver=new ChromeDriver();
	driver.get("https://www.twitter.com");
	driver.close();
}

}


