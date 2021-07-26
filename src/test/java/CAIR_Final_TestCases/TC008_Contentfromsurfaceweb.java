package CAIR_Final_TestCases;

import org.testng.annotations.Test;

import CAIRObjectRepository.ArticlesPage;
import CAIRObjectRepository.CAIRDashboardPage;
import CAIRObjectRepository.CAIRHomePage;

public class TC008_Contentfromsurfaceweb extends InnsightLogin {

	@Test
	public void contentfromsurfaceweb() throws InterruptedException {

		CAIRHomePage hp = new CAIRHomePage(driver);
		hp.Search().sendKeys("India");
		Thread.sleep(2000);
		hp.Advancedfilter().click();
		Thread.sleep(2000);
		ArticlesPage ap = new ArticlesPage(driver);
		Thread.sleep(2000);
		ap.ClickApply().click();
		Thread.sleep(10000);
		CAIRDashboardPage dp = new CAIRDashboardPage(driver);
		dp.DashBoardButton().click();
		Thread.sleep(10000);
		dp.Datefilterclick().click();
		Thread.sleep(1000);
		dp.Last1Month().click();
		dp.FilterApply().click();
		Thread.sleep(30000);
		driver.quit();
	}

}