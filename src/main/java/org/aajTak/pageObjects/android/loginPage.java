package org.aajTak.pageObjects.android;

import org.aajTak.utils.AndroidActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class loginPage extends AndroidActions{

	AndroidDriver driver;
	
	public loginPage(AndroidDriver driver)
	{
		//super(driver);
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/signupBody']")
	private WebElement signInProfile;
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='लॉग इन'] | //android.widget.Button[@resource-id='in.AajTak.headlines:id/btLoginSso']")
	private WebElement loginButton;
	
	@AndroidFindBy(xpath="//android.widget.EditText[resource-id='in.AajTak.headlines:id/etLoginUsername']")
	private WebElement userName;
	
	@AndroidFindBy(xpath="//android.widget.EditText[resource-id='in.AajTak.headlines:id/etPassword']")
	private WebElement password;
	
	public void SignInProfile()
	{
		signInProfile.click();
	}
	
	public void loginButton()
		{
			loginButton.click();
		}
	public void usernameFiled(String username01)
	{
		userName.sendKeys(username01);
	}
	
	public void passwordField(String password01)
	{
		password.sendKeys(password01);
	}
	
	
}

