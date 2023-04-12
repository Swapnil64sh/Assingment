package UtilsLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {
	/*
	 * enterData method is verify is element is displayed and enabled and 
	 * then sends data to the respected textbox
	 * @Param WebElement
	 * @Param String value
	 */
	public static void enterData(WebElement wb,String value) {
		if((wb.isEnabled())&&(wb.isDisplayed()))
				{
					wb.sendKeys(value);
				}
	}
	/*
	 * clickOnElement method is verify is element is displayed and enabled and 
	 * then clicks on respected element
	 * @Param WebElement
	 */
	public static void ClickOnElement(WebElement wb) {
		if((wb.isEnabled())&&(wb.isDisplayed()))
				{
					wb.click();
				}
	}
	

}
