package advanceSelenium;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


    public class Tripit_HybridFramework {
	public static void main(String[]args)
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.tripit.com/web");
	driver.findElement(By.xpath("//a[.='Sign In']")).click();
	Program_128 lp =new Program_128(driver);
    lp.setlogin();
    
}
}
