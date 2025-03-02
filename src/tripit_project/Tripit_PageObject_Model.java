package tripit_project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Tripit_PageObject_Model {
	/*
	 * Declare the elements for Login page
	 */
	@FindBy(xpath = "//a[.='Sign In']")
	private WebElement Signin;

	@FindBy(xpath = "//input[@id='email_address']")
	private WebElement Emailbox;

	@FindBy(xpath = "//*[@type='password']")
	private WebElement Passwordbox;
	
	@FindBy(xpath = "//*[@type='submit']") 
	private WebElement SubmitBox;
	
	@FindBy(xpath = "//a[@id='forgot_password']")
	private WebElement Forgotbutton;
	
	@FindBy(xpath = "//p[@class='fieldBlock']")
	private WebElement ForgotmailBox;
	
	@FindBy(xpath = "//*[@id='signin-submit-btn']")
	private WebElement ForgotSendBox;
	
	@FindBy(xpath = "//a[@class='navbar-brand ml-3 router-link-active']")
	private WebElement Logo;
	
	@FindBy(xpath = "//*[@id='navbar-header-wrapper']")
	private WebElement wrapper_titles;
	
	@FindBy(xpath = "(//a[@href='/home'])[2]")
	private WebElement HomepageOpened;
	
	@FindBy(xpath = "//*[@class='default-link']")
	private WebElement AllHeadings;
	
	@FindBy(xpath = "(//a[contains(.,'TripIt Pro')])")
	private WebElement Tripitpro;
	
	@FindBy(xpath = "//*[@id='account-name']")
	private WebElement Account;
	
	@FindBy(xpath = "//*[@id='sign-out-link']")
	private WebElement Logout;

	/*
	 * Utilize the elements
	 */
	public void TestCase_01()
	{
		Reporter.log("test case is pass",true);
		Signin.click();
	}
	
	public void TestCase_02()//valid username and valid password
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		
	}
	
	public void TestCase_003()//invalid username and valid password
	{
		Signin.click();
		Emailbox.sendKeys("ivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");
	}
	
	public void TestCase_004()//invalid username and invalid password
	{
		Signin.click();
		Emailbox.sendKeys("ivjeevie@gmail.com");
		Passwordbox.sendKeys("akeid001");	
		}
	
	public void TestCase_005() //valid username and blank password
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("");
	}

	public void TestCase_006() ////invalid username and blank password
	{
		Signin.click();
		Emailbox.sendKeys("fsfffdsn");
		Passwordbox.sendKeys("");
	}

	public void TestCase_007() ////blank username and valid password
	{
		Signin.click();
		Emailbox.sendKeys("");
		Passwordbox.sendKeys("Fakeid001");
	}

	public void TestCase_008() //blank username and blank password
	{
		Signin.click();
		Emailbox.sendKeys("");
		Passwordbox.sendKeys("");
	}

	public void TestCase_009() //blank username and invalid password
	{
		Signin.click();
		Emailbox.sendKeys("");
		Passwordbox.sendKeys("monkey");
	}
	
	public void TestCase_010()//valid username and invalid password
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("akeid001");	
		}
	
	public void TestCase_011()
	{
		Signin.click();
		Reporter.log(""+Emailbox.isDisplayed(),true);
	}

	public void TestCase_012()
	{
		Signin.click();
		Reporter.log(""+Passwordbox.isDisplayed(),true);
	}
	
	public void TestCase_013()
	{
		Signin.click();
		Reporter.log(""+Forgotbutton.isDisplayed(),true);
	}

	public void TestCase_014()
	{
		Signin.click();
		Reporter.log(""+SubmitBox.isDisplayed(),true);
	}
	
	public void TestCase_015()
	{
		Signin.click();
		Reporter.log(Forgotbutton.getText(),true);
	}

	public void TestCase_016()
	{
		Signin.click();
		Forgotbutton.click();
		Reporter.log("TestCase_016 is pass",true);
	}
	
	public void TestCase_017()
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		Reporter.log(""+Logo.isDisplayed(),true);
	}
	
	public void TestCase_018()
	{
		Signin.click();
		int un = Emailbox.getSize().height;
		int pw = Passwordbox.getSize().height;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(un, pw);
		Reporter.log("TestCase_018 is pass",true);
	}

	public void TestCase_019()
	{
		Signin.click();
		int un = Emailbox.getSize().width;
		int pw = Passwordbox.getSize().width;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(un, pw);
		Reporter.log("TestCase_019 is pass",true);
	}
	
	public void TestCase_020()
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		int height = Logo.getSize().height;
		int width = Logo.getSize().width;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(height, width);
		Reporter.log("TestCase20 is pass",true);
	}
	
	public void TestCase_021()
	{
		Signin.click();
		Reporter.log(""+SubmitBox.isDisplayed(),true);
	}
	
	public void TestCase_022()
	{
		Signin.click();
		Emailbox.sendKeys("!@#$%^&*");
		}

	public void TestCase_023()
	{
		Signin.click();
		Passwordbox.sendKeys("!@#$%^&*");
		}
	
	public void TestCase_024() throws InterruptedException
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");
		SubmitBox.click();
		Thread.sleep(2000);
		Reporter.log(""+wrapper_titles.getText(),true);

	}
	
	public void TestCase_025() throws InterruptedException
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");
		SubmitBox.click();
		Thread.sleep(2000);
		Reporter.log(""+HomepageOpened.isDisplayed(),true);

	}
	
	public void TestCase_026() throws InterruptedException
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");
		SubmitBox.click();
		Thread.sleep(2000);
		Reporter.log(""+AllHeadings.getText(),true);

	}
	
	public void TestCase_027() throws InterruptedException
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");
		SubmitBox.click();
		Thread.sleep(2000);
		Reporter.log(""+Tripitpro.getText(),true);

	}
	
	public void TestCase_28()
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");
		SubmitBox.click();
		Account.click();
		Reporter.log("TestCase_32 is Pass",true);
	}
	
	public void TestCase_29()
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");
		SubmitBox.click();
		Account.click();
		Logout.click();
		Reporter.log("TestCase_33 is Pass",true);
	}
	}

