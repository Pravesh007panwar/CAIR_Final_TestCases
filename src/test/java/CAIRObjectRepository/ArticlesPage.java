package CAIRObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArticlesPage {
	WebDriver driver;

	@FindBy(css = "span#lblNewsCheckUnCheckAll")
	WebElement CountryDeskUncheck;
	@FindBy(id = "lblCheckUnCheckAll")
	WebElement SocialMediaSourcesUncheck;

	@FindBy(xpath = "//*[@id=\"ulThreatMatrixId\"]/li/label/span")
	WebElement ThreatMatrix;

	@FindBy(xpath = ("//*[@id=\"ulEntifilSource\"]/li[1]/label/span"))
	WebElement SetTwiter;
	@FindBy(xpath = ("//*[@id=\"ulEntifilSource\"]/li[4]/label/span"))
	WebElement Setinstagram;
	@FindBy(xpath = ("//*[@id=\"ulEntifilSource\"]/li[2]/label/span"))
	WebElement Setfacebook;
	@FindBy(xpath = "//*[@id=\"ulEntifilSource\"]/li[13]/label/span")
	WebElement SetWebSite;

	@FindBy(xpath = ("//*[@id=\"ulEntifilSource\"]/li[14]/label/span"))
	WebElement SetGoogle;
	@FindBy(xpath = ("//*[@id=\"ulEntifilSource\"]/li[15]/label/span"))
	WebElement SetBing;
	@FindBy(xpath = ("//*[@id=\"ulEntifilSource\"]/li[16]/label/span"))
	WebElement DuckDuckGO;
	@FindBy(xpath = "//*[@id=\"ulEntifilSource\"]/li[17]/label/span")
	WebElement Baidu;

	@FindBy(xpath = "//*[@id=\"ulEntifilSource\"]/li[19]/label/span")
	WebElement Reddit;

	@FindBy(xpath = "//*[@id=\"headingTwo\"]/h4/span/a[1]")
	WebElement ClickApply;

	public ArticlesPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement SetTwiter() {
		return SetTwiter;
	}

	public WebElement CountryDeskUncheck() {
		return CountryDeskUncheck;

	}

	public WebElement Reddit() {
		return Reddit;

	}

	public WebElement SocialMediaSourcesUncheck() {
		return SocialMediaSourcesUncheck;

	}

	public WebElement Setinstagram() {
		return Setinstagram;

	}

	public WebElement Setfacebook() {
		return Setfacebook;

	}

	public WebElement ClickApply() {
		return ClickApply;
	}

	public WebElement SetGoogle() {
		return SetGoogle;
	}

	public WebElement SetBing() {
		return SetBing;

	}

	public WebElement DuckDuckGO() {
		return DuckDuckGO;

	}

	public WebElement Baidu() {
		return Baidu;

	}

	public WebElement SetWebSite() {
		return SetWebSite;

	}

	public WebElement ThreatMatrix() {
		return ThreatMatrix;
	}
}
