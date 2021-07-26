package CAIR_Final_TestCases;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

import DataIngestors.InnsightLogin;

public class TC032_Historicalcontent extends InnsightLogin {
	
	@AfterClass
	
	public void historicalcontent() throws InterruptedException
	
	{
	driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
	driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("India AND Kashmir");
	driver.findElement(By.cssSelector("span#searchTweet")).click();
	Thread.sleep(15000);
    driver.findElement(By.xpath("//*[@id=\"calmBox\"]")).click();
    driver.findElement(By.xpath("//*[@id=\"calBox\"]/div[2]/span[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"calBox\"]/div[2]/span[8]")).click();
	Thread.sleep(15000);
	driver.quit();
	}
	

}
