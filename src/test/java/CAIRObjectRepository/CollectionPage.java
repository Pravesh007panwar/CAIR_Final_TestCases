package CAIRObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollectionPage {
	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"mat-input-0\"]")
	WebElement SearchListcollection;

	@FindBy(xpath = "/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav-content/div/app-collection-list/section/div/div/div[2]/div[2]/table/tbody/tr[1]/td[12]/button/i\n"
			+ "")
	WebElement EditCollection;

	@FindBy(xpath = "//*[@id=\"mat-menu-panel-2\"]/div/button[1]/i")
	WebElement Editbutton;

	@FindBy(xpath = "//*[@id=\"cdk-accordion-child-0\"]/div/ul/li[2]/button")
	WebElement AddCollection;
	@FindBy(id = "mat-input-1")
	WebElement CollectionName;
	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-0\"]/form/div[2]/button/span[1]")
	WebElement NextButton;

	@FindBy(xpath = "/html/body/app-root/app-navigation-manager/main/mat-sidenav-container/mat-sidenav/div/mat-nav-list/mat-accordion[1]/mat-expansion-panel[2]")
	WebElement ManageAvtarClick;

	@FindBy(xpath = "//*[@id=\"cdk-accordion-child-1\"]/div/ul/li[2]/button")
	WebElement AddAvtar;

	@FindBy(xpath = "//*[@id=\"mat-radio-3\"]/label/span[1]/span[1]")
	WebElement TrackProfile;

	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-1\"]/form/div[2]/div/button[2]")
	WebElement TrackProfileNextButton;

	@FindBy(xpath = "//*[@id=\"cdk-step-content-0-2\"]/collection-keyword/div[1]/add-profile/div/div[1]/small/button")
	WebElement SearchProfile;

	public CollectionPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement AddCollection() {
		return AddCollection;

	}

	public WebElement CollectionName() {
		return CollectionName;

	}

	public WebElement NextButton() {
		return NextButton;

	}

	public WebElement ManageAvtarClick() {
		return ManageAvtarClick;

	}

	public WebElement AddAvtar() {
		return AddAvtar;
	}

	public WebElement TrackProfile() {
		return TrackProfile;
	}

	public WebElement TrackProfileNextButton() {
		return TrackProfileNextButton;
	}

	public WebElement SearchProfile() {
		return SearchProfile;
	}

	public WebElement SearchListcollection() {
		return SearchListcollection;

	}

	public WebElement Editbutton() {
		return Editbutton;
	}

	public WebElement EditCollection() {
		return EditCollection;

	}
}