package advanceSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MyLastProgram {

	public static void main(String[] args)throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/admin/OneDrive/Desktop/marugaya.html");
		Thread.sleep(2000);
		Program_129 thodurum=new Program_129();
		PageFactory.initElements(driver, thodurum);
		thodurum.MyLastclass();

	}

}
