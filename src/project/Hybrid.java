package project;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hybrid extends ChatBot{
@Test
public void Testcase_001()
{
	pom cht=new pom();
PageFactory.initElements(driver, cht);
cht.Testcase01();
Reporter.log("Testcase01 is pass",true);
}
}
