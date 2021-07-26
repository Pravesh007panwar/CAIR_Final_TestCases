package CAIR_Final_TestCases;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import CAIRObjectRepository.CAIRHomePage;
import CAIRObjectRepository.LoginPage;
import DataIngestors.InnsightLogin;
import Repo.InnsightLogin2;

public class TC003_MultipleSocialMediaandWeb extends InnsightLogin {

	@Test

	public void supportCrawlingandScraping() throws InterruptedException, AWTException {

		CAIRHomePage hp = new CAIRHomePage(driver);
		Thread.sleep(10000);
		Actions a = new Actions(driver);
		a.moveToElement(hp.Collections()).build().perform();
		hp.Collections().click();
		Thread.sleep(5000);

		Set<String> mulwindow = driver.getWindowHandles();
		ArrayList<String> newwindow = new ArrayList<>(mulwindow);
		driver.switchTo().window(newwindow.get(1));
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-collection-list/section/div/div/div[1]/div/div/div[2]/div/a"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("New Collection test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/form/div[2]/button/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-radio-2\"]/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/form/div[2]/div/button[2]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")).sendKeys("Kashmir");
		driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"mat-slide-toggle-7\"]/label/div")).click();
		driver.findElement(
				By.xpath("//*[@id=\"cdk-step-content-0-2\"]/collection-keyword/form/div[2]/div[3]/button[2]/span[1]"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"mat-slide-toggle-7\"]/label/div/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id=\"cdk-step-content-0-2\"]/collection-keyword/form/div[2]/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-3\"]/form/div[2]/div[5]/button[2]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-4\"]/app-completed/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirm-dialog/div[2]/button[1]")).click();
		Thread.sleep(10000);

		driver.switchTo().window(newwindow.get(0));
		driver.findElement(By.cssSelector("input#txtTwSrch")).clear();
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("India AND Kashmir");
		driver.findElement(By.cssSelector("span#searchTweet")).click();
		driver.findElement(By.cssSelector("a#twColrelate")).click();
		Thread.sleep(10000);

		driver.findElement(By.cssSelector("a#twDashboard")).click();
		Thread.sleep(10000);

		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.xpath("//*[@id=\"widget_dashboard_14-1\"]/div[2]/div[1]/span"));
		act.moveToElement(wb).build().perform();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid red;');", wb);
		Thread.sleep(10000);
		driver.quit();
	}
}
