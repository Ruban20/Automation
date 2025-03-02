package framework_actiTime;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	public WebDriver driver;
	public FileInputStream fis;
	public Properties p;
	
	@BeforeMethod
	public void OpenBrowser() throws IOException {
		Reporter.log("open the broser",true);
		fis=new FileInputStream("./DataFiles/commondata.txt");
		p=new Properties();
		p.load(fis);
		String Link = p.getProperty("URL");
		driver=new ChromeDriver();
		driver.get(Link);
	}
	
	@AfterMethod
	public void CloseBrowser() {
		Reporter.log("close the browser",true);
		driver.close();
	}
}

