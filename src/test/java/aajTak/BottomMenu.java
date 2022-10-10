package aajTak;
import org.aajTak.pageObjects.android.homePage;
import org.aajTak.pageObjects.android.launchPage;
//Bottom navigation Menu
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import AT_FrameWork.Swipes;
import AT_FrameWork.base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BottomMenu extends base{


	AndroidDriver<AndroidElement>driver;

	public BottomMenu(AndroidDriver<AndroidElement> driver)
	{
		this.driver=driver;
	}
	Swipes uti = new Swipes(driver);
	
	@Test
	public void installApp() throws InterruptedException {
		 
		launchPage launch = new launchPage(driver);
		launch.launchapp();
		launch.closeNewspreeso();
	}
	public void bottomMenuVerify() throws Exception {
	
		homePage home = new homePage(driver);
		home.homeBNB();
		//home.waitForArtilce();
		home.shortVideoBNB();
		//home.waitForShortVideo();
		home.videoBNB();
		//home.waitForVideo();
		home.LiveTvBNB();
		//home.waitForLiveTv();
		home.podcastBNB();
		//home.waitForPodcast();
//Home	
      driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='होम']")).click();
      WebDriverWait wait = new WebDriverWait(driver, 60);
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvHBITitle']")));
   System.out.println("Clicked on Home");
  //Short Video  
      driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='शॉर्ट वीडियो']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='in.AajTak.headlines:id/drag_parent']")));
      	System.out.println("Click on Short video");
      Thread.sleep(15000); 
     
      uti.swipedown6(driver);
      
  //Video  
      driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='वीडियो']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvFeaturedFirstVideoTitle']")));
      	System.out.println("Click on video");
      Thread.sleep(8000);  
      uti.swipedown6(driver);
      	

  //LiveTv  
      driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='लाइव टीवी']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ivLiveTvTabImage']")));
      	System.out.println("Click on LiveTv");
      Thread.sleep(8000); 
      Thread.sleep(15000);
      uti.swipedown6(driver);
      	
    //PodCast  
      driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='पॉडकास्ट']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvPodcastLandingTitle']")));
      	System.out.println("Click on PodCast");
      //Thread.sleep(8000); 
      uti.swipedown6(driver);
      		
    //Home	
      driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='होम']")).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvHBITitle']")));
    
	}
	
	private void BottomMenuMultipleTimesClick() {
	  //Home	
		   driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='होम']")).click();
	  //Short Video  
		   driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='शॉर्ट वीडियो']")).click();
      //Video  
		   driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='वीडियो']")).click();
	  //LiveTv  
		   driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='लाइव टीवी']")).click();
	  //PodCast  
		   driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='पॉडकास्ट']")).click();
		       
	}
	
	public void BottomMenuMultipleClick(int a) {
		for(int i=1; i<=a; i++) {
			
			BottomMenuMultipleTimesClick();
		}

	}
	
	private void swipeShortVideo() throws Exception {
		uti.swipeFromBottomToTop(driver);
	}
	
	private void swipeShortVideoWithDelay() throws InterruptedException {
		
		for(int i =0; i<=10; i++) {
			swipeFromBottomToTop(driver);
			Thread.sleep(5000);
		}

	}
	private void swipeFromBottomToTop(AndroidDriver<AndroidElement> driver2) {
		// TODO Auto-generated method stub
		
	}
	
}
