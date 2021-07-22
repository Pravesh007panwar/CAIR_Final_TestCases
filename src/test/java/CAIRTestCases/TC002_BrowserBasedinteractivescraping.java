package CAIRTestCases;

import org.testng.annotations.Test;

import CAIRObjectRepository.ArticlesPage;
import CAIRObjectRepository.CAIRDashboardPage;
import CAIRObjectRepository.CAIRHomePage;
import DataIngestors.InnsightLogin;

public class TC002_BrowserBasedinteractivescraping extends InnsightLogin {

	@Test
	public void MultipleSocialMediaHandles() throws InterruptedException {

		CAIRHomePage hp = new CAIRHomePage(driver);
		hp.Search().sendKeys("India");
		Thread.sleep(2000);
		hp.Advancedfilter().click();

		ArticlesPage ap = new ArticlesPage(driver);
		ap.CountryDeskUncheck().click();
		ap.SocialMediaSourcesUncheck().click();
		Thread.sleep(1000);
		ap.Setfacebook().click();
		Thread.sleep(1000);
		ap.Setinstagram().click();
		Thread.sleep(2000);
		ap.ClickApply().click();
		Thread.sleep(10000);
		CAIRDashboardPage dp = new CAIRDashboardPage(driver);
		dp.DashBoardButton().click();
		Thread.sleep(10000);
		dp.Datefilterclick().click();
		Thread.sleep(1000);
		dp.Last7days().click();
		dp.FilterApply().click();
		Thread.sleep(10000);
		driver.quit();

	}

}
