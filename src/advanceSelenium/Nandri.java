package advanceSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Nandri {

	public static void main(String[] args)throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/admin/OneDrive/Desktop/marugaya.html");
	Program_130 vanakam=new Program_130();
	PageFactory.initElements(driver, vanakam);
	vanakam.TestCase_01();
	Thread.sleep(2000);
	vanakam.TestCase_02();
	Thread.sleep(2000);
	vanakam.TestCase_03();

}
}
