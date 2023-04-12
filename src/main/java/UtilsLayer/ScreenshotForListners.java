package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class ScreenshotForListners extends BaseClass {
	
	public static void takeSceenshot(String methodname) {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File f = ts.getScreenshotAs(OutputType.FILE);

		String date = new SimpleDateFormat("_ddMMyyyy_HHmmss").format(new Date());

		File dist = new File(System.getProperty("user.dir") + "//PassScreenshot//"+methodname + date + ".png");

		try {
			FileUtils.copyFile(f, dist);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
