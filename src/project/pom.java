package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class pom {
@FindBy(xpath ="//img[@class='lazy-img-loaded']")
private WebElement chatbot;

public void Testcase01()
{
	chatbot.click();
Reporter.log("testcase01 is pass",true);

}

}
