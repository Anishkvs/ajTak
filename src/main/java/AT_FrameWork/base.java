package AT_FrameWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.aajTak.pageObjects.android.loginPage;
import org.aajTak.utils.AndroidActions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class base extends AndroidActions{
	
	
	  public static AppiumDriverLocalService service;
	  public loginPage log;
	
	  public AppiumDriverLocalService startServer() 
	{
		
		  boolean flag = checkIfServerIsRunnning(4723);
		  if(!flag)
		  {
		 service =  AppiumDriverLocalService.buildDefaultService();	
		 service.start();
		  }
		 return service;
	 }
	  public static boolean checkIfServerIsRunnning(int port) {
			
			boolean isServerRunning = false;
			ServerSocket serverSocket;
			try {
				serverSocket = new ServerSocket(port);
				
				serverSocket.close();
			} catch (IOException e) {
				//If control comes here, then it means that the port is in use
				isServerRunning = true;
			} finally {
				serverSocket = null;
			}
			return isServerRunning;
		}
		public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException {
		
			                                                                                                                                         
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\AT_FrameWork\\global.properties");
				Properties prop=new Properties();
				prop.load(fis);
				
				
			File appDir = new File("src/test/java");
			File app = new File(appDir, (String) prop.get(appName));
			
			DesiredCapabilities cap=new DesiredCapabilities();
			String device=(String) prop.get("device");
//			////////
//			if(device.equals("emulator"))
//			{
//			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "indiatoday");
//			}
//			else if(device.equals("real"))
//			{
//				////////
//			}
			/////
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "12_Samsung Galaxy J2");
			//cap.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("AndroidDeviceName"));
			
			//cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
			//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, prop.getProperty("VirtualDeviceName"));
			cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			loginPage log = new loginPage(driver);
			//
	
			    
			//
			return driver;
			
	
	}
		
}


/*
 *  Xpath locator 
 * // tagname[@attribute='value'];
 *   
 *   className is tagname
 * 
 * 
 * 
 * 
 * 
 */





