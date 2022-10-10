package org.aajTak.pageObjects.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class homePage {

AndroidDriver driver;
	
	public homePage(AndroidDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvHBITitle'] | //android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvHBIBTitle']")
	private WebElement ArticleView;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/hamburgerIcon']")
	private WebElement Hamburger;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ivGameCube']")
	private WebElement GameWidget;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/liveTV']")
	private WebElement LiveTvIcon;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/icSearch']")
	private WebElement SearchIcon;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='होम']")
	private WebElement HomeMenu;
	
//Bottom Menu	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc='होम']")
	private WebElement HomeBNB;
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc='शॉर्ट वीडियो']")
	private WebElement shortVideoBNB;
	     
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc='वीडियो']")
	private WebElement videoBNB;
	    
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc='लाइव टीवी']")
	private WebElement LiveTvBNB;
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc='पॉडकास्ट']")
	private WebElement podcastBNB;
	
		
	public void ViewtheArticle()
	{
		ArticleView.click();
	}
	
		
	public void waitForShortVideo()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@resource-id='in.AajTak.headlines:id/drag_parent']")));
	}
	
	public void waitForVideo()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/roundedImageView']")));
    }
	
	public void waitForLiveTv()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_placeholder']")));
     }
	
	public void waitForPodcast()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ivPodcastLandingCover']")));
	}
	
	public void waitForArtilce() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_title']")));
	}
	
	public void HamburgerId()
	{
		Hamburger.click();
	}
	
	public void GameWidget()
	{
		GameWidget.click();
	}
	
	public void LiveTvIcon()
	{
		LiveTvIcon.click();
	}
	
	public void homeMenu()
	{
		HomeMenu.click();
	}
//Bottom Menu	
	public void homeBNB() 
	{
		HomeBNB.click();
	}
	
	public void shortVideoBNB() 
	{
		shortVideoBNB.click();
	}
	
	public void videoBNB() 
	{
		videoBNB.click();
	}
	
	public void LiveTvBNB() 
	{
		LiveTvBNB.click();
	}
	
	public void podcastBNB() 
	{
		podcastBNB.click();
	}
	
	
	
}

/*
 * 
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_title']")
	private WebElement waitForHomePage;
	
	@AndroidFindBy(xpath="//android.widget.FrameLayout[@resource-id='in.AajTak.headlines:id/drag_parent']")
	private WebElement waitForShortVideoPage;
	 
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/roundedImageView']")
	private WebElement waitForVideoPage;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_placeholder']")
	private WebElement waitForLiveTvPage;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ivPodcastLandingCover']")
	private WebElement waitForPodcastPage;
	
	
	
	
 */
