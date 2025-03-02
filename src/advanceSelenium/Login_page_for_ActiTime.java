package advanceSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page_for_ActiTime {
	
/*
 * This is used to declare the element in the login page
 */
@FindBy(id="username")
private WebElement UserNameDabba;
@FindBy(name="pwd")
private WebElement PasswordDabba;
@FindBy(xpath = "//div[.='Login ']")
private WebElement LoginButton;

/*
 * This part is used to utilization the values
 */

public void Testcase_001()throws InterruptedException
{
	UserNameDabba.sendKeys("admin");
	Thread.sleep(2000);
	PasswordDabba.sendKeys("manager");
	Thread.sleep(2000);
	LoginButton.click();
}
}
