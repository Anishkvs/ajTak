package Runner;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import AT_FrameWork.base;
import aajTak.Newspresso;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class NewspressoVerify extends base{
   	AndroidDriver<AndroidElement> driver;

@Test
	public void AT_App() throws Exception {
	
	//startServer();
	
		AndroidDriver<AndroidElement> driver=capabilities("ATNewApp");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 
	    
	      
	    Newspresso obj = new Newspresso(driver);
	    obj.installApp();
	    obj.SuperFast_Newspresso();
	    obj.NewsPressoSwipe();
	    
	    
	    
	
	   
	  
	
		
		
		
   //service.stop();
   
   }

}




