package Runner;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import AT_FrameWork.base;
import aajTak.Article_SocialMeida;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Article_SocialMeida_Verify_inHomePage extends base{
   	AndroidDriver<AndroidElement> driver;

@Test
	public void AT_App() throws Exception {
	
	//startServer();
	
		AndroidDriver<AndroidElement> driver=capabilities("ATNewApp");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	 
	      
	    Article_SocialMeida obj = new Article_SocialMeida(driver);
	    obj.installApp();
	    obj.Article();
	   
	    
	    
	  
	  
	
		
		
		
  // service.stop();
   
   }

}




