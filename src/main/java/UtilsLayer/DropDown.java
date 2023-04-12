package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class DropDown extends BaseClass{
	//we handle dropdown by this method where tagname is select
	protected Select sel;

	public void dropdownByIndex(WebElement wb,int index)
	{
		//sel=new Select(wb);
		new Select(wb).selectByIndex(index);
	}
	
	public void dropdownByValue(WebElement wb,String value)
	{
		new Select(wb).selectByValue(value);
	}
	
	public void dropdownByVisibleText(WebElement wb,String visibletext)
	{	
		new Select(wb).selectByVisibleText(visibletext);
	}
	
	public String checkSelectedValue()
	{

		return sel.getFirstSelectedOption().getText();
	}
	
	public int countValuesFromDropdown(WebElement wb)
	{

		return new Select(wb).getOptions().size();
	}
	
	public void printAllValuesFromDropdown(WebElement wb)
	{
		sel=new Select(wb);
		List<WebElement> ls=sel.getOptions();
		//String a = null;
//		for(WebElement values:ls)
//		{
//			a=values.getText();
//			System.out.println(a);
//		}
		for(int i=0;i<ls.size();i++)
		{
			System.out.println("Value "+i+"="+ls.get(i).getText());
		}
//		for(int i=0;i<ls.size();i++)
//			{
//				for(int j=1;j<ls.size();j++)
//				{
//				System.out.println("Value "+j+"="+ls.get(i).getText());
//				}
//			}
	}
}
