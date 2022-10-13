package Runner;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.aajTak.pageObjects.android.homePage;
import org.aajTak.pageObjects.android.launchPage;
import org.aajTak.pageObjects.android.loginPage;
import org.testng.annotations.Test;

import AT_FrameWork.Swipes;
import AT_FrameWork.base;
import aajTak.BottomMenu;
import aajTak.loginTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class loginVerify2 extends base{
	AndroidDriver<AndroidElement>driver;

	public loginVerify2(AndroidDriver<AndroidElement> driver)
	{
		this.driver=driver;
	}
	Swipes uti = new Swipes(driver);
	
	@Test(dataProvider="getData")

	public void AT_App() throws Exception {
	
	//startServer();
	
		AndroidDriver<AndroidElement> driver=capabilities("ATNewApp");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 
	      
	    launchPage launch = new launchPage(driver);
		launch.launchapp();
		launch.closeNewspreeso();
	 
	   
	   
	   
	   
	   
	   
	    
	    
	  
	  
	
		
		
		
  // service.stop();
   
   }
	
public void login(HashMap<String, String > input) throws Exception {
		
		loginPage log = new loginPage(driver);
		homePage home = new homePage(driver);
		home.HamburgerId();
		log.SignInProfile();
		Thread.sleep(2000);
		log.loginButton();
		Thread.sleep(2000);
		log.usernameFiled(input.get("name"));
		log.passwordField(input.get("password"));
		log.loginButton();
				
	}

}




