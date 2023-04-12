package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class JavaScriptMethods extends BaseClass {
	protected static JavascriptExecutor js;
	
	public void clickOnElement(WebElement wb)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", wb);
	}
	public void sendData(WebElement wb,String value) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='"+value+"';", wb);
	}
	public void customAlert(String value)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+value+"');");
	}
	public void customConfirm(String value)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("confirm('"+value+"');");
	}
	public void customPrompt(String value)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("prompt('"+value+"');");
	}
	
	public void openWindow(String url)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.location='"+url+"';");
	}
	public void navigateBack(int back)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("history.go(-"+back+");");
	}
	public void navigateForward(int forward)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("history.go(+"+forward+");");
	}
	public void refresh()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0);");
	}
	public String captureTitle()
	{
		js=(JavascriptExecutor)driver;
		return js.executeScript("return document.URL;").toString();
	}
	public String captureInnerHTML()
	{
		js=(JavascriptExecutor)driver;
		return js.executeScript("return document.documentElement.innerHTML;").toString();
	}
	public void handleDropDown(WebElement namelocator,String value)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].getElementByName('"+namelocator+"').value='"+value+"';");
	}
	public void scrollDownByPixcel(int pixcel)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+pixcel+");");
	}
	public void scrollDownUpToElement(WebElement wb)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",wb);
	}
	public void highliteElement(WebElement wb,int pixcel,String colour)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='"+pixcel+"px solid "+colour+"'", wb);
	}
	
	

}
