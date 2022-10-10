package AT_FrameWork;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;



public class Swipes extends base{
	AndroidDriver<AndroidElement>driver;
    base app = new base();
    		//driver
  
	public Swipes(AndroidDriver<AndroidElement> driver)
	{
		this.driver=driver;
	}
	
@Test

public void Article() throws Exception {
	
		swipeFromBottomToTop(driver);
		newstitle(driver);
		//or
		blogs(driver);
		swipefour(driver);
		
		driver.findElement(By.className("android.widget.TextView")).isDisplayed();
		Reporter.log("Articles swipes & Interstitial Articles swipes Ads Verified.");
		waitforads(driver);
		Interstitialclose(driver);
		adclosebutton(driver);
		adclose(driver);
		swipetwo(driver);
		for(int i=1; i<=10; i++) {
			swipeFromBottomToTop(driver);
		}
		
		
		driver.navigate().back();
}
public void photo() throws Exception {
	
	
	driver.findElement(By.id("com.indiatoday:id/hamburgur_icon")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='PHOTOS']")).click();
	wait(driver);
	driver.findElement(By.id("com.indiatoday:id/large_thumbnail")).click();
	wait(driver);
	driver.findElement(By.id("com.indiatoday:id/btn_okay")).click();
	wait(driver);
	
	WebElement Panel = driver.findElement(By.className("android.widget.TextView"));
			
	swipethree(driver);
	driver.findElement(By.className("android.widget.TextView")).isDisplayed();
	Reporter.log("Photo swipes & Interstitial Photo swipes Ads Verified.");
	waitforads(driver);
	Interstitialclose(driver);
	adclosebutton(driver);
	adclose(driver);
	
	swipetwo(driver);
	
	
	driver.navigate().back();
	wait(driver);
	driver.navigate().back();
	wait(driver);
	
	}

//App exit
	public void appexit() throws Exception {
		
		driver.navigate().back();
		driver.findElement(By.className("android.widget.TextView")).isDisplayed();
		Reporter.log("Interstitial Exit Ads Verified.");
		waitforads(driver);
		Interstitialclose(driver);
	adclosebutton(driver);
	adclose(driver);
	driver.findElement(By.xpath("//android.widget.Button[@text='EXIT']")).click();
	
	
	
	}

public static void swipeFromLeftToRight(WebDriver driver) throws Exception {

	try {
		TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);

		Dimension size = driver.manage().window().getSize();

		int startx = (int) (size.width * 0.9);

		int endx = (int) (size.width * 0.1);
		//8:2
        //9:2
		
		int anchor = (int) (size.height / 2);

		touchAction.press(PointOption.point(startx, anchor))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1300)))

				.moveTo(PointOption.point(endx, anchor)).release().perform();

	} catch (Exception e) {
		throw new Exception(e.getMessage());
	}

}

