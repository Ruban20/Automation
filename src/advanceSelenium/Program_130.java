package advanceSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Program_130 {
/*
 * Declare the elements
 */
@FindBy(xpath = "//input[@id='d1']")
private WebElement CheckBox1;

@FindBy(xpath = "//input[@id='d2']")
private WebElement CheckBox2;

@FindBy(xpath = "//input[@id='d3']")
private WebElement CheckBox3;

/*
 * Utilize the elements
 */

public void TestCase_01()
{
CheckBox1.click();	
}
public void TestCase_02()
{
CheckBox2.click();	
}
public void TestCase_03()
{
CheckBox3.click();	
}

}
