package org.aajTak.pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class newspresso {

	AndroidDriver driver;
	
	public newspresso(AndroidDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvHBITitle'] | //android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvHBIBTitle']")
	private WebElement ArticleView;
	
	
	
}
