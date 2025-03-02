package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program_101 {
@Test
public void A()
{
Reporter.log("A for Apple",true);	
}
@Test
public void B()
{
Reporter.log("B for Ball",true);	
}
@Test
public void C()
{
Reporter.log("C for Cat",true);	
}
@Test(dependsOnMethods = "B")
public void D()
{
Reporter.log("D for Dog",true);	
}

}

