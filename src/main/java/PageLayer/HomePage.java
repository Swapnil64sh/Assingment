package PageLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//a[text()='Accept']")
	WebElement acceptCookiesPop;
	
	@FindBy(xpath="//button[@id='mega__menu_toggle']")
	WebElement options;
	
	
	@FindBy(xpath="//li[@id='menu-item-10499']")
	WebElement contactUs;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnCooKiesPop()
	{
		UtilsClass.ClickOnElement(acceptCookiesPop);
	}
	
	public void clickOnOptions()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='mega__menu_toggle']"))).click();
	}
	
	public void clickOnContactUs()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='menu-item-10499']"))).click();
	}

}
