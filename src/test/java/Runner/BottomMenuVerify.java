package Runner;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import AT_FrameWork.base;
import aajTak.BottomMenu;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BottomMenuVerify extends base{
   	AndroidDriver<AndroidElement> driver;

@Test
	public void AT_App() throws Exception {
	
	//startServer();
	
		AndroidDriver<AndroidElement> driver=capabilities("ATNewApp");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 
	      
	    BottomMenu obj = new BottomMenu(driver);
	    obj.installApp();
	    obj.bottomMenuVerify();
	   // obj.BottomMenuMultipleClick(2);
	    
	    
	  
	  
	
		
		
		
  // service.stop();
   
   }

}




