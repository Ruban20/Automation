package advanceSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Orangehrrrm {
	public static ChromeDriver driver;
	public static FileInputStream fis;
	public static Properties p;

	    @Test
	    public void testCase1() throws IOException {
	    	Reporter.log("TestCase1",true);
	    	fis=new FileInputStream("./DataFiles/orangeHRM.txt");
	    	p=new Properties();
	    	p.load(fis);
	    	String Link=p.getProperty("URL");
	    	driver=new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    	driver.get(Link);
	       
	        System.out.println("Test Case 1");
	    }

	    @Test
	    public void testCase2()throws InterruptedException {
	    	Reporter.log("TestCase2",true);
	    	String validUserName=p.getProperty("UN");
	    	String validPassword=p.getProperty("PW");
	    	driver.findElement(By.name("username")).sendKeys(validUserName);
	    	Thread.sleep(2000);
	    	driver.findElement(By.name("password")).sendKeys(validPassword);
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//*[@type='submit']")).click();

	        
	    }

	    @Test
	    public void testCase3()throws InterruptedException {
	    	Reporter.log("TestCase_003",true);	
	    	driver.findElement(By.xpath("//span[.='Admin']")).click();
			driver.findElement(By.xpath("(//li[contains(.,'Job ')])[1]")).click();
			Thread.sleep(2000);
			String AllText=driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']")).getText();
			System.out.println(AllText);
	    	driver.close();
	        
	    }
	    @Test
	    public void testCase4()throws InterruptedException {
	    	
	    	Reporter.log("TestCase_004",true);
			driver.findElement(By.xpath("//span[.='Admin']")).click();
			driver.findElement(By.xpath("(//li[contains(.,'Job ')])[1]")).click();
			Thread.sleep(2000);
			String AllText=driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']")).getText();
			System.out.println(AllText);


	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
