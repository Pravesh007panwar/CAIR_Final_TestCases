package CAIR_Final_TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Repo.InnsightLogin2;

public class TC007_AddAvtar extends InnsightLogin2 {

	@Test
	public void avatarcrawling() throws Exception {

		driver.findElement(
				By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-1']/span/mat-panel-title/span"))
				.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='cdk-accordion-child-1']/div/ul/li[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-1")).sendKeys("Pravesh");
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-2")).sendKeys("Panwar");
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-3")).sendKeys("next generation avatar");
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-4")).sendKeys("Innefu@123");
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-5")).sendKeys("innefu@innefu.com");
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-6")).sendKeys("9966334490");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id='mat-select-12']/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-option[@id='mat-option-15']/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='mat-select-value-15']/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-option[@id='mat-option-475']/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id='mat-select-16']/div/div[2]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-option[@id='mat-option-497']/span")).click();
		driver.findElement(By.id("mat-input-7")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-confirm-dialog/div[2]/button[1]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/app-confirm-dialog/div[2]/button[2]/span[1]")).click();
		Thread.sleep(15000);
		driver.quit();
	}

}