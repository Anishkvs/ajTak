package Runner;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.aajTak.pageObjects.android.loginPage;
import org.testng.annotations.Test;
import AT_FrameWork.base;
import aajTak.BottomMenu;
import aajTak.loginTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class loginVerify extends base{
   	AndroidDriver<AndroidElement> driver;

@Test
	public void AT_App() throws Exception {
	
	//startServer();
	
		AndroidDriver<AndroidElement> driver=capabilities("ATNewApp");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 
	      
	    loginTest login = new loginTest(driver);
	    login.installApp();
	    login.login(null); 
	 
	   
	   
	   
	   
	   
	   
	    
	    
	  
	  
	
		
		
		
  // service.stop();
   
   }

}




