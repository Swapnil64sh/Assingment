package UtilsLayer;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import BaseLayer.BaseClass;
public class ScreenShot extends BaseClass {
	
	public static void takeScreenshot(String destination_path,String file_name)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dist=new File(destination_path+"\\"+file_name+".jpeg");
		try {
			FileUtils.copyFile(src,dist);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println("Screenshot captured by name "+file_name);
	}
}