public static void adclosebutton(WebDriver driver) throws Exception {
	try {
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='close-button-icon']")).click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public static void adclose(WebDriver driver) throws Exception{
	try {
		driver.findElement(By.xpath("//android.widget.TextView[@text='Close']")).click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
 
public static void Interstitialclose(WebDriver driver) throws Exception{
	try {
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Interstitial close button']")).click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public static void swipethree(WebDriver driver) throws Exception {
	for (int i=1; i<=3; i++) {
		swipeFromLeftToRight(driver);
		Thread.sleep(1000);
	}
	
	}
 public static void swipetwo(WebDriver driver) throws Exception {
	for (int i=1; i<=2; i++) {
		swipeFromLeftToRight(driver);
		Thread.sleep(1000);
	}
}
 
 public static void swipeone(WebDriver driver) throws Exception {
	for (int i=1; i<=1; i++) {
		swipeFromLeftToRight(driver);
		Thread.sleep(1000);
	}
}
 
 public static void swipefour(WebDriver driver) throws Exception {
		for (int i=1; i<=4; i++) {
			swipeFromLeftToRight(driver);
			Thread.sleep(1000);
		}
				}
 public static void swipedown(WebDriver driver) throws Exception {
		for (int i=1; i<=1; i++) {
			swipeFromBottomToTop(driver);
			//Thread.sleep(1000);
		}
				}
 public static void swipedown3(WebDriver driver) throws Exception {
		for (int i=1; i<=3; i++) {
			swipeFromBottomToTop(driver);
			//Thread.sleep(1000);
		}
				}
 public static void swipedown6(WebDriver driver) throws Exception {
		for (int i=1; i<=6; i++) {
			swipeFromBottomToTop(driver);
			//Thread.sleep(1000);
		}
				}
 public static void swipedownONE(WebDriver driver) throws Exception {
		for (int i=1; i<=1; i++) {
			swipeFromBottomToTop(driver);
			//Thread.sleep(1000);
		}
				}	
 
 public static void swipeupfull(WebDriver driver) throws Exception {
		for (int i=1; i<=5; i++) {
			swipeFromTopToBottom(driver);
			//Thread.sleep(1000);
		}
				}	
//HomePage Scroll		
 public static void swipeHomePageDown(WebDriver driver) throws Exception {
		for (int i=1; i<=50; i++) {
			swipeFromBottomToTop(driver);
		
		}
 }
public static void swipeHomePageTop(WebDriver driver) throws Exception {
			for (int i=1; i<=51; i++) {
				swipeFromTopToBottom(driver);
			
		}
				}
//Article Scroll
public static void swipeArticlePageDown(WebDriver driver) throws Exception {
	for (int i=1; i<=20; i++) {
		swipeFromBottomToTop(driver);
	
	}
}
public static void swipeArticlePageTop(WebDriver driver) throws Exception {
		for (int i=1; i<=21; i++) {
			swipeFromTopToBottom(driver);
		
	}
			}
//SuperFast Newspresso Swipe
public static void SuperFastNewspressoSwipe(WebDriver driver) throws Exception {
	for (int i=1; i<=20; i++) {
		swipeFromBottomToTop(driver);
	
	}
			}	

 public static void swipeFromTopToBottom(WebDriver driver) throws Exception {

		try {
			TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);

			Dimension size = driver.manage().window().getSize();

			int starty = (int) (size.height * 0.70);

			int endy = (int) (size.height * 0.40);

			int anchor = (int) (size.width / 2);

			touchAction.press(PointOption.point(anchor, endy))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1300)))
					.moveTo(PointOption.point(anchor, starty)).release().perform();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

		//Thread.sleep(1000);
		}
 
 public static void swipeFromBottomToTop(WebDriver driver) throws Exception {

		try {
			TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);

			Dimension size = driver.manage().window().getSize();

			int starty = (int) (size.height * 0.70);

			int endy = (int) (size.height * 0.40);

			int anchor = (int) (size.width / 2);

			touchAction.press(PointOption.point(anchor, starty))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(1300)))
					.moveTo(PointOption.point(anchor, endy)).release().perform();

		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
//Thread.sleep(1000);
	}

  public static void newstitle(WebDriver driver) {
	 		try {
			driver.findElement(By.id("com.indiatoday:id/news_title")).click();
			driver.findElement(By.id("com.indiatoday:id/btn_okay")).click();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
  }
 
  public static void blogs(WebDriver driver) {
	//Even Blog
			try {
				driver.findElement(By.id("com.indiatoday:id/blog_title")).click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  }
 
  public static void waitforads(WebDriver driver) throws InterruptedException {
	  
	  Thread.sleep(8000);
  }
  
 public static void wait(WebDriver driver) throws InterruptedException {
	  
	  Thread.sleep(1000);
  }
 
}


/*
 * WebDriverWait wait = new WebDriverWait(wb, 60);
   wait.until(ExpectedConditions.elementToBeClickable(By.name("value")));
 * 
 */


