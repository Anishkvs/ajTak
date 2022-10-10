package Runner;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import AT_Android.HomePageArticleCheck;
import AT_FrameWork.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HomePageArticleMenu extends base{
   	AndroidDriver<AndroidElement> driver;

@Test
	public void AT_App() throws Exception {
	
	//startServer();
	
		AndroidDriver<AndroidElement> driver=capabilities("ATNewApp");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 
	      
	    HomePageArticleCheck obj = new HomePageArticleCheck(driver);
	    obj.installApp();
	    obj.ArticleClick();
	    
	    
	    
	    
	
		
  // service.stop();
   
   }

}




