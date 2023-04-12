package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * This BaseClass has a super-Parent class of whole framework.
 * It takes baseURL from the properties file from the ConfigLayer.
 * We can choose browser from properties file.
 * 
 * @author swapnil64sh
 *
 */
public class BaseClass {

	public static Properties prop;
	public static WebDriver driver=null;
	/*
	 * Under the constructor we are calling properties file where 
	 * URL and browser-type is mentioned.
	 */
	public BaseClass()
	{
		final String PROPERTIES_FILE_PATH = "\\src\\main\\java\\ConfigLayer\\config.properties";

		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+
					PROPERTIES_FILE_PATH);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * Initialization method have selection of browser
	 * Implicit timeOut of 30 Sec.
	 * pageLoadTimeOut of 30 Sec.
	 * deleting cookies
	 * maximizing of window
	 */
	@SuppressWarnings("deprecation")
	public static void initilization()
	{
		switch(prop.getProperty("browser"))
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			//options.addArguments("disable-infobars");
			//options.addArguments("incognito");
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;

		case "edge" :
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		case "opera" :
			WebDriverManager.operadriver().setup();
			driver=new OperaDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}

}
