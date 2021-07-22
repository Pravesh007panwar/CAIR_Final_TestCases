package CAIRObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	public static WebDriver driver;

	public WebElement base(WebDriver driver) {
		
		this.driver = driver;

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"divAllTweet\"]/div[1]/div[1]"))).build().perform();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		WebElement collection = driver.findElement(By.xpath("//*[@id=\"divAllTweet\"]/div[1]/div[1]"));
		js2.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red;');",
				collection);
		return base(driver);
		
		
	}

}
