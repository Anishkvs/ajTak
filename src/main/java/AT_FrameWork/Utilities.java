package AT_FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class Utilities {
	AndroidDriver<AndroidElement>  driver;

	public void Utilities(AndroidDriver<AndroidElement> driver)
	{
		this.driver=driver;
	}

	
	public void scrollToText(String text)
	{
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));");
	}
	
	public void index() {
		try {
			driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();
		}
		catch(NoSuchElementException e) {
			
		}
		
	}
	public void closepopUp() {
		 //close popup 
		try {
			driver.findElement(By.id("com.indiatoday:id/iv_close")).click();
		} catch(NoSuchElementException e) {
			
		}
		
	}
	
	



}
