package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Program_128 {

@FindBy(xpath = "//input[@id='email_address']") //declaration
private WebElement userNameTextBox;
@FindBy(xpath = "//*[@type='password']") 
private WebElement PassworddTextBox;
@FindBy(xpath = "//*[@type='submit']")
private WebElement LoginButtton;

//Initialization
public Program_128(WebDriver driver)
{
PageFactory.initElements(driver, this);



}

//utilization x
public void setlogin() {

	userNameTextBox.sendKeys("sivjeevie@gmail.com");
	PassworddTextBox.sendKeys("Fakeid001");
	LoginButtton.click();
}
}
