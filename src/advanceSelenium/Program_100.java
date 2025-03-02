package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program_100 {
@Test(invocationCount = 5)
public void CSK()
{
	Reporter.log("Chennai super kings",true);
}
@Test(invocationCount = 2)
public void KKR()
{
	Reporter.log("Kolkata knight Riders",true);
}
@Test(invocationCount = 1)
public void GT()
{
	Reporter.log("Gujarat Titans",true);
}
@Test(invocationCount = 5)
public void MI()
{
	Reporter.log("Mumbai Indians",true);
}
@Test(invocationCount = 2)
public void SRH()
{
	Reporter.log("Sun Rises Hyderabad",true);
}
@Test(invocationCount = 0)
public void RCB()
{
	Reporter.log("Royal Challenges Bangalore",true);
}
}

