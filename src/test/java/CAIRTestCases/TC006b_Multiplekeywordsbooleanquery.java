package CAIRTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class TC006b_Multiplekeywordsbooleanquery extends InnsightLogin {
	
	@AfterClass
	
	public void Multiplekeywordsbooleanquery() throws InterruptedException
	
	{
	driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
	driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("(India AND Kashmir) OR (Pakistan AND Kashmir)");
	driver.findElement(By.cssSelector("span#searchTweet")).click();
	Thread.sleep(25000);
	driver.quit();
	
	}
	

}
