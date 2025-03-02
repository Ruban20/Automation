package project;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseClass.BaseClassTripit;

public class Tripit extends BaseClassTripit  {
	@Test
	public void TestCase_001() throws InterruptedException
	{
	Reporter.log("TestCases_01-Header wrapper titles",true);	
	String Alltitles=driver.findElement(By.xpath("//*[@id='navbar-header-wrapper']")).getText();
	Thread.sleep(2000);
	    System.out.println(Alltitles);
	}
	
	@Test
	public void TestCase_002()
	{
	Reporter.log("TestCases_02 Homepage is visible or Not",true);
		boolean v= driver.findElement(By.xpath("((//a[@href='/home'])[2]")).isDisplayed();
		Reporter.log(v+"Homepage will be Opened",true);
		}
	
	@Test
	public void TestCase_003() throws InterruptedException
	{
		Reporter.log("TestCases_03-Trips module is opened and here the all headings",true);	
		driver.findElement(By.xpath("//*[@class='default-link']"));
		Thread.sleep(2000);
		String AllHeadings=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse container-fluid']")).getText();
		Thread.sleep(2000);
		 System.out.println(AllHeadings);
		
		}
     @Test
	public void TestCase_004() throws InterruptedException
	{
    	 Reporter.log("TestCases_04-TripIt Pro module is Passed",true);	
    	 String AllHeadings=driver.findElement(By.xpath("(//a[contains(.,'TripIt Pro')])")).getText();
		Thread.sleep(2000);
		 System.out.println(AllHeadings);
		}

}






