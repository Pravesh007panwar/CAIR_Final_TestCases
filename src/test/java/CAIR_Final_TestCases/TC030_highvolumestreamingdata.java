package CAIR_Final_TestCases;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

import DataIngestors.InnsightLogin;

public class TC030_highvolumestreamingdata extends InnsightLogin {
	
	@AfterClass
	
	public void highvolumestreamingdata() throws InterruptedException
	
	{
	driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
	driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("India");
	driver.findElement(By.cssSelector("span#searchTweet")).click();
	Thread.sleep(15000);
driver.quit();
	
	}
	

}
