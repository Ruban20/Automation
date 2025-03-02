package advanceSelenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Program_129 {
/*
 * declare the elements of the page
 */
	
@FindBy(xpath = "//input[@type='checkbox']")
private List<WebElement>AllCheckBox;
public void MyLastclass()throws InterruptedException{
int count=AllCheckBox.size();
Thread.sleep(2000);
for(int i=0;i<count;i++)
{
AllCheckBox.get(i).click();	
}
}
}


