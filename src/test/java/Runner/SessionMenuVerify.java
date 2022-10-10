package Runner;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import AT_Android.Hold_HamburgerMenu;
import AT_Android.SessionMenu;
import AT_FrameWork.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SessionMenuVerify extends base{
   	AndroidDriver<AndroidElement> driver;

@Test
	public void AT_App() throws Exception {
	
	//startServer();
	
		AndroidDriver<AndroidElement> driver=capabilities("ATNewApp");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 
	      
	    SessionMenu obj = new SessionMenu(driver);
	    obj.installApp();
	    obj.SessionMenuVerify();
	   // obj.skip();
	    
	    
	    
	    

	
		
		
		
 //  service.stop();
   
   }

}




