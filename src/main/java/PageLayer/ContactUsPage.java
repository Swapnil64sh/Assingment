package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.Frames;
import UtilsLayer.JavaScriptMethods;
import UtilsLayer.UtilsClass;

public class ContactUsPage extends BaseClass {
	
	static JavaScriptMethods jsm;
	
	@FindBy(xpath="//iframe[@src='https://go.intelligencebank.com/l/941293/2021-08-09/2gdc87p']")
	WebElement frameOfFeeds;
	
	@FindBy(xpath="//label[text()='Company Name*']//following::input[@id='Companypi_Company']")
	WebElement companyName;
	
	@FindBy(xpath="//label[text()='Company Name*']//following::input[@id='First_Namepi_First_Name']")
	WebElement firstName;
	
	@FindBy(xpath="//label[text()='Company Name*']//following::input[@id='Last_Namepi_Last_Name']")
	WebElement lastName;
	
	@FindBy(xpath="//label[text()='Company Name*']//following::input[@id='Emailpi_Email']")
	WebElement email;
	
	@FindBy(xpath="//label[text()='Company Name*']//following::input[@id='941293_138982pi_941293_138982']")
	WebElement phone;
	
	@FindBy(xpath="//select[@id='941293_138980pi_941293_138980']")
	WebElement countryDD;
	
	@FindBy(xpath="//label[text()='Enquiry Details']//following::textarea[@id='941293_138986pi_941293_138986']")
	WebElement enq_details;
	
	@FindBy(xpath="//select[@id='941293_178033pi_941293_178033']")
	WebElement aboutUsDD;
	
	@FindBy(xpath="//input[@id='941293_139028pi_941293_139028_631736']")
	WebElement iAgree;
	
	public ContactUsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void switchToFrame()
	{
		Frames frame=new Frames();
		frame.frameByWebElement(frameOfFeeds);
	}
	
	public void enterCompanyName(String value)
	{
		jsm=new JavaScriptMethods();
		jsm.sendData(companyName, value);
	}
	public String getAttributeOfCompanyName()
	{
		return companyName.getAttribute("value") ;
	}
	
	public void enterFirstName(String value)
	{
		jsm=new JavaScriptMethods();
		jsm.sendData(firstName, value);
	}
	
	public String getAttributeOfFirstName()
	{
		return firstName.getAttribute("value") ;
	}
	
	public void enterLastName(String value)
	{
		jsm=new JavaScriptMethods();
		jsm.sendData(lastName, value);
	}
	
	public String getAttributeOfLastName()
	{
		return lastName.getAttribute("value") ;
	}
	
	public void enterEmail(String value)
	{
		jsm=new JavaScriptMethods();
		jsm.sendData(email, value);
	}
	
	public String getAttributeOfemail()
	{
		return email.getAttribute("value") ;
	}
	
	public void enterPhone(String value)
	{
		jsm=new JavaScriptMethods();
		jsm.sendData(phone, value);
	}
	public String getAttributephone()
	{
		return phone.getAttribute("value") ;
	}
	
	public WebElement countryDD()
	{
		return countryDD;
	}
	
	public void enterEnqueryDetails(String value)
	{
		jsm=new JavaScriptMethods();
		jsm.sendData(enq_details, value);
	}
	
	public String getAttributeEnq_Details()
	{
		return enq_details.getAttribute("value") ;
	}
	
	public WebElement aboutUs_DD()
	{
		return aboutUsDD;
	}
	
	public void iAgreeBtn()
	{
		jsm=new JavaScriptMethods();
		jsm.clickOnElement(iAgree);
	}

}
