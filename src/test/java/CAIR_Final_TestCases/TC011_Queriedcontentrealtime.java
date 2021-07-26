package CAIR_Final_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

import CAIRObjectRepository.ArticlesPage;
import CAIRObjectRepository.CAIRHomePage;
import DataIngestors.InnsightLogin;

public class TC011_Queriedcontentrealtime extends InnsightLogin {

	@AfterClass
	public void DS() throws InterruptedException {

		CAIRHomePage hp = new CAIRHomePage(driver);
		Thread.sleep(2000);
		hp.Search().sendKeys("India");
		Thread.sleep(2000);
		hp.Advancedfilter().click();
		Thread.sleep(10000);
		ArticlesPage ap = new ArticlesPage(driver);
		ap.Reddit().click();
		ap.ClickApply().click();
		Thread.sleep(20000);

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"divAllTweet\"]/div[1]/div[1]"))).build().perform();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		WebElement collection = driver.findElement(By.xpath("//*[@id=\"divAllTweet\"]/div[1]/div[1]"));
		js2.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');",
				collection);
	
		Thread.sleep(10000);
		driver.quit();
	}

}
