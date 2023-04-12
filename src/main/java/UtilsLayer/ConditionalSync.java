package UtilsLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import BaseLayer.BaseClass;

public class ConditionalSync extends BaseClass {
	public static void implecitWait(int timeinsec)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeinsec));
	}
	//for those WebElement need more time find its xpath and pass as string
	//e.g.WebElement wb=ConditionalSync.explicitlyWait(120,"//button[text()=" Login "]"
	public static WebElement explicitlyWait(int timeinsec,String xpath)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath")));
	}
	
	/**
	public static void fluentWait(final String xpathofelement)
	{
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
	.pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);

			WebElement wb2 = wait.until(new Function<WebDriver, WebElement>() 
			{
			public WebElement apply(WebDriver driver) 
				{
				return driver.findElement(By.xpath(""+xpathofelement+""));
				}
			}
			);
	}**/
}
