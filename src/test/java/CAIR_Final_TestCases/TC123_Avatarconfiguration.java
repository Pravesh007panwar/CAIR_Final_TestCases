package CAIR_Final_TestCases;

import org.testng.annotations.Test;

import CAIRObjectRepository.CollectionPage;
import Repo.InnsightLogin2;

public class TC123_Avatarconfiguration extends InnsightLogin2 {
	@Test
	public void Avatarconfig123() throws InterruptedException {

		Thread.sleep(2000);
		CollectionPage cp = new CollectionPage(driver);
		cp.ManageAvtarClick().click();

		cp.AddAvtar().click();

	}
}
