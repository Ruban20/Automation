package advanceSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_124 {
public static void main(String[]args)throws InterruptedException, IOException
//Up cast ChromeDriver to web driver
{
 WebDriver driver=new ChromeDriver();	
 //enter the URL
driver.get("https://www.instagram.com");
//Type case the object to TakeScreenshot
TakesScreenshot ts=(TakesScreenshot)driver;
//Like Pressing the printScreen Button
Thread.sleep(2000);
File source=ts.getScreenshotAs(OutputType.FILE);
//Create a Folder to save the screenshot
File destination=new File("./test-output/Screenshot/ss2png");
//Move the screenshot from the source to Destination
FileUtils.copyFile(source, destination);
//Close the browser
driver.close();


}
}
