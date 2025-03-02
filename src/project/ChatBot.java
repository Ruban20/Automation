package project;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ChatBot {
	public static ChromeDriver driver;
@BeforeMethod
public void openBrowser() {
Reporter.log("OPEN THNE BROWSER",true);
driver=new ChromeDriver();
driver.get("https://www.chatbot.com/");
}
@AfterMethod
public void CloseBrowser() {
	Reporter.log("Close the brower",true);
	driver.close();
	
}
}