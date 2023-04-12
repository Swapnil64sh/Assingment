package TestLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import UtilsLayer.ConditionalSync;
import UtilsLayer.ScreenShot;
import junit.framework.Assert;

public class HomePageTestCase extends BaseClass {
	static HomePage homepage;
	@BeforeClass
	public void setup()// throws InterruptedException
	{
		BaseClass base=new BaseClass();
		base.initilization();
	}
	
	@Test(priority=1,groups="homepage")
	public void acceptCookiesPopup()
	{
		homepage=new HomePage();
		homepage.clickOnCooKiesPop();
		ScreenShot screenshot=new ScreenShot();
		String date = new SimpleDateFormat("_ddMMyyyy_HHmmss").format(new Date());
		String path=System.getProperty("user.dir") + "//PassScreenshot//";
		ScreenShot.takeScreenshot(path,"AcceptCookies");
	}

	@Test(priority=2,groups="homepage")
	public void validate_Title()
	{
		String actualTitle="#1 Digital Asset Management, Brand Portal & MRM Software | IntelligenceBank";
		String expectedTitle=driver.getTitle();
		System.out.println(expectedTitle);
		Assert.assertEquals(expectedTitle,actualTitle);

	}

	@Test(priority=3,groups="homepage")
	public void clickOnContactUs() throws InterruptedException
	{
		homepage=new HomePage();
		homepage.clickOnOptions();
		ScreenShot screenshot=new ScreenShot();
		String date = new SimpleDateFormat("_ddMMyyyy_HHmmss").format(new Date());
		String path=System.getProperty("user.dir") + "//PassScreenshot//";
		ScreenShot.takeScreenshot(path,"options");
		homepage.clickOnContactUs();
	}
	@Test(priority=4,groups="homepage")
	public void validateUserOnContctUsPage()
	{
		String actual_Title="Contact Us - IntelligenceBank";
		Assert.assertEquals(driver.getTitle(), actual_Title);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
