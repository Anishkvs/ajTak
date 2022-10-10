package Runner;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import AT_Android.Article_SocialMeida;
import AT_Android.Setting_Page;
import AT_Android.Notification_Hub;
import AT_FrameWork.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Notification_Hub_Verify extends base{
   	AndroidDriver<AndroidElement> driver;

@Test
	public void AT_App() throws Exception {
	
//	startServer();
	
		AndroidDriver<AndroidElement> driver=capabilities("ATNewApp");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 
	    
	    
	    Notification_Hub obj = new Notification_Hub(driver);
	    obj.installApp();
	    obj.openNotification();
	    obj.notificationHub();
	    
	    
	    
	    
	    
	 
		
		
   //service.stop();
   
   }

}




