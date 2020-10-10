package Git.JenkinsWith;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWorld1 
{
	WebDriver driver;
	@Test
	  public void launchBrowser()
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
	      driver.get("https://www.facebook.com");
	      System.out.println("Page accessed successfully");
	      driver.close();

	  }


}
