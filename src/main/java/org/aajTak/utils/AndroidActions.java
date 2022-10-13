package org.aajTak.utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import AT_FrameWork.base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public abstract class AndroidActions {

	
	AndroidDriver<AndroidElement> driver;
	 
	public List<HashMap<String, String>> getJsonData(String jsonFilePath) throws IOException {

		String jsonContent = FileUtils.readFileToString(new File(jsonFilePath),StandardCharsets.UTF_8);
		//System.getProperty("user.dir")+"//src//test//java//org//aajTak//testData//indiaToday.json"
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent,
		  new TypeReference<List<HashMap<String, String>>>()  {
		});
		return data;
	}
			
		@AndroidFindBy(xpath="//android.widget.FrameLayout[@resource-id='in.AajTak.headlines:id/drag_parent']")
		private WebElement wait;
		
		
		public void waitForThePage(WebElement ele, AndroidDriver driver)
		{
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable((ele)));
		
		}
		
		public String getScreenshotPath(String testCaseName, AppiumDriver driver) throws IOException 
		{
			File source = driver.getScreenshotAs(OutputType.FILE);
			String destinationFile = System.getProperty("user.dir")+"//reports"+testCaseName+".png";
			FileUtils.copyFile(source, new File(destinationFile));
			return destinationFile;
			
		}
		
}
