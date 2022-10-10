package Runner;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import AT_Android.Article_SocialMeida;
import AT_Android.Setting_Page;
import AT_Android.Notification_Hub;
import AT_FrameWork.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SettingPage_Verify extends base{
   	AndroidDriver<AndroidElement> driver;

@Test
	public void AT_App() throws Exception {
	
//	startServer();
	
		AndroidDriver<AndroidElement> driver=capabilities("ATNewApp");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 
	    //Home obj1 = new Home(driver);
	      
	    Setting_Page obj = new Setting_Page(driver);
	    
	    obj.installApp();
	    obj.openNotification();
	    obj.notificationSetting();
	    
	    
	    
	    
	    
	    
	 
		
		
   //service.stop();
   
   }

}




