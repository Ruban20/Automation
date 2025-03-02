package advanceSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Program_127 {

	public static void main(String[] args)throws InterruptedException {
		/*
		 * Login to the application by using Page object model
		 */
ChromeDriver driver=new ChromeDriver();
Thread.sleep(2000);
driver.get("https://demo.actiTime.com/login.do");
Thread.sleep(2000);
Login_page_for_ActiTime lpa=new Login_page_for_ActiTime();
PageFactory.initElements(driver, lpa);
lpa.Testcase_001();
}
}
