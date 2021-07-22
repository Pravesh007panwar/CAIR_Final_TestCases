package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import CAIRObjectRepository.ArticlesPage;
import CAIRObjectRepository.CAIRHomePage;
import DataIngestors.InnsightLogin;

public class TC004_SystemshouldsupportTwitterstreamingAPI extends InnsightLogin {

	@Test
	public void MultipleSocialMediaHandles() throws InterruptedException {

		CAIRHomePage hp = new CAIRHomePage(driver);
		hp.Search().sendKeys("India AND Kashmir");
		Thread.sleep(1000);
		hp.Advancedfilter().click();

		ArticlesPage ap = new ArticlesPage(driver);
		ap.CountryDeskUncheck().click();
		ap.SocialMediaSourcesUncheck().click();
		Thread.sleep(1000);
		ap.SetTwiter().click();
		Thread.sleep(2000);
		ap.ClickApply().click();
		Thread.sleep(20000);

		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath("//*[@id=\"divAllTweet\"]/div[1]/div[1]"));
		act.moveToElement(wb).build().perform();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');", wb);
		Thread.sleep(10000);
		driver.quit();

	}

}
