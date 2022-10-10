package org.aajTak.pageObjects.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ArticlePage {

 AndroidDriver driver;
	
	public ArticlePage(AndroidDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/hamburgerIcon']")
	private WebElement articleBack;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/tbTtsIcon']")
	private WebElement speaker;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_title']")
	private WebElement articleTitle;
		
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/whatsappShare']")
	private WebElement whatsUp;
	 
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/twitterShare']")
	private WebElement twitter;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/fbShare']")
	private WebElement faceBook;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/textSize']")
	private WebElement changeTextSize;
		
	@AndroidFindBy(xpath="//android.widget.RadioButton[@resource-id='in.AajTak.headlines:id/small_text_size']")
	private WebElement changeSmallSizeText;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/text_ok']")
	private WebElement OkButtonForTextSizeUpdate;	
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@resource-id='in.AajTak.headlines:id/medium_text_size']")
	private WebElement changeMediumSizeText;	
	
//More
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/moreOptions']")
	private WebElement moreOption;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='ब�?कमार�?क'] | //android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvBottomBookmark'] | //android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/layoutBookmark']")
	private WebElement bookmark;		
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='डाउनलोड'] | //android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/layoutDownload']")
	private WebElement download;		

	@AndroidFindBy(xpath="//android.widget.TextView[@text='कमेंट ?'] | //android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/commentLayout']")
	private WebElement comment;	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='All Comments (0)'] | //android.widget.TextView[@text='Replies (0)'] | //android.widget.ImageView[@resource-id='in.AajTak.headlines:id/newspresso_image'] | //android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvHBITitle']")
	private WebElement commentPage;	
		
	@AndroidFindBy(xpath="//android.widget.TextView[@text='शेयर करें'] | //android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/shareLayout']")
	private WebElement share;		

	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvCancel']")
	private WebElement cancelShareOption;		
	
	
	public void articleBackButton()
	{
		articleBack.click();
	}
	public void speakerButton()
	{
		speaker.click();
	}
	public void articleTitleText()
	{
		articleTitle.isDisplayed();
	}
	public void whatsupButton() throws InterruptedException
	{
		whatsUp.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	public void twitterButton() throws InterruptedException
	{
		twitter.click();
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
	}
	public void facebookButton() throws InterruptedException
	{
		faceBook.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	public void updateTextSize()
	{
		changeTextSize.click();
	}
	public void smallSizeText()
	{
		changeSmallSizeText.click();
	}
	public void OkButtonForTextUpdate()
	{
		OkButtonForTextSizeUpdate.click();
	}
	public void mediumSizeText()
	{
		changeMediumSizeText.click();
	}
	public void moreOptionButton()
	{
		moreOption.click();
	}
	public void bookmark()
	{
		bookmark.click();
	}
	public void download()
	{
		download.click();
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
	}
	
	public void commentButton()
	{
		comment.click();
	}
	public void viewCommentPage()
	{
		commentPage.isDisplayed();
	}
	public void shareButton()
	{
		share.click();
	}
	public void cancelShareButton()
	{
		cancelShareOption.click();
	}
	
	
	//////////////////////////////////

	 



	
	//////////////////////////////////
	
}
