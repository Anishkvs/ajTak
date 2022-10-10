package aajTak;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import AT_FrameWork.Swipes;
import AT_FrameWork.base;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

@Test
public class Newspresso extends base{

	AndroidDriver<AndroidElement>driver;

	public Newspresso(AndroidDriver<AndroidElement> driver)
	{
		this.driver=driver;
	}
	Swipes uti = new Swipes(driver);
	
	
	public void installApp() throws Exception {
		 driver.findElement(By.xpath("//android.widget.Button[@resource-id='in.AajTak.headlines:id/button_home']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_back']")).click();
		
	}
	
	public void SuperFast_Newspresso() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		waitforHomePage();
	//Click on Newspresso	
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/newspresso_image']")).click();
	//Click on close button
		waitforNewspresso();
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_back']")).click();
	//Click on Newspresso
	    driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/newspresso_image']")).click();
	    waitforNewspresso();
	    
	//Click on share
	     driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_share']")).click();
	//click on close button
	    driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_close']")).click();
	    
	 //Cancel option   
	    Sharethiscardonly();
	    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvCancel']")).click();
	    
	 //FB option   
	    Sharethiscardonly();
	    Fb();  
	   
	  //Whatsapp option
	    Sharethiscardonly();
	    whatsapp(); 
	    
	  //Twitter option
	    Sharethiscardonly();
	    twitter();   
	   
	  //More option
	    Sharethiscardonly();
	    moreOption();
//Share All Cards	    
	    //FB option   
	    ShareAllCards();
	    Fb();  
	   
	  //Whatsapp option
	    ShareAllCards();
	    whatsapp(); 
	    
	  //Twitter option
	    ShareAllCards();
	    twitter();   
	   
	  //More option
	    ShareAllCards();
	    moreOption();
	}
	  
	public void NewsPressoSwipe() throws Exception {
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/title'] | //android.widget.ImageView[@resource-id='in.AajTak.headlines:id/newspresso_image']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_title'] | //android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvAnchorNames']")));
	
  //SocialMedia Check	
		socialMediaInArticle();
	//Click on Speark
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/tbTtsIcon']")).click();
	//Swipe the Article
		uti.swipeArticlePageDown(driver);
		uti.swipeArticlePageTop(driver);
//back
		//driver.findElement(By.xpath("//android.widget.ImageView[resource-id='in.AajTak.headlines:id/hamburgerIcon']")).click();
		driver.navigate().back();
		Thread.sleep(500);
	//Swipe Newspresso
					
	   uti.SuperFastNewspressoSwipe(driver);
		

	}
	

	public void socialMediaInArticle() throws Exception {
	 
		
		uti.swipedownONE(driver);
//Whatsapp	
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/whatsappShare']")).click();
	    Thread.sleep(5000);
		driver.navigate().back();
		
  //Twitter	
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/twitterShare']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		try {
			driver.findElement(By.xpath("//android.widget.Button[@text='Delete']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	
	//FB
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/fbShare']")).click();
		Thread.sleep(5000);
		driver.navigate().back();

//TextChange	
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/textSize']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/text_ok']")));
	
//Small size
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='in.AajTak.headlines:id/small_text_size']")).click();
  //Ok		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/text_ok']")).click();
		
 //Again Text change
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/textSize']")).click();
//medium size
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='in.AajTak.headlines:id/medium_text_size']")).click();
//Ok		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/text_ok']")).click();
	
		
//Click on MoreOption		
		MoreOption();
	 //Bookmark
		 driver.findElement(By.xpath("//android.widget.TextView[@text='ब�?कमार�?क'] | //android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvBottomBookmark'] | //android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/layoutBookmark']")).click();
		  
		   
 //More	- Download
		 MoreOption();
     //Download
		   driver.findElement(By.xpath("//android.widget.TextView[@text='डाउनलोड'] | //android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/layoutDownload']")).click();
		   
		  try {
			Boolean t = driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")).isDisplayed();
			   
			  if(t)
			  {
				  driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")).click();
			  }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	//More	
		  MoreOption();
		  //Comment
	   		driver.findElement(By.xpath("//android.widget.TextView[@text='कमेंट�?'] | //android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/commentLayout'] ")).click();
	   		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='All Comments (0)'] | //android.widget.TextView[@text='Replies (0)'] | //android.widget.ImageView[@resource-id='in.AajTak.headlines:id/newspresso_image'] | //android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvHBITitle']")));
	   		Thread.sleep(500);
			driver.navigate().back();
			
	//Share
		MoreOption();
		driver.findElement(By.xpath("//android.widget.TextView[@text='शेयर करें'] | //android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/shareLayout']")).click();
	    Thread.sleep(2000);
		driver.navigate().back();

	}
	private void MoreOption() {
		//More	- Share
			driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/moreOptions']")).click();
	}
	
	private void waitforHomePage() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/newspresso_image']")));
	    	 
	}
	
	private void waitforNewspresso() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_back'] | //android.widget.TextView[@resource-id='in.AajTak.headlines:id/title']")));
		   
	}
	
	private void Sharethiscardonly() {
		//Click on share
	    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_share']")).click();

	//Click on Share this card only
	     driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_share_this_card_only']")).click();
	
	}
	
	    private void ShareAllCards() {
	    //Click on share
		    driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_share']")).click();

		//Click on Share All Card 
		 	driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_share_all_cards']")).click();
 
		}
	
	private void Fb() throws InterruptedException {
		//FB
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvFacebook']")).click();
		Thread.sleep(5000);
		driver.navigate().back();

	}
	  private void whatsapp() throws InterruptedException {
		//Whatsapp	
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvWhatsapp']")).click();
		  Thread.sleep(5000);
		  driver.navigate().back();

	}
	  
	  private void twitter() throws InterruptedException {
		  //Twitter	
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvTwitter']")).click();
		  Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(1000);
			driver.navigate().back();
			try {
				driver.findElement(By.xpath("//android.widget.Button[@text='Delete']")).click();
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//android.widget.Button[@text='Delete']")).click();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}
	
	  private void moreOption() throws InterruptedException {
		//More	- Share
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvOther']")).click();
		  Thread.sleep(3000);
		  driver.navigate().back();

	}
	
	  private static void swipeTopToBottom(WebDriver driver) throws Exception {

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

		Thread.sleep(1000);
			}
	  
	 private static void swipeTopandBottom(WebDriver driver) throws Exception {
			for (int i=1; i<=21; i++) {
				swipeTopToBottom(driver);
			
		}
				}  
	
	
}
