package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program_099 {
@Test(priority=-2)
public void B()
{
	Reporter.log("B for Ball",true);
}
@Test(priority=-1)
public void A()
{
	Reporter.log("A for Apple",true);
}
@Test
public void C()
{
	Reporter.log("C for Cat",true);
}
@Test(priority = 2)
public void D()
{
	Reporter.log("D for Dog",true);
}
}
