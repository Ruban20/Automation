package advanceSelenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program_125 {
/*
 * common data's for the project
 */
static WebDriver driver;
static String URL="https://www.google.com/";
public static void main(String[]args)throws InterruptedException{
	//Taking the input from the user
	Scanner sc=new Scanner(System.in);
	String BrowserName=sc.nextLine();
	if (BrowserName.contains("Chrome")) {
   driver=new ChromeDriver();		
	}
	else if (BrowserName.contains("Edge")) {
driver=new EdgeDriver();		
	}
	else
	{
		driver=new FirefoxDriver();
		}
driver.get(URL);
Thread.sleep(2000);
String Title=driver.getTitle();
Thread.sleep(2000);
System.out.println(Title);
driver.close();
}



}
