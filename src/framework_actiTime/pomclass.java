package framework_actiTime;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class pomclass {
	/**
	 * Declaring values for Login Page
	 */
	@FindBy(id="username")
	private WebElement UsernameTextBox;

	@FindBy(name="pwd")
	private WebElement PasswordTextBox;

	@FindBy(xpath = "//div[@class='atProductName']")
	private WebElement LogoText;

	@FindBy(xpath = "//div[.='Login ']")
	private WebElement LoginButton;

	@FindBy(xpath = "//div[@class='atLogoImg']")
	private WebElement Logo;

	@FindBy(xpath = "//td[.='Please identify yourself']")
	private WebElement Text;

	@FindBy(xpath = "//td[@id='demoTooltipContainer']")
	private WebElement DemoTooltip;

	@FindBy(xpath = "//td[.='actiTIME 2020 Online']")
	private WebElement Actitime2020;

	@FindBy(name =  "remember")
	private WebElement Remember;

	@FindBy(xpath = "//a[.='Forgot your password?']")
	private WebElement ForgotPassword;

	@FindBy(xpath = "//div[.='Request Login Info']")
	private WebElement RequestLogin;

	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement ActitimeInc;

	/**
	 * Declaring values for the Home Page
	 */
	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement Settings;

	@FindBy(id="logoutLink")
	private WebElement LogOut;

	@FindBy(xpath = "//div[.='Time-Track']")
	private WebElement TimeTrack;

	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement Tasks;

	@FindBy(xpath = "//div[.='Reports']")
	private WebElement Reports;

	@FindBy(xpath = "//div[.='Users']")
	private WebElement Users;

	@FindBy(xpath = "(//div[.='Switch to actiPLANS'])[1]")
	private WebElement SwitchActiplans;

	@FindBy(id="ext-gen23")
	private WebElement Date;

	@FindBy(xpath = "//span[.='Add Recent Task']")
	private WebElement AddRecentTask;
	
	@FindBy(xpath = "(//div[@class='menu_icon'])[1]")
	private WebElement icon;

	/**
	 * Initialization
	 * @throws InterruptedException
	 */

	public void TestCase_001()
	{
		Reporter.log(""+Logo.isDisplayed(),true);
	}

	public void TestCase_002() //valid username and valid password
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("manager");
		LoginButton.click();
	}

	public void TestCase_003() //valid username and invalid password
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("Manager");
	}

	public void TestCase_004() //invalid username and invalid password
	{
		UsernameTextBox.sendKeys("Admin");
		PasswordTextBox.sendKeys("Manager");
	}

	public void TestCase_005() //valid username and blank password
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("");
	}

	public void TestCase_006() //valid username and blank password
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("");
	}

	public void TestCase_007() ////invalid username and blank password
	{
		UsernameTextBox.sendKeys("Admin");
		PasswordTextBox.sendKeys("");
	}

	public void TestCase_008() ////blank password and valid password
	{
		UsernameTextBox.sendKeys("");
		PasswordTextBox.sendKeys("manager");
	}

	public void TestCase_009() //blank username and valid password
	{
		UsernameTextBox.sendKeys("");
		PasswordTextBox.sendKeys("Admin123");
	}

	public void TestCase_010() //blank username and invalid password
	{
		UsernameTextBox.sendKeys("");
		PasswordTextBox.sendKeys("manager");
	}

	public void TestCase_011()
	{
		Reporter.log(Text.getText(),true);
	}

	public void TestCase_012()
	{
		Reporter.log(""+DemoTooltip.isDisplayed(),true);
	}

	public void TestCase_013()
	{
		Reporter.log(Actitime2020.getText(),true);
	}

	public void TestCase_014()
	{
		int h = Logo.getSize().height;
		int w = Logo.getSize().width;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(h, w);
		Reporter.log("TestCase15 is pass",true);
	}

	public void TestCase_015()
	{
		Reporter.log(""+UsernameTextBox.isDisplayed(),true);
	}

	public void TestCase_016()
	{
		Reporter.log(""+PasswordTextBox.isDisplayed(),true);
	}

	public void TestCase_017()
	{
		int unh = UsernameTextBox.getSize().height;
		int pwh = PasswordTextBox.getSize().height;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(unh, pwh);
		Reporter.log("TestCase_008 is pass",true);
	}

	public void TestCase_018()
	{
		int unw = UsernameTextBox.getSize().width;
		int pww = PasswordTextBox.getSize().width;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(unw, pww);
		Reporter.log("TestCase_009 is pass",true);
	}

	public void TestCase_019()
	{
		Reporter.log(""+Remember.isDisplayed(),true);
	}

	public void TestCase_020()
	{
		Reporter.log(""+LoginButton.isDisplayed(),true);
	}

	public void TestCase_021()
	{
		Reporter.log(LoginButton.getCssValue("border-top"));
	}

	public void TestCase_022()
	{
		Reporter.log(ForgotPassword.getText(),true);
	}

	public void TestCase_023()
	{
		ForgotPassword.click();
		Reporter.log("TestCase_023 is pass",true);
	}

	public void TestCase_024()
	{
		Reporter.log(""+RequestLogin.isDisplayed(),true);
	}

	public void TestCase_025()
	{
		Reporter.log(RequestLogin.getCssValue("border-top"));
	}

	public void TestCase_026()
	{
		UsernameTextBox.sendKeys("1234");
	}

	public void TestCase_027()
	{
		PasswordTextBox.sendKeys("1234");
	}

	public void TestCase_028()
	{
		UsernameTextBox.sendKeys("!@#$");
	}

	public void TestCase_029()
	{
		PasswordTextBox.sendKeys("!@#$");
	}

	public void TestCase_030()
	{
		Reporter.log(""+ActitimeInc.isDisplayed(),true);
	}

	public void TestCase_031()
	{
		ActitimeInc.click();
		Reporter.log("TestCase_031 is pass",true);
	}

	public void TestCase_032() throws InterruptedException
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("manager");
		LoginButton.click();
		Thread.sleep(2000);
		Reporter.log(""+Settings.isDisplayed(),true);
	}

	public void TestCase_033() throws InterruptedException
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("manager");
		LoginButton.click();
		Thread.sleep(2000);
		Settings.click();
		Reporter.log("TestCase_032 is pass",true);
	}

	public void TestCase_034() throws InterruptedException
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("manager");
		LoginButton.click();
		Thread.sleep(2000);
		Reporter.log(""+LogOut.isDisplayed(),true);
	}

	public void TestCase_035() throws InterruptedException
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("manager");
		LoginButton.click();
		Thread.sleep(2000);
		LogOut.click();
		Reporter.log("TestCase_035 is pass",true);
	}

	public void TestCase_036() throws InterruptedException
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("manager");
		LoginButton.click();
		Thread.sleep(2000);
		Reporter.log(""+TimeTrack.isDisplayed(),true);
	}
	
	public void TestCase_037() throws InterruptedException
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("manager");
		LoginButton.click();
		Thread.sleep(2000);
		Reporter.log(""+Tasks.isDisplayed(),true);
	}
	
	public void TestCase_038() throws InterruptedException
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("manager");
		LoginButton.click();
		Thread.sleep(2000);
		Reporter.log(""+Reports.isDisplayed(),true);
	}
	
	public void TestCase_039() throws InterruptedException
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("manager");
		LoginButton.click();
		Thread.sleep(2000);
		Reporter.log(""+Users.isDisplayed(),true);
	}
	
	public void TestCase_040() throws InterruptedException
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("manager");
		LoginButton.click();
		Thread.sleep(2000);
		Reporter.log(""+SwitchActiplans.isDisplayed(),true);
	}
	
	public void TestCase_041() throws InterruptedException
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("manager");
		LoginButton.click();
		Thread.sleep(2000);
		Reporter.log(""+Date.isDisplayed(),true);
	}
	
	public void TestCase_042() throws InterruptedException
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("manager");
		LoginButton.click();
		Thread.sleep(2000);
		Date.click();
		Reporter.log("TestCase_042 is pass",true);
	}
	
	public void TestCase_043() throws InterruptedException
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("manager");
		LoginButton.click();
		Thread.sleep(2000);
		Reporter.log(""+icon.isDisplayed(),true);
	}
	
	public void TestCase_044() throws InterruptedException
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("manager");
		LoginButton.click();
		Thread.sleep(2000);
		icon.click();
		Reporter.log("TestCase_044 is pass",true);
	}	
	
	public void TestCase_045() throws InterruptedException
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("manager");
		LoginButton.click();
		Thread.sleep(2000);
		Reporter.log(""+AddRecentTask.isDisplayed(),true);
	}
	
	public void TestCase_046() throws InterruptedException
	{
		UsernameTextBox.sendKeys("admin");
		PasswordTextBox.sendKeys("manager");
		LoginButton.click();
		Thread.sleep(2000);
		AddRecentTask.click();
		Reporter.log("TestCase_046 is pass",true);
	}
}

