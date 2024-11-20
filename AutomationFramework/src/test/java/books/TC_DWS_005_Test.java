package books;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_005_Test extends BaseClass {
	@Test
	public void clickOnBooks() throws EncryptedDocumentException, IOException {
		// test = extReport.createTest("clickOnBooks");
		hp = new HomePage(driver);
		hp.getBooksLink().click();
		Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Books", 1, 0),
				"Books page is not displayed");
		test.log(Status.PASS, "Books page is displayed");
	}

	/*
	 * public void clickOnComputers() throws EncryptedDocumentException, IOException
	 * { // test = extReport.createTest("clickOnComputers"); hp = new
	 * HomePage(driver); hp.getBooksLink().click();
	 * Assert.assertEquals(driver.getTitle(),
	 * eUtil.getStringDataFromExcel("Computers", 1, 0),
	 * "Computers page is not displayed"); test.log(Status.PASS,
	 * "Computers page is displayed"); }
	 * 
	 * public void clickOnElectronics() throws EncryptedDocumentException,
	 * IOException { //test = extReport.createTest("clickOnElectronics"); hp = new
	 * HomePage(driver); hp.getBooksLink().click();
	 * Assert.assertEquals(driver.getTitle(),
	 * eUtil.getStringDataFromExcel("Electronics", 1, 0),
	 * "Electronics page is not displayed"); test.log(Status.PASS,
	 * "Electronics page is displayed"); }
	 * 
	 * public void clickOnGiftCards() throws EncryptedDocumentException, IOException
	 * { // test = extReport.createTest("clickOnGiftCards"); hp = new
	 * HomePage(driver); hp.getBooksLink().click();
	 * Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Books",
	 * 1, 0), "GiftCards page is not displayed"); test.log(Status.PASS,
	 * "GiftCards page is displayed"); }
	 */
}
