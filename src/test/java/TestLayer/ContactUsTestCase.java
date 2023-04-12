package TestLayer;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.ContactUsPage;
import PageLayer.HomePage;
import UtilsLayer.DropDown;
import UtilsLayer.ScreenShot;
import junit.framework.Assert;

public class ContactUsTestCase extends BaseClass{

	static ContactUsPage contactUs;
	static HomePage homepage;
	@BeforeClass
	public void setup()// throws InterruptedException
	{
		BaseClass base=new BaseClass();
		base.initilization();
		homepage=new HomePage();
		homepage.clickOnCooKiesPop();
		homepage.clickOnOptions();
		homepage.clickOnContactUs();
	}

	@Test(priority=1)
	public void enterData()
	{
		contactUs=new ContactUsPage();
		contactUs.switchToFrame();
		contactUs.enterCompanyName("Syscryption Technology");
		contactUs.enterFirstName("Swapnil");
		contactUs.enterLastName("Shingate");
		contactUs.enterEmail("swapnil.64.sh@gmail.com");
		contactUs.enterPhone("8262943962");
		contactUs.enterEnqueryDetails("About Intrest Rates");

	}

	@Test(priority=2)
	public void countryDD()
	{
		contactUs=new ContactUsPage();

		DropDown dropdown=new DropDown();
		String country="India";
		dropdown.dropdownByVisibleText(contactUs.countryDD(), country);
		int sizeOfList=dropdown.countValuesFromDropdown(contactUs.countryDD());
		int actualSizeOfcountryList=243;
		//Select countrydd=new Select(contactUs.countryDD());
		//List<WebElement> countryList=countrydd.getOptions();
		//String country="India";
		//countrydd.selectByVisibleText(country);
		//validation of count of country from country DropDown
		Assert.assertEquals(sizeOfList, actualSizeOfcountryList);
	}

	@Test(priority=3)
	public void aboutUsDD()
	{
		DropDown dropdowna=new DropDown();
		String aboutUs="Web Search";
		dropdowna.dropdownByVisibleText(contactUs.aboutUs_DD(), aboutUs);
		int countOfAboutUs=dropdowna.countValuesFromDropdown(contactUs.aboutUs_DD());
		//System.out.println(countOfAboutUs);
		int actualSizeOfAboutUsList=6;
		Assert.assertEquals(countOfAboutUs, actualSizeOfAboutUsList);
	}

	@Test(priority=4)
	public void enterRemeningfields()
	{
		contactUs=new ContactUsPage();

		contactUs.iAgreeBtn();
		ScreenShot screenshot=new ScreenShot();
		String date = new SimpleDateFormat("_ddMMyyyy_HHmmss").format(new Date());
		String path=System.getProperty("user.dir") + "//PassScreenshot//";
		ScreenShot.takeScreenshot(path,"contactUs");
	}
	@Test(priority=5,enabled=false)
	public void validationOfAllFilds()
	{
		contactUs=new ContactUsPage();
		String expectedcompanyName=contactUs.getAttributeOfCompanyName();
		String expectedFirstName=contactUs.getAttributeOfFirstName();
		String expectedLastName=contactUs.getAttributeOfLastName();
		String expectedemail=contactUs.getAttributeOfemail();
		String expectedPhone=contactUs.getAttributephone();
		String expectedEnq_Details=contactUs.getAttributeEnq_Details();

		//validation of first five fields.
		Assert.assertEquals(expectedcompanyName, "Syscryption Technology");
		Assert.assertEquals(expectedFirstName, "Swapnil");
		Assert.assertEquals(expectedLastName, "Shingate");
		Assert.assertEquals(expectedemail, "swapnil.64.sh@gmail.com");
		Assert.assertEquals(expectedPhone, "8262943962");
		Assert.assertEquals(expectedEnq_Details, "About Intrest Rates");
	}

	@AfterClass
	public void tearDown()
	{

		driver.quit();
	}

}
