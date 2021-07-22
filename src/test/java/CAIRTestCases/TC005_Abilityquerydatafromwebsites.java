package CAIRTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import CAIRObjectRepository.ArticlesPage;
import CAIRObjectRepository.CAIRDashboardPage;
import CAIRObjectRepository.CAIRHomePage;
import DataIngestors.InnsightLogin;

public class TC005_Abilityquerydatafromwebsites extends InnsightLogin {

	@Test
	public void MultipleSocialMediaHandles() throws InterruptedException {

		CAIRHomePage hp = new CAIRHomePage(driver);
		hp.Search().sendKeys("India AND Kashmir");
		Thread.sleep(1000);
		hp.Advancedfilter().click();
		WebElement element = driver.findElement(By.id("ulEntifilSource"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(14000);
		ArticlesPage ap = new ArticlesPage(driver);
		ap.CountryDeskUncheck().click();
		ap.SocialMediaSourcesUncheck().click();
		Thread.sleep(1000);
		ap.SetGoogle().click();
		ap.SetBing().click();
		ap.DuckDuckGO().click();
		ap.Baidu().click();
		Thread.sleep(2000);
		ap.ClickApply().click();
		CAIRDashboardPage dp = new CAIRDashboardPage(driver);
		Thread.sleep(2000);
		dp.Datefilterclick().click();
		Thread.sleep(2000);

		dp.Last1Month().click();
		Thread.sleep(2000);
		dp.FilterApply().click();

		Thread.sleep(10000);

		dp.DashBoardButton().click();
		Thread.sleep(15000);

		driver.quit();

	}

}
