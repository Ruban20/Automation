package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Program_097 {
@Test
public void Testcases_001()
{
System.out.println("Hi");//Prints only on the console
Reporter.log("Hello");//prints only on the report
Reporter.log("Enna Pandra",true);//Both console and report
Reporter.log("Saptiya",false);//Print only on report
}
}
