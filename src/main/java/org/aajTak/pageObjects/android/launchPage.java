package org.aajTak.pageObjects.android;

import org.aajTak.utils.AndroidActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class launchPage extends AndroidActions{

	AndroidDriver driver;
	
	public launchPage(AndroidDriver driver)
	{
		//super(driver);
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='in.AajTak.headlines:id/button_home']")
	private WebElement launchButton;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_back']")
	private WebElement closeNewspresso;
	
	public void launchapp()
	{
		launchButton.click();
	}
	
	public void closeNewspreeso(){
		{
			closeNewspresso.click();
		}
	}
}
