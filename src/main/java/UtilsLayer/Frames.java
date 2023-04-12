package UtilsLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class Frames extends BaseClass {
	
	public static void frameByIndex(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public static void frameByName(String name)
	{
		driver.switchTo().frame(name);
	}
	public static void frameByWebElement(WebElement wb)
	{
		driver.switchTo().frame(wb);
	}
	public static void switchToDefaultContent()
	{
		driver.switchTo().defaultContent();
	}
	public static void switchToParent()
	{
		driver.switchTo().parentFrame();
	}
}
