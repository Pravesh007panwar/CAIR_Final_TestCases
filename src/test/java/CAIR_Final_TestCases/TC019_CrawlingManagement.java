package CAIR_Final_TestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import CAIRObjectRepository.CollectionPage;
import Repo.InnsightLogin2;

public class TC019_CrawlingManagement extends InnsightLogin2 {
	@Test
	public void CrawlingManagement() throws InterruptedException {

		CollectionPage cp = new CollectionPage(driver);

		cp.SearchListcollection().sendKeys("Collection Test Profiles 1");
		Thread.sleep(1000);
		cp.SearchListcollection().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		cp.EditCollection().click();
		Thread.sleep(1000);
		cp.Editbutton().click();
		Thread.sleep(1000);
		cp.NextButton().click();
		Thread.sleep(1000);
		cp.TrackProfileNextButton().click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"mat-select-value-37\"]/span/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"mat-option-2744\"]/span")).click();
		
	driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/collection-keyword/div[1]/add-profile/div/div[3]/button[2]/span[1]")).click();

	}

}
