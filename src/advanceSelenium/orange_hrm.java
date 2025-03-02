package advanceSelenium;

import org.openqa.selenium.By;

import org.testng.Reporter;
import org.testng.annotations.Test;

import baseClass.OrangeHRM;

public class orange_hrm extends OrangeHRM{
	@Test
	public void TestCase_001() throws InterruptedException
	{
		Reporter.log("TestCase_001",true);	
	driver.findElement(By.xpath("//span[.='Admin']")).click();
	driver.findElement(By.xpath("//span[.='User Management ']")).click();
	Thread.sleep(2000);
	String	text=driver.findElement(By.xpath("//a[.='Users']")).getText();
	System.out.println(text);
	
}
	
	@Test
	public void TestCases_002() throws InterruptedException
	{
		Reporter.log("TestCase_002",true);
		driver.findElement(By.xpath("//span[.='Admin']")).click();
		driver.findElement(By.xpath("(//li[contains(.,'Job ')])[1]")).click();
		Thread.sleep(2000);
		String AllText=driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']")).getText();
		System.out.println(AllText);
	
}
	@Test
	public void TestCases_003() throws InterruptedException
	{
		Reporter.log("TestCase_003",true);
		driver.findElement(By.xpath("//span[.='Admin']")).click();
       driver.findElement(By.xpath("//span[contains(normalize-space(.),'Organization')]")).click();
       Thread.sleep(2000);
String AllText=driver.findElement(By.xpath("//ul[.='General InformationLocationsStructure']")).getText();
System.out.println(AllText);
}
	
	@Test
	public void TestCases_004() throws InterruptedException
	{
		Reporter.log("TestCase_004",true);
		driver.findElement(By.xpath("//span[.='Admin']")).click();
		  driver.findElement(By.xpath("//li[contains(normalize-space(.),'Qualifications')]")).click();
	       Thread.sleep(2000);
	String AllText=driver.findElement(By.xpath("//ul[.='SkillsEducationLicensesLanguagesMemberships']")).getText();
	System.out.println(AllText);
	
	
	
	
	}
}