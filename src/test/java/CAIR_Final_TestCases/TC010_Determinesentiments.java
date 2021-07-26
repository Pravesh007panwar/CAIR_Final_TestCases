package CAIR_Final_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import CAIRObjectRepository.ArticlesPage;
import CAIRObjectRepository.CAIRHomePage;

public class TC010_Determinesentiments extends InnsightLogin {

	@Test
	public void DS() throws InterruptedException {

		CAIRHomePage hp = new CAIRHomePage(driver);
		hp.Search().sendKeys("India");
		Thread.sleep(2000);
		hp.Advancedfilter().click();
		Thread.sleep(2000);
		ArticlesPage ap = new ArticlesPage(driver);
		Thread.sleep(2000);
		ap.ThreatMatrix().click();
		Thread.sleep(2000);
		ap.ClickApply().click();

		Thread.sleep(30000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement collection = driver.findElement(By.xpath("//*[@id=\"Corelation\"]/div/div/div[1]/div/div[1]"));
		js.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", collection);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement collection1 = driver.findElement(By.xpath("//*[@id=\"Corelation\"]/div/div/div[2]/div/div[1]"));
		js1.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');",
				collection1);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		WebElement collection2 = driver.findElement(By.xpath("//*[@id=\"Hashtags\"]/div/div[1]"));
		js2.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');",
				collection2);

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		WebElement collection3 = driver.findElement(By.xpath("//*[@id=\"divartProfile\"]/div/div[1]"));
		js3.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');",
				collection3);

		JavascriptExecutor js21 = (JavascriptExecutor) driver;
		WebElement collection21 = driver.findElement(By.xpath("//*[@id=\"divAllTweet\"]/div[1]/div[1]"));
		js21.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');",
				collection21);

		JavascriptExecutor js32 = (JavascriptExecutor) driver;
		WebElement collection34 = driver.findElement(By.xpath("//*[@id=\"divAllTweet\"]/div[2]/div[1]"));
		js32.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');",
				collection34);

		Thread.sleep(12000);

		driver.quit();

	}

}
