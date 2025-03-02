package advanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_126 {
public static void main(String[]args)throws InterruptedException
{
ChromeDriver driver =new ChromeDriver();	
Thread.sleep(2000);
driver.get("https://demo.actitime.com/login.do");
Thread.sleep(2000);
//store the username Textbox address as A001 in userName TextBox
WebElement userNameTextBox=driver.findElement(By.id("username"));
Thread.sleep(2000);
userNameTextBox.clear();
Thread.sleep(2000);
//Refresh the page and usernametextbox address will be changed as A002
driver.navigate().refresh();
Thread.sleep(2000);
//If we try to enter the UN using Old address it is No longExists
userNameTextBox.sendKeys("admin");
}
}
